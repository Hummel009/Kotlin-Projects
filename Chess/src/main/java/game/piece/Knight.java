package game.piece;

import game.board.Board;
import game.board.Tile;
import game.Move;
import game.Pieces;
import game.util.BoardUtilities;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(Team team) {
        super(team, PieceTypes.KNIGHT);
    }

    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {
        List<Move> possibleMoves = new ArrayList<>();
        Tile destinationTile;
        for (Coordinate coord : Pieces.KNIGHT_MOVES) {
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
