package webDriverTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpliLearnLogin extends BaseClass{
	
	
	@Test
	public void test1() {
		
		LoginPage login = new LoginPage(driver);
		login.loginFunction("abc@xyz.com", "Bichillo01*");
		
		WebElement errorMsg = driver.findElement(By.id("msg_box"));
		String actError = errorMsg.getText();
		String expError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(actError, expError);

	}
	
	@Test
	public void test2() {
		
		LoginPage login = new LoginPage(driver);
		login.loginFunction("javierluque2@hotmail.com", "Bichillo01*");

	}
}
