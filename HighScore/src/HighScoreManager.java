
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasin
 */
public class HighScoreManager {
    // Arraylist with 'Score' type to hold higscores
    private ArrayList<HighScore> highscores;
    //Create name of the file to save highscores
    private static final String HIGHSCORE_FILE = "HighScores.dat";
    //constructor
    public HighScoreManager()
    {
        //Init to ArrayList
        highscores= new ArrayList<HighScore>();
    }
    
    FileOutputStream fileOut=null;
    ObjectOutputStream output=null;
    
    FileInputStream fileIn=null;
    ObjectInputStream input=null;
    
    //Get highscore from the file
    public ArrayList<HighScore> getHighScores()
    {
        loadHighScoreFile();
        sortHighScores();
        return highscores;
    }
    
    //add a new high score to the file
    public void addHighScore( HighScore newHighScore) 
    {
        loadHighScoreFile();
        highscores.add(newHighScore);
        updateHighScores();
    }
    // loading highscores in the file
    public void loadHighScoreFile() 
    {
        try
        {
            fileIn = new  FileInputStream(HIGHSCORE_FILE);
            input = new ObjectInputStream(fileIn);
            highscores = (ArrayList<HighScore>) input.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("[Load] FileNotFound Error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("[Load] IOException Error: " + e.getMessage());
        }
        catch ( ClassNotFoundException e) {
            System.out.println("[Load] ClassNotFoundException Error: " + e.getMessage());
        }
        finally {
            
            try {
                if(output !=null)
                {
                    output.flush();
                    output.close();
                }    
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //add a new highscore to the file and update it
    public void updateHighScores()
    {
        try {
            
        fileOut = new FileOutputStream(HIGHSCORE_FILE);
        output = new ObjectOutputStream(fileOut);
        output.writeObject(highscores);
        
        } catch (FileNotFoundException e) {
            System.out.println("[Update] FileNotFound Error: " + e.getMessage() + ",the program will try and make a new file");
        }
        catch (IOException e) {
            System.out.println("[Update] IOException Error: " + e.getMessage());
        }
        finally {
            
            try {
                if(output !=null)
                {
                    output.flush();
                    output.close();
                }    
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    //sort highscores
    public void sortHighScores()
    {
        Collections.sort(highscores);
    }
    
    public String getHighscoreString() {
        String highscoreString = "";
	int max = 10;

        ArrayList<HighScore> hScores;
        hScores = getHighScores();

        int i = 0;
        int x = hScores.size();
        if (x > max) {
            x = max;
        }
        while (i < x) {
            highscoreString += (i + 1) + ".\t" + hScores.get(i).getName() + "\t\t" + hScores.get(i).getScore() + "\n";
            i++;
        }
        return highscoreString;
}
}
