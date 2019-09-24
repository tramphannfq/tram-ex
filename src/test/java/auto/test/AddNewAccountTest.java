package auto.test;

import org.junit.Test;

public class AddNewAccountTest extends BaseTest {
	@Test
	public void testAddNewAccountSuccess() {
		basePage.navigate("http://demo.guru99.com/V2/webpages/addAccount.php");
		newAccountPage.addNewAccount("100");

}
}