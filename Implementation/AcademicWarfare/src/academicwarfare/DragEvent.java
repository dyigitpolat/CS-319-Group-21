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
public class DragEvent implements InteractionEvent
{
    private boolean hold;
    
    public DragEvent()
    {
        hold = false;
    }
    
    @Override
    public void processInteraction( Interaction i, Object obj) 
    {
        GameObject gobj = (GameObject) obj;
        Vector2 centerVector = new Vector2( i.getInteractionVector().x - (gobj.getSize().x / 2), i.getInteractionVector().y - (gobj.getSize().y / 2));
        
        if( i.getStatus() == 3)
        {
            hold = true;
        }
        
        if( i.getStatus() == 4)
        {
            hold = false;
        }
        
        if( hold)
            gobj.setPosition( centerVector);
    }

}
