package main.kotlin.hummel.side_server

import main.kotlin.hummel.game.piece.Team
import main.kotlin.hummel.msg.Message
import main.kotlin.hummel.side_server.Server.Companion.sendMessage

class ClientPairingThread(var client: SClient) : Thread() {
    override fun run() {
        while (client.socket!!.isConnected && client.isWantToPair && !client.isPaired) {
            try {
                Server.pairingLockForTwoPair.acquire(1)
                var chosenPair: SClient? = null
                while (client.socket!!.isConnected && chosenPair == null) {
                    for (client in Server.clients!!) {
						client as SClient
                        if (client != this.client && !client.isPaired && client.isWantToPair) {
                            chosenPair = client
                            this.client.pair = client
                            client.pair = this.client
                            this.client.isWantToPair = false
                            client.isWantToPair = false
                            client.isPaired = true
                            this.client.isPaired = true
                            val message = Message(Message.MessageTypes.PAIRING)
                            message.content = "Eşleştin"
                            sendMessage(this.client, message)
                            sendMessage(chosenPair, message)
                            val clientStartMessage = Message(Message.MessageTypes.START)
                            clientStartMessage.content = Team.WHITE
                            val pairClientStartMessage = Message(Message.MessageTypes.START)
                            pairClientStartMessage.content = Team.BLACK
                            sendMessage(this.client, clientStartMessage)
                            sendMessage(chosenPair, pairClientStartMessage)
                            break
                        }
                    }
                    sleep(1000)
                }
                Server.pairingLockForTwoPair.release(1)
            } catch (ex: InterruptedException) {
                println("Pairing thread could not been acquired 1 permit. There is an error occurred there.")
            }
        }
    }
}