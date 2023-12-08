package com.Multithreading;

public class ThreadRunnable implements Runnable {
	
	private String thrdName;
	
	ThreadRunnable(String name)
	{
		this.thrdName = name ;
	}
	
	@Override
	public void run()
	{
		for(int i = 0 ;i<5 ;i++)
		{
			System.out.println(thrdName+" "+Thread.currentThread().getId()+" : "+i);
			
		}
		
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
