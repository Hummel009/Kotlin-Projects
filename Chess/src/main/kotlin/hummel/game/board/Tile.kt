package main.kotlin.hummel.game.board

import main.kotlin.hummel.game.piece.Coordinate
import main.kotlin.hummel.game.piece.Piece
import main.kotlin.hummel.game.piece.PieceNull
import java.io.Serializable

open class Tile(var coordinate: Coordinate, var piece: Piece) : Serializable {
    fun hasPiece(): Boolean {
        return piece !is PieceNull
    }

    override fun toString(): String {
        return coordinate.toString() + " Piece " + if (hasPiece()) piece.toString() else "Empty"
    }
}