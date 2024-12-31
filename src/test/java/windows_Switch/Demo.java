package windows_Switch;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	void frameTest() {
		WebDriver driver = new ChromeDriver();
		
		  // Navigate to Url
        driver.get("https://testautomationpractice.blogspot.com/");
        
        String currentWindow = driver.getWindowHandle();
        
        driver.findElement(By.xpath("//button[@id='PopUp']")).click();
        
        Set<String> allWindows = driver.getWindowHandles();
        
//        for(String allWindow : allWindows) {
//        	if(!allWindow.equals(currentWindow)) {
//        		driver.switchTo().window(allWindow);
//        		break;
//        	}
//        }
        
     
        Iterator<String> iter = allWindows.iterator();
        //iter.next();
        String nextWindow = iter.next();
        
        driver.switchTo().window(nextWindow);
        System.out.println(driver.getTitle());
        
        
        
	}
	
}
