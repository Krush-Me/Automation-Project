package TestNGPackage2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTestCases {
	
	@Test(priority = 1)
	void logout() {
		System.out.println(1);
		Assert.assertEquals(3,3);
	}
	
	@Test(priority = 2)
	void dashBoard() {
		System.out.println(2);
		Assert.assertEquals(5, 5);
	}

	@Test(priority = 3)
	void aboutUs() {
		System.out.println(3);
		Assert.assertEquals(3, 2);
	}
}
