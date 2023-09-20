//Assignment79: Write a Program to login to Google.com and double click on images link
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment79 {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gamailLink = driver.findElement(By.linkText("Images"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(gamailLink).perform();	

	}

}
