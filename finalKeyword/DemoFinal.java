package com.finalKeyword;

public class DemoFinal {

	//final variable in java
	
	public final double VAR1 = 3.141723;  //Allowed
//	
//	public final double VAR2;
//	VAR2 = 2.17;   // Not Allowed
	
	public final double VAR2;
	
	DemoFinal()
	{
		this.VAR2 = 2.47 ;
	}
	public static final double GRAVITY = 9.81;
	
	public final String STR = null ;
	
//	public final int VAR4;
//	public void setVar4() {
//		this.VAR4 = 9876;          //Not allowed in java
//	}
	
	//This is for final Method
	
	public final void setGravity() {
		
		System.out.println("I am final method in Demo final.So  Cannot overriden");
		System.out.println("But Body can be modify");
	}
	public final void setGravity(float a) {
		System.out.println("Method overloading is possible in java ");
	}
	public static final void setFinal() {
		System.out.println("Final with static keyword is possible in java");
	}
	public static final void setFinal(int a) {
		System.out.println("Final with static keyword is possible in java and also overloading is possibe");
	}
}
