package game.piece

import game.Move
import game.Pieces
import game.board.Board
import game.board.Tile
import game.util.BoardUtilities

class Pawn(team: Team) : Piece(team, PieceTypes.PAWN) {
    override fun availableMoves(board: Board, currentCoord: Coordinate): List<Move> {
        val possibleMoves: MutableList<Move> = ArrayList()
        val currentTile = board.getTile(currentCoord)
        var destinationTile: Tile
        for (coord in Pieces.PAWN_MOVES[team]!!["Normal"]!!) {
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue
            }
            destinationTile = board.getTile(currentCoord.plus(coord))
            if (!destinationTile.hasPiece()) {
                possibleMoves.add(Move(board, currentTile, destinationTile))
            }
        }
        if (currentTile.getCoordinate().y == Pieces.getPawnStartPosY(team)) {
            for (coord in Pieces.PAWN_MOVES[team]!!["Start"]!!) {
                if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                    continue
                }
                destinationTile = board.getTile(currentCoord.plus(coord))
                if (!destinationTile.hasPiece()) {
                    possibleMoves.add(Move(board, currentTile, destinationTile))
                }
            }
        }
        for (coord in Pieces.PAWN_MOVES[team]!!["Attack"]!!) {
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue
            }
            destinationTile = board.getTile(currentCoord.plus(coord))
            if (destinationTile.hasPiece()) {
                if (destinationTile.getPiece().team !== team) {
                    possibleMoves.add(Move(board, currentTile, destinationTile))
                }
            }
        }
        return possibleMoves
    }
}