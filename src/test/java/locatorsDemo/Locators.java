package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

	@Test
	void locate() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		// standard xpath
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		// text
		
		// using 'and' condition
		driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("password123");
		
		// using 'or' conditions
		driver.findElement(By.xpath("//button[@type='submit' or @class='btn-primary']")).click();
		
		//
		driver.quit();
	}
	
}
