import java.util.*
import kotlin.collections.HashMap
import kotlin.reflect.KFunction0

var scan = Scanner(System.`in`)

fun main() {
    val functions: HashMap<String, KFunction0<Unit>> = HashMap()
    functions["0101"] = Lab0101::launch
    functions["0102"] = Lab0102::launch
    functions["0103"] = Lab0103::launch
    functions["0105"] = Lab0105::launch
    functions["0106"] = Lab0106::launch
    functions["0107"] = Lab0107::launch
    functions["0108"] = Lab0108::launch
    functions["0201"] = Lab0201::launch
    functions["0211"] = Lab0211::launch
    functions["0212"] = Lab0212::launch
    val command = scan.nextLine()
    if (functions.containsKey(command)) {
        functions[command]!!.invoke()
    } else {
        println("Invalid command")
    }
}