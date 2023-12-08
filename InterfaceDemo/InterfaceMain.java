package com.InterfaceDemo;

public class InterfaceMain implements InterfaceDemo{
	
	

	public static void main(String[] args) {
		
		
		
		InterfaceDemo id = new InterfaceMain();
	
		
		System.out.println("Roll no set in interface is : "+InterfaceDemo.roll);
		//InterfaceDemo.roll = 101;------>  treated as static final int roll = 101 ; in interface
		
		
		System.out.println("Interface costant variable is accessible and value is : "+ PI);

	}

	@Override
	public void methodDeclare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstarctMethod() {
		// TODO Auto-generated method stub
		
	}

}
