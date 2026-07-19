package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.ChangePassword;
import PageOjects.CommonElement;
import PageOjects.MyAccountPage;

public class TC006_LoginWithNewPassword extends BaseClass{
@Test
	public void verify_loginWithNewPassword() {
	//calling login page
	login();
	
	//Myaccount page calling
	MyAccountPage map = new MyAccountPage(driver);
	map.clickChangePassword();
	
	//Changepasssword page calling
	ChangePassword cp = new ChangePassword(driver);
	cp.enterPassword("test@12345");
	cp.enterConfirmPassword("test@12345");
	
	//CommonPage calling
	CommonElement cl = new CommonElement(driver);
	cl.continueBtn();
	cl.clickBackBtn();
	
	map.logoutAccount();
    // Login again with the new password
    login(p.getProperty("email"), "test@12345");

    // Verify login successful
    Assert.assertTrue(map.isMyAccountPageExists(),
            "Login with new password failed.");
	
	}
}
