package main.java.hummel

import java.util.*

var input10 = Scanner(System.`in`)
var input11 = Scanner(System.`in`)
var input12 = Scanner(System.`in`)
var input13 = Scanner(System.`in`)
var input21 = Scanner(System.`in`)
var list = ArrayList<Content>()
var map = HashMap<String, Content>()

fun addObject() {
    // Можно любое количество страниц в терминах и подтерминах
    val ids1 = ArrayList<Int>()
    ids1.add(17)
    ids1.add(81)

    val ids2 = ArrayList<Int>()
    ids2.add(16)
    ids2.add(72)
    ids2.add(32)
    ids2.add(39)

    val ids3 = ArrayList<Int>()
    ids3.add(14)
    ids3.add(51)
    ids3.add(36)

    val ids11 = ArrayList<Int>()
    ids11.add(73)
    ids11.add(86)

    val ids21 = ArrayList<Int>()
    ids21.add(11)
    ids21.add(20)
    ids21.add(33)
    ids21.add(98)

    val ids22 = ArrayList<Int>()
    ids22.add(21)
    ids22.add(27)
    ids22.add(23)
    ids22.add(79)

    val ids32 = ArrayList<Int>()
    ids32.add(45)
    ids32.add(15)
    ids32.add(68)

    val ids31 = ArrayList<Int>()
    ids31.add(14)
    ids31.add(56)
    ids31.add(69)

    // Можно любое количество терминов, подтерминов и доступна любая
    // вложенность

    // Обычный
    val conts11 = ArrayList<Content>()
    conts11.add(Content("b", ids11))

    // Два подтермина
    val conts21 = ArrayList<Content>()
    conts21.add(Content("y", ids21))
    conts21.add(Content("b", ids22))

    // Подтермин в подтермине
    val conts32 = ArrayList<Content>()
    conts32.add(Content("o", ids32))

    val conts31 = ArrayList<Content>()
    conts31.add(Content("j", ids31, conts32))

    val prev1 = Content("a", ids1, conts11)
    val prev2 = Content("x", ids2, conts21)
    val prev3 = Content("z", ids3, conts31)

    list.add(prev1)
    list.add(prev2)
    list.add(prev3)

    map["a"] = prev1
    map["x"] = prev2
    map["z"] = prev3

    showObjects()
}

fun editObjects() {
    println("Enter the name of the old object.")
    val name = input11.nextLine()
    val cont = map[name]
    if (cont != null) {
        editObject(cont)
    } else {
        println("Wrong! Enter the sub-object name then.")
        val namesub = input13.nextLine()
        for (c in map.values) {
            for (sub in c.contentSubs!!) {
                if (c.contentSubs != null && sub.contentName == namesub) {
                    editObject(c)
                }
            }
        }
    }
    showObjects()
}

fun findObject() {
    println("Enter the name of the old object.")
    val name = input11.nextLine()
    val cont = map[name]
    if (cont != null) {
        println(cont.toString())
    } else {
        println("Wrong! Enter the sub-object name then.")
        val namesub = input13.nextLine()
        for (c in map.values) {
            for (sub in c.contentSubs!!) {
                if (c.contentSubs != null && sub.contentName == namesub) {
                    println(c.toString())
                }
            }
        }
    }
}

fun main() {
    printOptions()
    sus@ while (true) {
        when (input10.nextInt()) {
            1 -> addObject()
            2 -> editObjects()
            3 -> removeObjects()
            4 -> showObjects()
            5 -> findObject()
            6 -> sortName()
            7 -> sortContent()
            8 -> break@sus
        }
    }
}

fun printOptions() {
    println()
    println("====================")
    println()
    println("1. Add objects.")
    println("2. Edit object.")
    println("3. Remove objects.")
    println("4. Show objects.")
    println("5. Find objects.")
    println("6. Sort by name.")
    println("7. Sort by content.")
    println("8. Close.")
    println()
    println("====================")
    println()
}

fun showObjects() {
    for (cont in list) {
        println(cont.toString())
    }
}

fun sortContent() {
    val comparator: Comparator<Content> = Comparator.comparing { o1 -> o1.contentIds[0] }

    for (c in list) {
        if (c.contentSubs != null) {
            c.contentSubs?.let { Collections.sort(it, comparator) }

        }
    }
    Collections.sort(list, comparator)
    showObjects()
}

fun sortName() {
    val comparator: Comparator<Content> = Comparator.comparing { o1 -> o1.contentName }
    Collections.sort(list, comparator)
    for (c in list) {
        if (c.contentSubs != null) {
            c.contentSubs?.let { Collections.sort(it, comparator) }

        }
    }
    showObjects()
}

fun editObject(content: Content) {
    content.contentIds.clear()
    content.contentSubs?.clear()
    println("Enter the new ids of the old object.")
    while (true) {
        val read = input12.nextInt()
        if (read == 0) {
            break
        }
        content.contentIds.add(read)

    }
    content.contentIds.sort()

    while (true) {
        println("Has sub-content?")
        val read = input13.nextBoolean()
        if (!read) {
            break
        }
        val temp = ArrayList<Int>()
        println("Enter the name:")
        val name = input21.nextLine()
        println("Enter the new ids:")
        while (true) {
            val reads = input12.nextInt()
            if (reads == 0) {
                break
            }
            temp.add(reads)
        }
        temp.sort()
        val prev = Content(name, temp)
        content.contentSubs?.add(prev)
    }
}

fun removeObjects() {
    println("Enter the name of the old object.")
    val name = input11.nextLine()
    val cont = map[name]
    if (cont != null) {
        list.remove(cont)
        map.remove(cont.contentName)
    } else {
        println("Wrong! Enter the sub-object name then.")
        val namesub = input13.nextLine()
        for (c in map.values) {
            for (sub in c.contentSubs!!) {
                if (c.contentSubs != null && sub.contentName == namesub) {
                    list.remove(c)

                }
            }
        }
    }
    showObjects()
}

class Content(
    var contentName: String,
    var contentIds: ArrayList<Int> = ArrayList(),
    var contentSubs: ArrayList<Content>? = ArrayList()
) {

    constructor(fName: String, fIds: ArrayList<Int>) : this(fName, fIds, null)

    override fun toString(): String {
        if (contentSubs == null) {
            return "$contentName: $contentIds, sub does not exist."
        }
        val s = StringBuilder().append(contentName).append(": ").append(contentIds.toString()).append(", subs:\n")
        for (c: Content in contentSubs!!) {
            s.append(c.toString()).append("\n")
        }
        return s.toString()
    }
}