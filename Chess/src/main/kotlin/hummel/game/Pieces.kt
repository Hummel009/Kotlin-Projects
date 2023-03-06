package hummel.game

import hummel.game.piece.Coordinate
import hummel.game.piece.Team
import java.util.*
import kotlin.collections.HashMap

object Pieces {
	var KNIGHT_MOVES = arrayOf(
		Coordinate(2, 1),
		Coordinate(-2, 1),
		Coordinate(2, -1),
		Coordinate(-2, -1),
		Coordinate(1, 2),
		Coordinate(-1, 2),
		Coordinate(1, -2),
		Coordinate(-1, -2)
	)
	var BISHOP_MOVES = arrayOf(Coordinate(1, 1), Coordinate(-1, 1), Coordinate(1, -1), Coordinate(-1, -1))
	var ROOK_MOVES = arrayOf(Coordinate(0, 1), Coordinate(0, -1), Coordinate(1, 0), Coordinate(-1, 0))
	var QUEEN_MOVES = arrayOf(
		Coordinate(0, 1),
		Coordinate(0, -1),
		Coordinate(1, 0),
		Coordinate(-1, 0),
		Coordinate(1, 1),
		Coordinate(-1, 1),
		Coordinate(1, -1),
		Coordinate(-1, -1)
	)
	private var BLACK_PAWN_NORMAL_MOVES = arrayOf(Coordinate(0, 1))
	private var WHITE_PAWN_NORMAL_MOVES = arrayOf(Coordinate(0, -1))
	private var WHITE_PAWN_ATTACK_MOVES = arrayOf(Coordinate(1, -1), Coordinate(-1, -1))
	private var BLACK_PAWN_ATTACK_MOVES = arrayOf(Coordinate(1, 1), Coordinate(-1, 1))
	private var BLACK_PAWN_START_MOVES = arrayOf(Coordinate(0, 2))
	private var WHITE_PAWN_START_MOVES = arrayOf(Coordinate(0, -2))
	private var BLACK_PAWNS_START_Y_POS = 1
	private var WHITE_PAWNS_START_Y_POS = 6
	var PAWN_MOVES: MutableMap<Team, MutableMap<String, Array<Coordinate>>> = EnumMap(Team::class.java)

	init {
		val whitePawnMoves: MutableMap<String, Array<Coordinate>> = HashMap()
		val blackPawnMoves: MutableMap<String, Array<Coordinate>> = HashMap()
		whitePawnMoves["Normal"] = WHITE_PAWN_NORMAL_MOVES
		whitePawnMoves["Attack"] = WHITE_PAWN_ATTACK_MOVES
		whitePawnMoves["Start"] = WHITE_PAWN_START_MOVES
		blackPawnMoves["Normal"] = BLACK_PAWN_NORMAL_MOVES
		blackPawnMoves["Attack"] = BLACK_PAWN_ATTACK_MOVES
		blackPawnMoves["Start"] = BLACK_PAWN_START_MOVES
		PAWN_MOVES[Team.WHITE] = whitePawnMoves
		PAWN_MOVES[Team.BLACK] = blackPawnMoves
	}

	fun getPawnStartPosY(team: Team): Int {
		return if (team === Team.WHITE) {
			WHITE_PAWNS_START_Y_POS
		} else {
			BLACK_PAWNS_START_Y_POS
		}
	}
}