package loginTestCaseValidation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidation {	
	
	@Test
	void headingCheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		String actualHeading = driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		// in BRD
		String expectedHeading = "Welcome Again";
		Assert.assertEquals(actualHeading, expectedHeading,"Text does not match.....");
		
		driver.close();
	}
	
	@Test
	void subHeadingCheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		String actualSubHeading = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		// in BRD
		String expectedSubHeading = "Login to manage your tests and categories";
		Assert.assertEquals(actualSubHeading, expectedSubHeading);
		
		driver.close();
	}
	
	@Test
	void validCredential() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		String actualPanel = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		// in BRD
		String expectedPanel = "Admin Panel"; 
		Assert.assertEquals(actualPanel, expectedPanel);
		
		driver.close();
	}
	
	@Test
	void invalidCredentials() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin145");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123789");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		//in BRD
		String expectedErrorMessage = "Incorrect Username and Password";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	
	@Test
	void invalidUsername() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin145");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		//in BRD
		String expectedErrorMessage = "Incorrect Username and Password";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
		driver.close();
	}
	
	@Test
	void invalidPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		//in BRD
		String expectedErrorMessage = "Incorrect Username and Password";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
		driver.close();
	}
	
	@Test
	void validUnameNoPass() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.xpath("//*[@id=\\\"username\\\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		//in BRD
		String expectedErrorMessage = "Incorrect Username and Password";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
		driver.close();
	}
	
	@Test
	void noUnameValidPass() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		driver.findElement(By.xpath("//*[@id=\\\"username\\\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		//in BRD
		String expectedErrorMessage = "Incorrect Username and Password";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
		driver.close();
	}
	
	@Test
	void usernameLabelCheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		String actualUnameLabel = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText();
		// in BRD
		String expectedUnameLabel = "Username";
		Assert.assertEquals(actualUnameLabel, expectedUnameLabel);
		
		driver.close();
	}
	
	@Test
	void passwordLabelCheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		String actualPassLabel = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/label")).getText();
		// in BRD
		String expectedPassLabel = "Password";
		Assert.assertEquals(actualPassLabel, expectedPassLabel);
		
		driver.close();
	}
	
	
//	@Test
//	void noUnameNoPass() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/login.html");
//		
//		driver.findElement(By.xpath("//*[@id=\\\"username\\\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
//		
//		
//		
//		driver.close();
//	}
	
	@Test
	void titleCheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		@Nullable
		String actualTitle = driver.getTitle();
		// in BRD
		String expectedTitle = "Login - Java by Kiran";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
	}
	
	
//	@Test
//	void urlCheck() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/login.html");
//		
//		@Nullable
//		String actualURL = driver.getCurrentUrl();
//		// in BRD
//		String expectedURL = "https://javabykiran.com/selenium/login.html";
//		Assert.assertEquals(actualURL, expectedURL);
//		
//		driver.close();
//	}
	
	
	@Test
	void subcategorieslinkcheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		
		driver.findElement(By.linkText("Subcategories")).click();
		String actualurl = driver.getCurrentUrl();
		
		String expectedurl = "https://javabykiran.com/selenium/subcategories.html";
		Assert.assertEquals(actualurl, expectedurl);
		
		driver.quit();
	}
	
}
