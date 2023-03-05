package game.gui

import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel
import kotlin.system.exitProcess

class MainMenu : JPanel() {
    private var exitBTN: JButton? = null
    @JvmField
    var infoLBL: JLabel? = null
    @JvmField
    var playBTN: JButton? = null

    init {
        initComponents()
    }

    private fun initComponents() {
        playBTN = JButton()
        exitBTN = JButton()
        infoLBL = JLabel()
        playBTN!!.text = "Search Match"
        playBTN!!.addActionListener { playBTNActionPerformed() }
        exitBTN!!.text = "Exit"
        exitBTN!!.addActionListener { exitBTNActionPerformed() }
        infoLBL!!.text = "Matching"
        val layout = GroupLayout(this)
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addGap(217, 217, 217).addGroup(
                    layout.createParallelGroup(
                        GroupLayout.Alignment.TRAILING, false
                    ).addComponent(playBTN, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE.toInt()).addComponent(
                        exitBTN,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE.toInt()
                    )
                ).addGap(40, 40, 40).addComponent(infoLBL).addContainerGap(134, Short.MAX_VALUE.toInt())
            )
        )
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(127, 127, 127).addGroup(
                    layout.createParallelGroup(
                        GroupLayout.Alignment.BASELINE
                    ).addComponent(playBTN).addComponent(infoLBL)
                ).addGap(29, 29, 29).addComponent(exitBTN).addContainerGap(190, Short.MAX_VALUE.toInt())
            )
        )
    }

    private fun playBTNActionPerformed() {}
    private fun exitBTNActionPerformed() {
        exitProcess(0)
    }
}