//Assignment47: Launch google.com type india from autosuggestion select last option
package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment47 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement googlesearchtextbox = driver.findElement(By.id("APjFqb"));
		googlesearchtextbox.sendKeys("India");
		Thread.sleep(2000);
		//driver.findElements(By.)

	}

}
