package hummel.utils

import hummel.Shop
import hummel.transport.Transport
import java.io.File
import java.lang.Boolean
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import kotlin.Exception

object XmlUtils {
    fun serialize(transportList: MutableList<Transport>) {
        val shop = Shop
        val context: JAXBContext = JAXBContext.newInstance(Transport::class.java, Shop::class.java)
        val marshaller = context.createMarshaller()
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE)
        marshaller.marshal(shop, File("memory/transports.xml"))
    }

    fun deserialize(): MutableList<Transport> {
        try {
            val context = JAXBContext.newInstance(Transport::class.java, Shop::class.java)
            val unmarshaller = context.createUnmarshaller()
            val transportListFromFile = unmarshaller.unmarshal(File("memory/transports.xml")) as Shop
            return transportListFromFile.transport
        } catch (e: Exception) {
            println("Error. Default list was loaded; e: ${e.message}")
            return StandardUtils.loadDefaultList()
        }
    }

}
