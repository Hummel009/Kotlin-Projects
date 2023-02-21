import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.net.Socket
import kotlin.random.Random

const val SERVER_PORT = 5000
const val PACKET_SIZE = 1024
const val SEND_INTERVAL_MS = 1000
const val REPORT_INTERVAL_MS = 5000

fun main() {
    val serverAddress = InetAddress.getByName("192.168.100.11")
    val tcpSocket = Socket(serverAddress, SERVER_PORT)
    val udpSocket = DatagramSocket()

    val sendData = ByteArray(PACKET_SIZE)
    val receiveData = ByteArray(PACKET_SIZE)
    val expectedData = ByteArray(PACKET_SIZE)

    var tcpPacketsSent = 0
    var tcpPacketsReceived = 0
    var udpPacketsSent = 0
    var udpPacketsReceived = 0
    var udpPacketsLost = 0
    var startTime = System.currentTimeMillis()

    while (true) {
        // Generate random data to send
        Random.nextBytes(sendData)

        // Send data over TCP
        val tcpOut = tcpSocket.getOutputStream()
        tcpOut.write(sendData)
        tcpPacketsSent++

        // Send data over UDP
        val udpPacket = DatagramPacket(sendData, PACKET_SIZE, serverAddress, SERVER_PORT)
        udpSocket.send(udpPacket)
        udpPacketsSent++

        // Receive data over TCP
        val tcpIn = tcpSocket.getInputStream()
        tcpIn.read(receiveData)
        tcpPacketsReceived++

        // Receive data over UDP
        val udpReceivePacket = DatagramPacket(receiveData, PACKET_SIZE)
        udpSocket.receive(udpReceivePacket)
        udpPacketsReceived++

        // Compare received data with expected data
        if (!receiveData.contentEquals(expectedData)) {
            udpPacketsLost++
        }

        // Update the expected data
        System.arraycopy(sendData, 0, expectedData, 0, PACKET_SIZE)

        // Calculate the transmission rates and lost packets
        val elapsedTime = System.currentTimeMillis() - startTime

        if (elapsedTime >= REPORT_INTERVAL_MS) {
            val tcpTransmissionRate = (tcpPacketsReceived.toFloat() / elapsedTime) * 1000
            val udpTransmissionRate = (udpPacketsReceived.toFloat() / elapsedTime) * 1000
            val udpPacketLossRate = (udpPacketsLost.toFloat() / udpPacketsSent) * 100

            println("TCP transmission rate: $tcpTransmissionRate packets per second")
            println("UDP transmission rate: $udpTransmissionRate packets per second")
            println("UDP packet loss rate: $udpPacketLossRate%")

            tcpPacketsSent = 0
            tcpPacketsReceived = 0
            udpPacketsSent = 0
            udpPacketsReceived = 0
            udpPacketsLost = 0
            startTime = System.currentTimeMillis()
        }

        // Sleep for the send interval
        Thread.sleep(SEND_INTERVAL_MS.toLong())
    }
}