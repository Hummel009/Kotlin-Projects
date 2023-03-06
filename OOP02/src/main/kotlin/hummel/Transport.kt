package hummel

open class Transport {
    open fun getColor(): String {
        return "no"
    }

    open fun getFullInfo(): String {
        return "NULL"
    }

    open fun getPrice(): Int {
        return 0
    }

    open fun getName(): String {
        return "NULL"
    }

    companion object
}

