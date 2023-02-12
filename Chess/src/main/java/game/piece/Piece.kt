package game.piece

import game.Move
import game.board.Board
import java.io.Serializable

abstract class Piece(team: Team, type: PieceTypes?) : Serializable {
    @JvmField
    var team: Team
    @JvmField
    var type: PieceTypes? = null

    init {
        this.team = team
        this.type = type
    }

    override fun toString(): String {
        return team.toString() + " " + type.toString()
    }

    abstract fun availableMoves(board: Board, currentCoord: Coordinate) : List<Move>
}