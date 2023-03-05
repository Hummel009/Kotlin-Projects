package main.kotlin.hummel.game.gui

import java.awt.Color
import java.awt.Font
import javax.swing.*

class InGameBottomMenu : JPanel() {
    var killedPiecesListModel: DefaultListModel<String>
    private var killedPiecesLIST: JList<String>? = null
    lateinit var playersColorLBL: JLabel
    lateinit var turnLBL: JLabel

    init {
        initComponents()
        killedPiecesListModel = DefaultListModel()
        killedPiecesLIST!!.model = killedPiecesListModel
    }

    private fun initComponents() {
        playersColorLBL = JLabel()
        val jScrollPane2 = JScrollPane()
        killedPiecesLIST = JList()
        turnLBL = JLabel()
        val jLabel2 = JLabel()
        playersColorLBL.text = "You're playing: "
        jScrollPane2.setViewportView(killedPiecesLIST)
        turnLBL.background = Color(13, 197, 197)
        turnLBL.font = Font("Segoe UI", Font.PLAIN, 24)
        turnLBL.foreground = Color(153, 255, 153)
        turnLBL.text = "YOUR TURN!"
        jLabel2.background = Color(0, 153, 102)
        jLabel2.foreground = Color(0, 255, 153)
        jLabel2.text = "Killed piece"
        val layout = GroupLayout(this)
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addGap(23, 23, 23).addGroup(
                    layout.createParallelGroup(
                        GroupLayout.Alignment.LEADING
                    ).addComponent(playersColorLBL, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                ).addGap(99, 99, 99).addComponent(turnLBL).addContainerGap(80, Short.MAX_VALUE.toInt())
            ).addGroup(
                layout.createSequentialGroup().addGap(94, 94, 94).addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE.toInt())
            )
        )
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(
                    layout.createParallelGroup(
                        GroupLayout.Alignment.BASELINE
                    ).addComponent(turnLBL)
                        .addComponent(playersColorLBL, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                ).addGap(18, 18, 18).addComponent(jLabel2).addPreferredGap(
                    LayoutStyle.ComponentPlacement.RELATED, 11, Int.MAX_VALUE
                ).addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
            )
        )
    }
}