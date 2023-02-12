/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game.gui;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
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

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    }// </editor-fold>//GEN-END:initComponents


    private void playBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel infoLBL;
    private javax.swing.JButton playBTN;
    // End of variables declaration//GEN-END:variables
}
