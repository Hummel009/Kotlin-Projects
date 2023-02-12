package game.util;

import game.board.Board;
import game.board.Tile;
import game.move.Move;
import game.piece.Coordinate;
import game.piece.PieceTypes;
import game.piece.Team;
import game.resource.PieceConfigurations;

public class MoveUtilities {
    public static boolean isValidMove(Board board, Tile destinationTile) {
        if (!board.hasChosenTile()) {
            return false;
        }
        for (Move m : board.getChosenTile().getPiece().availableMoves(board, board.getChosenTile().getCoordinate())) {
            if (m.getDestinationTile().getCoordinate().equals(destinationTile.getCoordinate())) {
                return true;
            }
        }
        return false;
    }

    public static boolean controlCheckState(Board board, Team team) {
        Tile destinationTile;
        Coordinate currentCoord = board.getCoordOfGivenTeamPiece(team, PieceTypes.KING);

        for (Coordinate coord : PieceConfigurations.KNIGHT_MOVES) {
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue;
            }
            destinationTile = board.getTile(currentCoord.plus(coord));
            if (destinationTile.hasPiece()) {
                if (destinationTile.getPiece().getTeam() != team && destinationTile.getPiece().getType() == PieceTypes.KNIGHT) {
                    return true;
                }
            }
        }

        board.getTile(currentCoord);
        Coordinate destinationCoordinate;
        for (Coordinate coord : PieceConfigurations.ROOK_MOVES) {
            destinationCoordinate = currentCoord;
            while (BoardUtilities.isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord);
                destinationTile = board.getTile(destinationCoordinate);
                if (destinationTile.hasPiece()) {
                    if (destinationTile.getPiece().getTeam() == team) {
                        break;
                    }
                    if (destinationTile.getPiece().getTeam() != team && (destinationTile.getPiece().getType() == PieceTypes.ROOK || destinationTile.getPiece().getType() == PieceTypes.QUEEN)) {
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }

        for (Coordinate coord : PieceConfigurations.BISHOP_MOVES) {
            destinationCoordinate = currentCoord;
            while (BoardUtilities.isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord);
                destinationTile = board.getTile(destinationCoordinate);
                if (destinationTile.hasPiece()) {
                    if (destinationTile.getPiece().getTeam() == team) {
                        break;
                    }
                    if (destinationTile.getPiece().getTeam() != team && (destinationTile.getPiece().getType() == PieceTypes.BISHOP || destinationTile.getPiece().getType() == PieceTypes.QUEEN)) {
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }

        for (Coordinate coord : (Coordinate[]) PieceConfigurations.PAWN_MOVES.get(team).get("Attack")) {
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue;
            }
            destinationTile = board.getTile(currentCoord.plus(coord));
            if (destinationTile.hasPiece()) {
                if (destinationTile.getPiece().getTeam() != team && destinationTile.getPiece().getType() == PieceTypes.PAWN) {
                    return true;
                }
            }
        }
        return false;
    }
}
