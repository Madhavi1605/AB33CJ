//Write a program to return the value using all data types
package Package1;
public class Assignment67 
{ //Integer
	int add(int a, int b)
	{	int c= a+b;
		return c;}
	//String
		String Name(String a, int b)
		{	String output= a+b;
			return output;}
	//double
		double sub(double a, int b)
		{	double c= a-b;
			return c;}
	//long
		long div(int a, int b)
			{	long c= a/b;
				return c;}
	//byte
			byte bodmas_1(int a, int b, int c)
			{	byte d= (byte) (a+b+c);
				return d;}		
	//short
			short bodmas_2(int a, int b, int c,int d)
			{	short e= (short)(a/b*c+d);
				return e;}
	//float
			float bodmas_3(float a, float b,float c,int d, int e)
				{	float f= (a=b-c*d/e);
					return f;}
	//char
				char val(char a)
				{return a;}	
	//boolean
				boolean condi(boolean a)
				{return a;}	
	public static void main(String[] args) 
	{
		Assignment67 r1 = new Assignment67();
		System.out.println(r1.Name("mary",32));
		System.out.println(r1.add(1,5));
		System.out.println(r1.sub(20,12));
		System.out.println(r1.div(20,5));
		System.out.println(r1.bodmas_1(10, 20, 5));
		System.out.println(r1.bodmas_2(10, 20, 13, 30));
		System.out.println(r1.bodmas_3(10, 20, 30, 40, 50));
		System.out.println(r1.val('M'));
		System.out.println(r1.condi(true));

	}

}
