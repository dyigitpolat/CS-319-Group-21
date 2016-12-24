/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

/**
 *
 * @author onur.elbirlik
 */
public class Options extends javax.swing.JPanel {

    /**
     * Creates new form Options
     */
    public Options() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        masterVolumeLabel = new javax.swing.JLabel();
        soundEffectsLable = new javax.swing.JLabel();
        backgroundMusicLable = new javax.swing.JLabel();
        masterVolumeBox = new javax.swing.JComboBox<>();
        soundEffectsBox = new javax.swing.JComboBox<>();
        backgroundMusicBox = new javax.swing.JComboBox<>();
        optionsLable = new javax.swing.JLabel();
        returnMainMenu = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));

        masterVolumeLabel.setForeground(new java.awt.Color(240, 240, 240));
        masterVolumeLabel.setText("Master Volume");

        soundEffectsLable.setForeground(new java.awt.Color(240, 240, 240));
        soundEffectsLable.setText("Sound Effects");

        backgroundMusicLable.setForeground(new java.awt.Color(240, 240, 240));
        backgroundMusicLable.setText("Background Music");

        masterVolumeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        masterVolumeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterVolumeBoxActionPerformed(evt);
            }
        });

        soundEffectsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        backgroundMusicBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        optionsLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optionsLable.setForeground(new java.awt.Color(240, 240, 240));
        optionsLable.setText("Options");

        returnMainMenu.setText("Return To Main Menu");
        returnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(masterVolumeLabel)
                            .addComponent(soundEffectsLable)
                            .addComponent(backgroundMusicLable))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backgroundMusicBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soundEffectsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(masterVolumeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(optionsLable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 226, Short.MAX_VALUE)
                .addComponent(returnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(optionsLable)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masterVolumeLabel)
                    .addComponent(masterVolumeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soundEffectsLable)
                    .addComponent(soundEffectsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backgroundMusicLable)
                    .addComponent(backgroundMusicBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(returnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void masterVolumeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterVolumeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masterVolumeBoxActionPerformed

    private void returnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMainMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnMainMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> backgroundMusicBox;
    private javax.swing.JLabel backgroundMusicLable;
    private javax.swing.JComboBox<String> masterVolumeBox;
    private javax.swing.JLabel masterVolumeLabel;
    private javax.swing.JLabel optionsLable;
    private javax.swing.JButton returnMainMenu;
    private javax.swing.JComboBox<String> soundEffectsBox;
    private javax.swing.JLabel soundEffectsLable;
    // End of variables declaration//GEN-END:variables
}
