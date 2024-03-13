/*Filtering Numbers: Given a list of integers, write a program that uses a functional interface and lambda expressions to filter out all even numbers and 
	print the remaining odd numbers.*/
	
	import java.util.*;
	
	
	@FunctionalInterface
	interface EvenNum{
		public void evenNum(List<Integer> numList);
	}
	
	public class EvenNumber {
		
		public static void main(String [] args) {
			List<Integer> myNum = new ArrayList<>();
			myNum.add(12);
			myNum.add(21);
			myNum.add(134);
			myNum.add(56);
			myNum.add(43);
			myNum.add(67);
			myNum.add(98);
			
			System.out.print("Original List : ");
			for(Integer num : myNum){
				System.out.print(num+" ");
			}
			
			EvenNum numbers = (numList)->{
				System.out.print("\n Even Number from the List : ");
				for(Integer num : myNum){
					if(num%2==0){
						System.out.print(num+" ");
					}
				}
			};
			numbers.evenNum(myNum);
		}
	}