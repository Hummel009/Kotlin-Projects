package msg

import java.io.Serializable

class Message(@JvmField var type: MessageTypes) : Serializable {
    @JvmField
    var content: Any? = null

    enum class MessageTypes {
        START, MOVE, END, PAIRING, CHECK, LEAVE
    }
}