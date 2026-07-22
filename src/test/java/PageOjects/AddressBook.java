package PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressBook extends BasePage{

	//Constructor
	public AddressBook(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath="//a[normalize-space()='New Address']")
	WebElement btnNewAdd;
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='input-company']")
	WebElement company;
	@FindBy(xpath="//input[@id='input-address-1']")
	WebElement address1;
	@FindBy(xpath="//input[@id='input-address-2']")
	WebElement address2;
	@FindBy(xpath="//input[@id='input-city']")
	WebElement city;
	@FindBy(xpath="//input[@id='input-postcode']")
	WebElement postcode;
	@FindBy(xpath="//select[@id='input-country']")
	WebElement drpCountry;
	@FindBy(xpath="//select[@id='input-zone']")
	WebElement drpState;
	@FindBy(xpath="//div[@class='row mb-3']//div[2]")
	WebElement defaultAdd;
	@FindBy(xpath="//h1[normalize-space()='Add Address']")
	WebElement msgHeading;
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement msgSuccess;
	
	
	//Action Methods
	public void clickNewAddress() {
		btnNewAdd.click();
	}
	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);	
	}
	public void enterCompanyName(String companyName) {
		company.sendKeys(companyName);
	}
	public void enterAddress1(String add1) {
		address1.sendKeys(add1);
	}
	public void enterAddress2(String add2) {
		address2.sendKeys(add2);
	}
	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}
	public void enterPostCode(String postCode) {
		postcode.sendKeys(postCode);
	}
	
	public void selectCountrydropdown(String countryName) {
		Select mySelect = new Select(drpCountry);
		mySelect.selectByVisibleText(countryName);
	}
	public void selectStatedropdown(String stateName) {
		Select mySelect2 = new Select(drpState);
		mySelect2.selectByVisibleText(stateName);
	}
	public void selectDefaultAdd() {
		defaultAdd.click();
	}
	
	public boolean isAddAddressPageDisplayed() {
	    try {
	        return msgHeading.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	public void clickContinueBtn() {
		btnContinue.click();
	}
	public String getSuccessMessage() {
	    return msgSuccess.getText();
	}
	
}
