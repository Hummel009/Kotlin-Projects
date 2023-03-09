package hummel

import com.google.gson.*
import com.google.gson.reflect.TypeToken
import hummel.optional.Improvable
import hummel.transport.*
import java.io.*
import java.lang.reflect.Type

object Data {
	class TransportSerializer : JsonSerializer<Transport> {
		override fun serialize(src: Transport, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
			val jsonObject = JsonObject()
			if (src is CarVolkswagen || src is CarLada || src is BicycleAist || src is BicycleStels) {
				jsonObject.addProperty("getPrice", src.getThePrice())
				jsonObject.addProperty("getColor", src.getTheColor())
				jsonObject.addProperty("javaClass", src.javaClass.name)
			}
			if (src is Improvable) {
				jsonObject.addProperty("attribute", src.getImprovement())
			}
			return jsonObject
		}
	}

	fun serializeListJson(list: MutableList<Transport>) {
		val gson: Gson =
			GsonBuilder().registerTypeHierarchyAdapter(Transport::class.java, TransportSerializer()).create()
		val type: TypeToken<MutableList<Transport>> = object : TypeToken<MutableList<Transport>>() {}

		val file = File("memory/transports.json")
		val json = gson.toJson(list, type.type)
		val writer = FileWriter(file)
		writer.use {
			it.write(json)
		}
		println("List was serialized to JSON")
	}

	fun deserializeListJson(): MutableList<Transport> {
		val gson: Gson =
			GsonBuilder().registerTypeHierarchyAdapter(Transport::class.java, TransportSerializer()).create()

		try {
			val file = File("memory/transports.json")
			if (!file.exists()) {
				println("File does not exist, returning default list")
				return loadDefaultList()
			}
			val reader = FileReader(file)
			reader.use {
				val json = gson.fromJson(it, JsonArray::class.java)
				val list = mutableListOf<Transport>()
				for (element in json) {
					val jsonObject = element.asJsonObject
					val javaClass = jsonObject.get("javaClass").asString
					val price = jsonObject.get("getPrice").asInt
					val color = jsonObject.get("getColor").asString
					val attribute = jsonObject.get("attribute").asString

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
					list.add(transport)
				}
				println("List was deserialized from JSON: $list")
				return list
			}
		} catch (e: Exception) {
			println("An error occurred while deserializing the list. Default list is loaded: ${e.message}")
			return loadDefaultList()
		}
	}

	fun serializeList(list: MutableList<Transport>) {
		val filename = "memory/transports.ser"
		val outputStream = FileOutputStream(filename)
		val objectOutputStream = ObjectOutputStream(outputStream)
		objectOutputStream.writeObject(list)
		objectOutputStream.close()
		outputStream.close()
		println("List was serialized")
	}

	fun deserializeList(): MutableList<Transport> {
		try {
			val filename = "memory/transports.ser"
			val fileInputStream = FileInputStream(filename)
			val objectInputStream = ObjectInputStream(fileInputStream)
			val obj = objectInputStream.readObject()
			if (obj is List<*>) {
				obj.filterIsInstance<Transport>().forEach { list.add(it) }
			}
			objectInputStream.close()
			fileInputStream.close()
			println("List was deserialized")
			return list
		} catch (e: Exception) {
			println("An error occurred while deserializing the list. Default list is loaded")
			return loadDefaultList()
		}
	}

	fun loadDefaultList(): MutableList<Transport> {
		val localList = ArrayList<Transport>()
		localList.add(BicycleAist(250, "Red"))
		localList.add(BicycleStels(color = "Red"))
		localList.add(CarVolkswagen(18500, "Red"))
		localList.add(CarLada(color = "Red"))

		localList.add(BicycleAist(color = "Green"))
		localList.add(BicycleStels(color = "Green"))
		localList.add(CarVolkswagen(color = "Green"))
		localList.add(CarLada(color = "Green"))

		localList.add(BicycleAist(color = "Blue"))
		localList.add(BicycleStels(250, "Blue"))
		localList.add(CarVolkswagen(color = "Blue"))
		localList.add(CarLada(5500, "Blue"))

		localList.add(BicycleStelsImproved(color = "Grey", improve = "Packed"))
		localList.add(CarVolkswagenImproved(color = "Grey", improve = "Sportline"))
		localList.add(CarVolkswagenImproved(color = "Grey", improve = "Chroming"))
		localList.add(CarLadaImproved(color = "Violet", improve = "Sedan Baklazhan"))
		localList.add(BicycleAistImproved(color = "Shit", improve = "SUPERAIST"))

		return localList
	}
}