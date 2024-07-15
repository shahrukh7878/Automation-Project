package com.nucleus.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nucleus.qa.base.TestBase;

public class myPulsePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement ClickOnContinue;
	
	
	@FindBy(xpath="//h2[contains(text(),'HSBC (UK) - Personal')]")
	WebElement ClickOnBank;
	
	@FindBy(xpath="//span[contains(text(),'bank website')]")
	WebElement ClickOnBankWebsite;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement ClickOnSignIn;
	
	@FindBy(xpath="//div[contains(text(),'Plaid Current Account')]")
	WebElement ClickOnAccount;
	
	@FindBy(xpath="//button[@id='submit-accounts']")
	WebElement ClickOnConnectAccountInformation;
	
	@FindBy(xpath="(//div[@id='header']//following-sibling::div)[4]")
	WebElement Congratulations;
	
	@FindBy(xpath="//button[contains(text(),'Get Started')]")
	WebElement ClickOnGetStarted;
	
	@FindBy(xpath=  "//input[@name='CompanyName']")
	WebElement CompanyName;
	
	@FindBy(xpath= "//input[@name='email']" )
	WebElement Email;
	
	@FindBy(xpath= "//input[@name='Telephone']")
	WebElement mobileNumber;
	
	@FindBy(xpath= "//button[contains(text(),'Continue')]")
	WebElement ClickOnContinue1;
	
	@FindBy(xpath= "//input[@id='search-bank']")
	WebElement EnterBankName;
	
	@FindBy(xpath= "//span[contains(text(),'AccountScore Test Bank')]")
	WebElement ClickOnYourBank;
	
	@FindBy(xpath= "//button[contains(text(),'Consent')]")
	WebElement ClickOnConsent;

	@FindBy(xpath= "//input[@id='Username']")
	WebElement EnterUsername;
	
	@FindBy(xpath= "//input[@name='submit']")
	WebElement ClickOnSubmit;
	
	@FindBy(xpath= "//h1[contains(text(),'Thank you')]")
	WebElement VerifyMessage;
	
	@FindBy(xpath= "//button[contains(text(),'Finish')]")
	WebElement ClickOnFinish;
	
	
	
public myPulsePage() {
		
		PageFactory.initElements(driver, this);
		}
	
	public void ClickOnContinue() {
		ClickOnContinue.click();
	 }
	
	public void ClickOnBank() {
		ClickOnBank.click();
	 }
	
	
	
     public void ClickOnBankWebsite() {
    	 ClickOnBankWebsite.click();
	  }
     
     public void ClickOnSignIn() {
    	 ClickOnSignIn.click();
	  }
     
     public void ClickOnAccount() {
    	 ClickOnAccount.click();
	  }
     
     public void ClickOnConnectAccountInformation() {
    	 ClickOnConnectAccountInformation.click();
	  }
     
     public void Congratulations() {
    	 Congratulations.isDisplayed();
	  }
     
     public void ClickOnGetStarted() {
    	 ClickOnGetStarted.click();
	  }
     
     public boolean CompanyName() {
    	  CompanyName.isDisplayed();
    	  return CompanyName();
	  }
     
     public void CompanyNames() {
    	 CompanyName.sendKeys("ABC");
	  }
     
     public void EnterEmail() {
    	 Email.sendKeys("shahrukh.aatar@mypulse.io");
	  }
     
     
     public void mobileNumber() {
    	 mobileNumber.sendKeys("+447856489623");
	  }
     
     public void ClickOnContinue1() {
    	 ClickOnContinue1.click();
	  }
     
     public void EnterBankName() {
    	 EnterBankName.sendKeys("Account");
	  }
   
     public void ClickOnYourBank() {
    	 ClickOnYourBank.click();
	  }
     
     
     
     public void ClickOnConsent() {
    	 ClickOnConsent.click();
	  }
     
     public void EnterUsername() {
    	 EnterUsername.sendKeys("AishaPine");
	  }
     
     public void ClickOnSubmit() {
    	 ClickOnSubmit.click();
	  }
     
     public void VerifyMessage() {
    	 VerifyMessage.isDisplayed();
    	 }
     
     public void ClickOnFinish() {
    	 ClickOnFinish.click();
    	 }
     
     
     
     
     
     
     
     
     
     

}
