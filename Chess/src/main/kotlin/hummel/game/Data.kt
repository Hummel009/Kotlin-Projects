package hummel.game

import java.awt.Color
import java.awt.Dimension

object Data {
	@JvmField
	var ROW_COUNT = 8

	@JvmField
	var ROW_TILE_COUNT = 8
	var BOARD_LOWER_BOUND = 0
	var BOARD_UPPER_BOUND = 7

	@JvmField
	var TILE_SIZE = 60

	@JvmField
	var OUTER_FRAME_DIMENSION = Dimension(600, 700)

	@JvmField
	var creamColor = Color(255, 229, 204)

	@JvmField
	var lightCyanColor = Color(204, 255, 255)
}