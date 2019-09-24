package auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mifmif.common.regex.Generex;

public class NewCustomerPage extends BasePage {

	private static final String BY_SUBMIT_BUTTON = "//input[@type=\"submit\" and @name=\"sub\"]";
	private static final String BY_EMAIL = "//input[@type=\"text\" and @name=\"emailid\"]";
	private static final String BY_PHONENUMBER = "//input[@type=\"text\" and @name=\"telephoneno\"]";
	private static final String BY_BIRTHDAY = "//input[@type=\"date\"and @name=\"dob\"]";
	private static final String BY_PIN = "//input[@type=\"text\" and @name=\"pinno\"]";
	private static final String BY_STATE = "//input[@type=\"text\" and @name=\"state\"]";
	private static final String BY_CITY = "//input[@type=\"text\" and @name=\"city\"]";
	private static final String BY_ADDRESS = "//textarea[@name=\"addr\"]";
	private static final String BY_GENDER = "//input[@type=\"radio\" and @name=\"rad1\"][2]";
	private static final String BY_CUSTOMER_NAME = "//input[@type=\"text\"and@onkeyup=\"validatecustomername();\"]";

	public NewCustomerPage(WebDriver driver) {
		super(driver);
	}

	public void EnterCustomerName(String CustomerName) {
		driver.findElement(By.xpath(BY_CUSTOMER_NAME)).sendKeys(CustomerName);

	}

	public void SelectGender() {
		driver.findElement(By.xpath(BY_GENDER)).click();
	}

	public void selectBirthday(String birthday) {
		driver.findElement(By.xpath(BY_BIRTHDAY)).sendKeys(birthday);
	}

	public void EnterAddress(String Address) {
		driver.findElement(By.xpath(BY_ADDRESS)).sendKeys(Address);
	}

	public void EnterCity(String City) {
		driver.findElement(By.xpath(BY_CITY)).sendKeys(City);
	}

	public void EnterState(String State) {
		driver.findElement(By.xpath(BY_STATE)).sendKeys(State);
	}

	public void EnterPin(String Pin) {
		driver.findElement(By.xpath(BY_PIN)).sendKeys(Pin);
	}

	public void EnterPhoneNo(String phonenumber) {
		driver.findElement(By.xpath(BY_PHONENUMBER)).sendKeys(phonenumber);

	}

	public void EnterEmail() {
		String regex = "\\[a-z]&[0-9]{10}\\@gmail\\.com";
		driver.findElement(By.xpath(BY_EMAIL)).sendKeys(new Generex(regex).random());
	}

	public void clickSubmitButton() {
		driver.findElement(By.xpath(BY_SUBMIT_BUTTON)).click();
	}

	public void AddNewCustomer(String CustomerName, String birthday, String Address, String City, String State,
			String Pin, String phonenumber) {
		EnterCustomerName(CustomerName);
		SelectGender();
		selectBirthday(birthday);
		EnterAddress(Address);
		EnterCity(City);
		EnterState(State);
		EnterPin(Pin);
		EnterPhoneNo(phonenumber);
		EnterEmail();
		clickSubmitButton();
	}
}