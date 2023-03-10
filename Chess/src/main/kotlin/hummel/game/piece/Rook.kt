package hummel.game.piece

import hummel.game.Move
import hummel.game.Pieces
import hummel.game.board.Board
import hummel.game.board.Tile
import hummel.game.util.BoardUtilities

class Rook(team: Team) : Piece(team, PieceTypes.ROOK) {
	override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
		val possibleMoves: MutableList<Move> = ArrayList()
		val currentTile = board.getTile(currentCoord)
		var destinationTile: Tile
		var destinationCoordinate: Coordinate
		for (coord in Pieces.ROOK_MOVES) {
			destinationCoordinate = currentCoord
			while (BoardUtilities.isValidCoordinate(destinationCoordinate.plus(coord))) {
				destinationCoordinate = destinationCoordinate.plus(coord)
				destinationTile = board.getTile(destinationCoordinate)
				if (!destinationTile.hasPiece()) {
					Move(board, currentTile, destinationTile).let { possibleMoves.add(it) }
				} else {
					if (destinationTile.piece.team !== team) {
						Move(board, currentTile, destinationTile).let { possibleMoves.add(it) }
					}
					break
				}
			}
		}
		return possibleMoves
	}
}