package demo;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class LogOutFail {
	WebDriver driver ;

	
    @Before 
	public void setup(){
    	System.setProperty("webdriver.chrome.driver", "/Users/phanngocbichtram/Automation/driver/chromedriver");
    	driver = new ChromeDriver();
		//maximize driver 
		driver.manage().window().maximize();
		// set wait time => use implicilyWait
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test
	public void execute() {
		
		driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");
		driver.findElement(By.name("uid")).sendKeys("1303");
     	driver.findElement(By.name("password")).sendKeys("Guru9");
     	driver.findElement(By.name("btnLogin")).click();

		WebElement logoutTxt = driver.findElement(By.xpath("//*[text()=\"Log out\"]"));
		assertNotNull("Logout link should be available!",logoutTxt);
		driver.quit();


		
	}
	@After
	public void teardown(){
		if(driver !=null) {
			driver.quit();
		}
		
	}
			}
