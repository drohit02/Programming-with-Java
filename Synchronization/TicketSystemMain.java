package com.Synchronization;

public class TicketSystemMain {

	public static void main(String[] args) 
	{
		TicketSystem ts1 = new TicketSystem();
		
		MyThread mt1 = new MyThread(ts1);
		MyThread mt2 = new MyThread(ts1);
		
		System.out.println("First Thread Executed....");
		mt1.start();
		System.out.println("Second Thread Executed....");
		mt2.start();

	}

}
