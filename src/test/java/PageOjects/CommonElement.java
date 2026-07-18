package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonElement extends BasePage{

	public CommonElement(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath="//button[normalize-space()='Continue']")
		WebElement continuBtn;
		@FindBy(xpath="//a[normalize-space()='Back']")
		WebElement backBtn;

		public void continueBtn() {
			continuBtn.click();
		}
		public void clickBackBtn() {
			backBtn.click();
		}
}
