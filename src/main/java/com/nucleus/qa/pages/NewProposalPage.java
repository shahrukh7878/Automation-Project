package com.nucleus.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nucleus.qa.base.TestBase;

public class NewProposalPage extends TestBase {
	

	@FindBy(xpath="//p[contains(text(),'Business Information')]")
	WebElement VerifyBusinessInformationText;
	
	@FindBy(xpath="//p[contains(text(),'Loan Information')]")
	WebElement VerifyLoanInformationText;
	
	@FindBy(xpath="//p[contains(text(),'Director Information')]")
	WebElement VerifyDirectorInformationText;
	
	@FindBy(xpath="//p[contains(text(),'Documents')]")
	WebElement VerifyDocumentsText;
	
	
	@FindBy(xpath="//div[contains(text(),'Limited Company')]")
	WebElement LimitedCompany;
	
	@FindBy(id="comp_name")
	WebElement SearchCompanyName;
	
	@FindBy(xpath="//h3[contains(text(),'\"+Name+\"')]")
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
	WebElement EnterHouseNumber;
	
	@FindBy(xpath="//input[@name='residential_building_name']")
	WebElement EnterHouseName;
	
	@FindBy(xpath="//input[@id='residential_street']")
	WebElement EnterStreet;
	
	@FindBy(xpath="//input[@name='residential_city']")
	WebElement EnterCity;
	
	@FindBy(xpath="//input[@name='residential_country']")
	WebElement EnterCountry;
	
	@FindBy(xpath="//input[@name='residential_zip']")
	WebElement SendPostCode;
	
	@FindBy(id="steponebutton")
	WebElement NextButton;
	
	public NewProposalPage() {
		
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
	
	public void LimitedCompany() {
		LimitedCompany.click();
	}
	
	public void SearchCompanyName(String CompanyName) {
		
		SearchCompanyName.sendKeys(CompanyName);
		Sleep(5000);
		
	}
	
 public void CompanyName(String Name) {
	 
	 driver.findElement(By.xpath("//h3[contains(text(),'"+Name+"')]")).click();
		
	
	}
 
   public void PrimaryDirector() {
		PrimaryDirector.click();
	}
 
	
	
	public void EnterEmail(String Email) {
		EnterEmail.sendKeys(Email);
	}
	
	public void EnterPhoneNumberField(String PhoneNumber) {
		EnterPhoneNumberField.sendKeys(PhoneNumber);
		
	}
	
	public void EnterBirthDay(String BirthDay) {
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
	
	public void EnterHouseNumber(String HouseNumber) {
		EnterHouseNumber.sendKeys(HouseNumber);
	}
	
	public void EnterHouseName(String HouseName) {
		EnterHouseName.sendKeys(HouseName);
		
	}
	
	public void EnterStreet(String Street) {
		EnterStreet.sendKeys(Street);
	}
	
	public void EnterCity(String City ) {
		EnterCity.sendKeys(City);
	}
	
	public void EnterCountry(String Country ) {
		EnterCountry.sendKeys(Country);
	}
	
	public void SendPostCode(String PostCode) {
		
		SendPostCode.sendKeys(PostCode);
	}
	
   public void SelectResidentialPropertyYes() {
		
	   SelectResidentialPropertyYes.click();
	}
   
   public void BusinessAddressSelectYes() {
		
	   BusinessAddressSelectYes.click();
	}
 
   public void NextButton() {
		
	 /*  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("steponebutton"))).isDisplayed();
		
	   NextButton.click();*/
	   NextButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
