/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;


/**
 *
 * @author yigitpolat
 */
public class GameObject 
{
    private Vector2 position;
    private Vector2 size;
    private Vector2 velocity;
    private BufferedImage texture;
    private ImageObserver observer;
    private InteractionEvent interactionEvent;
    private ArrayList<Event> events;
    private int tag;
    
    
    public GameObject()
    {
        position = new Vector2(0,0);
        size = new Vector2(0,0);
        velocity = new Vector2(0,0);
        events = new ArrayList<>();
        texture = null;
        observer = null;
        tag = 0;
    }
    
    public void drawEntity( Graphics g)
    {
        g.drawOval((int) getPosition().x, (int) getPosition().y, (int) getSize().x, (int) getSize().y);
        //g.drawImage(texture, (int) position.x, (int) position.y, (int) size.x, (int) size.y, observer);
    }

    public boolean contains( Vector2 point)
    {
        float up;
        float down;
        float right;
        float left;
        
        up = getPosition().y;
        down = up + getSize().y;
        left = getPosition().x;
        right = left + getSize().x;
        
        return (point.x <= right && point.x >= left && point.y >= up && point.y <= down);
    }
    
    /**
     * @return the position
     */
    public Vector2 getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Vector2 position) {
        this.position = position;
    }

    /**
     * @return the size
     */
    public Vector2 getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Vector2 size) {
        this.size = size;
    }

    /**
     * @return the velocity
     */
    public Vector2 getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    /**
     * @return the texture
     */
    public BufferedImage getTexture() {
        return texture;
    }

    /**
     * @param texture the texture to set
     */
    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    /**
     * @return the observer
     */
    public ImageObserver getObserver() {
        return observer;
    }

    /**
     * @param observer the observer to set
     */
    public void setObserver(ImageObserver observer) {
        this.observer = observer;
    }

    /**
     * @return the tag
     */
    public final int getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public final  void setTag(int tag) {
        this.tag = tag;
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
    
    public void addEvent( Event e)
    {
        events.add(e);
    }

    /**
     * @return the interactionEvent
     */
    public InteractionEvent getInteractionEvent() {
        return interactionEvent;
    }

    /**
     * @param interactionEvent the interactionEvent to set
     */
    public void setInteractionEvent(InteractionEvent interactionEvent) {
        this.interactionEvent = interactionEvent;
    }

}
