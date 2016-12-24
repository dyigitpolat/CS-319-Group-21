/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets.menuframes;

import javax.swing.JFrame;

/**
 *
 * @author onur.elbirlik
 */
public class HighScorePanel extends javax.swing.JPanel {

    /**
     * Creates new form HighScoreTable
     */
    private JFrame mainFrame;
    public HighScorePanel(JFrame frame) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        highScoreTable = new javax.swing.JTable();
        returnToMainMenuButton = new javax.swing.JButton();
        HighScoreLable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));

        highScoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Selin", "sln", "100"},
                {"Yiğit", "ygt", "100"},
                {"Yasin", "ysn", "100"},
                {"Onur", "onr", null}
            },
            new String [] {
                "Name", "Nickname", "Score"
            }
        ));
        jScrollPane1.setViewportView(highScoreTable);
        if (highScoreTable.getColumnModel().getColumnCount() > 0) {
            highScoreTable.getColumnModel().getColumn(0).setResizable(false);
            highScoreTable.getColumnModel().getColumn(1).setResizable(false);
            highScoreTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            highScoreTable.getColumnModel().getColumn(2).setResizable(false);
        }

        returnToMainMenuButton.setText("Return Back To Main Menu");
        returnToMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainMenuButtonActionPerformed(evt);
            }
        });

        HighScoreLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HighScoreLable.setForeground(new java.awt.Color(240, 240, 240));
        HighScoreLable.setText("HighScores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(HighScoreLable)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(HighScoreLable)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(returnToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnToMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainMenuButtonActionPerformed
        // TODO add your handling code here:
        mainFrame.remove( this );
        mainFrame.add( new MainMenu(mainFrame));
        mainFrame.pack();
        mainFrame.repaint();
    }//GEN-LAST:event_returnToMainMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HighScoreLable;
    private javax.swing.JTable highScoreTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnToMainMenuButton;
    // End of variables declaration//GEN-END:variables
}