import java.util.*
import kotlin.collections.HashMap

val scan = Scanner(System.`in`)
val letters = HashMap<String, String>()

fun main() {
    var entered: String

    letters["А"] = ""
    letters["Е"] = ""
    letters["Ё"] = ""
    letters["И"] = ""
    letters["О"] = ""
    letters["У"] = ""
    letters["Ы"] = ""
    letters["Э"] = ""
    letters["Ю"] = ""
    letters["Я"] = ""
    letters["Ь"] = ""

    letters["Б"] = "ب"
    letters["В"] = "و"
    letters["Г"] = "ه"
    letters["Д"] = "د"
    letters["Ж"] = "ژ"
    letters["З"] = "ض"
    letters["Й"] = "ى"
    letters["К"] = "ق"
    letters["Л"] = "ل"
    letters["М"] = "م"
    letters["Н"] = "ن"
    letters["П"] = "پ"
    letters["Р"] = "ر"
    letters["С"] = "ص"
    letters["Т"] = "ط"
    letters["Ф"] = "ف"
    letters["Х"] = "خ"
    letters["Ц"] = "ࢯ"
    letters["Ч"] = "چ"
    letters["Ш"] = "ش"
    letters["Щ"] = "ش"
    letters["Ъ"] = "ع"
    do {
        entered = scan.nextLine()
        entered = entered.uppercase(Locale.getDefault())
        for (sus in letters.entries) {
            entered = entered.replace(sus.key, sus.value)
        }
        System.out.println(reverse(entered))
    } while (!"стоп".equals(entered))
}

fun reverse(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun viceVersa() {
    letters["ب"] = "Б"
    letters["و"] = "В"
    letters["ه"] = "Г"
    letters["د"] = "Д"
    letters["ژ"] = "Ж"
    letters["ض"] = "З"
    letters["ى"] = "Й"
    letters["ق"] = "К"
    letters["ل"] = "Л"
    letters["م"] = "М"
    letters["ن"] = "Н"
    letters["پ"] = "П"
    letters["ر"] = "Р"
    letters["ص"] = "С"
    letters["ط"] = "Т"
    letters["ف"] = "Ф"
    letters["خ"] = "Х"
    letters["ࢯ"] = "Ц"
    letters["چ"] = "Ч"
    letters["ش"] = "Ш"
    letters["ع"] = "Ъ"
}