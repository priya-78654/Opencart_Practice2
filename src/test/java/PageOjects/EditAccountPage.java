package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {

	//Constructor
	public EditAccountPage(WebDriver driver) {
		super(driver);
	}

	
	//Locators
	@FindBy(xpath="//h1[normalize-space()='My Account Information']")
	WebElement msgEditPageHeading;
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement editFirstName;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement editlastName;
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement editContinuBtn;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement editsuccessMessage;
	
	
	//Action Methods
	public void editFirstNameAccount(String editfirstname) {
	    editFirstName.clear();
	    editFirstName.sendKeys(editfirstname);
	}

	public void editLastNameAccount(String editlastname) {
	    editlastName.clear();
	    editlastName.sendKeys(editlastname);
	}
	public void editContinueButton() {
		editContinuBtn.click();
	}
	
	public boolean isEditAccountPageExist() {
		try {
			return msgEditPageHeading.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getSuccessMessage() {
		return editsuccessMessage.getText();
	}
	
}
