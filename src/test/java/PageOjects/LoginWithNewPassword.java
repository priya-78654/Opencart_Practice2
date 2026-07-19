package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWithNewPassword extends BasePage{


	//Constructor
	public LoginWithNewPassword(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement logout;
	
	//Action Methods
	public void Myaccount() {
		myAccount.click();
	}
	public void logOut() {
		logout.click();
	}
	
}
