package game.piece

import game.Move
import game.board.Board
import java.io.Serializable

abstract class Piece(val team: Team, val type: PieceTypes) : Serializable {
    override fun toString(): String {
        return "$team $type"
    }

    abstract fun availableMoves(board: Board, currentCoord: Coordinate) : List<Move>
}