/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets.events;

import academicwarfare.assets.GameScene;
import academicwarfare.assets.gameobjects.Enemy;
import academicwarfare.engine.GameObject;
import java.awt.Graphics;

/**
 *
 * @author yigitpolat
 */
public class EnemyGenerator extends GameObject
{
    private boolean isWaveActive;
    double randomTime;
    private int wave;
    private int timer;
    
    public EnemyGenerator( GameScene s)
    {
        super(s);
        timer = 0;
        randomTime = Math.random() * 10 + 5;
    }
    
    @Override
    public void drawEntity( Graphics g)
    {
        if( timer > randomTime && isWaveActive)
        {
            generateEnemies();
            randomTime = Math.random() * (10.0/Math.sqrt(wave)) + 5;
        }
        timer++;
    }
    
    public void generateEnemies()
    {
        int randomAcademic;
        Enemy toAdd;
        randomAcademic = (int) (Math.random() * 10) % 10;
        
        switch( randomAcademic)
        {
            case 0:
                
        }
        
        
        
    }
}
