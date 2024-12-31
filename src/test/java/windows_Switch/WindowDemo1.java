package windows_Switch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowDemo1 {

	@Test
	void windowsSwitchTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		// for single window
//		String windowId = driver.getWindowHandle();
//		System.out.println(windowId);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//a[@target='_blank' and @href='http://www.selenium.dev' ]")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds.size());
		
		Iterator<String> iter = windowIds.iterator();
		String parentWindow = iter.next();
		String childWindow = iter.next();
		
		driver.switchTo().window(childWindow);
		
		/**/
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.quit();
	}
	
}
