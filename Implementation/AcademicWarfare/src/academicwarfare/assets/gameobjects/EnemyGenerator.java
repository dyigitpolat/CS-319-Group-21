/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets.gameobjects;

import academicwarfare.assets.GameScene;
import academicwarfare.assets.Path;
import academicwarfare.assets.gameobjects.*;
import academicwarfare.engine.GameObject;
import academicwarfare.engine.Vector2;
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
    private float positionx;
    private float positiony;
    
    public EnemyGenerator( GameScene s)
    {
        super(s);
        timer = 0;
        isWaveActive = true;
        randomTime = Math.random() * 1000 + 50;
        setTag(2);
    }
    
    @Override
    public void setPosition( Vector2 pos)
    {
        positionx = pos.x;
        positiony = pos.y;
    }
    
    @Override
    public Vector2 getPosition()
    {
        return new Vector2(positionx, positiony);
    }
    
    @Override
    public void update()
    {
        if( timer > randomTime && isWaveActive)
        {
            timer = 0;
            generateEnemies();
            randomTime = Math.random() * (1000 / Math.sqrt( getScene().getWave()) ) + 50;
        }
        timer++;
    }
    
    public void generateEnemies()
    {
        int randomAcademic;
        Enemy toAdd;
        randomAcademic = (int) (Math.random() * 8) % 8;
        
        switch( randomAcademic)
        {
            case 0:
                toAdd = new Atalar( getScene());
                break;
            case 1:
                toAdd = new Baray( getScene());
                break;
            case 2:
                toAdd = new Calkan( getScene());
                break;
            case 3:
                toAdd = new Ugur( getScene());
                break;
            case 4:
                toAdd = new Ezhan( getScene());
                break;
            case 5:
                toAdd = new Erman( getScene());
                break;
            case 6:
                toAdd = new Ercument( getScene());
                break;
            case 7:
                toAdd = new Altay( getScene());
                break;
            default:
                toAdd = new Altay( getScene());
                break;
        }
        
        toAdd.setPosition( getPosition());
        toAdd.setVelocity( new Vector2( 50, 0));
        toAdd.setPath( getScene().createScenePath());
        getScene().addObject(toAdd);
    }
}
