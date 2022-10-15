import java.io.IOException;
import java.net.Socket;

public class client {
	// declare Port No. and IP address for Server Client Connection
	private static final String ServerIP = "127.0.0.1";
	private static final int ServerPort = 9085;
	
	public static void main(String[] args) throws IOException{
		Socket socket = new Socket(ServerIP,ServerPort);
		
		socket.close();
		System.exit(0);
	}
}
