package com.SocketProgramming;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class StudentClient {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Virat", 35);

        System.out.println("Sending connection request...");

        try (Socket nwSocket = new Socket("localhost", 12345);
             ObjectOutputStream myObj = new ObjectOutputStream(nwSocket.getOutputStream())) 
        {

            myObj.writeObject(s1);
            myObj.flush();
            System.out.println("Object is sent to the server.");

        } catch (UnknownHostException e) {
            e.printStackTrace(); // Handle this exception appropriately
        } catch (IOException e) {
            e.printStackTrace(); // Handle this exception appropriately
        }
    }
}
