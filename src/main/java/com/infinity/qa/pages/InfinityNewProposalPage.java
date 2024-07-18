package com.infinity.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nucleus.qa.base.TestBase;

public class InfinityNewProposalPage extends TestBase {
	
	

	@FindBy(xpath="//p[contains(text(),'Business Information')]")
	WebElement VerifyBusinessInformationText;
	
	@FindBy(xpath="//p[contains(text(),'Loan Information')]")
	WebElement VerifyLoanInformationText;
	
	@FindBy(xpath="//p[contains(text(),'Director Information')]")
	WebElement VerifyDirectorInformationText;
	
	@FindBy(xpath="//p[contains(text(),'Documents')]")
	WebElement VerifyDocumentsText;
	
	@FindBy(xpath="//input[@id='Infinity_lead']")
	WebElement EnterInfinityFundingProposal;
	
	
	
	
	//@FindBy(id="result1")
	//WebElement ClickOnInfinityFundingProposal;
	
	@FindBy(xpath="//div[contains(text(),'Limited Company')]")
	WebElement LimitedCompany;
	
	@FindBy(xpath="//ul[@id='myUL']")
	WebElement ClickOnCompanyName;
	
	@FindBy(id="comp_name")
	WebElement SearchCompanyName;
	
	@FindBy(xpath="(//ul[@id='myUL']//child::li)[1]")
	WebElement CompanyName;
	
	
	
	@FindBy(xpath="(//div[@class='list-result'])[1]")
	WebElement PrimaryDirector;
	
	//@FindBy(xpath="//h3[contains(text(),'GERASYMENKO, Oleksandr')]")
	//WebElement PrimaryDirector;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EnterEmail;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement EnterPhoneNumberField;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement EnterMobileField;
	
	@FindBy(id="birth_day")
	WebElement EnterBirthDay;
	
	@FindBy(id="birth_month")
	WebElement EnterBirthMonth;
	
	@FindBy(id="birth_year")
	WebElement EnterBirthYear;
	
	@FindBy(xpath="//input[@id='residential_address']")
    WebElement EnterPostCode;

	@FindBy(xpath="(//span[contains(text(),'Enter address manually')])[1]//parent::div")
    WebElement ClickOnFindAddress;
	
	@FindBy(xpath="(//ul[@id='residential']//ancestor::li)[1]")
	WebElement SelectAddress;
	
	@FindBy(xpath="(//span[contains(text(),'Enter address manually')])[1]")
	WebElement EnterAddressManually;
	
	@FindBy(xpath="//label[@id='property-hide']")
	WebElement SelectResidentialPropertyYes;
	
	@FindBy(xpath="//label[@id='property-show']")
	WebElement SelectResidentialPropertyNo;
	
	@FindBy(xpath="//input[@name='propertyowner']//parent::label//div[contains(text(),'Yes')]")
	WebElement SelectResidentialpropertyinUKYes;
	
	@FindBy(xpath="//input[@name='propertyowner']//parent::label//div[contains(text(),'No')]")
	WebElement SelectResidentialpropertyinUKNo;
	
	@FindBy(xpath="//input[@id='property_address']")
	WebElement  EnterPostCodePropertyAddress;
	
	@FindBy(xpath="(//span[contains(text(),'Enter address manually')])[2]//parent::div//button")
	WebElement ClickOnFindAddresPropertyAddress;
	
	@FindBy(xpath="(//span[contains(text(),'Enter address manually')])[2]")
	WebElement ClickOnEnterAddressManuallyPropertyAddress;
	
	@FindBy(id="trading_address")
	WebElement EnterPostCodeTradingAddress;
	
	@FindBy(xpath="(//button[contains(text(),'Find Address')])[4]")
	WebElement ClickOnFindAddressTradingAddress;
	
	
	
	@FindBy(xpath="(//span[contains(text(),'Enter address manually')])[4]")
	WebElement ClickOnEnterAddressManuallyTradingAddress;
	
