package game.boards;

import game.pieces.*;
import game.player.Player;
import game.resources.*;
import game.util.BoardUtilities;

public class Board implements java.io.Serializable{

    private final Tile[][] tiles;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    private Tile chosenTile = null;

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Tile getChosenTile() {
        return chosenTile;
    }

    public boolean hasChosenTile() {
        boolean hasChosen = false;
        if(chosenTile == null)
        {
            return false;
        }
        if(chosenTile.getPiece() == null)
        {
            return false;   
        }
        return true;
    }

    public void setChosenTile(Tile chosenTile) {
        if (!chosenTile.hasPiece()) {
            this.chosenTile = null;
        } else {
            this.chosenTile = chosenTile;
        }
    }

    public Tile getTile(Coordinate coordinate) {
        return getTile(coordinate.getX(), coordinate.getY());
    }

    public Board() {
        
        whitePlayer = new Player(Team.WHITE);
        blackPlayer = new Player(Team.BLACK);
        currentPlayer = whitePlayer;
        tiles = BoardUtilities.createStandartBoardTiles();

    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            System.out.println("Get Tile Index Bound Of Array");
            return null;
        }
        return tiles[x][y];
    }

    public Coordinate getCoordOfGivenTeamPiece(Team team, PieceTypes pieceType) {
        for (int i = 0; i < BOARD_Configurations.ROW_COUNT; i++) {
            for (int j = 0; j < BOARD_Configurations.ROW_TILE_COUNT; j++) {
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

    public Tile getTileOfGivenTeamPiece(Team team, PieceTypes pieceType) {
        for (int i = 0; i < BOARD_Configurations.ROW_COUNT; i++) {
            for (int j = 0; j < BOARD_Configurations.ROW_TILE_COUNT; j++) {
                if (!tiles[i][j].hasPiece()) {
                    continue;
                }
                if (tiles[i][j].getPiece().getTeam() == team && tiles[i][j].getPiece().getType() == pieceType) {
                    return tiles[i][j];
                }
            }
        }
        return null;
    }
}
