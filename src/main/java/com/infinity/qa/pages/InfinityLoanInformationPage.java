package com.infinity.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;

import com.nucleus.qa.base.TestBase;

public class InfinityLoanInformationPage extends TestBase {
	
	@FindBy(xpath="//div[contains(text(),'Nucleus Business Loan')]")
	WebElement NucleusBusinessLoan;
	
	@FindBy(xpath="//div[contains(text(),'Revenue Based Loan')]")
	WebElement RevenueBasedLoan;
	
	@FindBy(xpath="//div[contains(text(),'Property Finance')]")
	WebElement PropertyFinance;
	
	@FindBy(xpath="//input[@id='overdraft_amount']")
	WebElement OverdraftAmount;
	
	@FindBy(xpath="//input[@id='funding_needed']")
	WebElement FundingNeeded;
	
	@FindBy(xpath="//input[@id='loan_months']")
	WebElement LoanMonths;
	
	@FindBy(id="purpose_funding")
	WebElement PurposeFunding;
	
	@FindBy(xpath="//input[@id='broker_commission_percent_nbl']")
	WebElement BrokerPercent;
	
	@FindBy(xpath="(//button[@id='lender-contn'])[1]")
	WebElement NextStep;

	@FindBy(xpath="(//a[contains(text(),'Confirm')])[1]")
	WebElement ConfirmAlert;
	
	@FindBy(xpath="(//a[contains(text(),'Confirm')])[2]")
	WebElement ConfirmAlert1;



public InfinityLoanInformationPage() {
	
	PageFactory.initElements(driver, this);
	}

 public void NucleusBusinessLoan() {
	 NucleusBusinessLoan.click();
 }
 
 public  void SelectPurposeFunding() {
	 Select dropdown = new Select(PurposeFunding); 
	 dropdown.selectByValue("Research & Development activities"); 
   }
 
 public void FundingNeeded() {
	 FundingNeeded.sendKeys("5000");
 }
 
 public void LoanMonths() {
	 LoanMonths.sendKeys("12");
 }
 
 
 
 public void BrokerPercent() {
	 BrokerPercent.clear(); 
	 BrokerPercent.sendKeys("5");
 }
 
 public void NextStep() {
	 NextStep.click();
 }
 
 public void ConfirmAlert() {
	 ConfirmAlert.click();
 }
 
 public void ConfirmAlert1() {
	 ConfirmAlert1.click();
 }
 
 
 
 
}
 
 
