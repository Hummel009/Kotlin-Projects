package game;

import game.board.Board;
import game.board.Tile;
import game.piece.Piece;

public class Move implements java.io.Serializable {
    public Board board;
    public Tile currentTile;
    public Tile destinationTile;
    public Piece movedPiece;
    public Piece killedPiece;

    public Move(Board board, Tile currentTile, Tile destinationTile) {
        this.board = board;
        this.currentTile = currentTile;
        this.destinationTile = destinationTile;
        this.movedPiece = currentTile.getPiece();
        if (destinationTile.hasPiece()) {
            killedPiece = destinationTile.getPiece();
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Tile getCurrentTile() {
        return currentTile;
    }

    public Tile getDestinationTile() {
        return destinationTile;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public boolean hasKilledPiece() {
        return this.killedPiece != null;
    }
}
