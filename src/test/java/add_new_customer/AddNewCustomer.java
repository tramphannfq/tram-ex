package add_new_customer;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomer extends BaseTest {
	@Test
	public void add_new_customer() {
		//Login
		driver.navigate().to("http://demo.guru99.com/V2/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr222553");
		driver.findElement(By.name("password")).sendKeys("UbUqEze");
		driver.findElement(By.name("btnLogin")).click();
		wait(1);
		// Go to Add New Customer form
		driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();;
		WebElement CustomerLable = driver.findElement(By.xpath("//p[contains(text(),'Add New Customer')]"));
		assertNotNull("Customer lable should be available!",CustomerLable);
		
		//Input customer data
	  driver.findElement(By.xpath("//input[@type=\"text\"and@onkeyup=\"validatecustomername();\"]")).sendKeys("TramPhan");;
	  driver.findElement(By.xpath("//input[@type=\"radio\" and @name=\"rad1\"][2]")).click();
	  driver.findElement(By.xpath("//input[@type=\"date\"and @name=\"dob\"]")).sendKeys("02081989");
      driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("abc");
      driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"city\"]")).sendKeys("HCM");
      driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"state\"]")).sendKeys("BT");
      driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"pinno\"]")).sendKeys("123456");
      driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"telephoneno\"]")).sendKeys("84382882955");;
      driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"emailid\"]")).sendKeys("phantram124@gmail.com");
      driver.findElement(By.xpath("//input[@type=\"submit\" and @name=\"sub\"]")).click();
      
      //Alert
      
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      String customerID = alertText.substring(alertText.lastIndexOf(":") + 1);
      alert.accept();
      //Input Account
        driver.findElement(By.xpath("//a[@href='addAccount.php']")).click();
		driver.findElement(By.name("cusid")).sendKeys(customerID);
		driver.findElement(By.xpath("//select[@name=\"selaccount\"]/option[@value=\"Current\"]"));

	    //driver.findElement(By.xpath("//option[@value=\"Savings\"]")).click();
		driver.findElement(By.name("inideposit")).sendKeys("100");
		driver.findElement(By.xpath("//input[@type=\"submit\"and@value=\"submit\"]")).click();
  }
}
