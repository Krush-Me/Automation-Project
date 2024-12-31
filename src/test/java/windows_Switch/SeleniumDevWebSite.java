package windows_Switch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumDevWebSite {

	@Test
	void switchTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		driver.findElement(By.xpath("//a[@href='/documentation']")).click();	
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String windowHandle : allWindows) {
			if(!windowHandle.equals(mainWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(mainWindow);
		System.out.println("Return Url : " + driver.getCurrentUrl() );
		
	}
	
}
