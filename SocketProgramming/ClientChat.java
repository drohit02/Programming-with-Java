package com.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientChat {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("connection request send.....");
		Socket myClient = new Socket("localhost",12345);
		System.out.println("Connection Establish.....  ");
		String str = "..";
		Scanner sc = new Scanner(System.in);
		String readStr;
		while(true)
		{
			PrintWriter pwt = new PrintWriter(myClient.getOutputStream(),true);
			System.out.println("Message to Server : ");
			str = sc.nextLine();
			
			pwt.println(str);
			BufferedReader brf = new BufferedReader(new InputStreamReader(myClient.getInputStream())); 
			readStr = brf.readLine();
			if (readStr == null || readStr.equalsIgnoreCase("exit")) {
                break; // 
            }
			System.out.println("reply by server : "+readStr);
		}
		myClient.close();
	}

}
