package windows_Switch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Switch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		// for single window
//		String windowId = driver.getWindowHandle();
//		System.out.println(windowId);
		
		driver.findElement(By.linkText("Myntra")).click();
		
		// for multiple windows
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds.size());
		
		Iterator<String> it = windowIds.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		//driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Shoes for men");
		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		enter.sendKeys("Shoes for men");
		enter.sendKeys(Keys.ENTER);
		
		//driver.quit();
	}

}
