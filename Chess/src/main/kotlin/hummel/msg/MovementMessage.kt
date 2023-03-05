package main.kotlin.hummel.msg

import java.io.Serializable
import main.kotlin.hummel.game.piece.Coordinate

class MovementMessage : Serializable {
    var isPieceKilled = false
    lateinit var destinationCoordinate: Coordinate
    lateinit var currentCoordinate: Coordinate
}