package com.Multithreading;

public class ThreadMain {

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Executing.....");
	
		NewThread nt1 = new NewThread("First");
		NewThread nt2 = new NewThread("Second");
		
		System.out.println("First Thread...");
		nt1.start();
		System.out.println("Second Thread...");
		nt2.start();
		
		System.out.println("Main Thread Terminated.....");

	}

}
