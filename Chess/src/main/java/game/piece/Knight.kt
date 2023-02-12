package game.piece

import game.Move
import game.Pieces
import game.board.Board
import game.board.Tile
import game.util.BoardUtilities

class Knight(team: Team) : Piece(team, PieceTypes.KNIGHT) {
    override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
        val possibleMoves: MutableList<Move> = ArrayList()
        var destinationTile: Tile
        for (coord in Pieces.KNIGHT_MOVES) {
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue
            }
            destinationTile = board.getTile(currentCoord.plus(coord))
            if (!destinationTile.hasPiece()) {
                possibleMoves.add(Move(board, board.getTile(currentCoord), destinationTile))
            } else {
                if (destinationTile.getPiece().team !== team) {
                    possibleMoves.add(Move(board, board.getTile(currentCoord), destinationTile))
                }
            }
        }
        return possibleMoves
    }
}