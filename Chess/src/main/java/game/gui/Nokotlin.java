package game.gui;

import javax.swing.*;

public class Nokotlin {
    public static void doSmth(GroupLayout layout, JLabel jLabel2, JScrollPane jScrollPane2, JLabel playersColorLBL, JLabel turnLBL) {
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(playersColorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(99, 99, 99).addComponent(turnLBL).addContainerGap(80, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(94, 94, 94).addComponent(jLabel2).addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(turnLBL).addComponent(playersColorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(17, 17, 17)));
    }
}
