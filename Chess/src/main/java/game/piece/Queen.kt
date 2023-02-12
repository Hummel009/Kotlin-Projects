package game.piece

import game.Move
import game.Pieces
import game.board.Board
import game.board.Tile
import game.util.BoardUtilities

class Queen(team: Team) : Piece(team, PieceTypes.QUEEN) {
    override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
        val possibleMoves: MutableList<Move> = ArrayList()
        val currentTile = board.getTile(currentCoord)
        var destinationTile: Tile
        var destinationCoordinate: Coordinate
        for (coord in Pieces.QUEEN_MOVES) {
            destinationCoordinate = currentCoord
            while (BoardUtilities.isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord)
                destinationTile = board.getTile(destinationCoordinate)!!
                if (!destinationTile.hasPiece()) {
                    currentTile?.let { Move(board, it, destinationTile) }?.let { possibleMoves.add(it) }
                } else {
                    if (destinationTile.piece?.team !== team) {
                        currentTile?.let { Move(board, it, destinationTile) }?.let { possibleMoves.add(it) }
                    }
                    break
                }
            }
        }
        return possibleMoves
    }
}