package add_new_customer;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver ;

	public void wait( int seconds) {
		try {
		Thread.sleep(seconds *1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	}
@BeforeClass // run before all test cases
	 public static void beforeAll() {
		 System.setProperty("webdriver.chrome.driver", "/Users/phanngocbichtram/Automation/driver/chromedriver");	   

}
 @Before 
	public void setup() {
	 System.setProperty("webdriver.chrome.driver", "/Users/phanngocbichtram/Automation/driver/chromedriver");
 	driver = new ChromeDriver();
		//maximize driver 
		driver.manage().window().maximize();
		// set wait time => use implicilyWait
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     
	}
 
 protected WebElement findElement(By by) {
		try {
			return driver.findElement(by);
		}catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}

 @AfterClass
 public static void afterAll() {
 }
 @After
 public void teardown(){
 	if(driver !=null) {
 		driver.quit();
 	}
 	
 }

}
