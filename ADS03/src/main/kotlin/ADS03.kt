package main.java.hummel

import java.util.*

private var scan = Scanner(System.`in`)

fun main() {
    val bst = ADS03()
    val arr: Array<Int> = Array(6) { 0 }

    print("ENTER NUMBERS (example: 45 10 7 12 90 50): ")
    for (i in 0 until 6) {
        arr[i] = scan.nextInt()
    }
    print("ENTER REMOVAL (example: 7): ")
    val rem = scan.nextInt()
    for (i in 0 until 6) {
        bst.push(arr[i])
    }
    print("START TREE: ")
    bst.print()
    println("\nTREE WITH RAB LINKS")
    bst.printRAB()
    bst.printRABLinked()
    println("\nTREE WITH ARB LINKS")
    bst.printARB()
    bst.printARBLinked()
    println("\nTREE WITH ABR LINKS")
    bst.printABR()
    bst.printABRLinked()
    print("\nREMOVING ELEMENT\nSTART TREE:")
    bst.remove(rem)
    bst.print()
    println("\nTREE WITH RAB LINKS")
    bst.printRAB()
    bst.printRABLinked()
    println("\nTREE WITH ARB LINKS")
    bst.printARB()
    bst.printARBLinked()
    println("\nTREE WITH ABR LINKS")
    bst.printABR()
    bst.printABRLinked()
}

class ADS03 {
    private var rabc: Int = 0
    private var arbc: Int = 0
    private var abrc: Int = 0
    private var list = ArrayList<Value>()

    private var rab: Array<Int> = Array(100) { 0 }
    private var arb: Array<Int> = Array(100) { 0 }
    private var abr: Array<Int> = Array(100) { 0 }

    private var root: Node? = null

    fun print() {
        println()
        println()
        print(root!!, "", "")
    }

    private fun print(root: Node, s: String, isLeft: String) {
        println(s + isLeft + root.value)
        var se = s
        se += "   "
        if (root.left != null) {
            print(root.left!!, se, "L) ")
        }
        if (root.right != null) {
            print(root.right!!, se, "R) ")
        }
    }

    fun printABR() {
        printABR(root!!)
        abr[abrc] = root!!.value
        abrc++
    }

    private fun printABR(root: Node) {
        if (root.left != null) {
            printABR(root.left!!)
        }
        if (root.right != null) {
            printABR(root.right!!)
        }
        abr[abrc] = root.value
        abrc++
        print(root.value.toString() + " ")
    }

    fun printABRLinked() {
        println()
        println()
        printABRLinked(root!!, "", "")
    }

    private fun printABRLinked(root: Node, s: String, isLeft: String) {
        println(s + isLeft + root.value)
        var se = s
        se += "   "
        if (root.left != null) {
            printABRLinked(root.left!!, se, "L) ")
        }
        if (root.right != null) {
            printABRLinked(root.right!!, se, "R) ")
        } else {
            var i = 0
            for (element in abr) {
                i++
                if (element == root.value) {
                    break
                }
            }
            println(se + "R) --> " + abr[i + 1])
            se += "   "
        }
    }

    fun printARB() {
        printARB(root!!)
        arb[arbc] = root!!.value
        arbc++
    }

    private fun printARB(root: Node) {
        if (root.left != null) {
            printARB(root.left!!)
        }
        print(root.value.toString() + " ")
        arb[arbc] = root.value
        arbc++
        if (root.right != null) {
            printARB(root.right!!)
        }
    }

    fun printARBLinked() {
        println()
        println()
        printARBLinked(root!!, "", "")
    }

    private fun printARBLinked(root: Node, s: String, isLeft: String) {
        println(s + isLeft + root.value)
        var se = s
        se += "   "
        if (root.left != null) {
            printARBLinked(root.left!!, se, "L) ")
        }
        if (root.right != null) {
            printARBLinked(root.right!!, se, "R) ")
        } else {
            var i = 0
            for (element in arb) {
                i++
                if (element == root.value) {
                    break
                }
            }
            println(se + "R) --> " + arb[i + 1])
            se += "   "
        }
    }

    fun printRAB() {
        printRAB(root!!)
        rab[rabc] = root!!.value
        rabc++
    }

    private fun printRAB(root: Node) {
        print(root.value.toString() + " ")
        rab[rabc] = root.value
        rabc++
        if (root.left != null) {
            printRAB(root.left!!)
        }
        if (root.right != null) {
            printRAB(root.right!!)
        }
    }

    fun printRABLinked() {
        println()
        println()
        printRABLinked(root!!, "", "")
    }

    private fun printRABLinked(root: Node, s: String, isLeft: String) {
        println(s + isLeft + root.value)
        var se = s
        se += "   "
        if (root.left != null) {
            printRABLinked(root.left!!, se, "L) ")
        }
        if (root.right != null) {
            printRABLinked(root.right!!, se, "R) ")
        } else {
            var i = 0
            for (element in rab) {
                i++
                if (element == root.value) {
                    break
                }
            }
            println(se + "R) --> " + rab[i + 1])
            se += "   "
        }
    }

    fun push(value: Int) {
        root = push(root, value)
        val vall = Value(value)
        list.add(vall)
    }

    private fun push(root: Node?, key: Int): Node {
        if (root == null) {
            return Node(key)
        }
        if (key < root.value) {
            root.left = push(root.left, key)
        } else if (key > root.value) {
            root.right = push(root.right, key)
        }
        return root
    }

    fun remove(i: Int) {
        root = null
        for (c in 0 until 100) {
            arb[c] = 0
            abr[c] = 0
            rab[c] = 0
        }
        for (vall in list) {
            if (
                vall.value == i) {
                list.remove(vall)
                break
            }
        }
        for (vall in list) {
            repush(vall.value)
        }
    }

    private fun repush(value: Int) {
        root = push(root, value)
    }
}

class Node(
    var value: Int,
    var left: Node?,
    var right: Node?
) {
    constructor(fValue: Int) : this(fValue, null, null)
}

class Value(
    var value: Int
)