package game.board

import game.piece.Coordinate
import game.piece.Piece
import java.io.Serializable

class Tile(var coordinate: Coordinate, var piece: Piece?) : Serializable {
    fun hasPiece(): Boolean {
        return piece != null
    }

    override fun toString(): String {
        return coordinate.toString() + " Piece " + if (hasPiece()) piece.toString() else "Empty"
    }
}