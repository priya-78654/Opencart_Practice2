package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.CommonElement;
import PageOjects.MyAccountPage;
import PageOjects.NewsLetter;

public class TC008_NewsLetterTest extends BaseClass{
@Test
	public void verify_NewsLetter() {
		
    //Calling login page
	MyAccountPage map = null;

	try {
	    logger.info("*********Starting TC008_NewsLetter");
	    login();

	    map = new MyAccountPage(driver);
	    map.clickSubscribe();

	    NewsLetter nl = new NewsLetter(driver);
	    nl.toggleBtnSubscribe();

	    CommonElement cl = new CommonElement(driver);
	    cl.continueBtn();

	    String confirmedMsg = nl.getSuccessMsg();

	    Assert.assertEquals(
	            confirmedMsg,
	            "Success: Your newsletter subscription has been successfully updated!",
	            "Newsletter subscription update failed."
	    );

	    cl.clickBackBtn();

	} catch (Exception e) {
	    logger.error("Your test failed", e);
	    Assert.fail();
	} finally {
	    if (map != null) {
	        map.logoutAccount();
	    }
	}
	}
}
