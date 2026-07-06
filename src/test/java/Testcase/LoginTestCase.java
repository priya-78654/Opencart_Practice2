package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.HomePage;
import PageOjects.LoginPage;
import PageOjects.MyAccountPage;

public class LoginTestCase extends BaseClass{
 @Test
	public void loginDetail() {
	 logger.info("******Starting LoginTestCase*******");
	 try {
		HomePage hp = new HomePage(driver);
		hp.myAccount();
		hp.LoginAccount();
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail(p.getProperty("email"));
		lp.enterPassword(p.getProperty("password"));
		lp.clickBtn();
		
		//MyAccountPage
		MyAccountPage mp = new MyAccountPage(driver);
		boolean targetpage = mp.isMyAccountPageExists();
		
		Assert.assertTrue(targetpage);
	 }catch(Exception e) {
		 Assert.fail();
	 }
		logger.info("***********Finished LoginTestCase");
		
	}
}
