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
public class Path 
{
    ArrayList<Vector2> points;
    int curPoint;
    
    public Path(ArrayList<Vector2> pts)
    {
        points = pts;
        curPoint = 0;
    }
    
    public void nextPoint( GameObject o)
    {
        float alpha;
        float magnitude;
        float firstx, firsty;
        float lastx, lasty;
        
        firstx = o.getVelocity().x;
        firsty = o.getVelocity().y;
        
        magnitude = (float) Math.sqrt( firstx*firstx + firsty*firsty);
        
        alpha = (float) Math.atan( firsty / firstx);
        
    }
}
