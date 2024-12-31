package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
//	@Test
//	void TestCase() {
//		/*	Hard Asserrtion	*/
//		System.out.println(1);
//		Assert.assertEquals(3, 3);
//		System.out.println(2);
//		Assert.assertEquals(4,4);
//		System.out.println(3);
//		Assert.assertEquals(3, 6);
//		System.out.println(4);
//		Assert.assertEquals(3, 3);
//	}

	
	/*	Soft Assertion	*/
	@Test
	void loginTestCase() {
		SoftAssert sa = new SoftAssert();
		
		System.out.println(1);
		sa.assertEquals(3, 3);
		
		System.out.println(2);
		sa.assertEquals(3,3);
		
		System.out.println(3);
		sa.assertEquals(3, 6);
		
		System.out.println(4);
		sa.assertEquals(3, 3);
		
		sa.assertAll();
	}
	
	
}
