//Assignment_57: Write a Program for Exception handling. Use finally block in the program.
package Package1;

public class Assignment57 
{
	public static void main(String[] args) 
	{
	try
	{
		System.out.println("I am try blank");
		//int a=1/1;
		
	}
	catch(ArithmeticException a1)
	{
		System.out.println("Handled exception");
	}
	catch(NullPointerException a2)
	{
		System.out.println("Handled exception 1");
	}	
	finally
	{
		System.out.println("thanks for visiting the website");
	}
	}

}


