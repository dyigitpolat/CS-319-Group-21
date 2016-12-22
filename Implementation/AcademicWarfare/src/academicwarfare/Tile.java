/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author yigitpolat
 */
public class Tile extends GameObject
{
    public Tile( int x, int y, String texturePath, ImageObserver observer)
    {
        BufferedImage img = null;
        try 
        {
            img = ImageIO.read(new File(texturePath));
        } 
        catch (IOException e) 
        {
            System.out.println("cannot find texture file.");
            System.exit(0);
        }
        
        setSize( new Vector2( 50, 50));
        setPosition( new Vector2( x*50, y*50));
        setVelocity( new Vector2());
        setTexture( img);
        setObserver( observer);
    }
}
