package game.board;

import game.piece.Coordinate;
import game.piece.PieceTypes;
import game.piece.Team;
import game.Player;
import game.Data;
import game.util.BoardUtilities;

public class Board implements java.io.Serializable {
    public final Tile[][] tiles;
    public final Player whitePlayer;
    public final Player blackPlayer;
    public Player currentPlayer;
    public Tile chosenTile = null;

    public Board() {
        whitePlayer = new Player(Team.WHITE);
        blackPlayer = new Player(Team.BLACK);
        currentPlayer = whitePlayer;
        tiles = BoardUtilities.createStandardBoardTiles();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Tile getChosenTile() {
        return chosenTile;
    }

    public void setChosenTile(Tile chosenTile) {
        if (!chosenTile.hasPiece()) {
            this.chosenTile = null;
        } else {
            this.chosenTile = chosenTile;
        }
    }

    public boolean hasChosenTile() {
        if (chosenTile == null) {
            return false;
        }
        return chosenTile.getPiece() != null;
    }

    public Tile getTile(Coordinate coordinate) {
        return getTile(coordinate.getX(), coordinate.getY());
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            System.out.println("Get Tile Index Bound Of Array");
            return null;
        }
        return tiles[x][y];
    }

    public Coordinate getCoordOfGivenTeamPiece(Team team, PieceTypes pieceType) {
        for (int i = 0; i < Data.ROW_COUNT; i++) {
            for (int j = 0; j < Data.ROW_TILE_COUNT; j++) {
                if (!tiles[i][j].hasPiece()) {
                    continue;
                }
                if (tiles[i][j].getPiece().getTeam() == team && tiles[i][j].getPiece().getType() == pieceType) {
                    return tiles[i][j].getCoordinate();
                }
            }
        }
        return null;
    }

    public void changeCurrentPlayer() {
        if (currentPlayer == whitePlayer) {
            currentPlayer = blackPlayer;
        } else {
            currentPlayer = whitePlayer;
        }
    }
}
