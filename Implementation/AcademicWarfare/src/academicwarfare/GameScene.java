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
import javax.swing.JLabel;
/**
 *
 * @author yigitpolat
 */
public class GameScene extends Scene
{
    private JLabel pointLabel;
    private final String POINTS_DISPLAY_TEXT = "Points:";
    public GameScene()
    {
        initScene();
    }
    
    public void addTile( int x, int y, String texturepath, boolean movable)
    {
        Tile t = new Tile( x, y, texturepath, this, movable);
        addObject( t);
    }
    
    public final void initScene()
    {
        pointLabel = new JLabel(POINTS_DISPLAY_TEXT + 0);
    }
    public void setPoints(int points){
        pointLabel.setText(POINTS_DISPLAY_TEXT + points);
    }
    public int getPoints(){
        return Integer.parseInt(pointLabel.getText().split(" ")[1]);
    }
}

