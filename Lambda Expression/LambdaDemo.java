/*
Lambda Expression : Works with the functional Interface which contain only one abstract method
*/
@FunctionalInterface
interface MyFuctionalInterface{
	public void display();
}


public class LambdaDemo{
	
	public static void main(String [] args){
		
		MyFuctionalInterface mfi = ()->{
			System.out.println("'Lambda Expression using Functional Exepression'");
		};
		
		mfi.display();
	}
}