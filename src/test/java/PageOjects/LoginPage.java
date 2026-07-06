package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//Constructor
	public LoginPage (WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailname;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	//Action Methods
	public void enterEmail(String email) {
		emailname.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickBtn() {
		loginBtn.click();
	}
}
