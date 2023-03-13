package hummel.transport

import hummel.optional.Improvable

class BicycleStelsImproved(price: Int = 400, color: String = "No", var improve: String = "No") : BicycleStels(price, color), Improvable {
    override fun getImprovement(): String {
        return improve
    }

    override fun getTheInfo(): String {
        return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
    }
}