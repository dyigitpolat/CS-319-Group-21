/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets;

import academicwarfare.assets.gameobjects.Tile;
import academicwarfare.assets.gameobjects.GameLabel;
import academicwarfare.engine.GameObject;
import academicwarfare.engine.Scene;
import academicwarfare.engine.Vector2;

/**
 *
 * @author yigitpolat
 */
public class GameScene extends Scene
{
    private GameLabel pointLabel;
    private GameLabel waveLabel;
    private final String WAVE_DISPLAY_TEXT = "Wave: ";
    private final String POINTS_DISPLAY_TEXT = "Points: ";
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
        GameObject sidebar = new GameObject();
        sidebar.setSize( new Vector2(250, 600));
        sidebar.setPosition( new Vector2( 550, 0));
        sidebar.setTexture("Graphics/sidebar.png", this);
        addObject(sidebar);
        
        
        pointLabel = new GameLabel(POINTS_DISPLAY_TEXT + 0);
        pointLabel.setPosition(new Vector2(580,60));
        addObject(pointLabel);

        
        waveLabel = new GameLabel(WAVE_DISPLAY_TEXT + 1);
        waveLabel.setPosition(new Vector2 (580, 150));
        addObject(waveLabel);
        
    }
    
  

    

    public void setPoints(int points){
        pointLabel.setString(POINTS_DISPLAY_TEXT + points);
    }
    public int getPoints(){
        return Integer.parseInt(pointLabel.getString().split(" ")[1]);
    }
}

