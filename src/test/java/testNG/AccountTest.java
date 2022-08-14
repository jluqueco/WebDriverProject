package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTest {
	
	@BeforeTest
	public void method1() {
		System.out.println("inside before test");
	}
	
	@BeforeMethod (alwaysRun = true)
	public void beforeMethod1() {
		System.out.println("Inside before M1");
	}
	
	@Test
	public void savingAccountTest1() {
		System.out.println("Inside saving acc test1");
	}
	
	@Test(enabled = true, priority=0, description = "this test will be validating something")
	public void savingAccountTest2() {
		System.out.println("Inside saving acc test2");
	}
	
	@Test(groups= {"sanity"})
	public void checkingAccountTest1() {
		System.out.println("Inside checking acc test1");
	}
	
	@AfterMethod
	public void afterMethod1() {
		System.out.println("Inside after M1");
	}
	
	@AfterTest
	public void method2() {
		System.out.println("inside after test");
	}
}
