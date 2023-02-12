package game.gui;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MainMenu extends javax.swing.JPanel {

        public MainMenu() {
        initComponents();

    }

    public JButton getExitBTN() {
        return exitBTN;
    }

   
    public JLabel getInfoLBL() {
        return infoLBL;
    }

    public JButton getPlayBTN() {
        return playBTN;
    }

    

        @SuppressWarnings("unchecked")
    
    private void initComponents() {

        playBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        infoLBL = new javax.swing.JLabel();

        playBTN.setText("Search Match");
        playBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        infoLBL.setText("Matching");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(exitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(infoLBL)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBTN)
                    .addComponent(infoLBL))
                .addGap(29, 29, 29)
                .addComponent(exitBTN)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }


    private void playBTNActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel infoLBL;
    private javax.swing.JButton playBTN;
    
}
