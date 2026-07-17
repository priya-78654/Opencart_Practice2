package Testcase;

import org.testng.annotations.Test;

import PageOjects.EditAccountPage;
import PageOjects.MyAccountPage;

public class TC004_EditAccountPage extends BaseClass{
	@Test
	public void verify_editAccountPage() {
		login(); //Resuable login method
		
		//Myaccount Page calling through object
		MyAccountPage map = new MyAccountPage(driver);
		map.clickEditAccount();
		
		
		//Edit Account Page calling through objects
		EditAccountPage eap = new EditAccountPage(driver);
		eap.editFirstNameAccount("Demo");
		eap.editLastNameAccount("testing");
		eap.editContinueButton();
		
		
	}

}
