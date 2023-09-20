//Assignment 38:Launch facebook.com and do login
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment38 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("marymadhavi@ymail.com");
		driver.findElement(By.id("pass")).sendKeys("xyz");
		driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
	}

}
