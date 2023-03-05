package main.kotlin.hummel.side_server

import main.kotlin.hummel.msg.Message
import java.io.IOException
import java.net.ServerSocket
import java.util.concurrent.Semaphore
import java.util.logging.Level
import java.util.logging.Logger

class Server(port: Int) {
    @JvmField
    var socket: ServerSocket? = null
    private var port = 0
    private var listenConnectionRequestThread: ListenConnectionRequestThread? = null
    private var removingControlThread: ClientRemovingControlThread? = null

    init {
        try {
            this.port = port
            socket = ServerSocket(this.port)
            listenConnectionRequestThread = ListenConnectionRequestThread(this)
            removingControlThread = ClientRemovingControlThread(this)
            clients = ArrayList()
        } catch (ex: IOException) {
            println("There is an error occurred when opening the server on port:" + this.port)
        }
    }

    fun listenClientConnectionRequests() {
        listenConnectionRequestThread!!.start()
    }

    companion object {
        @JvmField
        var clients: ArrayList<SClient>? = null
        @JvmField
        var pairingLockForTwoPair = Semaphore(1, true)
        @JvmStatic
        fun sendMessage(client: SClient, message: Message?) {
            try {
                client.cOutput?.writeObject(message)
            } catch (ex: IOException) {
                Logger.getLogger(Server::class.java.name).log(Level.SEVERE, null, ex)
            }
        }
    }
}