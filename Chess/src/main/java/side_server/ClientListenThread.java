package side_server;

import msg.Message;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientListenThread extends Thread {
    public SClient client;

    public ClientListenThread(SClient client) {
        this.client = client;
    }

    @Override
    public void run() {
        while (!this.client.socket.isClosed()) {
            try {
                Message msg = (Message) (this.client.cInput.readObject());
                switch (msg.type) {
                    case PAIRING:
                        this.client.isWantToPair = true;
                        this.client.pairingThread.start();
                        break;
                    case MOVE:
                    case CHECK:
                        this.client.pair.Send(msg);
                        break;
                    case END:
                        this.client.pair = null;
                    case LEAVE:
                        this.client.isPaired = false;
                        this.client.isWantToPair = false;
                        assert this.client.pair != null;
                        this.client.pair.isWantToPair = false;
                        this.client.pair.isPaired = false;
                        this.client.pair.pair = null;
                        this.client.pair = null;

                }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(ClientListenThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
