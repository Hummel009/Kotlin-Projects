package side_server;

import msg.Message;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    public static ArrayList<SClient> clients;
    public static Semaphore pairingLockForTwoPair = new Semaphore(1, true);
    public ServerSocket socket;
    public int port;
    public ListenConnectionRequestThread listenConnectionRequestThread;
    public ClientRemovingControlThread removingControlThread;

    public Server(int port) {
        try {
            this.port = port;
            this.socket = new ServerSocket(this.port);
            this.listenConnectionRequestThread = new ListenConnectionRequestThread(this);
            removingControlThread = new ClientRemovingControlThread(this);
            clients = new ArrayList<>();

        } catch (IOException ex) {
            System.out.println("There is an error occurred when opening the server on port:" + this.port);

        }
    }

    public static void sendMessage(SClient client, Message message) {
        try {
            client.cOutput.writeObject(message);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ListenClientConnectionRequests() {
        this.listenConnectionRequestThread.start();
    }
}
