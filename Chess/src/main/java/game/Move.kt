package game

import game.board.Board
import game.board.Tile
import game.piece.Piece
import game.piece.PieceNull
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