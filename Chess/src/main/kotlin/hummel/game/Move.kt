package main.kotlin.hummel.game

import main.kotlin.hummel.game.board.Board
import main.kotlin.hummel.game.board.Tile
import main.kotlin.hummel.game.piece.Piece
import main.kotlin.hummel.game.piece.PieceNull
import java.io.Serializable

class Move(var board: Board, @JvmField var currentTile: Tile, @JvmField var destinationTile: Tile) : Serializable {

    @JvmField
    var killedPiece: Piece = PieceNull()

    init {
        if (destinationTile.hasPiece()) {
            killedPiece = destinationTile.piece
        }
    }

    fun hasKilledPiece(): Boolean {
        return killedPiece !is PieceNull
    }
}