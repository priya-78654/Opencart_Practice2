package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage{

	//Constructor
	public Logout(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//h1[normalize-space()='Account Logout']")
	WebElement logoutMsg;
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement clickContinue;
	
	
	//Action Methods
	public boolean isLogoutAccountMsgExist() {
		try {
			return logoutMsg.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickContinueBtn() {
		clickContinue.click();
	}
}
