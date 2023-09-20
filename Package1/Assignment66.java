//Assognment 66: Write program for encapsulation
package Package1;
class Authentication{
private String username="contact@grotechminds.com";
	public String get_username()//getter
	{	return username;	}
	public void set_username(String username)//setter
	{		this.username= username;	}
private String password="12345678";
		public String get_password()//getter
	{
		return password;
	}
	public void set_password(String password)//setter
	{		this.password= password; }
	private int age=60;
	public int getage()//getter
{
	return age;
}
public void setage(int age)//setter
{
	this.age= age;
}	
}
public class Assignment66 {
	public static void main(String[] args) 
	{	Authentication a1 = new Authentication();
		a1.set_username("marymadhavi.28@gmail.com");
		System.out.println(a1.get_username());
		a1.set_password("1234567");
		System.out.println(a1.get_password());
		a1.setage(50);
		System.out.println(a1.getage());
	}
}
