package Testcase;

import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass{
 @Test
	public void loginDetail() {
	 login(); //calling Resuable method
	/* logger.info("******Starting LoginTestCase*******");
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
	*/
	 
	}
}
