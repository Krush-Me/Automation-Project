package tableReadFromWeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArraySorter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandilngWebTables {

//	@Test
//	void countHeaders() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/admin.html");
//		int count = 0;
//		for(int i=1;i<=5;i++) {
//			driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+ i +"]"));
//			count++;
//		}
//		Assert.assertEquals(count, 6);
//		driver.close();
//	}
//	
//	@Test
//	void tableHeaderTextTest() {
////		ArrayList<String> arr = new ArrayList<String>();
////		arr.add("Category ID");
////		arr.add("Category Name");
////		arr.add("Created At");
////		arr.add("Modified At");
////		arr.add("Actions");
//		
//		List<String> arr1 = Arrays.asList("Category ID","Category Name","Created At","Modified At","Actions");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/admin.html");
//		
//		for(int i=1; i<=5; i++) {
//			String actualHeaderText = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+ i +"]")).getText();
//			
//			String expectedHeaderText = arr1.get(i-1);			// if we write i here it will print by index value
//			Assert.assertEquals(actualHeaderText, expectedHeaderText);
//		}
//		driver.close();
//	}
	
	/* ------------- Check First Character is UpperCase	---------------- */
//	@Test
//	void headerFirstLetterCheck() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/admin.html");
//		
////		for(int i=1; i<=5; i++) {
////			String actualHeaderText = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+ i +"]")).getText();
////			char firstLetter = actualHeaderText.charAt(0);
////			boolean isUpperCase = Character.isUpperCase(firstLetter);
////			
////			Assert.assertTrue(isUpperCase);
////		}
//		
//		List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th"));
//		for(WebElement header : headers) {
//			String actualHeaderText = header.getText();
//			char firstLetter = actualHeaderText.charAt(0);
//			boolean isUpperCase = Character.isUpperCase(firstLetter);
//			
//			Assert.assertTrue(isUpperCase);
//		}
//		
//		driver.close();
//	}
	/* ------------- Check First Character is UpperCase	---------------- */
	
	/* ------------- Check 2nd Words First Character is UpperCase	---------------- */
	@Test
	void firstCharOf2ndWordCheck() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		
		List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th"));
		for(WebElement header : headers) {
			String actualHeaderText = header.getText();
			String[] words = actualHeaderText.split(" ");
			if(words.length < 2) {
				continue;
			}
			char firstLetterOfSecondWord = words[1].charAt(0);
			boolean isUpperCase = Character.isUpperCase(firstLetterOfSecondWord);
			
			Assert.assertTrue(isUpperCase);
		}
		driver.close();
	}
	
	/* ------------- Check 2nd Words First Character is UpperCase	---------------- */
	
	
	
}