	@FindBy(id="hide-find-address")
	WebElement BusinessAddressSelectYes;
	
	@FindBy(xpath="//label[@id='show-find-address']")
	WebElement BusinessAddressSelectNo;
	
	@FindBy(xpath="//input[@id='residential_building_number']")
	WebElement HouseNumber;
	
	@FindBy(xpath="//input[@name='residential_building_name']")
	WebElement HouseName;
	
	@FindBy(xpath="//input[@id='residential_street']")
	WebElement Street;
	
	@FindBy(xpath="//input[@name='residential_city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='residential_country']")
	WebElement Country;
	
	@FindBy(xpath="//input[@name='residential_zip']")
	WebElement PostCode;
	
	@FindBy(id="steponebutton")
	WebElement NextButton;
	
	
	public InfinityNewProposalPage() {
		
		PageFactory.initElements(driver, this);
		}
	
	public void VerifyBusinessInformationText() {
		VerifyBusinessInformationText.isDisplayed();
	}
	
	public void VerifyLoanInformationText() {
		VerifyLoanInformationText.isDisplayed();
	}
	
	public void VerifyDirectorInformation() {
		VerifyDirectorInformationText.isDisplayed();
	}

	public void VerifyDocumentsText() {
		VerifyDocumentsText.isDisplayed();
	}
	
	public void EnterInfinityFundingProposal(String CompanyName) {
		EnterInfinityFundingProposal.sendKeys(CompanyName);
	}
	
	public void LimitedCompany() {
		LimitedCompany.click();
	}
	
	public void SearchCompanyName() {
		
		SearchCompanyName.sendKeys("");
		Sleep(5000);
		
	}
	
 public void CompanyName() {
		
	CompanyName.click();
	}
 
   public void PrimaryDirector() {
		PrimaryDirector.click();
	}
 
	
	
	public void EnterEmail(String Email) {
		
		EnterEmail.clear();
		EnterEmail.sendKeys(Email);
	}
	
	public void EnterPhoneNumberField(String PhoneNumber) {
		EnterPhoneNumberField.clear();
		EnterPhoneNumberField.sendKeys(PhoneNumber);
		
	}
	
	
	public void EnterMobileField(String PhoneNumber) {
		EnterMobileField.clear();
		EnterMobileField.sendKeys(PhoneNumber);
		
	}
	
	public void EnterBirthDay(String BirthDay) {
		EnterBirthDay.clear();
		EnterBirthDay.sendKeys(BirthDay);
	}
	
	public void EnterPostCode(String PostCode) {
		EnterPostCode.sendKeys(PostCode);
	}
	
	public void ClickOnFindAddress() {
		ClickOnFindAddress.click();
	}
	
	public void EnterAddressManually() {
		EnterAddressManually.click();
	}
	
	public void HouseNumber() {
		HouseNumber.sendKeys("12");
	}
	
	public void HouseName() {
		HouseName.sendKeys("Tower");
		
	}
	
	public void Street() {
		Street.sendKeys("Roundhead Street");
	}
	
	public void City() {
		City.sendKeys("Cheshire");
	}
	
	public void Country() {
		Country.sendKeys("England");
	}
	
	public void PostCode() {
		
		PostCode.sendKeys("CW5 6YR");
	}
	
   public void SelectResidentialPropertyYes() {
		
	   SelectResidentialPropertyYes.click();
	}
   
   public void BusinessAddressSelectYes() {
		
	   BusinessAddressSelectYes.click();
	}
 
   public void NextButton() {
		
	   NextButton.click();
	}
	
   public void ClickOnInfinityFundingProposal() {
	   
	   WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement ClickOnInfinityFundingProposal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result1")));
		
	   ClickOnInfinityFundingProposal.click();
	}
   
   public void ClickOnCompanyName() {
		
	   ClickOnCompanyName.click();
	}
   
   public void SelectAddress() {
		
	   SelectAddress.click();
	}
   
	
	
	
	
	
	
	
	
	
	
	
	
	

}
