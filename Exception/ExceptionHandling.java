package com.Exception;
import java.util.Scanner;
public class ExceptionHandling {
	
	public static int divider(int a,int b) throws ArithmeticException {
		
//		if (b==0)
//		{
//			throw new ArithmeticException("B is eqaul to 0");
//		}
		return a/b;
		
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c=0;
		System.out.println("Enter number 1 ");
		a = sc.nextInt();
		System.out.println("Enter the number 2 ");
		b = sc.nextInt();
		
		try 
		{
		
			c = divider(a,b);
			System.out.println("I am try block");
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Someting is wrong :"+e.getMessage());
////			e.printStackTrace();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Exception handle here");
//		}
		finally {
			System.out.println("Finally block is executed");
		}
		System.out.println("result is : "+ c);
		
		sc.close();
	}

}
