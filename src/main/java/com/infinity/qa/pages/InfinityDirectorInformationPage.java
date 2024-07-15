package com.infinity.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;

import com.nucleus.qa.base.TestBase;
public class InfinityDirectorInformationPage extends TestBase {
	
	@FindBy(id="edit_1")
	WebElement EditDirectorDetails;
	
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
	
	@FindBy(id="pgno")
	WebElement PersonalGuaranteeNo;
	
	@FindBy(id="residential_prop_yes")
	WebElement SecondDirectorResidentialPropertyYes;
	
	@FindBy(id="sgyes")
	WebElement SignatoryDirectorYes;
	
	@FindBy(xpath="//label[@id='sgno']")
	WebElement SignatoryDirectorNo;
	
	@FindBy(id="director_residential_address")
	WebElement EnterPostCode;
	
	@FindBy(xpath="(//a[contains(text(),'Find Address')])[1]")
	WebElement ClickonFindAddress;
	
	@FindBy(xpath="(//a[contains(text(),'Find Address')])[1]//following::li[1]")
	WebElement SelectAddress;
	
	@FindBy(id="hide-director-address")
	WebElement SelectResidentialPropertyYes;
	
	@FindBy(id="show-director-address")
	WebElement SelectResidentialPropertyNo;
	
	@FindBy(id="residential_prop_uk_yes")
	WebElement SelectResidentialPropertyInUKYes;
	
	@FindBy(id="director-other_property-hide")
	WebElement SelectResidentialPropertyInUKNo;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement ClickOnSubmit;
	
	@FindBy(xpath="(//button[@id='lender-contn'])[2]")
	WebElement ClickOnNext;
	
	
	public InfinityDirectorInformationPage() {
		
		PageFactory.initElements(driver, this);
		}
	
	public void EditDirectorDetails() {
		EditDirectorDetails.click();
	 }
	
	public void DateofBirth() {
		DateofBirth.sendKeys("5");
	 }
	
	public void Email() {
		Email.sendKeys("shahrukh.aatar@mypulse.in");
	 }
	
	public void DirMobile() {
		dirMobile.sendKeys("8655342280");
	 }
	
	public void dirPhone() {
		dirPhone.sendKeys("8655342280");
	 }
	
	public void PersonalGuaranteeYes() {
		PersonalGuaranteeYes.click();
	 }
	
	public void SecondDirectorResidentialPropertyYes() {
		SecondDirectorResidentialPropertyYes.click();
	}
	
	public void SignatoryDirectorYes() {
		SignatoryDirectorYes.click();
	 }
	
	public void EnterPostCode() {
		EnterPostCode.sendKeys("CW5 6YR");
	 }
	
	public void ClickonFindAddress() {
		ClickonFindAddress.click();
	}
	
	public void SelectAddress() {
		SelectAddress.click();
	}
	
	public void SelectResidentialPropertyYes() {
		SelectResidentialPropertyYes.click();
	}
	public void SelectResidentialPropertyNo() {
		SelectResidentialPropertyNo.click();
	}
	
	public void SelectResidentialPropertyInUKYes() {
		SelectResidentialPropertyInUKYes.click();
	}
	
	public void SelectResidentialPropertyInUKNo() {
		SelectResidentialPropertyInUKNo.click();
	}
	
	public void ClickOnSubmit() {
		ClickOnSubmit.click();
	}
	
	public void ClickOnNext() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickOnNext.click();
	}
	
	
	
	
	
	

}
