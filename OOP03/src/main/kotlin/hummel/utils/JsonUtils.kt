package hummel.utils

import com.google.gson.*
import com.google.gson.reflect.TypeToken
import hummel.Shop
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
			jsonObject.addProperty("price", item.getThePrice())
			jsonObject.addProperty("color", item.getTheColor())
			jsonObject.addProperty("className", item.javaClass.name)
			if (item is Improvable) {
				jsonObject.addProperty("improve", item.getImprovement())
			}
			return jsonObject
		}
	}

	fun serialize(shop: Shop) {
		val gson: Gson =
			GsonBuilder().registerTypeHierarchyAdapter(Transport::class.java, TransportJsonSerializer()).create()
		val type: TypeToken<MutableList<Transport>> = object : TypeToken<MutableList<Transport>>() {}
		val file = File("memory/transports.json")
		val json = gson.toJson(shop.transport, type.type)
		val writer = FileWriter(file)
		writer.use {
			it.write(json)
		}
		println("List was serialized")
	}

	fun deserialize(shop: Shop) {
		val gson: Gson =
			GsonBuilder().registerTypeHierarchyAdapter(Transport::class.java, TransportJsonSerializer()).create()

		try {
			val file = File("memory/transports.json")
			val reader = FileReader(file)
			reader.use {
				val json = gson.fromJson(it, JsonArray::class.java)
				val transports: MutableList<Transport> = ArrayList()
				for (element in json) {
					val item = element.asJsonObject
					val price = item.get("price").asInt
					val color = item.get("color").asString

					val transport: Transport = when (item.get("className").asString) {
						CarVolkswagenImproved::class.java.name -> {
							val attribute = item.get("improve").asString
							CarVolkswagenImproved(price, color, attribute)
						}

						CarLadaImproved::class.java.name -> {
							val attribute = item.get("improve").asString
							CarLadaImproved(price, color, attribute)
						}

						BicycleStelsImproved::class.java.name -> {
							val attribute = item.get("improve").asString
							BicycleStelsImproved(price, color, attribute)
						}

						BicycleAistImproved::class.java.name -> {
							val attribute = item.get("improve").asString
							BicycleAistImproved(price, color, attribute)
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
				shop.transport = transports
			}
		} catch (e: Exception) {
			println("Error. Default list is loaded")
			shop.transport = StandardUtils.loadDefaultList()
		}
	}
}