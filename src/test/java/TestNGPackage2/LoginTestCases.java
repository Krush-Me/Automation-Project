package TestNGPackage2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	@Test(priority = 1)
	void txtUsername() {
		System.out.println(1);
		Assert.assertEquals("admin","admin");
	}
	
	@Test(priority = 2)
	void txtPassword() {
		System.out.println(2);
		Assert.assertEquals("123245", "password");
	}

	@Test(priority = 3)
	void btnLogin() {
		System.out.println(3);
		Assert.assertEquals(3, 3);
	}
}
