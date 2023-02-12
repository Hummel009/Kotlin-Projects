package game.pieces;

import game.boards.Board;
import game.boards.Tile;
import game.move.Move;
import game.resources.PIECE_Configurations;
import game.util.BoardUtilities;

import java.util.ArrayList;
import java.util.List;


public class Knight extends Piece {

    public Knight(Team team) {
        super(team, PieceTypes.KNIGHT);
    }

    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {

        List<Move> possibleMoves = new ArrayList<Move>();

        Tile destinationTile;

        for (Coordinate coord : PIECE_Configurations.KNIGHT_MOVES) {

            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue;
            }
            destinationTile = board.getTile(currentCoord.plus(coord));

            if (!destinationTile.hasPiece()) {
                possibleMoves.add(new Move(board, board.getTile(currentCoord), destinationTile));
            } else {
                if (destinationTile.getPiece().getTeam() != this.getTeam()) {
                    possibleMoves.add(new Move(board, board.getTile(currentCoord), destinationTile));
                }
            }
        }
        return possibleMoves;
    }
}
