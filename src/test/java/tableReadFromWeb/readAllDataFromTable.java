package tableReadFromWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class readAllDataFromTable {
	
	/* ----------------- Print All Data ----------------------*/
	@Test
	void readAllDataFromTable() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		
		List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th"));
		for( WebElement header : headers) {
			System.out.printf(" %-15s | ",header.getText());
		}
		System.out.println();
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"categories-table\"]/tbody/tr"));
	
		for(WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(WebElement cell : cells) {
				System.out.printf(" %-15s | ",cell.getText());
			}
			System.out.println();
		}
		driver.close();
	}
	/* ----------------- Print All Data ----------------------*/
	
	
	/* ----------------- Print Specific Row ----------------------*/
//	@Test
//	void printSpecificRow() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/admin.html");
//		
//		WebElement row = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]"));
//		List<WebElement> cells = row.findElements(By.tagName("td"));
//		for( WebElement cell : cells) {
//			System.out.printf(" %-15s | " ,cell.getText());
//		}
//		System.out.println();
//		driver.close();
//	}
	/* ----------------- Print Specific Row ----------------------*/
	
	
	/* ----------------- Print Specific Column ----------------------*/
//	@Test
//	void printSpecificColumn() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javabykiran.com/selenium/admin.html");
//		
//		List<WebElement> cells = driver.findElements(By.xpath("//*[@id=\"categories-table\"]/tbody/tr/td[2]"));
//		for(WebElement cell : cells) {
//			System.out.printf(" %-15s | \n", cell.getText());
//		}
//		System.out.println();
//	}
	/* ----------------- Print Specific Column ----------------------*/
}
