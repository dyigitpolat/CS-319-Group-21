/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.util.ArrayList;

/**
 *
 * @author yigitpolat
 */
public class WeaponEvent implements Event
{
    private int cooldown;
    
    public WeaponEvent()
    {
        cooldown = 0;
    }
    
    public float distance( Vector2 v1, Vector2 v2)
    {
        float x1,x2,y1,y2;
        
        x1 = v1.x;
        x2 = v2.x;
        y1 = v1.y;
        y2 = v2.y;
        
        return (float) Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    
    //O(n) time algorithm where n is game enemy count
    public Enemy closestEnemyInRange( ArrayList<Enemy> enemies, Weapon w)
    {
        float min;
        Enemy closestEnemy;
        int len = enemies.size();
        
        if( len <= 0)
            return null;
        
        min = distance(w.getPosition(), enemies.get(0).getPosition());
        closestEnemy = enemies.get(0);
        for( int i = 0; i < len; i++)
        {
            float cur = distance(w.getPosition(), enemies.get(i).getPosition());
            
            if( cur < min)
            {
                min = cur;
                closestEnemy = enemies.get(i);
            }
        }
        
        if( min <= w.getRange() )
        {
            return closestEnemy;
        }
        else
        {
            return null;
        }
    }
    
    public ArrayList<Enemy> filterEnemies( ArrayList<GameObject> objects)
    {
        ArrayList<Enemy> filtered = new ArrayList<>();
        for( GameObject o : objects)
        {
            if( o.getTag() == 1)
                filtered.add( (Enemy) o);
        }
        
        return filtered;
    }
    
    public void processWeapon( Weapon w, ArrayList<GameObject> objects)
    {
        Enemy closestEnemy;
        
        cooldown++;
        closestEnemy = closestEnemyInRange( filterEnemies(objects), w);
        if( closestEnemy != null)
        {
            if( cooldown >= ( 100 / w.getFireRate()))
            {
                w.fireAt( closestEnemy);
                cooldown = 0;
            }
        }        
    }
    
}
