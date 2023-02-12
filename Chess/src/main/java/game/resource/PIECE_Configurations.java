package game.resource;

import game.piece.Coordinate;
import game.piece.Team;

import java.util.HashMap;
import java.util.Map;

public class PIECE_Configurations {


    public static Coordinate[] KNIGHT_MOVES = {new Coordinate(2, 1), new Coordinate(-2, 1), new Coordinate(2, -1), new Coordinate(-2, -1), new Coordinate(1, 2), new Coordinate(-1, 2), new Coordinate(1, -2), new Coordinate(-1, -2)};


    public static Coordinate[] BISHOP_MOVES = {new Coordinate(1, 1), new Coordinate(-1, 1), new Coordinate(1, -1), new Coordinate(-1, -1)};


    public static Coordinate[] ROOK_MOVES = {new Coordinate(0, 1), new Coordinate(0, -1), new Coordinate(1, 0), new Coordinate(-1, 0)};


    public static Coordinate[] QUUEN_MOVES = {new Coordinate(0, 1), new Coordinate(0, -1), new Coordinate(1, 0), new Coordinate(-1, 0), new Coordinate(1, 1), new Coordinate(-1, 1), new Coordinate(1, -1), new Coordinate(-1, -1)};


    public static Coordinate[] BLACK_PAWN_NORMAL_MOVES = {new Coordinate(0, 1)};


    public static Coordinate[] WHITE_PAWN_NORMAL_MOVES = {new Coordinate(0, -1)};


    public static Coordinate[] WHITE_PAWN_ATTACK_MOVES = {new Coordinate(1, -1), new Coordinate(-1, -1)};


    public static Coordinate[] BLACK_PAWN_ATTACK_MOVES = {new Coordinate(1, 1), new Coordinate(-1, 1)};


    public static Coordinate[] BLACK_PAWN_START_MOVES = {new Coordinate(0, 2)};


    public static Coordinate[] WHITE_PAWN_START_MOVES = {new Coordinate(0, -2)};

    public static int BLACK_PAWNS_START_Y_POS = 1;

    public static int WHITE_PAWNS_START_Y_POS = 6;

    public static Map<Team, Map> PAWN_MOVES;

    static {
        PAWN_MOVES = new HashMap<>();
        Map<String, Coordinate[]> whitePawnMoves = new HashMap<>();
        Map<String, Coordinate[]> blackPawnMoves = new HashMap<>();
        whitePawnMoves.put("Normal", WHITE_PAWN_NORMAL_MOVES);
        whitePawnMoves.put("Attack", WHITE_PAWN_ATTACK_MOVES);
        whitePawnMoves.put("Start", WHITE_PAWN_START_MOVES);
        blackPawnMoves.put("Normal", BLACK_PAWN_NORMAL_MOVES);
        blackPawnMoves.put("Attack", BLACK_PAWN_ATTACK_MOVES);
        blackPawnMoves.put("Start", BLACK_PAWN_START_MOVES);
        PAWN_MOVES.put(Team.WHITE, whitePawnMoves);
        PAWN_MOVES.put(Team.BLACK, blackPawnMoves);

    }

    public static int getPawnStartPosY(Team team) {
        if (team == Team.WHITE) {
            return WHITE_PAWNS_START_Y_POS;
        } else {
            return BLACK_PAWNS_START_Y_POS;
        }
    }
}
