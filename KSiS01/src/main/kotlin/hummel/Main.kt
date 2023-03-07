package hummel

import java.net.NetworkInterface
import java.net.SocketException
import java.util.Locale

fun main() {
	try {
		val interfaces = NetworkInterface.getNetworkInterfaces()
		while (interfaces.hasMoreElements()) {
			val networkInterface = interfaces.nextElement()
			networkInterface as NetworkInterface
			val mac = networkInterface.hardwareAddress
			if (mac != null) {
				print("MAC Address of " + networkInterface.name + ": ")
				for (i in mac.indices) {
					print(mac[i])
					if (i < mac.size - 1) {
						print("-")
					}
				}
				println()
			}
		}
	} catch (e: SocketException) {
		e.printStackTrace()
	}
}