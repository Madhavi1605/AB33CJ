package Package1;

import org.testng.annotations.Test;

public class Assignment77 
{
	@Test(groups = {"Smoke", "System","Regression"})
	public void testcase1()
	{
		System.out.println(1);
	}
	@Test(groups = { "System","Regression"})
	public void testcase2()
	{
		System.out.println(2);
	}
	@Test(groups = { "System","Regression"})
	public void testcas3()
	{
		System.out.println(3);
	}
	@Test(groups = {"Smoke"})
	public void testcase4()
	{
		System.out.println(4);
	}
	@Test(groups = {"System"})
	public void testcase5()
	{
		System.out.println(5);
	}
	@Test(groups = {"System"})
	public void testcase6()
	{
		System.out.println(6);
	}
	@Test
	public void testcase7()
	{
		System.out.println(7);
	}
	@Test
	public void testcase8()
	{
		System.out.println(8);
	}
	@Test
	public void testcase9()
	{
		System.out.println(9);
	}
	@Test
	public void testcase10()
	{
		System.out.println(10);
	}
	
	

}
