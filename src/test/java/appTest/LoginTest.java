package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("abc@xyz.com");
		
		WebElement remember = driver.findElement(By.className("rememberMe"));
		remember.click();
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Bichillo01*");
		
		WebElement loginButton = driver.findElement(By.name("btn_login"));
		loginButton.click();
		
		WebElement errorMsg = driver.findElement(By.id("msg_box"));
		String actError = errorMsg.getText();
		String expError = "The email or password you have entered is invalid.";
		
		if(actError.equals(expError)) {
			System.out.println("TC passed");
			
		}else {
			System.out.println("TC Failed");
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		
		System.out.println(links);
	}

}
