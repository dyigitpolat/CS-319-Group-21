/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author yigitpolat
 */
public class Enemy extends GameObject
{
    private int health;
    private Path p;
    private PathEvent pevt;
    
    public Enemy()
    {
        setTag(1);
        pevt = new PathEvent();
    }

    @Override
    public void processEvents( ArrayList<GameObject> sceneObjects)
    {
        if( p != null)
            pevt.processPathEvent(p, this);
    }
    
    @Override
    public void drawEntity(java.awt.Graphics g)
    {
        super.drawEntity(g);
        
        g.setColor(Color.red);
        g.drawLine( (int) getCenter().x, (int) getCenter().y, (int) (getCenter().x + getVelocity().x),(int) (getCenter().y + getVelocity().y));
        
    }
    
    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the p
     */
    public Path getEnemypath() {
        return p;
    }

    /**
     * @param enemypath the p to set
     */
    public void setEnemypath(Path enemypath) {
        this.p = enemypath;
    }
}
