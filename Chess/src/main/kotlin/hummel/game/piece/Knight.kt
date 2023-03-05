package main.kotlin.hummel.game.piece

import main.kotlin.hummel.game.Move
import main.kotlin.hummel.game.Pieces
import main.kotlin.hummel.game.board.Board
import main.kotlin.hummel.game.board.Tile
import main.kotlin.hummel.game.util.BoardUtilities

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
                if (destinationTile.piece.team !== team) {
                    possibleMoves.add(Move(board, board.getTile(currentCoord), destinationTile))
                }
            }
        }
        return possibleMoves
    }
}