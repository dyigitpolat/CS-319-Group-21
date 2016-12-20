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
public class GameScene extends Scene
{
    
    public GameScene()
    {
        initScene();
    }
    
    public final void initScene()
    {
        GameObject obj1 = new GameObject();
        GameObject obj2 = new GameObject();
        Weapon w = new Weapon();
        
        obj1.setSize( new Vector2( 50.0f, 50.0f));
        obj1.setPosition( new Vector2( 50.0f, 300.0f));
        obj1.setVelocity( new Vector2( 50.0f, 0f));
        
        obj2.setSize( new Vector2( 50.0f, 50.0f));
        obj2.setPosition( new Vector2( 700.0f, 300.0f));
        obj2.setVelocity( new Vector2( -50.0f, 0f));
        
        w.setSize( new Vector2( 50.0f, 50.0f));
        w.setPosition( new Vector2( 150.0f, 150.0f));
        w.setVelocity( new Vector2( 0f, 0f));
        
        setObjects( new ArrayList<>());
        getObjects().add(obj1);
        getObjects().add(obj2);
        getObjects().add(w);
    }
    
}
