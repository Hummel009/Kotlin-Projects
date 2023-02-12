package side_server;

import game.piece.Team;
import msg.Message;

public class ClientPairingThread extends Thread {
    public SClient client;

    public ClientPairingThread(SClient client) {
        this.client = client;
    }

    @Override
    public void run() {
        while (this.client.socket.isConnected() && this.client.isWantToPair && !this.client.isPaired) {
            try {
                Server.pairingLockForTwoPair.acquire(1);
                SClient chosenPair = null;
                while (this.client.socket.isConnected() && chosenPair == null) {
                    for (SClient client : Server.clients) {
                        if (client != this.client && !client.isPaired && client.isWantToPair) {

                            chosenPair = client;
                            this.client.pair = client;
                            client.pair = this.client;
                            this.client.isWantToPair = false;
                            client.isWantToPair = false;
                            client.isPaired = true;
                            this.client.isPaired = true;

                            Message message = new Message(Message.MessageTypes.PAIRING);
                            message.content = "Eşleştin";
                            Server.sendMessage(this.client, (message));
                            Server.sendMessage(chosenPair, (message));


                            Message clientStartMessage = new Message(Message.MessageTypes.START);
                            clientStartMessage.content = Team.WHITE;
                            Message pairClientStartMessage = new Message(Message.MessageTypes.START);
                            pairClientStartMessage.content = Team.BLACK;
                            Server.sendMessage(this.client, clientStartMessage);
                            Server.sendMessage(chosenPair, pairClientStartMessage);
                            break;
                        }
                    }
                    sleep(1000);
                }
                Server.pairingLockForTwoPair.release(1);
            } catch (InterruptedException ex) {
                System.out.println("Pairing thread could not been acquired 1 permit. There is an error occurred there.");
            }
        }
    }
}
