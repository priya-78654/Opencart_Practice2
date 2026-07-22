package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewsLetter extends BasePage{

	//Constructor
	public NewsLetter(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="//input[@id='input-newsletter']")
	WebElement subscribeBtn;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement successMsg;
	@FindBy(xpath="//h1[normalize-space()='Newsletter Subscription']")
	WebElement msgHeading;
	//Action Methods
	public void toggleBtnSubscribe() {
		subscribeBtn.click();
	}
	public boolean IsNewLetterPageExist() {
		try {
			 return msgHeading.isDisplayed();
		}catch(Exception e) {
			return false;
		}
		
		
	}
	public String getSuccessMsg() {
		return successMsg.getText();
		
	}

}
