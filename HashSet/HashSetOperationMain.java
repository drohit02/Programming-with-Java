package com.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperationMain {

	public static void main(String[] args) {
		
		HashSet<Integer> myIntObj1 = new HashSet<>();
		myIntObj1.add(12);
		myIntObj1.add(24);
		myIntObj1.add(38);
		myIntObj1.add(45);
		myIntObj1.add(57);
//		myIntObj1.add(65);
		Iterator<Integer> myHash = myIntObj1.iterator();
		while(myHash.hasNext())
		{
			Integer in = myHash.next();
			System.out.println(in);			
		}
		System.out.println("-----------------------------------------------------------------------------");
		HashSet<Integer> myIntObj2 = new HashSet<>();
		myIntObj2.add(32);
		myIntObj2.add(12);
		myIntObj2.add(59);
		myIntObj2.add(40);
		myIntObj2.add(57);
//		myIntObj2.add(101);
		Iterator<Integer> myHash2 = myIntObj2.iterator();
		while(myHash2.hasNext())
		{
			Integer in = myHash2.next();
			System.out.println(in);			
		}
		System.out.println("---------------------- Set Operation ---------------------------");
		
		HashSet<Integer> interOp = new HashSet<>(myIntObj1);
		System.out.println(interOp.retainAll(myIntObj2));
		
		//retainsAll()method gives Intersection
		
		Iterator<Integer> myInter = interOp.iterator();
		System.out.println("Intersection of the myIntObj1 and myIntObj1 : ");
		while(myInter.hasNext())
		{
			Integer in = myInter.next();
			System.out.println(in);
		}
		
		//addAll() method gives Union of the Hashset
		
		HashSet<Integer> add = new HashSet<>(myIntObj1);
		add.addAll(myIntObj2);
		
		System.out.println("\nUnion of the myIntObj1 and myIntObj2 : ");
		Iterator<Integer> unionOp = add.iterator();
		while(unionOp.hasNext())
		{
			Integer in = unionOp.next();
			System.out.println(in);
		}
		
		//removernAll() method gives the Difference between two HashSet
		
		HashSet<Integer> diff = new HashSet<>(myIntObj1);
		diff.removeAll(myIntObj2);
		
		System.out.println("\nDiffrence between myIntObj1 and myIntObj2 : ");
		Iterator<Integer> myItr = diff.iterator();
		while(myItr.hasNext()) {
			Integer in = myItr.next();
			System.out.println(in);
		}
		
		HashSet<Integer> diff1 = new HashSet<>(myIntObj2);
		diff1.removeAll(myIntObj1);
		
		System.out.println("\nDiffrence between myIntObj2 and myIntObj1 : ");
		Iterator<Integer> myItr1 = diff1.iterator();
		while(myItr1.hasNext()) {
			Integer in = myItr1.next();
			System.out.println(in);
		}
 
	}

}
