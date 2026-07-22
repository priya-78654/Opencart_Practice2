package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	//Constructor
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="//h1[text()= 'My Account']")
	WebElement msgHeading;
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccountDDT;
	@FindBy(xpath="//a[normalize-space()='Edit your account information']")
	WebElement editAccountInfo;
	@FindBy(xpath="//a[normalize-space()='Change your password']")
	WebElement changePassword;
	@FindBy(xpath="//a[normalize-space()='Stored payment methods']")
	WebElement storedPayment;
	@FindBy(xpath="//a[normalize-space()='Modify your address book entries']")
	WebElement modifyAddressBook;
	@FindBy(xpath="//a[normalize-space()='Modify your wish list']")
	WebElement wishList;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutLinkDDT;
	@FindBy(xpath="//a[normalize-space()='Subscribe / unsubscribe to newsletter']")
	WebElement subscribeBtn;
	public boolean isMyAccountPageExists() {
		try {
			return (msgHeading.isDisplayed());
		}catch(Exception e) {
			return false;
		}
	}
	
	public void logoutAccount() {
		myAccountDDT.click();
		logoutLinkDDT.click();
    }

	 public void clickEditAccount() {
	    	editAccountInfo.click();
	    	
	    }
	    public void clickChangePassword() {
	    	changePassword.click();
	    }
	    public void clickStoredPayment() {
	    	storedPayment.click();
	    }
	    public void clickModifyAddressBook() {
	    	modifyAddressBook.click();
	    }
	    public void clickWishList() {
	    	wishList.click();
	    }
		public void clickSubscribe() {
			subscribeBtn.click();
		}
	
}
