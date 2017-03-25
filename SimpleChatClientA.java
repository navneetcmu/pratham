package hello;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA {

	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	
	public void go(){
		JFrame frame = new JFrame("A simple chat client");
		JPanel mainpanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainpanel.add(outgoing);
		mainpanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainpanel);
		setUpNetworking();
		frame.setSize(400, 500);
		frame.setVisible(true); 
	}
	
	private void setUpNetworking(){
	try{
		sock = new Socket("127.0.0.1", 5000);
		writer = new PrintWriter(sock.getOutputStream());
		System.out.println("Connection established");
	} catch(IOException ex){
		ex.printStackTrace(); 
	}
	}
	
	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			try{
				writer.println(outgoing.getText());
				writer.flush();
			} catch(Exception ex){
				ex.printStackTrace(); 
			}
			outgoing.setText(" ");
			outgoing.requestFocus();
		}
	}
	
	public static void main(String[] args) {
		new SimpleChatClientA().go();
	}
	
}
