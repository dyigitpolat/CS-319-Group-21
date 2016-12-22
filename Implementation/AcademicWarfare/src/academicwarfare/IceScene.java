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
public class IceScene extends GameScene{
    public IceScene(){
        initMap();
    }
    public void initMap(){
        for(int i = 0; i <= 10; i++)
            for (int j = 0; j <= 10; j++)
                if((( i < 7 && i > 4 ) && (j < 2 )) || 
                        ((i == 5 || i == 6 )&&(j < 6 && j > 1))|| 
                        (( i == 7 || i == 8)&&(j > 3))||
                        (i < 7 && j > 8))
                    addTile(i,j,"Graphics/buz.png", true);
                else
                    addTile(i,j,"Graphics/buz-dış.png", false );
    }
     public void addTile( int x, int y, String texturepath, boolean movable)
    {
        Tile t = new Tile( x, y, texturepath, this,movable);
        addObject( t);
    }
    
     
}
