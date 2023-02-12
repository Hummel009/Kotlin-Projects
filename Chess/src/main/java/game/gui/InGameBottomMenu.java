package game.gui;

import javax.swing.*;
import java.awt.*;

public class InGameBottomMenu extends javax.swing.JPanel {
    public DefaultListModel<String> killedPiecesListModel;
    private javax.swing.JList<String> killedPiecesLIST;
    private javax.swing.JLabel playersColorLBL;
    private javax.swing.JLabel turnLBL;

    public InGameBottomMenu() {
        initComponents();
        killedPiecesListModel = new DefaultListModel<>();
        killedPiecesLIST.setModel(killedPiecesListModel);
    }

    public JLabel getPlayersColorLBL() {
        return playersColorLBL;
    }

    public JLabel getTurnLBL() {
        return turnLBL;
    }

    private void initComponents() {
        playersColorLBL = new javax.swing.JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        killedPiecesLIST = new javax.swing.JList<>();
        turnLBL = new javax.swing.JLabel();
        JLabel jLabel2 = new JLabel();

        playersColorLBL.setText("You're playing: ");

        jScrollPane2.setViewportView(killedPiecesLIST);

        turnLBL.setBackground(new java.awt.Color(13, 197, 197));
        turnLBL.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 24));
        turnLBL.setForeground(new java.awt.Color(153, 255, 153));
        turnLBL.setText("YOUR TURN!");

        jLabel2.setBackground(new java.awt.Color(0, 153, 102));
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("Killed piece");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(playersColorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(99, 99, 99).addComponent(turnLBL).addContainerGap(80, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(94, 94, 94).addComponent(jLabel2).addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(turnLBL).addComponent(playersColorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(17, 17, 17)));
    }
}
