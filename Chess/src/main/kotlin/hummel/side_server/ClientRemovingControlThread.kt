package hummel.side_server

class ClientRemovingControlThread(private val server: Server) : Thread() {
	override fun run() {
		while (!server.socket!!.isClosed) {
			Server.clients!!.removeIf { client -> client.socket!!.isClosed }
		}
	}
}