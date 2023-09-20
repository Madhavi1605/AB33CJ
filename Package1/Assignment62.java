//Assignment62: Write a Program to find the Past,present,future time
package Package1;
import java.util.Date;
public class Assignment62 {
public static void main(String[] args) 
{
	Date d1 = new Date();// Java util
	System.out.println(d1.getTime());//epoch time
	Date d2 = new Date(d1.getTime());
	Date d3 = new Date(d1.getTime()+1000*60*60*24*5);// future time
	Date d4 = new Date(d1.getTime()-1000*60*60*24*5);// past time
	System.out.println("Current date:" +d2);
	System.out.println("Future date:" +d3);
	System.out.println("Past Date:" +d4);
	
	String currenttime = d2.toString();
	String date = currenttime.substring(8, 10);
	System.out.println(date);
	String month = currenttime.substring(4, 7);
	System.out.println(month);
	String year = currenttime.substring(24);
	System.out.println(year);
	String format1 = date.concat(month).concat(year);
	System.out.println(format1);
	
	}

}
