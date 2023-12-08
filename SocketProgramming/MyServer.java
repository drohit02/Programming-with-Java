package com.SocketProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args)
	{
		try {
			ServerSocket ss = new ServerSocket(12345);
			System.out.println("Server is running...........");
			
			
			System.out.println("Waiting for Connection...........");
			Socket mySocket = ss.accept();
			
			System.out.println("Connection Sucessfully establish");
			mySocket.close();
			ss.close();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
