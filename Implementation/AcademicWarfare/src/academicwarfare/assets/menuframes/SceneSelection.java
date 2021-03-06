/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets.menuframes;

import academicwarfare.AcademicWarfare;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author onur.elbirlik
 */
public class SceneSelection extends javax.swing.JPanel {

    /**
     * Creates new form SceneSelection
     */
    
    private JFrame mainFrame;
    public SceneSelection(JFrame frame) {
        initComponents();
        this.mainFrame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forest = new javax.swing.JLabel();
        grassSelect = new javax.swing.JButton();
        sceneSelectionText = new javax.swing.JLabel();
        clickOnTheSceneText = new javax.swing.JLabel();
        grass = new javax.swing.JLabel();
        iceSelect = new javax.swing.JButton();
        forestSelect = new javax.swing.JButton();
        ice = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));

        forest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academicwarfare/assets/menuframes/ormantile.png"))); // NOI18N
        forest.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        grassSelect.setText("Grass");
        grassSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grassSelectActionPerformed(evt);
            }
        });

        sceneSelectionText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sceneSelectionText.setForeground(new java.awt.Color(255, 255, 255));
        sceneSelectionText.setText("Scene Selection");

        clickOnTheSceneText.setBackground(new java.awt.Color(255, 255, 255));
        clickOnTheSceneText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clickOnTheSceneText.setForeground(new java.awt.Color(255, 255, 255));
        clickOnTheSceneText.setText("Please click on the scene that you want to play with");

        grass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academicwarfare/assets/menuframes/normal-dış_1.png"))); // NOI18N
        grass.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        iceSelect.setText("Ice");
        iceSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceSelectActionPerformed(evt);
            }
        });

        forestSelect.setBackground(new java.awt.Color(255, 255, 255));
        forestSelect.setText("Forest");
        forestSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forestSelectActionPerformed(evt);
            }
        });

        ice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academicwarfare/assets/menuframes/buz.png"))); // NOI18N
        ice.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grassSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ice, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iceSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forestSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clickOnTheSceneText)
                        .addGap(74, 74, 74))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(sceneSelectionText)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(sceneSelectionText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(clickOnTheSceneText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grassSelect)
                    .addComponent(iceSelect)
                    .addComponent(forestSelect))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forest, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void grassSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grassSelectActionPerformed
        // TODO add your handling code here:
        mainFrame.setVisible(false);
       // TODO add your handling code here:
        EventQueue.invokeLater( new Runnable() 
        {
            @Override
            public void run() {
                AcademicWarfare prg = new AcademicWarfare(1);
                prg.setVisible(true);
            }
        });
    }//GEN-LAST:event_grassSelectActionPerformed

    private void iceSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceSelectActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        mainFrame.setVisible(false);
       // TODO add your handling code here:
        EventQueue.invokeLater( new Runnable() 
        {
            @Override
            public void run() {
                AcademicWarfare prg = new AcademicWarfare(0);
                prg.setVisible(true);
            }
        });
    }//GEN-LAST:event_iceSelectActionPerformed

    private void forestSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forestSelectActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        mainFrame.setVisible(false);
       // TODO add your handling code here:
        EventQueue.invokeLater( new Runnable() 
        {
            @Override
            public void run() {
                AcademicWarfare prg = new AcademicWarfare(2);
                prg.setVisible(true);
            }
        });
    }//GEN-LAST:event_forestSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clickOnTheSceneText;
    private javax.swing.JLabel forest;
    private javax.swing.JButton forestSelect;
    private javax.swing.JLabel grass;
    private javax.swing.JButton grassSelect;
    private javax.swing.JLabel ice;
    private javax.swing.JButton iceSelect;
    private javax.swing.JLabel sceneSelectionText;
    // End of variables declaration//GEN-END:variables
}
