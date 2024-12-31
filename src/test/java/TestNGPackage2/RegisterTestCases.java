package TestNGPackage2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestCases {

	@Test(priority = 1)
	void txtFirstName() {
		System.out.println(1);
		Assert.assertEquals("krusham","krusham");
	}
	
	@Test(priority = 2)
	void txtLastName() {
		System.out.println(2);
		Assert.assertEquals("normal", "testing");
	}

	@Test(priority = 3)
	void btnSignIn() {
		System.out.println(3);
		Assert.assertEquals(3, 3);
	}
	
}
