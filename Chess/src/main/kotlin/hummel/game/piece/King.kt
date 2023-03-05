package main.kotlin.hummel.game.piece

import main.kotlin.hummel.game.Move
import main.kotlin.hummel.game.Pieces
import main.kotlin.hummel.game.board.Board
import main.kotlin.hummel.game.board.Tile
import main.kotlin.hummel.game.util.BoardUtilities

class King(team: Team) : Piece(team, PieceTypes.KING) {
	override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
		val possibleMoves: MutableList<Move> = ArrayList()
		val currentTile = board.getTile(currentCoord)
		var destinationTile: Tile
		var destinationCoordinate: Coordinate?
		for (coord in Pieces.QUEEN_MOVES) {
			destinationCoordinate = currentCoord.plus(coord)
			if (!BoardUtilities.isValidCoordinate(destinationCoordinate)) {
				continue
			}
			destinationTile = board.getTile(destinationCoordinate)
			if (!destinationTile.hasPiece()) {
				Move(board, currentTile, destinationTile).let { possibleMoves.add(it) }
			} else {
				if (destinationTile.piece.team !== team) {
					Move(board, currentTile, destinationTile).let { possibleMoves.add(it) }
				}
			}
		}
		return possibleMoves
	}
}