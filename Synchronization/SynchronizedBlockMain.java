package com.Synchronization;

public class SynchronizedBlockMain {

	public static void main(String[] args) 
	{
		SynchronizedBlock synblk1 = new SynchronizedBlock();
		SynchronizedBlock synblk2 = new SynchronizedBlock();
		
		System.out.println("First thread Execution start....");
		synblk1.start();
		System.out.println("Second thread Execution start....");
		synblk2.start();
	}

}
