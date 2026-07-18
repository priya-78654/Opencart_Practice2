package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassword extends BasePage{

	//Constructor
	public ChangePassword(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
    @FindBy(xpath="//h1[normalize-space()='Change Password']")
    WebElement msgHeading;
	
	//Action Methods
	public void enterPassword(String changepassword) {
		txtPassword.sendKeys(changepassword);
	}
	
	public void enterConfirmPassword(String confirmpassword) {
		txtConfirmPassword.sendKeys(confirmpassword);
	}

	public String isChangePasswordPageExist() {
		try {
			return (msgHeading.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
}
