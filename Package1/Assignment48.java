//Assignment48: Launch flipkart.com and type shoe select the 6th autosuggestion and then click on the 1st option
package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment48 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fk = driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]"));
		fk.click();
		WebElement search_shoe = driver.findElement(By.name("q"));
		search_shoe.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> selectshoe= driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
		int count= selectshoe.size();
		System.out.println(count);
		selectshoe.get(count-1).click();
	

	}

}
