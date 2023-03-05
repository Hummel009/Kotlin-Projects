package main.kotlin.hummel.game.gui

import main.kotlin.hummel.game.Data
import main.kotlin.hummel.game.board.Board
import main.kotlin.hummel.game.piece.Team
import main.kotlin.hummel.msg.Message
import main.kotlin.hummel.side_client.Client
import java.awt.BorderLayout
import java.awt.Color
import javax.swing.JFrame
import javax.swing.JOptionPane
import kotlin.system.exitProcess

class Table {
	var gameFrame: JFrame = JFrame("Chess")
	var mainMenu: MainMenu
	var client: Client
	lateinit var boardPanel: BoardPanel
	lateinit var chessBoard: Board
	lateinit var bottomGameMenu: InGameBottomMenu

	init {
		gameFrame.layout = BorderLayout()
		gameFrame.size = Data.OUTER_FRAME_DIMENSION
		mainMenu = MainMenu()
		client = Client(this)
		client.connect("127.0.0.1", 4000)
		if (client.socket == null) {
			JOptionPane.showMessageDialog(null, "Servera bağlanılamadı")
			exitProcess(0)
		}
		createMainMenu()
		gameFrame.isVisible = true
	}

	fun createMainMenu() {
		mainMenu.infoLBL!!.text = ""
		mainMenu.infoLBL!!.isVisible = false
		mainMenu.playBTN!!.addActionListener {
			if (!client.isPaired) {
				mainMenu.infoLBL!!.isVisible = true
				mainMenu.infoLBL!!.text = "Matching..."
				mainMenu.playBTN!!.isEnabled = false
				val msg = Message(Message.MessageTypes.PAIRING)
				msg.content = "ESLESME"
				client.send(msg)
			}
			if (client.isPaired) {
				mainMenu.infoLBL!!.text = "Matched"
				mainMenu.infoLBL!!.text = "Game is starting..."
				mainMenu.playBTN!!.isEnabled = true
				mainMenu.infoLBL!!.text = ""
				mainMenu.infoLBL!!.isVisible = false
				createGamePanel()
			}
		}
		gameFrame.add(mainMenu, BorderLayout.CENTER)
	}

	private fun createGamePanel() {
		gameFrame.remove(mainMenu)
		chessBoard = Board()
		boardPanel = BoardPanel(chessBoard, client)
		bottomGameMenu = InGameBottomMenu()
		bottomGameMenu.playersColorLBL.text = "Your color is " + client.team.toString()
		if (client.team === Team.WHITE) {
			bottomGameMenu.turnLBL.text = "Your Turn"
			bottomGameMenu.turnLBL.foreground = Color.GREEN
		} else {
			bottomGameMenu.turnLBL.text = "Enemy Turn"
			bottomGameMenu.turnLBL.foreground = Color.RED
		}
		gameFrame.add(boardPanel)
		gameFrame.add(boardPanel, BorderLayout.CENTER)
		gameFrame.add(bottomGameMenu, BorderLayout.PAGE_END)
		gameFrame.isVisible = true
	}
}