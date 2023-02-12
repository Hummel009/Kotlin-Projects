package game.gui;

import game.board.Board;
import game.piece.Coordinate;
import game.resource.BOARD_Configurations;
import side_client.Client;

import javax.swing.*;
import java.awt.*;


public class BoardPanel extends JPanel {

    private TilePanel boardTiles[][];

    public BoardPanel(Board chessBoard, Client client) {
        super(new GridLayout(BOARD_Configurations.ROW_COUNT, BOARD_Configurations.ROW_TILE_COUNT));
        this.boardTiles = new TilePanel[BOARD_Configurations.ROW_COUNT][BOARD_Configurations.ROW_TILE_COUNT];
        for (int i = 0; i < BOARD_Configurations.ROW_COUNT; i++) {
            for (int j = 0; j < BOARD_Configurations.ROW_TILE_COUNT; j++) {
                TilePanel tilePanel = new TilePanel(this, new Coordinate(j, i), chessBoard, client);
                this.boardTiles[i][j] = tilePanel;
                add(tilePanel);
            }

        }
    }

    public TilePanel[][] getBoardTiles() {
        return boardTiles;
    }

    public void setBoardTiles(TilePanel[][] boardTiles) {
        this.boardTiles = boardTiles;
    }

    public void updateBoardGUI(Board board) {
        for (int i = 0; i < BOARD_Configurations.ROW_COUNT; i++) {
            for (int j = 0; j < BOARD_Configurations.ROW_TILE_COUNT; j++) {
                boardTiles[i][j].assignTileColor(board);
                boardTiles[i][j].assignTilePieceIcon(board);

            }

        }
    }
}
