//Assignment 45: Launch http://www.flipkart.com/ next Hover over Fashions next click on 
//T-shirt next click on Men T-shirt next click on first T-shirt next click on Buy now.
package Package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment45 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
