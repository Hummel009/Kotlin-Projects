package side_client

import game.gui.Table
import game.piece.Team
import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket
import java.util.logging.Level
import java.util.logging.Logger

class Client(@JvmField var game: Table) {
    @JvmField
    var socket: Socket? = null
    @JvmField
    var sInput: ObjectInputStream? = null
    private var sOutput: ObjectOutputStream? = null
    @JvmField
    var isPaired = false
    private var serverIP: String? = null
    private var serverPort = 0
    private var listenThread: ClientListenThread? = null
    @JvmField
    var team = Team.NOCOLOR

    fun connect(serverIP: String?, port: Int) {
        try {
            println("Connecting to the server")
            this.serverIP = serverIP
            serverPort = port
            socket = Socket(this.serverIP, serverPort)
            println("Connecting to the server")
            sOutput = ObjectOutputStream(socket!!.getOutputStream())
            sInput = ObjectInputStream(socket!!.getInputStream())
            listenThread = ClientListenThread(this)
            listenThread!!.start()
        } catch (ex: IOException) {
            println("Can not connected to the server.")
        }
    }

    fun send(message: Any?) {
        try {
            sOutput!!.writeObject(message)
        } catch (ex: IOException) {
            Logger.getLogger(Client::class.java.name).log(Level.SEVERE, null, ex)
        }
    }
}