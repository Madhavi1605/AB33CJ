//Assignment61: String="MY NAME IS MKT" 
//Output to be in the below format:My Name Is Mkt 
package Package1;
public class Assignment61 {
public static void main(String[] args) 
{
	String str = "MY NAME IS MKT";
	String str_1[]= str.split(" ");
	for (int i=0;i<str_1.length;i++)
	{
		System.out.println(str_1[i].toUpperCase().charAt(0)+str_1[i].toLowerCase().substring(1));
	}
	for (int i=str_1.length-1;i>=0;i--)
	{
		System.out.println(str_1[i].toUpperCase().charAt(0)+str_1[i].toLowerCase().substring(1));
	}
	for (int i=0;i<str_1.length;i++)
	{
		System.out.print(str_1[i].toUpperCase().charAt(0)+str_1[i].toLowerCase().substring(1)+" ");
	}
	System.out.println();
	for (int i=str_1.length-1;i>=0;i--)
	{
		System.out.print(str_1[i].toUpperCase().charAt(0)+str_1[i].toLowerCase().substring(1)+" ");
	}
		
	}

}
