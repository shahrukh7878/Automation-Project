package com.nucleus.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nucleus.qa.base.TestBase;
public class ShareholderDetailsPage extends TestBase {
	
	@FindBy(id="edit_1")
	WebElement ClickOnShareholderDetails;
	
	@FindBy(id="edit_3")
	WebElement ClickOnShareholderDetails1;
	
	@FindBy(id="edit_4")
	WebElement ClickOnShareholderDetails2;
	
	@FindBy(xpath="//input[@id='day']")
	WebElement DateofBirth;
	
	@FindBy(id="dirEmail")
	WebElement Email;
	
	@FindBy(id="dirMobile")
	WebElement dirMobile;
	
	@FindBy(id="dirPhone")
	WebElement dirPhone;
	
	@FindBy(id="pgyes")
	WebElement PersonalGuaranteeYes;
	
	@FindBy(id="director_residential_address")
	WebElement EnterPostCode;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement ClickOnSubmit;
	
	@FindBy(xpath="(//a[contains(text(),'Find Address')])[1]")
	WebElement ClickonFindAddress;
	
	
	
	@FindBy(xpath="(//a[contains(text(),'Find Address')])[1]//following::li[1]")
	WebElement SelectAddress;
	

	
	
	
	
public ShareholderDetailsPage() {
		
		PageFactory.initElements(driver, this);
		}
	
	public void ClickOnShareholderDetails() {
		ClickOnShareholderDetails.click();
	 }
	
	public void DateofBirth(String BirthDay1) {
		DateofBirth.sendKeys(BirthDay1);
	 }
	
	public void Email(String Email1) {
		Email.sendKeys(Email1);
	 }
	
	public void DirMobile(String MobileNumber) {
		dirMobile.sendKeys(MobileNumber);
	 }
	
	public void dirPhone(String PhoneNO) {
		dirPhone.sendKeys(PhoneNO);
	 }
	
	public void PersonalGuaranteeYes() {
		PersonalGuaranteeYes.click();
	 }
	
	public void EnterPostCode(String PostCode) {
		EnterPostCode.sendKeys(PostCode);
	 }
	
	public void ClickOnSubmit() {
		ClickOnSubmit.click();
	}
	
	public void SelectAddress() {
		SelectAddress.click();
	}
	
	public void ClickOnShareholderDetails1() {
		ClickOnShareholderDetails1.click();
	}
	
	public void ClickOnShareholderDetails2() {
		ClickOnShareholderDetails2.click();
	}
	
	public void ClickonFindAddress() {
		ClickonFindAddress.click();
	}
	
}

