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
                destinationTile = board.getTile(destinationCoordinate)
                if (!destinationTile.hasPiece()) {
                    possibleMoves.add(Move(board, currentTile, destinationTile))
                } else {
                    if (destinationTile.piece?.team !== team) {
                        possibleMoves.add(Move(board, currentTile, destinationTile))
                    }
                    break
                }
            }
        }
        return possibleMoves
    }
}