import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket sock = new ServerSocket(7851);
			
			/* listening for connections */
			while(true) {
				/* here we create the client socket to establish the connection to the server socket */
				Socket client = sock.accept();
				
				/* Here we create an object to write characters to be put into the output stream and into the socket */
				PrintWriter printoutput = new PrintWriter(client.getOutputStream(), true);
				
				//TODO here i will create what i want to put onto the output stream to be put onto the socket and accessed by the client
				
				printoutput.println("Profile is: " + System.getProperty("user.name"));
				printoutput.println("The class we are in is Operating Systems.");
				printoutput.println("Todays date is: " + new java.util.Date().toString());
				printoutput.println("This is Project 1 and the topic is interproccess communication done through a server and client socket");
				
				
				/* giving Data to the socket for the client to access */

				/* close the socket and resume */
				/* listening for connections */
				client.close();
			}
		}
		
		/* this is for catching a error such as the address is currently in use from the client */
		catch(IOException ioe){
			System.err.println(ioe);
		}

	}

}


