import java.net.*;
import java.io.*;



import java.net.*;
import java.io.*;



// Server Class which allows Client Connection
public class server {
	private static  final int PORT = 9085;
	
	public static void main(String[] args)throws IOException {
		
		//Initialise server socket for client connection
		ServerSocket serversocket = new ServerSocket(PORT);
		System.out.println("[SERVER] Waiting For Client Connection");
		
		
		Socket clientincoming = serversocket.accept();
		System.out.println("Client Connected!");
		
		
		
	}

}

