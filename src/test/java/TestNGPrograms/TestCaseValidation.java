package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;



public class TestCaseValidation {
	
	@Test
	void action() {
		Assert.assertEquals("Hello", "Hello World");
	}
	
	@Test
	void display() {
		Assert.assertEquals(3, 3);
	}

	@Test(priority = 1)
	void register() {
		System.out.println("Register");
	}
	
	@Test(priority = 2)
	void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 3)
	void home() {
		System.out.println("Home");
	}
	
	@Test(priority = 4)
	void logout() {
		System.out.println("Logout");
	}
	
}
