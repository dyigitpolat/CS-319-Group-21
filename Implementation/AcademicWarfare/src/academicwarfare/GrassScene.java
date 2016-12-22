/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

/**
 *
 * @author selin
 */
public class GrassScene extends Scene{
    public GrassScene(){
        initScene();
    }
    public void initScene(){
        for(int i = 0; i <= 10; i++)
            for (int j = 0; j <= 10; j++)
                if((( j < 7 && j > 1 ) && (i < 2 )) || 
                        ((j == 5 || j == 6 )&&(i < 6 && i > 1))|| 
                        (( j == 7 || j == 8)&&(i > 3))||
                        (j < 7 && i > 8))
                    addTile(i,j,"Graphics/normal.png",true);
                else
                    addTile(i,j,"Graphics/normal-dış.png",false);
    }
     public void addTile( int x, int y, String texturepath, boolean movable)
    {
        Tile t = new Tile( x, y, texturepath,this,movable );
        addObject( t);
    }
     
}
