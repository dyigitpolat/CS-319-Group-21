/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 *
 * @author yigitpolat
 */
public class Weapon extends GameObject
{
    private float range;
    private float fireRate;
    private int firing = 0;
    private Vector2 target;
    private WeaponEvent we;
            
    public Weapon( float range, float fireRate)
    {
        this.range = range;
        this.fireRate = fireRate;
        target = new Vector2();
        firing = 5;
        we = new WeaponEvent();
    }
    
    public void fireAt( Enemy e)
    {
        System.out.println("Weapon fired!" + firing);
        target = e.getCenter();
        firing = 0;
    }
    
    @Override
    public void processEvents( ArrayList<GameObject> sceneObjects)
    {
        we.processWeapon(this, sceneObjects);
    }
    
    @Override
    public void drawEntity( Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        super.drawEntity(g);
        
        g.drawOval( (int) (getCenter().x - range), (int) (getCenter().y - range), (int) (2*range), (int) (2*range));
        
        if( firing < 5)
        {
            g2.setStroke(new BasicStroke(5));
            g2.setColor(Color.white);
            g2.drawLine( (int) getCenter().x , (int) getCenter().y, (int) target.x, (int) target.y);
            firing++;
        }
    }
            

    /**
     * @return the range
     */
    public float getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(float range) {
        this.range = range;
    }

    /**
     * @return the fireRate
     */
    public float getFireRate() {
        return fireRate;
    }

    /**
     * @param fireRate the fireRate to set
     */
    public void setFireRate(float fireRate) {
        this.fireRate = fireRate;
    }
}
