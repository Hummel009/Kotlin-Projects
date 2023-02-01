import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException


private var cur = 0
lateinit var arr: Array<Tokens?>
private fun array(): Boolean {
    return term(Tokens.ALEFT) && term(Tokens.ARIGHT) || term(Tokens.ALEFT) && elements() && term(Tokens.ARIGHT)
}

private fun element(): Boolean {
    return value()
}

private fun elements(): Boolean {
    return element() || element() && term(Tokens.KOSKA) && elements()
}

private fun json(): Boolean {
    return element()
}

fun main() {
    var reader: BufferedReader? = null
    try {
        reader = BufferedReader(FileReader("amogus.txt"))
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    }
    val stringBuilder = StringBuilder()
    var line: String? = null
    val ls = System.lineSeparator()
    try {
        while (reader!!.readLine().also { line = it } != null) {
            stringBuilder.append(line)
            stringBuilder.append(ls)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    stringBuilder.deleteCharAt(stringBuilder.length - 1)
    try {
        reader!!.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    var input = stringBuilder.toString()
    System.out.printf("%s", input)
    input = input.replace("\t", "").replace("\r", "").replace("\n", "").replace(" ", "")
    var c = 0
    var a: Int
    arr = arrayOfNulls(input.length)
    a = 0
    while (a < input.length) {
        val temp = input.substring(0, a + 1)
        for (token in Tokens.values()) {
            if (temp == token.s) {
                System.out.printf("Added %s\n", temp)
                arr[c] = token
                c++
                input = input.substring(a + 1)
                a = -1
            }
        }
        a++
    }
    for (i in 0 until c) {
        System.out.printf("%s ", arr[i]!!.s)
    }
    if (json()) {
        System.out.printf("\nTrue")
    } else {
        System.out.printf("\nFalse")
    }
}

private fun member(): Boolean {
    return string() && term(Tokens.DWUKROP) && element()
}

private fun members(): Boolean {
    return member() || member() && term(Tokens.KOSKA) && members()
}

private fun `object`(): Boolean {
    return term(Tokens.SLEFT) && term(Tokens.SRIGHT) || term(Tokens.SLEFT) && members() && term(Tokens.SRIGHT)
}

private fun string(): Boolean {
    return term(Tokens.STRING)
}

private fun term(tok: Tokens): Boolean {
    if (arr[cur] == tok) {
        cur++
        return true
    }
    return false
}

private fun value(): Boolean {
    return `object`() || array() || string()
}

enum class Tokens(var s: String) {
    SLEFT("{"), SRIGHT("}"), ALEFT("{"), ARIGHT("}"), STRING("\"tag\""), DWUKROP(":"), KOSKA(",")

}