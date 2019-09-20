package demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MiniStatementEx extends BaseTestWait {
  
@Test // define a testcase
  public void execute () {
	//Navigate to Agile Project 
	driver.navigate().to("http://demo.guru99.com/Agile_Project/Agi_V1/");
	//Login Agile project
	driver.findElement(By.name("uid")).sendKeys("1303");
	driver.findElement(By.name("password")).sendKeys("Guru99");
 	driver.findElement(By.name("btnLogin")).click();
 	//Navigate to Mini Statement page
 	driver.findElement(By.xpath ("//a[.='Mini Statement']")).click();;
 	driver.findElement(By.name("accountno")).click();
 	Select AccountSelect = new Select(driver.findElement(By.name("accountno")));
    AccountSelect.selectByVisibleText("3308");
    driver.findElement(By.name("AccSubmit")).click();
    WebElement lastTreeTXT = driver.findElement(By.xpath("//*[.='Last Three Transaction Details for Account No: 3308']"));
	assertNotNull("Last Three Transactions should be available!",lastTreeTXT);
	Assert.assertEquals("", "");	
}	
 
@Test
	public void test2_radioBtnAndCheckbox() {
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"Option 1\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"checkbox\" and @value=\"checkbox2\"]")).click();
		wait(10);
	}
		




}


