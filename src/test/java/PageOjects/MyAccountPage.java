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
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutLinkDDT;
	
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

    
	
	
}
