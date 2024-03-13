/*Mapping Strings to Lengths: Given a list of strings, write a program that uses a functional interface and 
lambda expressions to create a new list containing the lengths of each string.*/

	import java.util.*;
	@FunctionalInterface
	interface LengthStringFunction{
		
		public void lengthString();
	}
	
	public class LengthString {
		public static void main(String[] args){
			List<String> strList = new ArrayList<String>();
			strList.add("Aditya");
			strList.add("Shivraj");
			strList.add("Shubham");
			strList.add("Tushar");
			strList.add("Rohit");
			
			LengthStringFunction strLength = ()->{
				System.out.println("String  "+"    Length");
				for(String str : strList){
					System.out.println(str +"    |    "+str.length());
				}
			};
			strLength.lengthString();
		}
	}