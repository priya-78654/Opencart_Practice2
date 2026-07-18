package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.AccountRegsitration;
import PageOjects.HomePage;
import PageOjects.MyAccountPage;

public class TC_001AccountRegistrationTest extends BaseClass {
	
	@Test
	public void verfiy_Account() {
		try {
		logger.info("******** Starting TC001_AccountRegistrationTest *********");
	
		//HOMEPAGE objection creation and calling method
		HomePage hp = new HomePage(driver);
		hp.myAccount();
		logger.info("******** Clicked on myaccount tab*********");
		hp.RegisterAccount();
		logger.info("******** Clicked on registration link *********");
		
		//Registration page object creation and calling methods
		AccountRegsitration ar= new AccountRegsitration(driver);
		logger.info("******** Providing cutomer details *********");
		ar.setFirstName(RandomString());
		ar.setlastName(RandomString());
		ar.setEmail(RandomString() + "@gmail.com");
		ar.setPassword(Alphanumerics());
		ar.CheckPrivacyPolicy();
		ar.clickbtn();
		logger.info("******** Validating expected msg *********");
		String confirmMsg = ar.getConfirmationMsg(); 
		if (confirmMsg.equals("Your Account Has Been Created!")) {
			logger.info("******** Test Passed ********"); 
			Assert.assertTrue(true); 
			} else { 
				logger.error("******** Test Failed ********"); 
				Assert.fail(); }

		} 
		catch (Exception e) { logger.error("Exception occurred during test execution", e); 
		Assert.fail(); 
		
		}
		logger.info("******** Finished TC001_AccountRegistrationTest *********");
	}
	
	
}
