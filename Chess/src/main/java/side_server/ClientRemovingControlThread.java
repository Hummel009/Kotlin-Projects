package side_server;




public class ClientRemovingControlThread extends Thread{

    private Server server;

    public ClientRemovingControlThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        
        while(!this.server.socket.isClosed())
        {
            for(SClient client : Server.clients)
            {
                if(client.socket.isClosed())
                {
                    Server.clients.remove(client);
                }
            }
        }
    }
    
    
}
