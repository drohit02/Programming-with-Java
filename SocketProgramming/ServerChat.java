package com.SocketProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {

	
	public static void main(String []args) throws IOException
	{
		System.out.println("Server is runnning...");
		ServerSocket myServer = new ServerSocket(12345);
		
		System.out.println("Waiting for the Connevction....");
		Socket serverSocket = myServer.accept();
		System.out.println("Connection found.....");
		
		Scanner sc = new Scanner(System.in);
		String str = " ";
		String readStr;
		while(true)
		{	
			BufferedReader brf = new BufferedReader(new InputStreamReader(serverSocket.getInputStream())); 
			readStr = brf.readLine();
			if (readStr == null || readStr.equalsIgnoreCase("exit")) {
                break; // 
            }
			System.out.println("Client Message : "+readStr);
			PrintWriter pwt =  new PrintWriter(serverSocket.getOutputStream(),true);
			System.out.println("Reply/Send Meassge to Client : ");
			str = sc.nextLine();
			pwt.println(str);
		}
		
		serverSocket.close();
		myServer.close();
		
	}
}
