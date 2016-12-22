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
        Scene game_scr = new ForestScene();
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
        
        EventQueue.invokeLater( new Runnable() 
        {
            @Override
            public void run() {
                AcademicWarfare prg = new AcademicWarfare();
                prg.setVisible(true);
            }
        });
    }
    
}
