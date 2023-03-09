package hummel

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import hummel.transport.*
import hummel.util.TransportSerializer
import java.io.*

object Data {
	fun serializeList(list: MutableList<Transport>) {
		val filename = "memory/transports.ser"
		val outputStream = FileOutputStream(filename)
		val objectOutputStream = ObjectOutputStream(outputStream)
		objectOutputStream.writeObject(list)
		objectOutputStream.close()
		outputStream.close()
		println("List was serialized")
	}

	fun serializeListJson(list: MutableList<Transport>) {
		val gson = Gson()
		val filename = "memory/transports.json"
		val writer = FileWriter(filename)
		gson.toJson(list, writer)
		writer.close()
		println("List was serialized to JSON")
	}

	fun deserializeListJson(): MutableList<Transport> {
		val gson = Gson()
		try {
			val filename = "memory/transports.json"
			val reader = FileReader(filename)
			val listType = object : TypeToken<List<Transport>>() {}.type
			val obj = gson.fromJson<List<Transport>>(reader, listType)
			reader.close()
			println("List was deserialized from JSON")
			return obj.toMutableList()
		} catch (e: Exception) {
			println("An error occurred while deserializing the list from JSON. Default list is loaded")
			return loadDefaultList()
		}
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
		localList.add(BicycleAist("Red", 150))
		localList.add(BicycleStels("Red"))
		localList.add(CarVolkswagen("Red", 18500))
		localList.add(CarLada("Red"))

		localList.add(BicycleAist("Green"))
		localList.add(BicycleStels("Green", 350))
		localList.add(CarVolkswagen("Green"))
		localList.add(CarLada("Green"))

		localList.add(BicycleAist("Blue"))
		localList.add(BicycleStels("Blue"))
		localList.add(CarVolkswagen("Blue"))
		localList.add(CarLada("Blue", 5500))

		localList.add(BicycleStelsImproved("Blue", "Packed"))
		localList.add(CarVolkswagenImproved("Grey", "Sportline"))
		localList.add(CarVolkswagenImproved("Grey", "Chroming"))

		return localList
	}
}