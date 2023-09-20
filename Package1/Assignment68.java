//Assignment 69: Write a program using throw and throws keyword
package Package1;

public class Assignment68 {

	public static void main(String[] args) throws InterruptedException ,NullPointerException
	{
		int age=10;
		Thread.sleep(2000);
		if(age>18)
		{
			System.out.println("open www.youtube.com");
		}
		else
		{
			throw new NullPointerException("The user age is less than 18");
		}
	}


	}


