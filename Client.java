import java.net.*;
import java.io.*;


public class Client {

	public static void main(String[] args) {
		try {
			/* make connection to server socket */
			Socket sock = new Socket("127.0.0.1", 7851); 
			
			
			/* this code is done for reading the information from the server socket */
			
			InputStream in = sock.getInputStream();// creates an input stream
			
			/*Here we create a buffer reader that is reading character data from the input stream*/
			BufferedReader bin = new BufferedReader(new InputStreamReader(in)); 
			
			/* reading the data from the socket that the server class put in */
			String line;
			while((line = bin.readLine()) != null) {
				System.out.println(line);
			}
			
			
			/* close the socket connection */
			sock.close();
		}
		/* this will give a error and explain what the error is such as no such server exists or no data is within the server.*/
		catch(IOException ioe) {
			System.err.println(ioe);
		}
			
		

	}
}


