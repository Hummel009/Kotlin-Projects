package game

import game.board.Board
import game.piece.Team
import java.io.Serializable

class Player(@JvmField var team: Team) : Serializable {

    fun makeMove(board: Board, move: Move) {
        board.getTile(move.destinationTile.getCoordinate()).setPiece(move.currentTile.getPiece())
        board.getTile(move.currentTile.getCoordinate()).setPiece(null)
    }
}