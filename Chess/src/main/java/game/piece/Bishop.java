package game.piece;

import game.board.Board;
import game.board.Tile;
import game.Move;
import game.Pieces;
import game.util.BoardUtilities;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    public Bishop(Team team) {
        super(team, PieceTypes.BISHOP);
    }

    public List<Move> availableMoves(Board board, Coordinate currentCoord) {
        List<Move> possibleMoves = new ArrayList<>();
        Tile currentTile = board.getTile(currentCoord);
        Tile destinationTile;
        Coordinate destinationCoordinate;
        for (Coordinate coord : Pieces.BISHOP_MOVES) {
            destinationCoordinate = currentCoord;
            while (BoardUtilities.isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord);
                destinationTile = board.getTile(destinationCoordinate);
                if (!destinationTile.hasPiece()) {
                    possibleMoves.add(new Move(board, currentTile, destinationTile));
                } else {
                    if (destinationTile.getPiece().getTeam() != this.getTeam()) {
                        possibleMoves.add(new Move(board, currentTile, destinationTile));
                    }
                    break;
                }
            }
        }
        return possibleMoves;
    }
}
