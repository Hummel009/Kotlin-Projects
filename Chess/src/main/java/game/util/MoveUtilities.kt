package game.util

import game.Pieces
import game.board.Board
import game.board.Tile
import game.piece.Coordinate
import game.piece.PieceTypes
import game.piece.Team
import game.util.BoardUtilities.isValidCoordinate

object MoveUtilities {
    @JvmStatic
    fun isValidMove(board: Board, destinationTile: Tile): Boolean {
        if (!board.hasChosenTile()) {
            return false
        }
        for (m in board.getChosenTile().getPiece().availableMoves(board, board.getChosenTile().getCoordinate())) {
            if (m.destinationTile.getCoordinate() == destinationTile.getCoordinate()) {
                return true
            }
        }
        return false
    }

    @JvmStatic
    fun controlCheckState(board: Board, team: Team): Boolean {
        var destinationTile: Tile
        val currentCoord = board.getCoordOfGivenTeamPiece(team, PieceTypes.KING)
        for (coord in Pieces.KNIGHT_MOVES) {
            if (!isValidCoordinate(currentCoord.plus(coord))) {
                continue
            }
            destinationTile = board.getTile(currentCoord.plus(coord))
            if (destinationTile.hasPiece()) {
                if (destinationTile.getPiece().team !== team && destinationTile.getPiece()
                        .type === PieceTypes.KNIGHT
                ) {
                    return true
                }
            }
        }
        board.getTile(currentCoord)
        var destinationCoordinate: Coordinate
        for (coord in Pieces.ROOK_MOVES) {
            destinationCoordinate = currentCoord
            while (isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord)
                destinationTile = board.getTile(destinationCoordinate)
                if (destinationTile.hasPiece()) {
                    if (destinationTile.getPiece().team === team) {
                        break
                    }
                    return if (destinationTile.getPiece().team !== team && (destinationTile.getPiece()
                            .type === PieceTypes.ROOK || destinationTile.getPiece().type === PieceTypes.QUEEN)
                    ) {
                        true
                    } else {
                        break
                    }
                }
            }
        }
        for (coord in Pieces.BISHOP_MOVES) {
            destinationCoordinate = currentCoord
            while (isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord)
                destinationTile = board.getTile(destinationCoordinate)
                if (destinationTile.hasPiece()) {
                    if (destinationTile.getPiece().team === team) {
                        break
                    }
                    return if (destinationTile.getPiece().team !== team && (destinationTile.getPiece()
                            .type === PieceTypes.BISHOP || destinationTile.getPiece()
                            .type === PieceTypes.QUEEN)
                    ) {
                        true
                    } else {
                        break
                    }
                }
            }
        }
        for (coord in Pieces.PAWN_MOVES[team]!!["Attack"]!!) {
            if (!isValidCoordinate(currentCoord.plus(coord))) {
                continue
            }
            destinationTile = board.getTile(currentCoord.plus(coord))
            if (destinationTile.hasPiece()) {
                if (destinationTile.getPiece().team !== team && destinationTile.getPiece()
                        .type === PieceTypes.PAWN
                ) {
                    return true
                }
            }
        }
        return false
    }
}