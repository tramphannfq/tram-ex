package auto.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class LoginTest extends BaseTest {
	
	@Test
	public void testLoginSuccess() {
		basePage.navigate("http://demo.guru99.com/V2/index.php");
		loginPage.login("mngr223118", "qYzYhUz");
	}

}
