package main.kotlin.hummel.game.board

import main.kotlin.hummel.game.Data
import main.kotlin.hummel.game.Player
import main.kotlin.hummel.game.piece.Coordinate
import main.kotlin.hummel.game.piece.PieceNull
import main.kotlin.hummel.game.piece.PieceTypes
import main.kotlin.hummel.game.piece.Team
import main.kotlin.hummel.game.util.BoardUtilities.createStandardBoardTiles
import java.io.Serializable

class Board : Serializable {
	private val tiles: Array<Array<Tile>>
	private val whitePlayer: Player = Player(Team.WHITE)
	private val blackPlayer: Player = Player(Team.BLACK)
	var currentPlayer: Player
	var chosenTile: Tile = TileNull()

	init {
		currentPlayer = whitePlayer
		tiles = createStandardBoardTiles()
	}

	fun setChosenTile2(chosenTile: Tile) {
		if (!chosenTile.hasPiece()) {
			this.chosenTile = TileNull()
		} else {
			this.chosenTile = chosenTile
		}
	}

	fun hasChosenTile(): Boolean {
		return if (chosenTile == TileNull()) {
			false
		} else chosenTile.piece !is PieceNull
	}

	fun getTile(coordinate: Coordinate): Tile {
		return getTile(coordinate.x, coordinate.y)
	}

	fun getTile(x: Int, y: Int): Tile {
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			println("Get Tile Index Bound Of Array")
			return TileNull()
		}
		return tiles[x][y]
	}

	fun getCoordOfGivenTeamPiece(team: Team, pieceType: PieceTypes): Coordinate? {
		for (i in 0 until Data.ROW_COUNT) {
			for (j in 0 until Data.ROW_TILE_COUNT) {
				if (!tiles[i][j].hasPiece()) {
					continue
				}
				if (tiles[i][j].piece.team === team && tiles[i][j].piece.type === pieceType) {
					return tiles[i][j].coordinate
				}
			}
		}
		return null
	}

	fun changeCurrentPlayer() {
		currentPlayer = if (currentPlayer == whitePlayer) {
			blackPlayer
		} else {
			whitePlayer
		}
	}
}