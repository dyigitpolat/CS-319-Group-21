/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author yigitpolat
 */
public class AcademicWarfare extends JFrame{

    GameEngine engine;
    
    public AcademicWarfare()
    {
        engine = new GameEngine();
        initScreen();
    }

    private void initScreen() 
    {
        //to be changed with a screen instead.
        Scene game_scr = new IceScene();
        add(game_scr);
        setSize(800, 600);
        setTitle("Academic Warfare");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Init game engine.
        engine.setScene(game_scr);
        
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame MenuFrame = new JFrame();
        MenuFrame.add( new MainMenu(MenuFrame));
        MenuFrame.setTitle("Academic Warfare");
        MenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.pack();
        MenuFrame.setLocationRelativeTo(null);
        MenuFrame.setVisible(true);
        
        
    }
    
}
