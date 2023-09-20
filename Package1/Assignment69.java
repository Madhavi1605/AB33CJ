//Assignment 69: Write a program on switch, using scanner class to accept the input.
package Package1;
import java.util.Scanner;
public class Assignment69 {
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value for x");
		int x= s1.nextInt();
		System.out.println("Enter value for y");
		int y= s1.nextInt();
		System.out.println("Enter the Arithmetic operation");
		String operation= s1.next();
		switch(operation)
		{
		case "add": 
			System.out.println("Addition:" + (x+y));
			break;
	case "sub": 
		System.out.println("Substration:" + (x-y));
		break;
	case "mul": 
		System.out.println("Multiplication:" + (x*y));
		break;
	case "div": 
		System.out.println("Division:" + (x/y));
		break;
	default:
		System.out.println("Arithmetic operation");
		}
	}
}
