/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author yigitpolat
 */
public class GameEngine
{
    Scene currentScene;
    PhysicsManager pm;
    DisplayManager dm;
    InteractionsManager im;
    EventManager em;
    
    
    int timeQuantum;
    int count = 0;
    
    
    public GameEngine()
    {
        timeQuantum = 10;
        pm = new PhysicsManager();
        dm = new DisplayManager();
        im = new InteractionsManager();
        em = new EventManager();
    }
    
    public void setScene( Scene scn)
    {
        currentScene = scn;
        initScene();
    }
    
    public void initScene()
    {
        Timer t = new Timer(timeQuantum, dm);
        currentScene.addMouseListener(im);
        currentScene.addMouseMotionListener(im);
        t.start();
    }
    
    public void updateScene()
    {
        pm.updatePhysics();
    }
    
    class EventManager
    {
        
    }
    
    class PhysicsManager
    {
        class Collision
        {
            GameObject obj1;
            GameObject obj2;
        }
        
        public void updatePhysics()
        {
            updatePositions();
        }
        
        public void updatePositions()
        {
            for( GameObject o : currentScene.getObjects())
            {
                o.getPosition().x += o.getVelocity().x / (1000 / timeQuantum);
                o.getPosition().y += o.getVelocity().y / (1000 / timeQuantum);
            }
        }
        
        public ArrayList<Collision> getCollisions()
        {
            
            return null;
        }
        
        
    }
    
    class DisplayManager implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            updateScene();
            currentScene.repaint();
        }
        
    }
    
    class InteractionsManager implements MouseListener, MouseMotionListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {
            count++;
            System.out.println(count);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            for( GameObject o : currentScene.getObjects())
            {
                if( o.contains( new Vector2( e.getX(), e.getY())))
                {
                    System.out.println("object pressed lol");
                }
            }
            count++;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            count++;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            count++;
        }

        @Override
        public void mouseExited(MouseEvent e) {
            count++;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            for( GameObject o : currentScene.getObjects())
            {
                if( o.contains( new Vector2( e.getX(), e.getY())))
                {
                    o.setPosition( new Vector2( e.getX() - o.getSize().x / 2, e.getY() - o.getSize().y / 2));
                }
            }
            
            count++;
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            
            count++;
        }
        
    }
}
