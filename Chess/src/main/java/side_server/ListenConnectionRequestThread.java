package side_server;

import java.io.IOException;
import java.net.Socket;


public class ListenConnectionRequestThread extends Thread {
    public Server server;

    public ListenConnectionRequestThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        while (!this.server.socket.isClosed()) {
            try {
                Socket nSocket = this.server.socket.accept();
                SClient nClient = new SClient(nSocket);
                nClient.listen();
                Server.clients.add(nClient);

            } catch (IOException ex) {
                System.out.println("There is an error occured when the new client being accepted.");
            }
        }
    }
}
