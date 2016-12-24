package academicwarfare.assets.scenes;

import academicwarfare.assets.GameScene;
import academicwarfare.assets.gameobjects.Tile;

/**
 *
 * @author selin
 */
public class ForestScene extends GameScene {
    public ForestScene(){
        initMap();
    }
    public void initMap(){
        for(int i = 0; i <= 10; i++)
            for (int j = 0; j <= 10; j++)
                if((i < 2 && j < 2) || 
                        ((j >= 2 && j < 4)&&(i < 7))|| 
                        (( i == 5 || i == 6)&&(j == 4 || j == 5))||
                        ((i == 7 || i == 8) && (j > 3))||
                        (i > 6 && j > 8))
                    addTile(i,j,"Graphics/ormantile.png", true);
                else
                    addTile(i,j,"Graphics/orman dış.png", false );
    }
     public void addTile( int x, int y, String texturepath, boolean movable)
    {
        Tile t = new Tile( x, y, texturepath, this,movable);
        addObject( t);
    }
    
}
