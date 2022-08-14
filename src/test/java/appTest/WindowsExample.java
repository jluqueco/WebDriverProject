package appTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String parentWin = driver.getWindowHandle();
		System.out.println("before clicking tab button " + parentWin);
		
		WebElement tab = driver.findElement(By.id("tabButton"));
		tab.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			String currentHandle  = itr.next();
			System.out.println(currentHandle);
			
			if(!currentHandle.equals(parentWin)) {
				driver.switchTo().window(currentHandle);
			}
		}
		
		WebElement childWindowElement = driver.findElement(By.tagName("h1"));
		System.out.println("Text on new window is: " + childWindowElement.getText());
		
		driver.close();
		
		driver.switchTo().window(parentWin);
		System.out.println("Back to parent window");
	}

}
