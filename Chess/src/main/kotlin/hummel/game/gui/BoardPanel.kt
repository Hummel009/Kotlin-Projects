package hummel.game.gui

import hummel.game.Data
import hummel.game.board.Board
import hummel.game.piece.Coordinate
import hummel.side_client.Client
import java.awt.GridLayout
import javax.swing.JPanel

class BoardPanel(chessBoard: Board, client: Client) : JPanel(GridLayout(Data.ROW_COUNT, Data.ROW_TILE_COUNT)) {
	private var boardTiles: Array<Array<TilePanel?>> = Array(Data.ROW_COUNT) { arrayOfNulls(Data.ROW_TILE_COUNT) }

	init {
		for (i in 0 until Data.ROW_COUNT) {
			for (j in 0 until Data.ROW_TILE_COUNT) {
				val tilePanel = TilePanel(this, Coordinate(j, i), chessBoard, client)
				boardTiles[i][j] = tilePanel
				add(tilePanel)
			}
		}
	}

	fun updateBoardGUI(board: Board) {
		for (i in 0 until Data.ROW_COUNT) {
			for (j in 0 until Data.ROW_TILE_COUNT) {
				boardTiles[i][j]!!.assignTileColor(board)
				boardTiles[i][j]!!.assignTilePieceIcon(board)
			}
		}
	}
}