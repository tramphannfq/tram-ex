package auto.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import auto.page.BasePage;
import auto.page.DragDropPage;
import auto.page.HomePage;
import auto.page.LoginPage;
import auto.page.NewAccountPage;
import auto.page.NewCustomerPage;
import auto.page.NewCustomizedStatePage;

public class BaseTest {
	protected WebDriver driver;

	BasePage basePage;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected NewAccountPage newAccountPage;
	protected NewCustomerPage newCustomerPage;
	protected NewCustomizedStatePage newCustomizedStatePage;
    protected DragDropPage newDragDropPage;
		
	
	@BeforeClass // run before all test cases
	public static void beforeAll() {
		Math.pow(2, 3);
		System.setProperty("webdriver.chrome.driver", "/Users/phanngocbichtram/Automation/driver/chromedriver");

	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/phanngocbichtram/Automation/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		basePage = new BasePage(driver);
		loginPage = new LoginPage(driver);

		homePage = new HomePage(driver);
		newAccountPage = new NewAccountPage(driver);
		newCustomerPage = new NewCustomerPage(driver);
		newCustomizedStatePage = new NewCustomizedStatePage(driver);

	}

	protected WebElement findElement(By by) {
		try {
			return driver.findElement(by);
		} catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}

	@AfterClass
	public static void afterAll() {
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
