package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageOjects.AddressBook;
import PageOjects.MyAccountPage;

public class TC007_Addressbook extends BaseClass{
@Test
	public void verify_Addressbook() {
		//Calling login page
		try {
		login(); 
		logger.info("************Starting TC007_AddAdressBook*************");
		//MyAccount page is calling
		MyAccountPage map = new MyAccountPage(driver);
		map.clickModifyAddressBook();
		
		//Address book page is calling
		AddressBook ab = new AddressBook(driver);
		ab.clickNewAddress();
		boolean confirmMsg = ab.isAddAddressPageDisplayed();
		Assert.assertTrue(confirmMsg);
		ab.enterFirstName("DemoSite");
		ab.enterLastName("Testing");
		ab.enterCompanyName("Swift techonologies");
		ab.enterAddress1("Vasant House, Ground Floor");
		ab.enterAddress2("19th Road, Khar West, Mumbai, Maharashtra 400052, India");
		ab.enterCity("Mumbai");
		ab.enterPostCode("400051");
		ab.selectCountrydropdown("India");
		ab.selectStatedropdown("Maharashtra");
		ab.selectDefaultAdd();
		ab.clickContinueBtn();
		String successMsg = ab.getSuccessMessage();
		Assert.assertTrue(successMsg.contains("Your address has been successfully added"));
	}catch(Exception e) {
		Assert.fail();
	}
		logger.info("*************Finished TC00_AddAddressBook************");
	}
}
