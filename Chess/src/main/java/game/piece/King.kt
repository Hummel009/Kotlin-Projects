package game.piece

import game.Move
import game.Pieces
import game.board.Board
import game.board.Tile
import game.util.BoardUtilities

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
            destinationTile = board.getTile(destinationCoordinate)!!
            if (!destinationTile.hasPiece()) {
                currentTile?.let { Move(board, it, destinationTile) }?.let { possibleMoves.add(it) }
            } else {
                if (destinationTile.piece?.team !== team) {
                    currentTile?.let { Move(board, it, destinationTile) }?.let { possibleMoves.add(it) }
                }
            }
        }
        return possibleMoves
    }
}