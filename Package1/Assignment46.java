//Assignment 46: Launch Amazon.com and  type shoes next write the XPath for autosuggestion.
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment46 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchtextbox = driver.findElement(By.name("field-keywords"));
		searchtextbox.sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		int count= autosuggestion.size();
		System.out.println(count);
	}

}
