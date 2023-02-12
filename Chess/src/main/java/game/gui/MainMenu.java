package game.gui;

import javax.swing.*;

public class MainMenu extends javax.swing.JPanel {
    public javax.swing.JButton exitBTN;
    public javax.swing.JLabel infoLBL;
    public javax.swing.JButton playBTN;

    public MainMenu() {
        initComponents();
    }

    public JLabel getInfoLBL() {
        return infoLBL;
    }

    public JButton getPlayBTN() {
        return playBTN;
    }

    public void initComponents() {
        playBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        infoLBL = new javax.swing.JLabel();

        playBTN.setText("Search Match");
        playBTN.addActionListener(this::playBTNActionPerformed);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(this::exitBTNActionPerformed);

        infoLBL.setText("Matching");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(217, 217, 217).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(playBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE).addComponent(exitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(40, 40, 40).addComponent(infoLBL).addContainerGap(134, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(127, 127, 127).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(playBTN).addComponent(infoLBL)).addGap(29, 29, 29).addComponent(exitBTN).addContainerGap(190, Short.MAX_VALUE)));
    }

    public void playBTNActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
