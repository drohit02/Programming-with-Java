package com.Multithreading;

public class NewThread extends Thread{
	
	private String thrName;
	
	NewThread(String name)
	{
		this.thrName = name;
	}
	
	public void run()
	{
		for(int i = 0 ;i<5 ;i++)
		{
			System.out.println(thrName +" : "+i);
		}
		
		try {
			Thread.sleep(500);; // just to see where threads are running concurrently
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
