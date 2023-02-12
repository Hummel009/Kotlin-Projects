package msg

import game.piece.Coordinate
import java.io.Serializable

class MovementMessage : Serializable {
    @JvmField
    var isPieceKilled = false
    @JvmField
    var destinationCoordinate: Coordinate? = null
    @JvmField
    var currentCoordinate: Coordinate? = null
}