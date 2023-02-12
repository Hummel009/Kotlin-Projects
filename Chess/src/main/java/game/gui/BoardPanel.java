package game.gui;

import game.board.Board;
import game.piece.Coordinate;
import game.resource.BoardConfigurations;
import side_client.Client;

import javax.swing.*;
import java.awt.*;


public class BoardPanel extends JPanel {
    public TilePanel[][] boardTiles;

    public BoardPanel(Board chessBoard, Client client) {
        super(new GridLayout(BoardConfigurations.ROW_COUNT, BoardConfigurations.ROW_TILE_COUNT));
        this.boardTiles = new TilePanel[BoardConfigurations.ROW_COUNT][BoardConfigurations.ROW_TILE_COUNT];
        for (int i = 0; i < BoardConfigurations.ROW_COUNT; i++) {
            for (int j = 0; j < BoardConfigurations.ROW_TILE_COUNT; j++) {
                TilePanel tilePanel = new TilePanel(this, new Coordinate(j, i), chessBoard, client);
                this.boardTiles[i][j] = tilePanel;
                add(tilePanel);
            }
        }
    }

    public void updateBoardGUI(Board board) {
        for (int i = 0; i < BoardConfigurations.ROW_COUNT; i++) {
            for (int j = 0; j < BoardConfigurations.ROW_TILE_COUNT; j++) {
                boardTiles[i][j].assignTileColor(board);
                boardTiles[i][j].assignTilePieceIcon(board);
            }
        }
    }
}
