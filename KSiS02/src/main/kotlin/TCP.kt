import java.net.InetAddress
import java.net.Socket
import java.util.*
import kotlin.system.measureTimeMillis

fun main() {
    // Установка соединения с сервером
    val serverAddress = InetAddress.getByName("192.168.43.177")
    val serverPort = 8080
    val tcpSocket = Socket(serverAddress, serverPort)

    // Генерация случайных данных
    val random = Random()
    val dataSize = 1024
    val data = ByteArray(dataSize)
    random.nextBytes(data)

    // Отправка данных и замер времени передачи
    val time = measureTimeMillis {
        val outputStream = tcpSocket.getOutputStream()
        val inputStream = tcpSocket.getInputStream()

        // Отправка данных
        outputStream.write(data)
        outputStream.flush()

        // Получение результата
        val result = inputStream.read()
        if (result == 0) {
            println("Обмен прошёл успешно")
        }
    }

    // Вывод результатов
    val speed = dataSize / (time / 1000000.0)
    println("Скорость передачи: $speed КБ/с")
    tcpSocket.close()
}