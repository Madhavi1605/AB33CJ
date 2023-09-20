//Assignment81: Write a Program to login to Flipkart.com and Right click on Mobiles
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment81 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.linkText("Mobiles"));
		Actions a = new Actions(driver);
		a.contextClick(rightclick).perform();	
		
	}

}
