package hello;
import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	
	String[] advicelist = {"Take small bite", "Tight jeans", "Healthcare bill","Get a haircut"}; 
	
	public void go(){
		try{
			ServerSocket serverSock = new ServerSocket(4242);
			
			while(true){
				Socket sock = serverSock.accept(); 
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
				
			} 
			} catch(IOException ex){
			  ex.printStackTrace();
		}
		
	} // close go
	
	private String getAdvice(){
		int random = (int) (Math.random()*advicelist.length);
		return advicelist[random];
	}
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer(); 
		server.go(); 
	}

}
