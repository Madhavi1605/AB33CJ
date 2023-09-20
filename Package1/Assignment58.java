//Assignment58: Write a program for String function 1) length();2) charAt(index);3) indexOf(char);
//4) subString(origin);5) subString(origin,destination);6) trim();7) isEmpty();8) concat("String value");9) toUpperCase()
//10) toLowerCase()11) contains()12) matches()13) equals()14) lastIndexOfCharacter()
package Package1;
public class Assignment58 {
public static void main(String[] args)
{
	String my_country="India";
	System.out.println("Length of string="+my_country.length());//length
	System.out.println("Position of character="+my_country.charAt(2));//charAt(index)
	System.out.println("Index of value="+my_country.indexOf('d'));//indexOf(char)
	System.out.println("starting position of string="+my_country.substring(1));//subString(origin)
	System.out.println("start&end position of string="+my_country.substring(2,5));//subString(origin,destination)
	String my_Natioanlity=" I am from India ";
	System.out.println("remove extra space from string="+my_Natioanlity.trim());//trim
	System.out.println("check the string is empty="+my_Natioanlity.isEmpty());//isEmpty
	System.out.println("concatiation of 3 string="+my_Natioanlity.trim().concat(" "+ "and"+" "+my_country));//concat("String value")
	System.out.println("String to upper case="+my_country.toUpperCase());//toUpperCase
	System.out.println("String to lower case="+my_country.toLowerCase());//toLowerCase
	System.out.println("character in a string="+my_Natioanlity.contains("f"));//contains
	System.out.println("two string match or not="+my_country.matches(my_Natioanlity));//matches
	System.out.println("last index of perticular char ="+my_Natioanlity.trim().lastIndexOf("i"));//lastIndexOfCharacter
	}

}
