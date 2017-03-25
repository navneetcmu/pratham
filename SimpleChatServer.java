package hello;
import java.io.*;
import java.net.*;

public class SimpleChatServer {
	
	public void go(){
		try{
		ServerSocket serversock = new ServerSocket(5001);
		while(true){
			Socket sock = serversock.accept();
			InputStreamReader chat = new InputStreamReader(sock.getInputStream());
			BufferedReader reader = new BufferedReader(chat);
			System.out.println(reader.readLine());
			reader.close();
		}
		} catch(IOException ex){
			ex.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) {
		SimpleChatServer server = new SimpleChatServer();
		server.go(); 
	}

}
