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
 * @author onur.elbirlik 
 * 
 * version 1.1 by Selin Fildiş
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form JPanel
     */
    public MainMenu(JFrame comp) {
        initComponents();
        this.mainFrame = comp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JButton();
        highScores = new javax.swing.JButton();
        exitGame = new javax.swing.JButton();
        mainTitle = new javax.swing.JLabel();
        mainMenuTitle = new javax.swing.JLabel();
        tutorial = new javax.swing.JButton();
        loadGame = new javax.swing.JButton();
        newGame = new javax.swing.JButton();

        options.setText("Options");
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        highScores.setText("HighScores");
        highScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoresActionPerformed(evt);
            }
        });

        exitGame.setText("Exit Game");
        exitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameActionPerformed(evt);
            }
        });

        mainTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mainTitle.setText("Academic Warfare");

        mainMenuTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainMenuTitle.setText("Main Menu");

        tutorial.setText("Tutorial");
        tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialActionPerformed(evt);
            }
        });

        loadGame.setText("Load Game");
        loadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGameActionPerformed(evt);
            }
        });

        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(highScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(mainTitle)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenuTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(mainTitle)
                .addGap(18, 18, 18)
                .addComponent(mainMenuTitle)
                .addGap(48, 48, 48)
                .addComponent(newGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tutorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(options)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highScores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitGame)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        mainFrame.remove( this );
        mainFrame.add( new Options(mainFrame));
    }//GEN-LAST:event_optionsActionPerformed

    private void highScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoresActionPerformed
        // TODO add your handling code here:
        mainFrame.remove( this );
        mainFrame.add( new HighScore(mainFrame));
    }//GEN-LAST:event_highScoresActionPerformed

    private void exitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitGameActionPerformed

    private void tutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialActionPerformed
        // TODO add your handling code here:
         mainFrame.remove( this );
        mainFrame.add( new Tutorial(mainFrame));
    }//GEN-LAST:event_tutorialActionPerformed

    private void loadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGameActionPerformed
        // TODO add your handling code here:
         mainFrame.remove( this );
        mainFrame.add( new LoadGame(mainFrame));
    }//GEN-LAST:event_loadGameActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        
       mainFrame.setVisible(false);
       // TODO add your handling code here:
        EventQueue.invokeLater( new Runnable() 
        {
            @Override
            public void run() {
                AcademicWarfare prg = new AcademicWarfare();
                prg.setVisible(true);
            }
        });
        
       // oyunu başlat
    }//GEN-LAST:event_newGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitGame;
    private javax.swing.JButton highScores;
    private javax.swing.JButton loadGame;
    private javax.swing.JLabel mainMenuTitle;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JButton newGame;
    private javax.swing.JButton options;
    private javax.swing.JButton tutorial;
    private JFrame mainFrame;
    // End of variables declaration//GEN-END:variables
}
