/*Minimum and Maximum: Given a list of integers, write a program that uses functional interfaces and 
lambda expressions to find the minimum and maximum values in the list.*/

import java.util.*;
import java.util.function.Supplier;

public class MinMaxInList {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        numList.add(42);
        numList.add(12);
        numList.add(21);
        numList.add(134);
        numList.add(56);
        numList.add(43);
        numList.add(67);
        numList.add(98);

        Supplier minMaxEle = () -> {
            int min = numList.get(0);
            int max = numList.get(0);
			
			System.out.print("Numbers ");
            for (Integer num : numList) {
				System.out.print(num+" ");
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            }

            System.out.println("\nMax in List: " + max);
            System.out.println("Min in List: " + min);
        };
        minMaxEle.get();
    }
}
