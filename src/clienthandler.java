
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class clienthandler implements Runnable{
	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	
	
	public clienthandler(Socket clientsocket) throws IOException {
		this.client = clientsocket;
		in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream());
	}
	 
	

	@Override
	public void run() {
		try {
			while(true) {
				String request = in.readLine();
				
				if(request.contains("name")) {
					System.out.println("Hello");
				}else {
					System.out.println("Hello Person");
				}
				
			}
		}catch(IOException e) {
			System.err.println("IOException in handler");
			System.err.println(e.getStackTrace());
		}finally {
		out.close();
		try {
			in.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		}
		
	}
 
}
