import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.util.*
import kotlin.system.measureTimeMillis

fun main() {
    // Установка соединения с сервером
    val serverAddress = InetAddress.getByName("192.168.43.177")
    val serverPort = 9090
    val udpSocket = DatagramSocket()

    // Генерация случайных данных
    val random = Random()
    val dataSize = 1024
    val data = ByteArray(dataSize)
    random.nextBytes(data)

    // Отправка данных и замер времени передачи
    val time = measureTimeMillis {
        // Создание и отправка пакета
        val packet = DatagramPacket(data, data.size, serverAddress, serverPort)
        udpSocket.send(packet)

        // Получение результата
        val buffer = ByteArray(1)
        val responsePacket = DatagramPacket(buffer, buffer.size)
        udpSocket.receive(responsePacket)
        val result = buffer[0].toInt()
        if (result == 0) {
            println("Обмен прошёл успешно")
        }
    }

    // Вывод результатов
    val speed = dataSize / (time / 1000.0)
    println("Скорость передачи: $speed байт/с")
    udpSocket.close()
}