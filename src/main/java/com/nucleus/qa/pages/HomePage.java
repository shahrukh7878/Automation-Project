package com.nucleus.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nucleus.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[@class='user-profile']")
	WebElement UserProfile;
	
	
	
	@FindBy(xpath="//a[contains(text(),' DASHBOARD')]")
	WebElement Dashboard;
	
	
	
	@FindBy(xpath="//a[contains(text(),' NEW PROPOSAL')]")
	WebElement NewProposal;
	
	@FindBy(xpath="//a[contains(text(),' OPEN BANKING STATUS')]")
	WebElement OpenBankingStatus;
	
	@FindBy(xpath="//a[contains(text(),' OPEN ACCOUNTING STATUS')]")
	WebElement OpenAccountStatus;
	
	@FindBy(xpath="//a[contains(text(),' PRODUCT SUPPORT')]")
	WebElement ProductSupport;
	
	@FindBy(xpath="//a[contains(text(),' QUERIES')]")
	WebElement QUERIES;
	
	@FindBy(xpath="//a[contains(text(),' SIC Codes')]")
	WebElement  SICCodes;
	
	@FindBy(xpath="//a[contains(text(),'LOGOUT')]")
	WebElement Logout;
	
	@FindBy(id="menu_toggle")
	WebElement MenuBar;
	
	@FindBy(xpath="//span[contains(text(),'Log a Query')]")
	WebElement LogAQuery;
	
	@FindBy(name="search_name")
	WebElement SearchName;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		}
	
	
	public void NewProposal() {
		NewProposal.click();
	}
	
	
	
	
	
	public void Dashboard() {
		
		Dashboard.click();
		
	}
	
    public void IncompleteProposals(String CompanyName) {
		
    	driver.findElement(By.xpath("//a[contains(text(),'"+CompanyName+"')]")).click();
    
	}
	
	
			

}
