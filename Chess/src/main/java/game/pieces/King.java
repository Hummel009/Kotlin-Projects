package game.pieces;


import game.boards.Board;
import game.boards.Tile;
import game.move.Move;
import game.resources.PIECE_Configurations;
import game.util.BoardUtilities;

import java.util.ArrayList;
import java.util.List;


public class King extends Piece {

    private boolean castlingDone = false;

    public King(Team team) {
        super(team, PieceTypes.KING);
    }

    public boolean isCastlingDone() {
        return castlingDone;
    }

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }

    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {
        List<Move> possibleMoves = new ArrayList<Move>();
        Tile currentTile = board.getTile(currentCoord);
        Tile destinationTile;
        Coordinate destinationCoordinate;
        for (Coordinate coord : PIECE_Configurations.QUUEN_MOVES) {
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