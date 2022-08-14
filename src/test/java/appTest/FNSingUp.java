package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FNSingUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create new account']"));
		SignUp.click();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select dday = new Select(day);
		dday.selectByVisibleText("1");
		
		Select mmonth = new Select(month);
		mmonth.selectByVisibleText("Sep");
		
		Select yyear = new Select(year);
		yyear.selectByVisibleText("1983");
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement item: months) {
			System.out.println(item.getText());
		}
		
		WebElement selYear  = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']"));
		System.out.println("Selected year is: " + selYear.getText());
		
//		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//		gender.click();
		
		String genVal = "Custom";
		
		WebElement dynamicGender = driver.findElement(By.xpath("//label[text()='" + genVal + "']/following-sibling::input"));
		dynamicGender.click();
	}

}
