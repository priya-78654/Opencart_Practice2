package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.CommonElement;
import PageOjects.Logout;
import PageOjects.MyAccountPage;

public class TC009_LogoutTest extends BaseClass{
    @Test
	public void verify_logout() {
    	
		//Calling login page
    	try {
    		
    		logger.info("************Starting TC009_LogoutTest*****");
    	login();
    	
    	//Myaccount page is calling
    	MyAccountPage map = new MyAccountPage(driver);
    	map.logoutAccount();
    	
    	//Logout page is calling
    	Logout l = new Logout(driver);
    	boolean logoutMsg = l.isLogoutAccountMsgExist();
    	Assert.assertTrue(logoutMsg, "Logout page is not displayed.");
    	
    	//Common Element page is calling
    	CommonElement cl = new CommonElement(driver);
    	
    
    	
    	// Verify Logout page
    	Assert.assertTrue(l.isLogoutAccountMsgExist(),
    	        "Logout page is not displayed.");

    	// Click Continue
    	l.clickContinueBtn();   // or cl.continueBtn() - use only ONE

    	// Verify Home page
    	String titlePage = driver.getTitle();
    	Assert.assertEquals(
    	        titlePage,
    	        "Your Store",
    	        "User was not redirected to the Home page after logout."
    	);
	}
    	catch(Exception e) {
        	logger.error("TC009_LogoutTest failed", e);
        	Assert.fail();
        }
    	
    logger.info("**********Finished TC009_LogoutTest***********");
    }
    
}
