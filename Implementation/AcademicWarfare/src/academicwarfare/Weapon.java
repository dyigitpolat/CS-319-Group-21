/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

/**
 *
 * @author yigitpolat
 */
public class Weapon extends GameObject
{
    private float range;
    private float fireRate;
    
    public Weapon( float range, float fireRate)
    {
        
    }
    
    public void fireAt( Enemy e)
    {
        
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
