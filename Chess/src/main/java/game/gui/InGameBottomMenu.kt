package game.gui

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
        Nokotlin.doSmth(layout, jLabel2, jScrollPane2, playersColorLBL, turnLBL)
    }
}