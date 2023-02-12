package game.pieces;

import game.boards.Board;
import game.move.Move;
import game.boards.Tile;
import java.util.ArrayList;
import java.util.List;
import game.resources.PIECE_Configurations;
import game.util.BoardUtilities;


public class Pawn extends Piece {

    public Pawn(Team team) {
        super(team, PieceTypes.PAWN);
    }

    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {
        List<Move> possibleMoves = new ArrayList<Move>();
        Tile currentTile = board.getTile(currentCoord);
        Tile destinationTile;

        
        for (Coordinate coord : (Coordinate[]) PIECE_Configurations.PAWN_MOVES.get(this.getTeam()).get("Normal")) {
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue;
            }
            destinationTile = board.getTile(currentCoord.plus(coord));
            if (!destinationTile.hasPiece()) {
                possibleMoves.add(new Move(board, currentTile, destinationTile));
            }
            
        }
        if (currentTile.getCoordinate().getY() == PIECE_Configurations.getPawnStartPosY(this.getTeam())) {
            for (Coordinate coord : (Coordinate[]) PIECE_Configurations.PAWN_MOVES.get(this.getTeam()).get("side_client.Start")) {
                if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                    continue;
                }
                destinationTile = board.getTile(currentCoord.plus(coord));
                if (!destinationTile.hasPiece()) {
                    possibleMoves.add(new Move(board, currentTile, destinationTile));
                }

            }
        }
        for (Coordinate coord : (Coordinate[]) PIECE_Configurations.PAWN_MOVES.get(this.getTeam()).get("Attack")) {

            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue;
            }
            destinationTile = board.getTile(currentCoord.plus(coord));

            if (!destinationTile.hasPiece()) {
                continue;
            } else {
                if (destinationTile.getPiece().getTeam() != this.getTeam()) {
                    possibleMoves.add(new Move(board, currentTile, destinationTile));
                }
            }
        }

        return possibleMoves;
    }

}
