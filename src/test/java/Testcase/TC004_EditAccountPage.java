package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.EditAccountPage;
import PageOjects.CommonElement;
import PageOjects.MyAccountPage;

public class TC004_EditAccountPage extends BaseClass{
	@Test
	public void verify_editAccountPage() {
		login(); //Resuable login method
		try {
		logger.info("**********Starting TC004_EditAccountPage*********");
		//Myaccount Page calling through object
		MyAccountPage map = new MyAccountPage(driver);
		map.clickEditAccount();
		
		
		//Edit Account Page calling through objects
		EditAccountPage eap = new EditAccountPage(driver);
		eap.editFirstNameAccount("Demo");
		eap.editLastNameAccount("testing");
		
		
		String confirmMsg = eap.isEditAccountPageExist();
		if(confirmMsg.equals("My Account Information")) {
			logger.info("*********Test Passed*********");
			Assert.assertTrue(true);
		}else {
			logger.info("**********Test Failed******");
			Assert.fail();
		}
		//CommonElement calling through objects
		CommonElement cl = new CommonElement(driver);
		cl.continueBtn();
		cl.clickBackBtn();
		eap.getSuccessMessage();
		}
		
		catch(Exception e) {
			logger.error("Exception occur during test execution", e);
			Assert.fail();
		}
		
		
		logger.info("******** Finished TC004_EditAccountTest *********");
	}

}
