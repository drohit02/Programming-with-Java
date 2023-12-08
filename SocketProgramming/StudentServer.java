package com.SocketProgramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer {

    public static void main(String[] args) {
        System.out.println("Server Listening at Port 12345");

        try (ServerSocket myServer = new ServerSocket(12345);
             Socket mySocket = myServer.accept();
             ObjectInputStream objRead = new ObjectInputStream(mySocket.getInputStream())) 
        {

            System.out.println("Connection successfully established...");

            Student nwStudent = (Student) objRead.readObject();
            System.out.println(nwStudent);
            System.out.println("Student Object Received...");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Handle this exception appropriately
        }
    }
}
