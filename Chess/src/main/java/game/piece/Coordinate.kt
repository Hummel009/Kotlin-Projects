package game.piece

import java.io.Serializable

class Coordinate(@JvmField val x: Int, @JvmField val y: Int) : Serializable {

    override fun toString(): String {
        return "[X:$x, Y:$y]"
    }

    override fun equals(other: Any?): Boolean {
        return ((other as Coordinate?)!!.x == x) && (other!!.y == y)
    }

    operator fun plus(coord: Coordinate): Coordinate {
        return Coordinate(x + coord.x, y + coord.y)
    }
}