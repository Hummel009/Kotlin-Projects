package game

import game.board.Board
import game.board.Tile
import game.piece.Piece
import java.io.Serializable

class Move(var board: Board, @JvmField var currentTile: Tile, @JvmField var destinationTile: Tile) : Serializable {

    @JvmField
    var killedPiece: Piece? = null

    init {
        if (destinationTile.hasPiece()) {
            killedPiece = destinationTile.getPiece()
        }
    }

    fun hasKilledPiece(): Boolean {
        return killedPiece != null
    }
}