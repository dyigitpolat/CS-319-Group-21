/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasin
 */
public class Main {
    public static void main(String[] args) {
        HighScoreManager hm = new HighScoreManager();
        
        HighScore h1 = new HighScore(140, "Yiğit");
        HighScore h2 = new HighScore(130, "Selin");
        HighScore h3 = new HighScore(120, "Onur");
        HighScore h4 = new HighScore(110, "Yasin");
        HighScore h5 = new HighScore(1000, "Uğur");
        
        
        hm.addHighScore(h4);
        hm.addHighScore(h3);
        hm.addHighScore(h2);
        hm.addHighScore(h5);
        hm.addHighScore(h1);

        System.out.print(hm.getHighscoreString());
    }
}
