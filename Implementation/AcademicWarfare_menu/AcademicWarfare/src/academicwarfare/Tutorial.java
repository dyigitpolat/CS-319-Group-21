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
public class Tutorial extends javax.swing.JPanel {

    /**
     * Creates new form Tutorial
     */
    public Tutorial() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tutorialText2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tutorialText1 = new javax.swing.JTextArea();
        returnToMainMenuButton = new javax.swing.JButton();

        tutorialText2.setColumns(20);
        tutorialText2.setRows(5);
        tutorialText2.setText("Lorem ipsum d\nolor sit amet, \nconsectetur adipiscing el\nit. Nam orci orci, aliquet u\nt ex eget, posuere varius urna. C\nurabitur rhoncus odio et sem ornare, \nrutrum tincidunt lorem interdum. Sed in \ntristique magna. Donec nec pretium arcu. S\ned varius purus in eleifend consequat. Interdu\nm et malesuada fames ac ante ipsum primis in faucibus. Q\nuisque auctor nibh sit amet risus gravida, vitae lobortis au\ngue malesuada. Aliquam magna felis, suscipit sit amet viverr\na vel, congue pharetra ex. Vivamus tempus tortor enim, aucto\nr pharetra tellus ornare ac. Integer placerat rhoncus magna,\n at pretium mi blandit et. Aliquam gravida et lorem et posue\nre. Duis vestibulum arcu diam. Ut a est est. Nam aliquet bla\nndit tortor et pulvinar.");
        jScrollPane1.setViewportView(tutorialText2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tutorial");

        tutorialText1.setColumns(20);
        tutorialText1.setRows(5);
        tutorialText1.setText("Lorem ipsum d\nolor sit amet, \nconsectetur adipiscing el\nit. Nam orci orci, aliquet u\nt ex eget, posuere varius urna. C\nurabitur rhoncus odio et sem ornare, \nrutrum tincidunt lorem interdum. Sed in \ntristique magna. Donec nec pretium arcu. S\ned varius purus in eleifend consequat. Interdu\nm et malesuada fames ac ante ipsum primis in faucibus. Q\nuisque auctor nibh sit amet risus gravida, vitae lobortis au\ngue malesuada. Aliquam magna felis, suscipit sit amet viverr\na vel, congue pharetra ex. Vivamus tempus tortor enim, aucto\nr pharetra tellus ornare ac. Integer placerat rhoncus magna,\n at pretium mi blandit et. Aliquam gravida et lorem et posue\nre. Duis vestibulum arcu diam. Ut a est est. Nam aliquet bla\nndit tortor et pulvinar.");
        jScrollPane2.setViewportView(tutorialText1);

        returnToMainMenuButton.setText("Return Back To Main Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(returnToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(252, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton returnToMainMenuButton;
    private javax.swing.JTextArea tutorialText1;
    private javax.swing.JTextArea tutorialText2;
    // End of variables declaration//GEN-END:variables
}
