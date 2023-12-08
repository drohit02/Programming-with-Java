package com.Multithreading;

public class ThreadRunnableMain {

	public static void main(String[] args) 
	{
		System.out.println("Main Execution start here...... ");
		ThreadRunnable newThread1 =new ThreadRunnable("First");
		ThreadRunnable newThread2 =new ThreadRunnable("Second");
		
		Thread t1 = new Thread(newThread1);
		Thread t2 = new Thread(newThread2);

		System.out.println("First Thread Execution...");
		t1.start();
		System.out.println("Second Thread Execution...");
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Execution Ends here...... ");
	}
	

}
