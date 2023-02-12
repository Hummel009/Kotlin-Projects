package side_client;

import game.gui.Table;
import game.pieces.Team;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public Socket socket;
    public ObjectInputStream sInput;
    public ObjectOutputStream sOutput;
    public boolean isPaired = false;
    public String serverIP;
    public int serverPort;
    public ClientListenThread listenThread;
    public Table game;
    private Team team = Team.NOCOLOR;

    public Client(Table game) {
        this.game = game;
    }

    public void Connect(String serverIP, int port) {
        try {
            System.out.println("Connecting to the side_server");
            this.serverIP = serverIP;
            this.serverPort = port;
            this.socket = new Socket(this.serverIP, this.serverPort);
            System.out.println("Connecting to the side_server");
            sOutput = new ObjectOutputStream(this.socket.getOutputStream());
            sInput = new ObjectInputStream(this.socket.getInputStream());
            listenThread = new ClientListenThread(this);
            this.listenThread.start();
        } catch (IOException ex) {
            System.out.println("Can not connected to the side_server.");
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void Send(Object message) {
        try {
            this.sOutput.writeObject(message);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
