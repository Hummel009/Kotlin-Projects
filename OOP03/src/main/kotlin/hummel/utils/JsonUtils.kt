package hummel.utils

import com.google.gson.*
import com.google.gson.reflect.TypeToken
import hummel.optional.Improvable
import hummel.transport.*
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.lang.reflect.Type

object JsonUtils {
    class TransportJsonSerializer : JsonSerializer<Transport> {
        override fun serialize(item: Transport, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
            val jsonObject = JsonObject()
            if (item is CarVolkswagen || item is CarLada || item is BicycleAist || item is BicycleStels) {
                jsonObject.addProperty("getPrice", item.getThePrice())
                jsonObject.addProperty("getColor", item.getTheColor())
                jsonObject.addProperty("javaClass", item.javaClass.name)
            }
            if (item is Improvable) {
                jsonObject.addProperty("attribute", item.getImprovement())
            }
            return jsonObject
        }
    }

    fun serialize(list: MutableList<Transport>) {
        val gson: Gson = GsonBuilder().registerTypeHierarchyAdapter(Transport::class.java, TransportJsonSerializer()).create()
        val type: TypeToken<MutableList<Transport>> = object : TypeToken<MutableList<Transport>>() {}
        val file = File("memory/transports.json")
        val json = gson.toJson(list, type.type)
        val writer = FileWriter(file)
        writer.use {
            it.write(json)
        }
        println("List was serialized")
    }

    fun deserialize(): MutableList<Transport> {
        val gson: Gson = GsonBuilder().registerTypeHierarchyAdapter(Transport::class.java, TransportJsonSerializer()).create()

        try {
            val file = File("memory/transports.json")
            val reader = FileReader(file)
            reader.use {
                val json = gson.fromJson(it, JsonArray::class.java)
                val transports: MutableList<Transport> = ArrayList()
                for (element in json) {
                    val item = element.asJsonObject
                    val javaClass = item.get("javaClass").asString
                    val price = item.get("getPrice").asInt
                    val color = item.get("getColor").asString
                    val attribute = item.get("attribute").asString

                    val transport: Transport = when (javaClass) {
                        CarVolkswagenImproved::class.java.name -> {
                            CarVolkswagenImproved(price, color, attribute)
                        }

                        CarLadaImproved::class.java.name -> {
                            CarLadaImproved(price, color, attribute)
                        }

                        BicycleStelsImproved::class.java.name -> {
                            BicycleStelsImproved(price, color, attribute)
                        }

                        CarVolkswagen::class.java.name -> {
                            CarVolkswagen(price, color)
                        }

                        CarLada::class.java.name -> {
                            CarLada(price, color)
                        }

                        BicycleAist::class.java.name -> {
                            BicycleAist(price, color)
                        }

                        else -> {
                            BicycleStels(price, color)
                        }
                    }
                    transports.add(transport)
                }
                println("List was deserialized")
                return transports
            }
        } catch (e: Exception) {
            println("Error. Default list is loaded")
            return StandardUtils.loadDefaultList()
        }
    }
}