//Assignment54:Launch JSAM application,check if the last name isDisplayed,
//if yes then check isEnable,if yes then type name.(Do with if block)
package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment54 {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/donal/OneDrive/Desktop/Mary/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement l_name = driver.findElement(By.id("121"));
		boolean b1= l_name.isDisplayed();
		if (b1==true)
		{
			boolean b2=l_name.isEnabled();
			if(b2==true)
			{
				l_name.sendKeys("Madhavi");
			}
			else
			{
				System.out.println("It is disable");
			}
		}
	}

}
