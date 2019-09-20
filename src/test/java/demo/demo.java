package demo;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		//Open new browser chrome
		System.setProperty("webdriver.chrome.driver", "/Users/phanngocbichtram/Automation/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//maximize driver 
		driver.manage().window().maximize();
		// set wait time => use implicilyWait
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");
		driver.findElement(By.name("uid")).sendKeys("1303");
     	driver.findElement(By.name("password")).sendKeys("Guru99");
     	driver.findElement(By.name("btnLogin")).click();

		WebElement logoutTxt = driver.findElement(By.xpath("//*[text()=\"Log out\"]"));
		assertNotNull("Logout link should be available!",logoutTxt);
		driver.quit();

		
	}

}
