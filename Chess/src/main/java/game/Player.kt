package game

import game.board.Board
import game.piece.Team
import java.io.Serializable

class Player(@JvmField var team: Team) : Serializable {

    fun makeMove(board: Board, move: Move) {
        board.getTile(move.destinationTile.coordinate)?.piece = move.currentTile.piece
        board.getTile(move.currentTile.coordinate)?.piece = null
    }
}