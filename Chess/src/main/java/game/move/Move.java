package game.move;

import game.board.Board;
import game.board.Tile;
import game.piece.Piece;

public class Move implements java.io.Serializable {

    Board board;
    Tile currentTile;
    Tile destinationTile;
    Piece movedPiece;
    Piece killedPiece;

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

    public void setCurrentTile(Tile currentTile) {
        this.currentTile = currentTile;
    }

    public Tile getDestinationTile() {
        return destinationTile;
    }

    public void setDestinationTile(Tile destinationTile) {
        this.destinationTile = destinationTile;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    public boolean hasKilledPiece() {
        return this.killedPiece != null;
    }
}
