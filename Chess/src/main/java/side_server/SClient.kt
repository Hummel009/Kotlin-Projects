package side_server

import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket
import java.util.logging.Level
import java.util.logging.Logger

class SClient(socket: Socket?) {
    @JvmField
    var socket: Socket? = null
    @JvmField
    var cInput: ObjectInputStream? = null
    var cOutput: ObjectOutputStream? = null
    private var clientListenThread: ClientListenThread? = null
    @JvmField
    var pair: SClient? = null
    @JvmField
    var isPaired = false
    @JvmField
    var isWantToPair = false
    @JvmField
    var pairingThread: ClientPairingThread? = null

    init {
        try {
            this.socket = socket
            cOutput = ObjectOutputStream(this.socket!!.getOutputStream())
            cInput = ObjectInputStream(this.socket!!.getInputStream())
            clientListenThread = ClientListenThread(this)
            pairingThread = ClientPairingThread(this)
            isPaired = false
        } catch (ex: IOException) {
            Logger.getLogger(SClient::class.java.name).log(Level.SEVERE, null, ex)
        }
    }

    fun send(msg: Any?) {
        try {
            cOutput!!.writeObject(msg)
        } catch (ex: IOException) {
            Logger.getLogger(SClient::class.java.name).log(Level.SEVERE, null, ex)
        }
    }

    fun listen() {
        clientListenThread!!.start()
    }
}