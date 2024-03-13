import java.util.Scanner;

@FunctionalInterface
interface Addition{
	void add(int x,int y);
}

public class AdditionProgram{
		public static void main(String[] args){
			int a ;
			int b ;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st Number");
			a = sc.nextInt();
			
			System.out.println("Enter 2nd Number");
			b = sc.nextInt();

			Addition addNum = (x,y)->{
				System.out.println("Addition is : "+(x+y));
			};
			
			addNum.add(a,b);
		
		}
}