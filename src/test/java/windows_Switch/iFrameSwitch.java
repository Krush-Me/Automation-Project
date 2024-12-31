package windows_Switch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameSwitch {

//	@Test 
//	void iFrameTest() {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
//		
//		driver.switchTo().frame("singleframe");
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCD1234");
//		
//		driver.switchTo().defaultContent();
//		
//	}
	
	@Test
	void nestediFrameTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCD1234");
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
	}
	
	
	
}
