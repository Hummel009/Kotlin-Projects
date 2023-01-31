import java.util.*

var input = Scanner(System.`in`)

fun main() {
    println("─────────────────────────────────────────────────────────────────────────")
    println("─██████──────────██████─██████████████─██████████████████─██████████████─")
    println("─██░░██████████████░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░░░██─██░░░░░░░░░░██─")
    println("─██░░░░░░░░░░░░░░░░░░██─██░░██████░░██─████████████░░░░██─██░░██████████─")
    println("─██░░██████░░██████░░██─██░░██──██░░██─────────████░░████─██░░██─────────")
    println("─██░░██──██░░██──██░░██─██░░██████░░██───────████░░████───██░░██████████─")
    println("─██░░██──██░░██──██░░██─██░░░░░░░░░░██─────████░░████─────██░░░░░░░░░░██─")
    println("─██░░██──██████──██░░██─██░░██████░░██───████░░████───────██░░██████████─")
    println("─██░░██──────────██░░██─██░░██──██░░██─████░░████─────────██░░██─────────")
    println("─██░░██──────────██░░██─██░░██──██░░██─██░░░░████████████─██░░██████████─")
    println("─██░░██──────────██░░██─██░░██──██░░██─██░░░░░░░░░░░░░░██─██░░░░░░░░░░██─")
    println("─██████──────────██████─██████──██████─██████████████████─██████████████─")
    println("─────────────────────────────────────────────────────────────────────────")

    var floor: Floors?
    do {
        println("Enter the color of the floor: ")
        val color = input.nextLine()
        floor = Floors.forName(color)
    } while (floor == null)

    println("Enter the color of the room (green, black, grey): ")
    val color = input.nextLine()

    println("Enter the glowing of the room (true/false): ")
    val glowing = input.nextLine()

    println("Enter the glowing type of the room (true/false): ")
    val direct = input.nextLine()

    println("Enter the med environment of the room (true/false): ")
    val environment = input.nextLine()

    var type: Room.RoomType?
    var wtype: Room.WindowType?

    do {
        println("Enter the room type of the room: ")
        val r = input.nextLine()
        type = Room.RoomType.forName(r)
    } while (type == null)

    do {
        println("Enter the window type of the room: ")
        val w = input.nextLine()
        wtype = Room.WindowType.forName(w)
    } while (wtype == null)


    val rm = Room(color, glowing, direct, environment, type, wtype)

    var i = 0

    val room: Array<Room?> = arrayOfNulls(216)


    for (f in Floors.values()) {
        for (b1 in arrayOf("true", "false")) {
            for (b2 in arrayOf("true", "false")) {
                for (b3 in arrayOf("true", "false")) {
                    for (r in Room.RoomType.values()) {
                        for (w in Room.WindowType.values()) {
                            room[i] = Room(f.eName, b1, b2, b3, r, w)
                            i++
                        }
                    }
                }
            }
        }
    }


    val blackRoom = Room("grey", "true", "false", "false", Room.RoomType.ROOM, Room.WindowType.SMALL)
    val lab = Room("grey", "true", "true", "true", Room.RoomType.ROOM, Room.WindowType.BIG)
    val prison = Room("green", "false", "false", "false", Room.RoomType.ROOM, Room.WindowType.NONE)

    println("|=======================================|")
    println("|==============  GO BACK  ==============|")
    println("|=======================================|")
    println()

    when (floor) {
        Floors.ONE -> if (compareRooms(rm, blackRoom)) {
            println("You are on the first floor.\n" + "Turn left and go " + 12 + " steps.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 50 + " steps.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 18 + " steps.\n" + "Turn to the angle of " + 90 + " degrees to right and go forward.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 48 + " steps.\n" + "Then use lift." + "Turn to the angle of " + 45 + " degrees to left and go " + 50 + " metres.\n")
        } else {
            val rand = Random()
            val left1 = rand.nextInt(20) + 20
            val left2 = rand.nextInt(20) + 20
            val right = rand.nextInt(20) + 20

            println("You are on the second floor.\nTurn left and go $left1 steps.\nThen turn right and go $right steps.\nTurn left and go $left2 steps.\nThen use lift.\n")
            drawAsAMatrix(left1, right, left2)
        }

        Floors.TWO -> if (compareRooms(rm, lab)) {
            println("You are on the second floor.\n" + "Turn to the angle of " + 45 + " degrees to right and go forward.\n" + "Turn to the angle of " + 90 + " degrees to right and go forward.\n" + "Turn to the angle of " + 45 + " degrees to right and go forward.\n" + "Then use lift.\n" + "You are on the first floor.\n" + "Turn left and go " + 12 + " steps.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 50 + " steps.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 18 + " steps.\n" + "Turn to the angle of " + 90 + " degrees to right and go forward.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 48 + " steps.\n" + "Then use lift." + "Turn to the angle of " + 45 + " degrees to left and go " + 50 + " metres.\n")
        } else {
            val rand = Random()
            val left1 = rand.nextInt(20) + 20
            val left2 = rand.nextInt(20) + 20
            val right = rand.nextInt(20) + 20

            println("You are on the second floor.\nTurn left and go $left1 steps.\nThen turn right and go $right steps.\nTurn left and go $left2 steps.\nThen use lift.\n")
            drawAsAMatrix(left1, right, left2)
        }

        Floors.THREE -> if (compareRooms(rm, prison)) {
            println("You are on the third floor.\n" + "Turn left and go " + 8 + " steps.\n" + "Then use lift.\n" + "You are on the second floor.\n" + "Turn to the angle of " + 45 + " degrees to right and go forward.\n" + "Turn to the angle of " + 90 + " degrees to right and go forward.\n" + "Turn to the angle of " + 45 + " degrees to right and go forward.\n" + "Then use lift.\n" + "You are on the first floor.\n" + "Turn left and go " + 12 + " steps.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 50 + " steps.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 18 + " steps.\n" + "Turn to the angle of " + 90 + " degrees to right and go forward.\n" + "Turn to the angle of " + 45 + " degrees to right and go " + 48 + " steps.\n" + "Then use lift.\n" + "Turn to the angle of " + 45 + " degrees to left and go " + 50 + " metres.\n")
        } else {
            val rand = Random()
            val left1 = rand.nextInt(20) + 20
            val left2 = rand.nextInt(20) + 20
            val right = rand.nextInt(20) + 20

            println("You are on the second floor.\nTurn left and go $left1 steps.\nThen turn right and go $right steps.\nTurn left and go $left2 steps.\nThen use lift.\n")
            drawAsAMatrix(left1, right, left2)
        }
    }

}


fun drawAsAMatrix(left1: Int, right: Int, left2: Int) {
    var lLeft1 = left1 / 5
    var lRight = right / 5
    var lLeft2 = left2 / 5

    val matr = Array(26) { arrayOfNulls<String>(26) }

    for (i in 0..25) {
        for (j in 0..25) {
            matr[i][j] = " "
        }
    }

    var x = 12
    var y = 12
    while (lLeft1 > 0) {
        matr[x][y] = "G"
        x--
        lLeft1--
    }
    while (lRight > 0) {
        matr[x][y] = "G"
        y--
        lRight--
    }
    while (lLeft2 > 0) {
        matr[x][y] = "G"
        x++
        lLeft2--
    }
    matr[x][y] = "L"
    matr[12][12] = "S"
    println("|=======================================|")
    println("|===============  ROUTE  ===============|")
    println("|=======================================|")
    println()
    println("==========================")

    for (i in 0..25) {
        for (j in 0..25) {
            print(matr[i][j])
        }
        println()
    }
    println("==========================")
}

fun compareRooms(room1: Room, room2: Room): Boolean {
    return room1.direct == room2.direct && room1.color == room2.color && room1.glowing == room2.glowing && room1.environment == room2.environment && room1.roomType.roomName == room2.roomType.roomName && room1.windowType.windowName == room2.windowType.windowName
}

enum class Floors(val eName: String) {
    ONE("black"), TWO("grey"), THREE("green");

    companion object {
        fun forName(search: String): Floors? {
            for (color in Floors.values()) {
                if (search == color.eName) {
                    return color
                }
            }
            return null
        }
    }
}

class Room(
    var color: String,
    var glowing: String,
    var direct: String,
    var environment: String,
    var roomType: RoomType,
    var windowType: WindowType
) {
    enum class RoomType(var roomName: String) {
        OTSEK("otsek"), ROOM("room"), CORRIDOR("corridor");

        companion object {
            fun forName(search: String): RoomType? {
                for (r in RoomType.values()) {
                    if (search == r.roomName) {
                        return r
                    }
                }
                return null
            }
        }
    }

    enum class WindowType(var windowName: String) {
        BIG("big"), SMALL("small"), NONE("none");

        companion object {
            fun forName(search: String): WindowType? {
                for (r in WindowType.values()) {
                    if (search == r.windowName) {
                        return r
                    }
                }
                return null
            }
        }
    }
}