package game.pieces;

import game.boards.Board;
import game.move.Move;
import game.boards.Tile;
import game.resources.PIECE_Configurations;
import game.util.BoardUtilities;
import java.util.ArrayList;
import java.util.List;


public class Queen extends Piece {

    public Queen(Team team) {
        super(team, PieceTypes.QUEEN);
    }

    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {

        List<Move> possibleMoves = new ArrayList<Move>();
        Tile currentTile = board.getTile(currentCoord);
        Tile destinationTile;
        Coordinate destinationCoordinate;
        for (Coordinate coord : PIECE_Configurations.QUUEN_MOVES) {
            destinationCoordinate = currentCoord;
            while (BoardUtilities.isValidCoordinate(destinationCoordinate.plus(coord))) {
                destinationCoordinate = destinationCoordinate.plus(coord);
                destinationTile = board.getTile(destinationCoordinate);
                if (!destinationTile.hasPiece()) {
                    possibleMoves.add(new Move(board, currentTile, destinationTile));
                } else {
                    if (destinationTile.getPiece().getTeam() != this.getTeam()) {
                        possibleMoves.add(new Move(board, currentTile, destinationTile));
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        return possibleMoves;

    }

}
