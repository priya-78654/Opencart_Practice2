package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.ChangePassword;
import PageOjects.CommonElement;
import PageOjects.MyAccountPage;

public class TC005_ChangePassword extends BaseClass{
@Test
	public void verify_ChangePassword() {
	
		//login page calling
	     login();
	     try {
	    	 logger.info("******** Starting TC005_ChangePasswordTest *********");
	     //MyAccount page calling
	     MyAccountPage map = new MyAccountPage(driver);
	     map.clickChangePassword();
	     
		//ChangePasswordPage
		ChangePassword cp = new ChangePassword(driver);
		cp.enterPassword("test@123");
		cp.enterConfirmPassword("test@123");
		String confirmMsg = cp.isChangePasswordPageExist();
		if (confirmMsg.equals("Change Password")) {
			logger.info("******** Test Passed ********"); 
			Assert.assertTrue(true);
		}else {
			logger.info("******** Test Failed ********"); 
			Assert.fail();
		}
	     }catch(Exception e) {
	    	 logger.error("Exception occurred during test execution", e);
	    	 Assert.fail();
	    	 
	     }
		//CommonElementPage
		CommonElement cl = new CommonElement(driver);
		cl.continueBtn();
		cl.clickBackBtn();
		
		logger.info("******** Finished TC005_ChangePasswordTest *********");
	}
}
