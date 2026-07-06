package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.HomePage;
import PageOjects.LoginPage;
import PageOjects.MyAccountPage;
import Utilities.DataProviders;

/*
 * data is valid -- login successful - test pass - logout
 * data is valid -- login faild --- test fail
 * 
 * data is invalid -- login success - test fail - logout
 * data is invalid -- login failed -- test pass
 * */

 
public class LoginDDT extends BaseClass{

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class) //getting data provider from different class
	public void verify_LoginDDT(String email, String pwd, String exp) {
		try {
		 logger.info("***Starting LoginDDT Test*****");
			//Homepage
			HomePage hp = new HomePage(driver);
			hp.myAccount();
			hp.LoginAccount();
			//hp.logoutAccount();
			
			
			//Login
			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(email);
			lp.enterPassword(pwd);
			lp.clickBtn();
			
			//MyAccountPage
			MyAccountPage mp = new MyAccountPage(driver);
			boolean targetpage = mp.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid")) {
				if(targetpage ==true) {
					mp.logoutAccount();
					Assert.assertTrue(true);
					
				}else {
					Assert.assertTrue(false);
				}
			}
	
			if(exp.equalsIgnoreCase("Invalid")) {
				if(targetpage ==true) {
					mp.logoutAccount();
					Assert.assertTrue(false);
				}else {
					Assert.assertTrue(true);
				}
			}
		}catch(Exception e) {
			Assert.fail();
		}
			logger.info("***Starting LoginDDT Test*****");
		 }
			
	}
	
