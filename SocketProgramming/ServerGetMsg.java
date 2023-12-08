package com.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerGetMsg {

	public static void main(String[] args) 
	{
		try {
			System.out.println("Server listening...");
			ServerSocket srvr = new ServerSocket(12345);
			
			System.out.println("Waiting for the to Conncet...");
			Socket sckServe = srvr.accept();
			
			System.out.println("Connection succuessfull Establish...");
			
			BufferedReader brf = new BufferedReader(new InputStreamReader(sckServe.getInputStream()));
			String readMsg = brf.readLine();
			
			System.out.println("Client Msg : "+readMsg);
			
			
			sckServe.close();
			srvr.close();
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
