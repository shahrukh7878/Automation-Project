package com.nucleus.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nucleus.qa.base.TestBase;

public class NucleusSaleforcePage extends TestBase {
	
	@FindBy(id="Lead_Tab")
	WebElement ClickOnLeadtab;
	
	@FindBy(xpath="//input[@name='new']")
	WebElement ClickOnNewbutton;
	
	@FindBy(xpath="//select[@id='p3']")
	WebElement SelectOnLeadRecordType;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement ClickOnContinue;
	
	@FindBy(xpath="//input[@id='name_firstlea2']")
	WebElement EnterFirstName;
	
	@FindBy(xpath="//input[@id='name_lastlea2']")
	WebElement EnterLastName;
	
	@FindBy(xpath="//input[@id='lea3']")
	WebElement EnterCompanyName;
	
	@FindBy(xpath="//select[@id='lea5']")
	WebElement SelectLeadSource;
	

	@FindBy(xpath="//select[@id='00N5800000AeHw3']")
	WebElement SelectLeadSourceInformation ;
	
	@FindBy(xpath="//input[@name='save']")
	WebElement ClickOnSavebutton;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement EnterPassword;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement EnterUsername;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement ClickOnLogin;
	
	@FindBy(xpath="//img[@title='User']")
	WebElement ClickOnProfile;
	
	@FindBy(xpath="//a[contains(text(),'Switch to Salesforce Classic')]")
	WebElement SwitchToClassic;
	
	
	public NucleusSaleforcePage() {
		PageFactory.initElements(driver, this);
		}
	
	public void ClickOnLeadtab() {
		ClickOnLeadtab.click();
	}
	public void ClickOnNewbutton() {
		ClickOnNewbutton.click();
	}
	public void SelectOnLeadRecordType() {
	Select dropdown = new Select(SelectOnLeadRecordType); 
	 dropdown.selectByVisibleText("Standard");
	}
	
	public void ClickOnContinue() {
		ClickOnContinue.click();
	}
	
	public void EnterFirstName(String FirstName) {
		EnterFirstName.sendKeys(FirstName);
	}
	
	public void EnterLastName(String LastName) {
		EnterLastName.sendKeys(LastName);
	}
	
	public void EnterCompanyName(String CompanyName) {
		EnterCompanyName.sendKeys(CompanyName);
	}
	
	 public void SelectLeadSource() {
		Select dropdown = new Select(SelectLeadSource); 
		 dropdown.selectByVisibleText("Direct Channel");
		}
	
	  public void SelectLeadSourceInformation() {
		Select dropdown = new Select(SelectLeadSourceInformation); 
		 dropdown.selectByVisibleText("Affiliates");
		}
	
	  public void ClickOnSavebutton() {
		ClickOnSavebutton.click();
	     }
	  public void EnterUsername(String Username) {
		  EnterUsername.sendKeys(Username);
		     }
	  
	  public void EnterPassword(String Password) {
		  EnterPassword.sendKeys(Password);
		     }
	  
	  public void ClickOnProfile() {
		  
		 // WebElement element = driver.findElement(By.id("gbqfd"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", ClickOnProfile);
		  
		     }
	  public void ClickOnLogin() {
		  ClickOnLogin.click();
		     }
	  public void SwitchToClassic() {
		  
		  JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		  executor1.executeScript("arguments[0].click();", SwitchToClassic);
		     }
	  
	 
	  
	  
  

}
