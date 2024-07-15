package com.nucleus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.nucleus.qa.base.TestBase;
public class OfficePage extends TestBase{
	
	
	@FindBy(xpath="(//span[contains(text(),'Apulse')])[1]")
	WebElement ClickOnPulse;
	
	@FindBy(xpath="(//i[contains(text(),'')])[1]")
	WebElement ClickOnDeleteTab;
	
	@FindBy(xpath="//span[contains(text(),'Delete all')]")
	WebElement ClickOnDeleteAll;
	
	@FindBy(xpath="(//span[contains(text(),'DONOTREPLY NUCLEUS')])[1]")
	WebElement SelectFirstEmail;
	
	@FindBy(xpath="//img[@src='https://myfunding.ncf-sandbox.com/emailers/images/MyAppImages/accessbtn.png']")
	WebElement ClickOnCompleteApplication;
	
	@FindBy(xpath=" //a[contains(text(),'Complete your Open Banking')]")
	WebElement ClickonCompleteyourOpenBanking;
	
	
	
	public OfficePage() {
		PageFactory.initElements(driver, this);
		}
	
	
	public void ClickOnPulse() {
		ClickOnPulse.click();
	}
	
	public void ClickOnDeleteTab() {
		ClickOnDeleteTab.click();
	}
	
	public void ClickOnDeleteAll() {
		ClickOnDeleteAll.click();
	}
	
	public void SelectFirstEmail() {
		SelectFirstEmail.click();
	}
	
	public void ClickOnCompleteApplication() {
		ClickOnCompleteApplication.click();
	}
	
	public void ClickonCompleteyourOpenBanking() {
		ClickonCompleteyourOpenBanking.click();
	}

}
