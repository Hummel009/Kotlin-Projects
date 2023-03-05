package main.kotlin.hummel.side_server

import java.io.IOException

class ListenConnectionRequestThread(private var server: Server) : Thread() {
	override fun run() {
		while (!server.socket!!.isClosed) {
			try {
				val nSocket = server.socket!!.accept()
				val nClient = SClient(nSocket)
				nClient.listen()
				Server.clients!!.add(nClient)
			} catch (ex: IOException) {
				println("There is an error occurred when the new client being accepted.")
			}
		}
	}
}