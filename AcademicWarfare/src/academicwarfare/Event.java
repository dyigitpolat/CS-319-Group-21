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
public interface Event 
{
    public boolean eventOccured( ArrayList<GameObject> list);
    public void processEvent( ArrayList<GameObject> list);
}
