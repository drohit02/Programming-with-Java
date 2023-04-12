package start12th2023;

public class TernaryOpearator 
{
	public static void main(String args[])
   
	{
        //finding gretest among three number
		
		int a = 34;
		int b = 23 ; 
		int c = 67 ;
		
		int max = a>b?(a>c?a:c):(b>c?b:c);
		
		if(max==a)
		{
		  System.out.println("a is max");
		}

		else if(max==b)
		{
		  System.out.println("b is max");
		}

		else if(max==c)
		{
		  System.out.println("c is max");
		}

    }
}
