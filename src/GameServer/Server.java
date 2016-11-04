package GameServer;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Bouse PC on 4/11/2016.
 */
public class Server {

    int PORT_NUMBER;
    private Socket clientSocket;
    private ServerSocket serverSocket;

    Server(int port)
    {
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
        }
        catch (Exception e )
        {
            e.printStackTrace();
        }
    }
}
