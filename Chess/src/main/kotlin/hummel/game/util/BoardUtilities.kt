package hummel.game.util

import hummel.game.Data
import hummel.game.board.Tile
import hummel.game.board.TileNull
import hummel.game.piece.*
import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.util.logging.Logger
import javax.imageio.ImageIO
import javax.swing.ImageIcon

object BoardUtilities {
	@JvmStatic
	fun isValidCoordinate(coord: Coordinate): Boolean {
		return coord.x >= Data.BOARD_LOWER_BOUND && coord.x <= Data.BOARD_UPPER_BOUND && coord.y >= Data.BOARD_LOWER_BOUND && coord.y <= Data.BOARD_UPPER_BOUND
	}

	@JvmStatic
	fun getImageOfTeamPiece(team: Team, pieceType: PieceTypes?): ImageIcon? {
		var imagePath = "src/main/kotlin/hummel/game/img/"
		if (pieceType == null) {
			imagePath += "transparent.png"
		} else {
			imagePath += if (team === Team.BLACK) {
				"black"
			} else {
				"white"
			}
			if (pieceType === PieceTypes.BISHOP) {
				imagePath += "_bishop.png"
			} else if (pieceType === PieceTypes.KING) {
				imagePath += "_king.png"
			} else if (pieceType === PieceTypes.QUEEN) {
				imagePath += "_queen.png"
			} else if (pieceType === PieceTypes.KNIGHT) {
				imagePath += "_knight.png"
			} else if (pieceType === PieceTypes.PAWN) {
				imagePath += "_pawn.png"
			} else if (pieceType === PieceTypes.ROOK) {
				imagePath += "_rook.png"
			}
		}
		try {
			val img = File(imagePath)
			val bufferedImage = ImageIO.read(img)
			return ImageIcon(bufferedImage)
		} catch (ex: IOException) {
			Logger.getLogger(Data::class.java.name).log(Level.SEVERE, null, ex)
		}
		return null
	}

	@JvmStatic
	fun createStandardBoardTiles(): Array<Array<Tile>> {
		val tiles: Array<Array<Tile>> = Array(Data.ROW_COUNT) {
			Array(Data.ROW_TILE_COUNT) { TileNull() }
		}
		tiles[0][0] = Tile(Coordinate(0, 0), Rook(Team.BLACK))
		tiles[1][0] = Tile(Coordinate(1, 0), Knight(Team.BLACK))
		tiles[2][0] = Tile(Coordinate(2, 0), Bishop(Team.BLACK))
		tiles[3][0] = Tile(Coordinate(3, 0), Queen(Team.BLACK))
		tiles[4][0] = Tile(Coordinate(4, 0), King(Team.BLACK))
		tiles[5][0] = Tile(Coordinate(5, 0), Bishop(Team.BLACK))
		tiles[6][0] = Tile(Coordinate(6, 0), Knight(Team.BLACK))
		tiles[7][0] = Tile(Coordinate(7, 0), Rook(Team.BLACK))
		for (i in 0..7) {
			tiles[i][1] = Tile(Coordinate(i, 1), Pawn(Team.BLACK))
			tiles[i][6] = Tile(Coordinate(i, 6), Pawn(Team.WHITE))
		}
		for (i in 2..5) {
			for (j in 0..7) {
				tiles[j][i] = Tile(Coordinate(j, i), PieceNull())
			}
		}
		tiles[0][7] = Tile(Coordinate(0, 7), Rook(Team.WHITE))
		tiles[1][7] = Tile(Coordinate(1, 7), Knight(Team.WHITE))
		tiles[2][7] = Tile(Coordinate(2, 7), Bishop(Team.WHITE))
		tiles[3][7] = Tile(Coordinate(3, 7), King(Team.WHITE))
		tiles[4][7] = Tile(Coordinate(4, 7), Queen(Team.WHITE))
		tiles[5][7] = Tile(Coordinate(5, 7), Bishop(Team.WHITE))
		tiles[6][7] = Tile(Coordinate(6, 7), Knight(Team.WHITE))
		tiles[7][7] = Tile(Coordinate(7, 7), Rook(Team.WHITE))
		return tiles
	}
}