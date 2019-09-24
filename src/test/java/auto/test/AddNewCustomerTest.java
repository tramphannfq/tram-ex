package auto.test;

import org.junit.Test;

import auto.page.NewCustomerPage;

public class AddNewCustomerTest extends BaseTest {

	@Test
	public void testAddNewCustomerSuccess() {
		basePage.navigate("http://demo.guru99.com/V2/webpages/addcustomerpage.php");
		newCustomerPage.AddNewCustomer("Jade", "02082989", "72LeThanhTon", "BT", "HCM", "123456", "0382882955");
	}
}
