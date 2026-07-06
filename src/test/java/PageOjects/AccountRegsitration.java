package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegsitration extends BasePage{

	//constructor
	public AccountRegsitration(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacypoilicy;
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continubtn;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	//Action methods
	public void setFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void setlastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void CheckPrivacyPolicy() {
		privacypoilicy.click();
	}
	public void clickbtn() {
		continubtn.click();
	}
	public String getConfirmationMsg() {
		try {
			return(msgConfirmation.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}
}
