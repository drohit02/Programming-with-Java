package com.Synchronization;

public class SynchronizedBlock extends Thread {

    public void run() 
    {
        for (int i = 1; i < 10; i++) 
        {
            System.out.println(Thread.currentThread().getId() + " " + i);
        }
        System.out.println("Synchronized block start here...");
        synchronized (this)
        {
            for (int j = 0; j < 7; j++) 
            {
                System.out.println(Thread.currentThread().getId() + " " + j);
            }
        }
        try 
        {
			Thread.sleep(500);
		} 
        catch (InterruptedException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
