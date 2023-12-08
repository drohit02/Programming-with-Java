package com.SocketProgramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSentMsg {

	public static void main(String[] args)
	{
	
		System.out.println("Creating Connect between Server and Client..");
		
		try {
			Socket clientSocket = new Socket("localhost",12345);
			
			PrintWriter pwt = new PrintWriter(clientSocket.getOutputStream(),true);
			
			String msgSent = "Hello Server";
			
			System.out.println("Message sent to server....");
			pwt.println(msgSent);
			
			clientSocket.close();
		} 
		catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
