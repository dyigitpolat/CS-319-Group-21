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
import academicwarfare.assets.gameobjects.Weapon;

/**
 *
 * @author selin
 */
public class IceScene extends GameScene{
    public IceScene(){
        initMap();
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
        
        Enemy e1 = new Enemy();
        e1.setVelocity( new Vector2( 50, 0));
        e1.setSize( new Vector2( 80, 80));
        e1.setPosition( new Vector2( 50, 150));
        e1.setTexture("Graphics/aa.png", this);
        addObject(e1);
        
        Path p1 = new Path();
        p1.addPoint(50, 50);
        p1.addPoint(250, 100);
        p1.addPoint(300,450);
        p1.addPoint(500,150);
        
        GameObject o1 = new GameObject();
        o1.setSize( new Vector2(10,10));
        o1.setPosition( new Vector2(50,50));
        addObject(o1);
        
        GameObject o2 = new GameObject();
        o2.setSize( new Vector2(10,10));
        o2.setPosition( new Vector2(250,100));
        addObject(o2);
        
        GameObject o3 = new GameObject();
        o3.setSize( new Vector2(10,10));
        o3.setPosition( new Vector2(300,450));
        addObject(o3);
        
        GameObject o4 = new GameObject();
        o4.setSize( new Vector2(10,10));
        o4.setPosition( new Vector2(500,150));
        addObject(o4);
        
        e1.setEnemypath(p1);
        e1.setInteractionEvent( new DragEvent());
        
        Weapon w = new Weapon( 150, 5);
        w.setSize( new Vector2( 80, 80));
        w.setPosition( new Vector2( 150, 250));
        w.setInteractionEvent( new DragEvent());
        w.setTexture("Graphics/Turret1.png", this);
        addObject(w);
        
    }
     public void addTile( int x, int y, String texturepath, boolean movable)
    {
        Tile t = new Tile( x, y, texturepath, this,movable);
        addObject( t);
    }
    
     
}
