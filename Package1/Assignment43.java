//Assignment 43: Automate the provided HTML file (learningHTML1.html)
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment43 {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/donal/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Mary");
		driver.findElement(By.name("say hello")).sendKeys("good morning");
		driver.findElement(By.id("3")).sendKeys("Password@1");
		driver.findElement(By.name("fname")).sendKeys("Mary");
		driver.findElement(By.name("lname")).click();
		driver.findElement(By.xpath("/html/body/input[5]")).click();
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		WebElement dropdown=driver.findElement(By.id("Relegion"));
		Select s1= new Select(dropdown);
		s1.selectByValue("4");
		driver.findElement(By.xpath("/html/body/form[2]/input[4]")).click();
	}

}
