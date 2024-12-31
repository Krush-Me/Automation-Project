package propertyFileProgram;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadProperty {

	@Test
	void readDataProperty() throws Exception {

		FileInputStream fis = new FileInputStream(".\\Property File\\config.properties");
		Properties pro = new Properties();
		pro.load(fis);

		String browSer = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String userName = pro.getProperty("username");
		String passWord = pro.getProperty("password");

		WebDriver driver;
		if (browSer.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browSer.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browSer.equalsIgnoreCase("internetexplorer")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();

		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();

		/*	--------- Admin Panel text is Visible -----------	*/
//		String Actualtxt = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
//		String Expectedtxt = "Admin Success";
//		Assert.assertEquals(Actualtxt, Expectedtxt, "Text Does not match...");

		/*	---------- Categories text is visible ------------	*/
//		String actualDisp = driver.findElement(By.xpath("//*[@id=\"categories\"]/div[1]/h2")).getText();
//		String ExpectedDisp = "categories";
//		Assert.assertEquals(actualDisp, ExpectedDisp, "Text Does not match...");

		/*	---------- Add Category is Visible ------------	*/
//		boolean b1 = driver.findElement(By.xpath("//*[@id=\"add-category\"]")).isDisplayed();
//		Assert.assertTrue(b1);

		/*	---------- Homepage URL ------------	*/
//		String actualURL = driver.getCurrentUrl();
//		String expectedURL = "https://javabykiran.com/selenium/admin.html";
//		Assert.assertEquals(actualURL, expectedURL);

		/*	---------- Page Title ------------	*/
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "Admin Panel - Manage Categories";
//		Assert.assertEquals(actualTitle, expectedTitle);

		/*	---------- logout link is visible ------------	*/
//		boolean logoutcheck = driver.findElement(By.xpath("/html/body/header/nav/a[3]")).isDisplayed();
//		Assert.assertTrue(logoutcheck);

		/*	---------- Sub Categories link is visible ------------	*/
//		boolean subcategoriescheck = driver.findElement(By.xpath("/html/body/header/nav/a[2]")).isDisplayed();
//		Assert.assertTrue(subcategoriescheck);

		/*	---------- Sub Categories URL ------------	*/
//		String subcategoriesActualURL = driver.getCurrentUrl();
//		String subcategoriesExpectedURL = "https://javabykiran.com/selenium/subcategories.html";
//		Assert.assertEquals(subcategoriesActualURL, subcategoriesExpectedURL);
		/*	---------- Sub Categories URL ------------	*/
		
		
		/*	---------- Sub Categories link ------------	*/
//		try {
//			WebElement link = driver.findElement(By.cssSelector("body > header > nav > a:nth-child(2)"));
//			link.click();
//			System.out.println("Link is Clickable...");
//		} catch(Exception e) {
//			System.out.println("Link is not clickable..." + e.getMessage());
//		}
		/*	---------- Sub Categories link ------------	*/
		

		/* --------- Add Category Functionality ------- */
//		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
//
//		boolean addCategoryisDisplayed = driver.findElement(By.xpath("//*[@id=\"modal-title\"]")).isDisplayed();
//		Assert.assertTrue(addCategoryisDisplayed, "ADD category is Visible on Screen.......");
//
//		WebElement txt4 = driver.findElement(By.id("category-name"));
//		txt4.sendKeys("Chemistry");
//
//		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[3]/td[5]/button[2]")).click();
//		Alert alertCancel = driver.switchTo().alert();
//		alertCancel.dismiss();
//
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[3]/td[5]/button[2]")).click();
//		Alert alertOk = driver.switchTo().alert();
//		alertOk.accept();
//
//		Thread.sleep(1000);
		/* --------- Add Category Functionality ------- */
		
		
		/*	----------	Sub Category Functionality ---------	*/
//		driver.findElement(By.cssSelector("a[href='#subcategories'].nav-link")).click();	
//		
//		driver.findElement(By.id("add-subcategory")).click();
//		//driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
		/*	----------	Sub Category Functionality ---------	*/

		//driver.close();
	}

}
