package side_client

import game.Move
import game.piece.PieceTypes
import game.piece.Team
import msg.Message
import msg.Message.MessageTypes
import msg.MovementMessage
import java.awt.Color
import java.io.IOException
import java.util.logging.Level
import java.util.logging.Logger
import javax.swing.JOptionPane

class ClientListenThread(var client: Client) : Thread() {
    override fun run() {
        while (!client.socket!!.isClosed) {
            try {
                val msg = client.sInput!!.readObject() as Message
                when (msg.type) {
                    MessageTypes.START -> {
                        val serverChosenTeam = msg.content as Team?
                        client.team = serverChosenTeam!!
                    }

                    MessageTypes.PAIRING -> {
                        client.isPaired = true
                        client.game.getMainMenu().getPlayBTN().isEnabled = true
                        client.game.getMainMenu().getPlayBTN().text = "Start Game"
                        client.game.getMainMenu().getInfoLBL().text = "Matched. Click To Start Game"
                    }

                    MessageTypes.MOVE -> {
                        val movement = msg.content as MovementMessage?
                        val board = client.game.getChessBoard()
                        val player = board.getCurrentPlayer()
                        val move = Move(
                            board, board.getTile(movement!!.currentCoordinate), board.getTile(
                                movement.destinationCoordinate
                            )
                        )
                        player.makeMove(board, move)
                        client.game.getBoardPanel().updateBoardGUI(client.game.getChessBoard())
                        if (move.hasKilledPiece()) {
                            if (move.killedPiece!!.type === PieceTypes.KING) {
                                val winnerTeam: Team = if (move.killedPiece!!.team === Team.BLACK) Team.WHITE else Team.BLACK
                                JOptionPane.showMessageDialog(null, "Winner: $winnerTeam")
                                val message = Message(MessageTypes.END)
                                message.content = null
                                client.send(message)
                                break
                            }
                        }
                        board.changeCurrentPlayer()
                        client.game.getBottomGameMenu().getTurnLBL().text = "Your Turn"
                        client.game.getBottomGameMenu().getTurnLBL().foreground = Color.GREEN
                    }

                    MessageTypes.CHECK -> {
                        val checkStateTeam = msg.content as Team?
                        JOptionPane.showMessageDialog(null, "Check state for team: " + checkStateTeam.toString())
                    }

                    MessageTypes.LEAVE -> {
                        JOptionPane.showMessageDialog(null, "Enemy left. Returning to the Menu.")
                        client.game.getGameFrame().remove(client.game.getBoardPanel())
                        client.game.createMainMenu()
                    }

                    else -> {}
                }
            } catch (ex: IOException) {
                Logger.getLogger(ClientListenThread::class.java.name).log(Level.SEVERE, null, ex)
            } catch (ex: ClassNotFoundException) {
                println("Girilen class bulunamadı")
            }
        }
    }
}