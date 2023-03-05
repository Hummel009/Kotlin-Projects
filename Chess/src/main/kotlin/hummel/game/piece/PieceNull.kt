package main.kotlin.hummel.game.piece

import main.kotlin.hummel.game.Move
import main.kotlin.hummel.game.board.Board
import java.util.*

class PieceNull : Piece(Team.NO_COLOR, PieceTypes.NULL) {
    override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
        return Collections.emptyList()
    }
}