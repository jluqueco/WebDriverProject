package webDriverTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginFunction(String user, String pass) {
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(user);
		
		WebElement remember = driver.findElement(By.className("rememberMe"));
		remember.click();
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		
		WebElement loginButton = driver.findElement(By.name("btn_login"));
		loginButton.click();

	}
}
