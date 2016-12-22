/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
/**
 *
 * @author yigitpolat
 */
public class GameScene extends Scene
{
    
    public GameScene()
    {
        initScene();
    }
    
    public void addTile( int x, int y, String texturepath)
    {
        Tile t = new Tile( x, y, texturepath, this, true);
        addObject( t);
    }
    
    public final void initScene()
    {
        for( int i = 0; i < 15; i++)
            for( int j = 0; j < 10; j++)
                addTile( i, j, "Graphics/buz.png");
        
        for( int i = 4; i < 8; i++)
            addTile( i, 5, "Graphics/normal.png");
        
        Enemy obj1 = new Enemy();
        Enemy obj2 = new Enemy();
        Weapon w = new Weapon( 150, 5);
        
        
        obj1.setSize( new Vector2( 80.0f, 80.0f));
        obj1.setPosition( new Vector2( 50.0f, 300.0f));
        obj1.setVelocity( new Vector2( 50.0f, 0f));
        obj1.setTexture("Graphics/aa.png", this);
        
        obj2.setSize( new Vector2( 80.0f, 80.0f));
        obj2.setPosition( new Vector2( 700.0f, 300.0f));
        obj2.setVelocity( new Vector2( -50.0f, 0f));
        obj2.setTexture("Graphics/ugur.png", this);
        
        w.setSize( new Vector2( 50.0f, 50.0f));
        w.setPosition( new Vector2( 150.0f, 150.0f));
        w.setVelocity( new Vector2( 0f, 0f));
        w.setInteractionEvent( new DragEvent());
        w.setTexture("Graphics/Turret1.png", this);
        
        addObject(obj1);
        addObject(obj2);
        addObject(w);
        
        
    }
    
}
