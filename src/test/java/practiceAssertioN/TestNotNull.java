package practiceAssertioN;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNotNull {
	
	/*	In this Program : validate not null	*/
	
	@Test
	void validateNotNull() {
		String actual = "TestNG";
		Assert.assertNotEquals(actual, "The actual value is not null");
		System.out.println(1);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(3, 3);
		System.out.println(2);
		
		sa.assertEquals(" ", "Value", " Error.......");
		System.out.println(3);
		
		sa.assertAll();
	}

}
