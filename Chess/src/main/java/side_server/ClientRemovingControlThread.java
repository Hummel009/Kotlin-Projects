package side_server;


public class ClientRemovingControlThread extends Thread {
    public final Server server;

    public ClientRemovingControlThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        while (!this.server.socket.isClosed()) {
            Server.clients.removeIf(client -> client.socket.isClosed());
        }
    }
}
