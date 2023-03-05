package main.kotlin.hummel.game.piece

import main.kotlin.hummel.game.Move
import main.kotlin.hummel.game.Pieces
import main.kotlin.hummel.game.board.Board
import main.kotlin.hummel.game.board.Tile
import main.kotlin.hummel.game.util.BoardUtilities

class Bishop(team: Team) : Piece(team, PieceTypes.BISHOP) {
	override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
		val possibleMoves: MutableList<Move> = ArrayList()
		val currentTile = board.getTile(currentCoord)
		var destinationTile: Tile
		var destinationCoordinate: Coordinate
		for (coord in Pieces.BISHOP_MOVES) {
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