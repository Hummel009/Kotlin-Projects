package hummel.game.piece

import hummel.game.Move
import hummel.game.board.Board
import java.util.*

class PieceNull : Piece(Team.NO_COLOR, PieceTypes.NULL) {
	override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
		return emptyList()
	}
} 