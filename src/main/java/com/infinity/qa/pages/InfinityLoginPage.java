package com.infinity.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.nucleus.qa.base.TestBase;

public class InfinityLoginPage extends TestBase {
	

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement SignInBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//img[@src='https://myfunding.ncf-sandbox.com/images/mynucleus-logo.png']")
	WebElement mynucleuslogo;
	
	//Initializing the page Objects
	public InfinityLoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean  validateLogo() {
		return mynucleuslogo.isDisplayed();
		
	}
	
	public void login(String Username,String Password) {
		
		username.sendKeys(Username);
		password.sendKeys(Password);
		SignInBtn.click();
		
	//	return new HomePage();
		
	}		
	
	
	

}
