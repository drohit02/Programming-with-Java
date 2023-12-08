package com.finalKeyword;

public class FinalMain extends DemoFinal {
	
//	@Override
//	public final void setGravity() {
//		System.out.println("Truing to override but failed.Not Allowed!!!");              //NOT ALLOWED
//	}
	public final void setGravity(int a) {
		System.out.println("final method overloaded im child class");
	}
	
	public static void main(String []args) {
		
		FinalMain fm = new FinalMain();
		System.out.println("Final Varibale 1 : "+ fm.VAR1);
		fm.setGravity();
		fm.setGravity(12);
		fm.setGravity(12.5f);
		DemoFinal.setFinal();
		DemoFinal.setFinal(12);
	}

}
