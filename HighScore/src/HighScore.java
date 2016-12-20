
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasin
 */
public class HighScore implements Serializable, Comparable<HighScore> {
    
    //properties
    private int highscore;
    private String name;
    
    //constructor
    public HighScore(int highscore, String name)
    {
        this.highscore=highscore;
        this.name=name;
    }
    //get the name of the Highscore owner
    public String getName()
    {
        return name;
    }
    //get Highscore
    public int getScore()
    {
        return highscore;
    }
    
    @Override
    public int compareTo(HighScore h) {
        return ((Integer)(h.getScore())).compareTo(this.getScore());
    }
    
}
