package auto.test;

import org.junit.Test;

public class Day3HomeWork extends BaseTest{
	
	@Test
	public void test1() {
		basePage.navigate("http://demo.guru99.com/V2/index.php");
		loginPage.login("mngr223118", "qYzYhUz");
	}

}
