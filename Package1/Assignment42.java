//Assignment 42: Launch amazon.in select book from dropdown, and type book name of your
//choice and press enter. Now Click on the book.
package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment42 {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchDropdownBox_Feild =driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(searchDropdownBox_Feild);
		s1.selectByValue("search-alias=stripbooks");
		WebElement twotabsearchtextbox_feild = driver.findElement(By.id("twotabsearchtextbox"));
		twotabsearchtextbox_feild.sendKeys("The Richest Man In Babylon");
		twotabsearchtextbox_feild.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("The Richest Man In Babylon")).click();

	}

}
