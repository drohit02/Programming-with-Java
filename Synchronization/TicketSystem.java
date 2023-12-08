package com.Synchronization;

public class TicketSystem {
	
	
	synchronized public void BookTicket()
	{
		for(int i = 0 ;i<7;i++)
		{
			System.out.println(Thread.currentThread().getId() + " : "+i);
			 try 
			 {
				Thread.sleep(500);
			} 
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
