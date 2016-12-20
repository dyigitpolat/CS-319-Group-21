/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author yigitpolat
 */
public class Scene extends JPanel
{
    private ArrayList<GameObject> gameObjects;
    private ArrayList<Event> events;
    
    
    @Override
    public void paintComponent( Graphics g)
    {        
        super.paintComponent( g);
        for( GameObject o : getObjects())
        {
            o.drawEntity( g);
        }
    }

    /**
     * @return the gameObjects
     */
    public ArrayList<GameObject> getObjects() {
        return gameObjects;
    }

    /**
     * @param gameObjects the gameObjects to set
     */
    public void setObjects(ArrayList<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    /**
     * @return the events
     */
    public ArrayList<Event> getEvents() {
        return events;
    }

    /**
     * @param events the events to set
     */
    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

}
