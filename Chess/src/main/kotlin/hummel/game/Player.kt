package main.kotlin.hummel.game

import main.kotlin.hummel.game.board.Board
import main.kotlin.hummel.game.piece.PieceNull
import main.kotlin.hummel.game.piece.Team
import java.io.Serializable

class Player(@JvmField var team: Team) : Serializable {

    fun makeMove(board: Board, move: Move) {
        board.getTile(move.destinationTile.coordinate).piece = move.currentTile.piece
        board.getTile(move.currentTile.coordinate).piece = PieceNull()
    }
}