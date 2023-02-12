package game.piece;


import game.board.Board;
import game.board.Tile;
import game.Move;
import game.Pieces;
import game.util.BoardUtilities;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    public King(Team team) {
        super(team, PieceTypes.KING);
    }

    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {
        List<Move> possibleMoves = new ArrayList<>();
        Tile currentTile = board.getTile(currentCoord);
        Tile destinationTile;
        Coordinate destinationCoordinate;
        for (Coordinate coord : Pieces.QUEEN_MOVES) {
            destinationCoordinate = currentCoord.plus(coord);
            if (!BoardUtilities.isValidCoordinate(destinationCoordinate)) {
                continue;
            }
            destinationTile = board.getTile(destinationCoordinate);
            if (!destinationTile.hasPiece()) {
                possibleMoves.add(new Move(board, currentTile, destinationTile));
            } else {
                if (destinationTile.getPiece().getTeam() != this.getTeam()) {
                    possibleMoves.add(new Move(board, currentTile, destinationTile));
                }
            }
        }
        return possibleMoves;
    }
}
