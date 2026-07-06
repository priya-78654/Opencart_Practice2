package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
 
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement Register;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")
	WebElement clickLogin;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutLink;
	
	//Action methods
	public void myAccount() {
		myAccount.click();
	}
	public void RegisterAccount() {
		Register.click();
	}
	public void LoginAccount() {
		clickLogin.click();
	}
	public void logoutAccount() {
	    myAccount.click();
	    logoutLink.click();
	}
}
