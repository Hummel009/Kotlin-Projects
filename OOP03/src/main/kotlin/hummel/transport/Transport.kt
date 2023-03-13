package hummel.transport

import java.io.Serializable
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlSeeAlso

@XmlSeeAlso(BicycleAistImproved::class, BicycleAist::class, BicycleStels::class, BicycleStelsImproved::class, CarLada::class, CarLadaImproved::class, CarVolkswagen::class, CarVolkswagenImproved::class)
@XmlAccessorType(XmlAccessType.FIELD)
open class Transport : Serializable {
    private val serialVersionUID = 1L

    open fun getTheColor(): String {
        return "no"
    }

    open fun getTheInfo(): String {
        return "NULL"
    }

    open fun getThePrice(): Int {
        return 0
    }

    open fun getTheName(): String {
        return "NULL"
    }
}