/*
Squaring Numbers: Similar to question 1, use a functional interface and 
lambda expressions to create a new list containing the squares of all numbers in the original list.
*/

	import java.util.*;

	@FunctionalInterface
	interface SquareNum {
		void squareNum(List<Integer> numList);
	}

	public class SqaureNumber {

		public static void main(String[] args) {

        List<Integer> myNum = new ArrayList<>();
        myNum.add(12);
        myNum.add(21);
        myNum.add(134);
        myNum.add(56);
        myNum.add(43);
        myNum.add(67);
        myNum.add(98);

        SquareNum squares = (numList) -> {
			System.out.print("Numbers are : ");
			for(Integer num : myNum){
				System.out.print(num+" ");
			}
            System.out.print("\nSquares of the numbers: ");
            for (Integer num : numList) {
                int square = num * num;
                System.out.print(square + " ");
            }
        };

        squares.squareNum(myNum);
    }
}
