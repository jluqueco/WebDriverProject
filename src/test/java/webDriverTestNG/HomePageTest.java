package webDriverTestNG;

import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
	@Test
	public void test1() {
		LoginPage login = new LoginPage(driver);
		login.loginFunction("abc@xyz.com", "Bichillo01*");
	}
}
