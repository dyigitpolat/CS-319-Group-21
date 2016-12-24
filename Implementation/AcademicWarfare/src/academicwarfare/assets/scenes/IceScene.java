/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets.scenes;

import academicwarfare.engine.GameObject;
import academicwarfare.assets.GameScene;
import academicwarfare.assets.gameobjects.Tile;
import academicwarfare.engine.Vector2;
import academicwarfare.assets.events.DragEvent;
import academicwarfare.assets.gameobjects.Enemy;
import academicwarfare.assets.Path;
import academicwarfare.assets.gameobjects.AdvancedGun;
import academicwarfare.assets.gameobjects.EnemyGenerator;
import academicwarfare.assets.gameobjects.Atalar;
import academicwarfare.assets.gameobjects.BasicGun;
import academicwarfare.assets.gameobjects.Weapon;

/**
 *
 * @author selin
 */
public class IceScene extends GameScene{
    public IceScene(){
        initMap();
    }
    
    public Path createScenePath()
    {
        Path p1 = new Path();
        p1.addPoint(300, 25);
        p1.addPoint(300, 250);
        p1.addPoint(400, 250);
        p1.addPoint(400, 500);
        p1.addPoint(-10, 500);
        
        return p1;
    }
    
    public void initMap(){
        for(int i = 0; i <= 10; i++)
            for (int j = 0; j <= 10; j++)
                if((( i < 7 && i > 4 ) && (j < 2 )) || 
                        ((i == 5 || i == 6 )&&(j < 6 && j > 1))|| 
                        (( i == 7 || i == 8)&&(j > 3))||
                        (i < 7 && j > 8))
                    addTile(i,j,"Graphics/buz.png", true);
                else
                    addTile(i,j,"Graphics/buz-dış.png", false );
        
        Weapon w = new BasicGun(this);
        w.setSize( new Vector2( 80, 80));
        w.setPosition( new Vector2( 150, 250));
        w.setInteractionEvent( new DragEvent());
        addObject(w);
        
        Weapon w2 = new AdvancedGun(this);
        w2.setSize( new Vector2( 80, 80));
        w2.setPosition( new Vector2( 300, 250));
        w2.setInteractionEvent( new DragEvent());
        addObject(w2);
        
        
        EnemyGenerator eg = new EnemyGenerator( this);
        eg.setPosition( new Vector2(300, -10));
        addObject(eg);
        
    }
    
     public void addTile( int x, int y, String texturepath, boolean movable)
    {
        Tile t = new Tile( this, x, y, texturepath, this,movable);
        addObject( t);
    }
    
     
}
