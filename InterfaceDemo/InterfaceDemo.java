package com.InterfaceDemo;

public interface InterfaceDemo {
	
	abstract class FinalClass{
		                                 //Allowed to creted abstract class in interface
	} 

	public final double PI = 3.12;
	
	int roll = 121;  // ------------------>TREATED AS------->  static final int roll = 121;
	
	static String str = "hello" ;
	
	public void methodDeclare();   //treated as  public abstract void methodDeclare() here
	abstract void abstarctMethod();
	
	private void privateMethod() {
		System.out.println("Private method inside the Interface");
	}
	
	static void staticMethod() {
		System.out.println("I am static method in Interface.Only Static(me) and Default are allowed to have body in Interface");;
	}
	
	
}
