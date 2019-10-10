package auto.test;

import org.junit.Test;

public class DemoDragDrop extends BaseTest {
	@Test
	public void drapDropTest() {
		
	basePage.navigate("http://demo.guru99.com/test/drag_drop.html");
	newDragDropPage.dragToBox("BANK","DEBIT","Account");
	newDragDropPage.dragToBox("5000","DEBIT","Amount");
	newDragDropPage.dragToBox("SALES","CREDIT","Account");
	newDragDropPage.dragToBox("5000","CREDIT","Amount");

	}
}
