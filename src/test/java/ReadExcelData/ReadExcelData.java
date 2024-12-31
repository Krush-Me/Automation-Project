package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/hp/OneDrive/Desktop/Selenium Files (Eclipse)/Excel Files/SampleData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("LoginData");
		
		// To fetch particular data 
		String value1 = sheet.getRow(0).getCell(0).getStringCellValue();
		String value2 = sheet.getRow(1).getCell(1).getStringCellValue();
		String value3 = sheet.getRow(2).getCell(1).getStringCellValue();
		String value4 = sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println("-------------------------\n");
		
		// To fetch all data
		int noOfRows = sheet.getLastRowNum();
		System.out.println(noOfRows);
		
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		System.out.println(noOfColumns);
		
		for(int i=0; i<=noOfRows; i++) {
				XSSFRow row = sheet.getRow(i);
			for(int j=0; j<noOfColumns; j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.print(data + " | ");
			}
			System.out.println();
		}
		
	}

}
