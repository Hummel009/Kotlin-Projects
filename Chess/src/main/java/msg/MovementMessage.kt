package msg

import game.piece.Coordinate
import java.io.Serializable

class MovementMessage : Serializable {
    var isPieceKilled = false
    lateinit var destinationCoordinate: Coordinate
    lateinit var currentCoordinate: Coordinate
}