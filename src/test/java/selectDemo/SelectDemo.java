package selectDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDemo {

//	@Test
//	void selectValues() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/subcategories.html");
//		
//		driver.findElement(By.id("add-subcategory")).click();
//		
//		WebElement ele = driver.findElement(By.name("parentCategory"));
//		
//		Select sc = new Select(ele);
//		
//		//sc.selectByIndex(1);
//		//sc.selectByVisibleText("Arts");
//		//sc.selectByValue("Technology");
//	}
	
	/* ------------- Validate First value of Dropdown should be "Mathematics" ---------------------- */
	@Test
	void selectValues() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		
		driver.findElement(By.id("add-subcategory")).click();
		
		WebElement ele = driver.findElement(By.name("parentCategory"));
		
		Select sc = new Select(ele);
		
		List<WebElement> values = sc.getOptions();
		boolean b = false;
		for(WebElement value : values) {
			String drpValues = value.getText();
			if(drpValues.equals("Mathematics")) {
				b = true;
			}
		}
		Assert.assertTrue(b, "Value Does Not Match !!!");
		driver.quit();
	}
	/* ------------- Validate First value of Dropdown should be "Mathematics" ---------------------- */
	
	
	
	/* ------------- count values of Dropdown  ---------------------- */
	@Test
	void firstValues() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		
		driver.findElement(By.id("add-subcategory")).click();
		
		WebElement ele = driver.findElement(By.name("parentCategory"));
		
		Select sc = new Select(ele);
		
		List<WebElement> values = sc.getOptions(); 
		Assert.assertEquals(values.size(), 5);
		
	}
	/* ------------- count values of Dropdown ---------------------- */

	
	
	
}
