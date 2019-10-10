package auto.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {

	private static final String BY_CUSTOMERID = "//input[@type=\"text\"and@name=\"cusid\"]";
	private static final String BY_SUBMIT_BUTTON = "//input[@type=\"submit\"and@value=\"submit\"]";
	private static final String BY_INIDEPOSIT = "inideposit";
	private static final String BY_OPTION = "//option[@value=\"Savings\"]";
	private static final String BY_SELECT_ACCOUNT_TYPE = "//select[@name=\"selaccount\"]/option[@value=\"Current\"]";
	private static final String BY_ADDNEWACCOUNT_MENU = "//a[@href='addAccount.php']";
	private String customerID;

	public NewAccountPage(WebDriver driver) {
		super(driver);
	}

//			
	public void getCustomerId() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		customerID = alertText.substring(alertText.lastIndexOf(":") + 1);
		alert.accept();
	}

	public void clickAddAccountMenu() {
		driver.findElement(By.xpath(BY_ADDNEWACCOUNT_MENU)).click();

	}

	public void enterCustomerID() {
		driver.findElement(By.xpath(BY_CUSTOMERID)).sendKeys(customerID);
	}

	public void selectAccountType() {
		driver.findElement(By.xpath(BY_SELECT_ACCOUNT_TYPE));
	}

	public void clickOption() {
		driver.findElement(By.xpath(BY_OPTION)).click();

	}

	public void enterDeposit(String deposit) {
		driver.findElement(By.name(BY_INIDEPOSIT)).sendKeys("deposit");

	}

	public void clickSubmitButton() {
		driver.findElement(By.xpath(BY_SUBMIT_BUTTON)).click();
	}

	public void addNewAccount(String deposit) {
		clickAddAccountMenu();
//		enterCustomerID(customerID);
		selectAccountType();
		clickOption();
		enterDeposit(deposit);
		clickSubmitButton();

	}

}
