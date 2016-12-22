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
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
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
    private BufferedImage original_image;
    private boolean first;
    private Enemy lastEnemy;
            
    public Weapon( float range, float fireRate)
    {
        this.range = range;
        this.fireRate = fireRate;
        target = new Vector2();
        firing = 5;
        we = new WeaponEvent();
        first = true;
        lastEnemy = new Enemy();
    }
    
    public void fireAt( Enemy e)
    {
        System.out.println("Weapon fired!" + firing);
        lastEnemy = e;
        target = e.getCenter();
        firing = 0;
    }
    
    public void rotate()
    {
        float H = target.y - getCenter().y;
        float W = target.x - getCenter().x;
        
        if( W != 0 && H != 0)
        {
            if( H > 0 && W > 0)
                setRotation( (float) (Math.atan(H/W) + Math.PI / 2));
            else if( H > 0 && W < 0)
                setRotation( (float) (Math.atan(H/W) - Math.PI / 2) );
            else if( H < 0 && W > 0)
                setRotation( (float) (Math.atan(H/W) + Math.PI - Math.PI / 2) );
            else if( H < 0 && W < 0)
                setRotation( (float) (Math.atan(H/W) + Math.PI + Math.PI / 2) );
        }
        else
        {
            if( W == 0 && H > 0)
                setRotation( (float) Math.toRadians(0));
            else if( W == 0 && H < 0)
                setRotation( (float) Math.toRadians(180));
            else if( H == 0 && W > 0)
                setRotation( (float) Math.toRadians(90));
            else if( H == 0 && W < 0)
                setRotation( (float) Math.toRadians(270));
            else
                setRotation( (float) Math.toRadians(0));
        }
        
        // The required drawing location
        int drawLocationX = (int) getCenter().x;
        int drawLocationY = (int) getCenter().y;

        // Rotation information

        double rotationRequired = getRotation();
        double locationX = original_image.getWidth() / 2;
        double locationY = original_image.getHeight() / 2;
        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        setTexture(op.filter(original_image, null));
    }
    
    @Override
    public void setTexture( BufferedImage bi)
    {
        super.setTexture(bi);
        if( first)
        {
            original_image = bi;
            first = false;
        }
    }
            
    @Override
    public void processEvents( ArrayList<GameObject> sceneObjects)
    {
        we.processWeapon(this, sceneObjects);
    }
    
    @Override
    public void drawEntity( Graphics g)
    {
        target = lastEnemy.getCenter();
        rotate();
        
        g.setColor(Color.red);
        g.drawOval( (int) (getCenter().x - range), (int) (getCenter().y - range), (int) (2*range), (int) (2*range));
        if( firing < 7)
        {
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(5));
            g2.setColor(Color.white);
            g2.drawLine( (int) getCenter().x , (int) getCenter().y, (int) target.x, (int) target.y);
            firing++;
        }
        
        super.drawEntity(g);
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
