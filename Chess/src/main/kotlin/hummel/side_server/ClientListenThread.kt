package main.kotlin.hummel.side_server

import main.kotlin.hummel.msg.Message
import main.kotlin.hummel.msg.Message.MessageTypes
import java.io.IOException
import java.util.logging.Level
import java.util.logging.Logger

class ClientListenThread(var client: SClient) : Thread() {
	override fun run() {
		while (!client.socket!!.isClosed) {
			try {
				val msg = client.cInput!!.readObject() as Message
				when (msg.type) {
					MessageTypes.PAIRING -> {
						client.isWantToPair = true
						client.pairingThread!!.start()
					}

					MessageTypes.MOVE, MessageTypes.CHECK -> client.pair!!.send(msg)
					MessageTypes.END -> {
						client.pair = null
						client.isPaired = false
						client.isWantToPair = false
						client.pair = null
					}
					MessageTypes.LEAVE -> {
						client.isPaired = false
						client.isWantToPair = false
						client.pair!!.isWantToPair = false
						client.pair!!.isPaired = false
						client.pair!!.pair = null
						client.pair = null
					}

					else -> {}
				}
			} catch (ex: IOException) {
				Logger.getLogger(ClientListenThread::class.java.name).log(Level.SEVERE, null, ex)
			} catch (ex: ClassNotFoundException) {
				Logger.getLogger(ClientListenThread::class.java.name).log(Level.SEVERE, null, ex)
			}
		}
	}
}