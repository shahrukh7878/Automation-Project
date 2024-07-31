package com.mycollection.qa.pages;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nucleus.qa.base.TestBase;

public class mycollectionLoginPage extends TestBase {
	

	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement SignInBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//img[@src='https://myfunding.ncf-sandbox.com/images/mynucleus-logo.png']")
	WebElement mynucleuslogo;
	
	@FindBy(xpath="//option[contains(text(),'Select Product')]")
	WebElement ClickOnSelectProduct;
	
	
	
	//Initializing the page Objects
	public mycollectionLoginPage() {
		
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
	
    public void ClickOnSelectProduct() {
    	
    	ClickOnSelectProduct.click();
    	
	
    }
	

}
