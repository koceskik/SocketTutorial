import java.io.*;
import java.net.*;

public class client {
	public static void main(String[] args) throws IOException {
		final String HOST = "localhost";
		final int PORT = 3333;
		
		//connect to server, setup I/O streams to/from server
		Socket s = null;
		try {
			s = new Socket(HOST, PORT);	//create socket and connect to server
			System.out.println("Connected on PORT " + PORT);
		}
		catch (UnknownHostException ex) {
			System.err.println("Couldn't connect to the server");
			System.exit(1);
		}
		catch (IOException ex) {
			System.err.println("Couldn't get I/O for the connection");
			System.exit(1);
		}
		
		System.out.println("Connected");

		try {
			s.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Connection Closed");
	}
}