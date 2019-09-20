package auto.page;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	protected WebDriver driver;

//contructor
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected WebElement findElement(By by) {
		try {

			return driver.findElement(by);
		} catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}

	public void click(By by) {
		WebElement webElement = findElement(by);
		checkNotNull(by.toString(), webElement);
	}

	protected void checkNotNull(String name, WebElement webElement) {
		assertNotNull("Element "+name + "should be visible.", webElement);
	}

	public void navigate(String url) {
		driver.get(url);
		
	}

}
