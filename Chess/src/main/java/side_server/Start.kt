package side_server

object Start {
    @JvmStatic
    fun main(args: Array<String>) {
        val server = Server(4000)
        server.listenClientConnectionRequests()
        println("Server is ON now")
    }
}