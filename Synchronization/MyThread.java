package com.Synchronization;

public class MyThread extends Thread{
	
	private TicketSystem ts;
	
	public MyThread(TicketSystem ts)
	{
		this.ts = ts;
	}
	
	public void run()
	{
		this.ts.BookTicket();
	}

}
