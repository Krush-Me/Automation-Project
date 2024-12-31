package practiceAssertioN;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAssertion {
	
	/*	In this Program :  1- Hard Assertion	*/
	
	@Test
	void validateString() {
		Assert.assertEquals(3, 3);
		System.out.println(1);
		
		Assert.assertEquals("TestNG", "TestNG");
		System.out.println(2);
		
		Assert.assertEquals("Testng", "TestNG", "String does not match...");
		System.out.println(3);
		
		Assert.assertEquals(3, 4, "Number does not match...");
		System.out.println(4);
		
		Assert.assertEquals(3, 3);
		System.out.println(5);
		
		
	}

}
