package main.kotlin.hummel

open class CarTransport(private var name: String) : Transport() {
    override fun getName(): String {
        return name
    }
}