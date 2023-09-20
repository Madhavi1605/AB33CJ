//Assignment55:Annotations-Create single class and add 3 @Test annotations 
//with 3- methods(add,mul,sub) and check order of execution .
package Package1;

import org.testng.annotations.Test;

public class Assignment55 
{
	@Test
	void add()
	{
		System.out.println("addition");
	}
	@Test
	void mul()
	{
		System.out.println("multiplication");
	}
	@Test
	void sub()
	{
		System.out.println("sustraction");
	}
}
