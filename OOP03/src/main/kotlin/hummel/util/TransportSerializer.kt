package hummel.util

import com.google.gson.*
import hummel.transport.Transport
import java.lang.reflect.Type

class TransportSerializer : JsonSerializer<Transport> {
    override fun serialize(src: Transport?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        val jsonObject = JsonObject()
        jsonObject.addProperty("color", src?.getColor())
        jsonObject.addProperty("name", src?.getName())
        jsonObject.addProperty("price", src?.getPrice())
        return jsonObject
    }
}