package dataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

	@Test(dataProvider = "Login_Data")
	void testCredentials(String uname, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("btn-primary")).click();
		
		driver.quit();
	}
	
	
	@DataProvider
	Object[] [] Login_Data() {
		
//		Object[] [] obj = {{"admin","password123"},{"admin123","pass1234"},{"#@$%","%@&@$"},{"  ","  "}};
//		return obj;
		
		/*------ another way ------*/
		return new Object[][] {{"admin","password123"},{"admin123","pass1234"},{"#@$%","%@&@$"},{"  ","  "}};
	}
}
