package side_server;

public class Start {
    public static void main(String[] args) {
        Server server = new Server(4000);
        server.ListenClientConnectionRequests();
        System.out.println("Server is ON now");
    }
}
