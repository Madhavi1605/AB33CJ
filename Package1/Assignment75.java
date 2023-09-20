package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment75 {
WebDriver driver;
	
	@Test
	@Parameters("browser")
	void Broswer1(String nameofyourbrowser) 
	{
		if(nameofyourbrowser.equals("Chrome"))
		{	
		driver = new ChromeDriver();
		}
		if(nameofyourbrowser.equals("edge"))
		{	
		driver = new EdgeDriver();
		}
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();		
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		driver.close();
	}
	
}
