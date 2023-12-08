package com.BookCode;

import java.util.Scanner;

public class ScannerIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the roll no : ");
		int roll = sc.nextInt();

		System.out.println("Enter the Marks : ");
		double marks = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Name : "+name+" Roll No : "+roll+" Marks gets : "+marks);
		
		//Wrapper Classes
		
		System.out.println("Enter the Name : ");
		String name1 = sc.nextLine();
		
		System.out.println("Enter the roll no : ");
		int roll1 = Integer.parseInt(sc.nextLine());
		

		System.out.println("Enter the Marks : ");
		double marks1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Name : "+name1+" Roll No : "+roll1+" Marks gets : "+marks1);
	}

}
