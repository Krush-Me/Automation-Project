package practiceAssertioN;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertioN {
	
	/*	In this Program : 1- Soft Assertion,  2- priority, 3- enabled(skipping method)	*/

	@Test(priority = 1, enabled = false)
	void softAssertion() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("admin", "admin");
		System.out.println(1);
		
		sa.assertEquals(5, 5);
		System.out.println(2);
		
		sa.assertEquals(3, 6, "Number does not match!...");
		System.out.println(3);
		
		sa.assertEquals("TestNoG", "TestNG", "String does not match!...");
		System.out.println(4);
		
		sa.assertEquals(4, 4);
		System.out.println("----------------");
		
		sa.assertAll();
	}
	
	@Test(priority = 2)
	void testCase1() {
		Assert.assertEquals(3, 3);
		System.out.println(6);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("krusham", "krusham");
		System.out.println(7);
		
		sa.assertEquals("pass", "password", "Password does not match!...");
		System.out.println(8);
		
		sa.assertAll();
	}
	
	
	
}
