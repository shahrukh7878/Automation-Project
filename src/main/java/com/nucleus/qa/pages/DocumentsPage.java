package com.nucleus.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nucleus.qa.base.TestBase;

public class DocumentsPage extends TestBase {
	
	
	
	@FindBy(id="customer_accounting_package")
	WebElement SelectAccountingPackage;
	
	@FindBy(xpath="//label[@for='DirectorOpenFinance1']")
	WebElement ClickOnDirector;
	
	@FindBy(xpath="//label[@for='Director1']")
	WebElement ClickOnDirector1;
	
	@FindBy(xpath="//p[@id='popmsgother']//following-sibling::a")
	WebElement ClickOnOk;
	
	
	
	@FindBy(xpath="//select[@id='customer_bank']")
	WebElement SelectBank;
	
	
	
	@FindBy(id="customer_bank_account_type")
	WebElement SelectBankAccountType;
	
	@FindBy(id="submitleadbtn")
	WebElement SubmitButton;
	
	@FindBy(xpath="//input[@id='start_date_All_Mths_Bank_Statements']")
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='end_date_All_Mths_Bank_Statements']")
	WebElement EndDate;
	
	
  
	
	public DocumentsPage() {
		
		PageFactory.initElements(driver, this);
		}
	
	public void SelectAccountingPackage() {
		 Select dropdown = new Select(SelectAccountingPackage); 
		 dropdown.selectByValue("FreshBooks");
	 }
	
     public void ClickOnDirector() {
	  ClickOnDirector.click();
	  }
	
     public void ClickOnOk() {
    	 ClickOnOk.click();
   	  }
     
	public void SelectBank(String Bank) {
		
		Select dropdown = new Select(SelectBank); 
		 dropdown.selectByValue(Bank);
	}
	
    public void SelectBankAccountType(String BankType) {
		
		Select dropdown = new Select(SelectBankAccountType); 
		 dropdown.selectByValue(BankType);
	}
    
    public void ClickOnDirector1() {
  	  ClickOnDirector1.click();
  	  }
    
    public void SubmitButton() {
    	SubmitButton.click();
  	  }
    
    public void StartDate() {
    	StartDate.sendKeys("01072023");
  	  }
    
    public void EndDate() {
    	EndDate.sendKeys("01072024");
  	  }
    
    public void uploadfile() throws Exception {
    	   Robot robot = new Robot();
   		
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_TAB);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_TAB);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_ENTER);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_S);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_A);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_M);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_P);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_L);
   		Sleep(1000);
   		robot.keyPress(KeyEvent.VK_E);
   		
   		
   		
   		robot.keyPress(KeyEvent.VK_ENTER);

  	  }

}
