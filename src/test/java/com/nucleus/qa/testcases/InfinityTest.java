package com.nucleus.qa.testcases;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.infinity.qa.pages.InfinityHomePage;
import com.infinity.qa.pages.InfinityLoginPage;
import com.infinity.qa.pages.InfinityNewProposalPage;
import com.nucleus.qa.base.TestBase;

public class InfinityTest extends TestBase{
	
	InfinityLoginPage InfinityLogin;
	InfinityHomePage  InfinityHome;
	InfinityNewProposalPage InfinityNewProposal;
	
	ExtentReports extent;
	String Datepath;
	String FilePath;
	ExtentTest test1,test2;	
	static ExtentTest WriteExtentReport;
	datadriven d;
	String path = "C:\\Users\\ShahrukhAatar\\Documents\\TestDataInfinity.xls";
	
	@BeforeSuite
	public void start() {
		 
		
		String  path2 = System.getProperty("user.dir")+ "\\reports\\Infinity.html";
	//	ExtentSparkReporter esp=new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReport/ExtentReports_"+destDir+"/SwarupExtentReport.html");
		Calendar cal = Calendar.getInstance();
		File Dir = new File(path2);
		Dir.mkdir();
		int year = cal.get(Calendar.YEAR);
		Dir = new File(path2+"/"+year);
		Dir.mkdir();
		int month = cal.get(Calendar.MONTH);
		Dir = new File(path2+"/"+year+"/"+(month+1));
		Dir.mkdir();
		int day = cal.get(Calendar.DATE);
		Dir = new File(path2+"/"+year+"/"+(month+1)+"/"+day);
		Dir.mkdir();
		Dir = new File(path2+"/"+year+"/"+(month+1)+"/"+day);
		Dir.mkdir();
		Datepath= Dir.getAbsolutePath();
		
		Date sDate = new Date();
		String sScreenshotFilename = sDate.getHours()+"_"+sDate.getMinutes()+"_"+sDate.getSeconds();
		FilePath = Datepath + "/" + sScreenshotFilename;
		// String path = System.getProperty("user.dir")+ "\\reports\\"+Datepath+"\\index.html";
		
		
         // File DestFile=new File(FilePath);
		
		 // Files.copy(path.toPath(), DestFile.toPath());
         ExtentSparkReporter reporter=new ExtentSparkReporter(FilePath);
         reporter.config().setReportName("Web Automation Results");
		 reporter.config().setDocumentTitle("TestResult");
		 extent = new ExtentReports();
	     extent.attachReporter(reporter);
	     
	     
	}
	
	@BeforeMethod
	public void setUp() {
		
		
		
		
		initializationInfinity();
		InfinityLogin=new InfinityLoginPage();
		InfinityHome = new InfinityHomePage();
		InfinityNewProposal=new InfinityNewProposalPage();
		 d = new datadriven();
		
	  }
	
	/*@Test
	public void InfinityTest() throws IOException
	{
		
		//FileInputStream fis = new FileInputStream("C:/Users/ShahrukhAatar/Documents/TestData.xlsx");
		//XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//ExtentTest test= extent.createTest("TestCase");
		
		/*InfinityLogin.login();
		InfinityHome.NewProposal();
		InfinityNewProposal.EnterInfinityFundingProposal();
		extent.flush();
		Sleep(1000);
		InfinityNewProposal.ClickOnInfinityFundingProposal();
		InfinityNewProposal.LimitedCompany();
		InfinityNewProposal.ClickOnCompanyName();
		InfinityNewProposal.PrimaryDirector();
		InfinityNewProposal.Email();
		InfinityNewProposal.EnterPhoneNumberField();
		InfinityNewProposal.EnterBirthDay();
		InfinityNewProposal.EnterPostCode();
		InfinityNewProposal.ClickOnFindAddress();
		InfinityNewProposal.SelectAddress();
		InfinityNewProposal.SelectResidentialPropertyYes();
		InfinityNewProposal.BusinessAddressSelectYes();
		InfinityNewProposal.NextButton();
		
		//test.fail("Result not match");
		//extent.flush();
		
		
	    }*/
	
	
	
	@Test(enabled=true)
	public void TestCase1() throws Exception  {
		
		 test1 = extent.createTest("Test Case 1", "InfinityTestCase ");
	
		try {
				
		ArrayList data=d.getData("TestCase1", path);
		
		System.out.println(path);
		
		String url = (String) data.get(2);
		driver.get(url);
		String Username= (String) data.get(3);
		String Password= (String) data.get(4);
		String CompanyName=(String) data.get(5);
		String CompanyName1=(String) data.get(6);
		String Director = (String) data.get(7);
		String Email = (String) data.get(8);
		String PhoneNumber = (String) data.get(9);
		String BirthDay = (String) data.get(10);
		String PostCode = (String) data.get(11);
		/*
		
		String HouseNumber = (String) data.get(10);
		String HouseName = (String) data.get(11);
		String City = (String) data.get(12);
		String Street = (String) data.get(13);
		String Country = (String) data.get(14);
		String Fund = (String) data.get(15);
		String Months = (String) data.get(16);
		String Percent = (String) data.get(17);
		System.out.println(Percent);
		String BirthDay1= (String) data.get(18);
		String Email1 = (String) data.get(19);
		String MobileNumber = (String) data.get(20);
		String PhoneNO = (String) data.get(21);
		String url1 = (String) data.get(22);
		String Bank = (String) data.get(23);
		String BankType = (String) data.get(24);
		String Name = (String) data.get(29);*/
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Application landing page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		InfinityLogin.login(Username,Password);
		
		InfinityHome.NewProposal();
		InfinityNewProposal.EnterInfinityFundingProposal(CompanyName);
		driver.findElement(By.xpath("//h3[contains(text(),'"+CompanyName+"')]")).click();
		//InfinityNewProposal.ClickOnInfinityFundingProposal();
		InfinityNewProposal.LimitedCompany();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'"+CompanyName1+"')]"))).isDisplayed();
		driver.findElement(By.xpath("//h3[contains(text(),'"+CompanyName1+"')]")).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'"+Director+"')]"))).isDisplayed();
		driver.findElement(By.xpath("//h3[contains(text(),'"+Director+"')]")).click();
		InfinityNewProposal.EnterEmail(Email);
		InfinityNewProposal.EnterPhoneNumberField(PhoneNumber);
		InfinityNewProposal.EnterMobileField(PhoneNumber);
		InfinityNewProposal.EnterBirthDay(BirthDay);
		InfinityNewProposal.EnterPostCode(PostCode);
		InfinityNewProposal.ClickOnFindAddress();
		InfinityNewProposal.SelectAddress();
		InfinityNewProposal.SelectResidentialPropertyYes();
		InfinityNewProposal.BusinessAddressSelectYes();
		InfinityNewProposal.NextButton();
		
		Sleep(800000);
		
		//InfinityNewProposal.ClickOnCompanyName();
		//loginPage.login(Username,Password);	
		Screenshot();
		WriteExtentReport = test1.createNode("Navigate to Home Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(5000);
		//homePage.NewProposal();
		Screenshot(); 
		WriteExtentReport =test1.createNode("Navigate NewProposal Page ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		/*newproposalpage.LimitedCompany();
		newproposalpage.SearchCompanyName(CompanyName);
		newproposalpage.CompanyName(Name);
		newproposalpage.PrimaryDirector();
		newproposalpage.EnterEmail(Email);
		newproposalpage.EnterPhoneNumberField(PhoneNumber);
		newproposalpage.EnterBirthDay(BirthDay);
		newproposalpage.EnterAddressManually();
		newproposalpage.EnterHouseNumber(HouseNumber);
		newproposalpage.EnterHouseName(HouseName);
		newproposalpage.EnterCity(City);
		newproposalpage.EnterStreet(Street);
		newproposalpage.EnterCountry(Country);
		newproposalpage.SendPostCode(PostCode);
		newproposalpage.SelectResidentialPropertyYes();
		newproposalpage.BusinessAddressSelectYes();
		newproposalpage.NextButton();*/
		Screenshot(); 
		WriteExtentReport =test1.createNode("Navigate Loan Information Page ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		/*LoanInfo.NucleusBusinessLoan();
		LoanInfo.ConfirmAlert();
		LoanInfo.FundingNeeded(Fund);
		LoanInfo.LoanMonths(Months);
		LoanInfo.SelectPurposeFunding();
		LoanInfo.BrokerPercent(Percent);
		LoanInfo.NextStep();*/
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate Director Information Page ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(5000);
		/*try{
		DirectorInformation.EditDirectorDetails();
		DirectorInformation.DateofBirth(BirthDay1);
		DirectorInformation.Email(Email1);
		Sleep(1000);
		DirectorInformation.DirMobile(MobileNumber);
		DirectorInformation.PersonalGuaranteeYes();
		DirectorInformation.EnterPostCode(PostCode);
		DirectorInformation.ClickonFindAddress();
		Sleep(3000);
		DirectorInformation.SelectAddress();
		DirectorInformation.SelectResidentialPropertyYes();
		DirectorInformation.ClickOnSubmit();
		} catch(Exception e)  
        {  
            System.out.println(e);  
        }  */
		Sleep(3000);
	//	DirectorInformation.ClickOnNext();
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate Documents Page ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		//Documents.SelectAccountingPackage();
		Sleep(3000);
		//Documents.ClickOnDirector();
		//Documents.ClickOnOk();
		//Documents.SelectBank(Bank);
		//Documents.SelectBankAccountType(BankType);
		Sleep(3000);
		//Documents.ClickOnDirector1();
		Sleep(3000);
		//Documents.ClickOnOk();
		//Documents.SubmitButton();
		//driver.get(url1);
		Sleep(6000);
		Set<String> handles3 = driver.getWindowHandles();
		List<String> hList3 = new ArrayList<String>(handles3);
		if(switchToRightWindow("Mail - Shahrukh Aatar - Outlook",hList3)){
		      }
		//Office.ClickOnPulse();
		//Office.SelectFirstEmail();
			Sleep(6000);
			Screenshot();
			WriteExtentReport =test1.createNode("Navigate Email Page ");
			WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			//Office.ClickOnCompleteApplication();
			Sleep(6000);
			Set<String> handles = driver.getWindowHandles();
			List<String> hList = new ArrayList<String>(handles);
			if(switchToRightWindow("MyNucleus",hList)){
			      System.out.println(driver.getCurrentUrl() + ": " + driver.getTitle());
			      }
			Screenshot();
			WriteExtentReport =test1.createNode("Navigate Open Banking Page ");
			WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			//Office.ClickonCompleteyourOpenBanking();
			Sleep(6000);
			Set<String> handles1 = driver.getWindowHandles();
			List<String> hList1 = new ArrayList<String>(handles1);
			if(switchToRightWindow("myPulse - Plaid Open Banking",hList1)){
			   
			      }
			Screenshot();
			WriteExtentReport =test1.createNode("Navigate myPulse Page ");
			WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			driver.switchTo().frame(0);
		   // myPulse.ClickOnContinue();
		    //myPulse.ClickOnBank();
		    //myPulse.ClickOnBankWebsite();
		    Sleep(6000);
		    Set<String> handles2 = driver.getWindowHandles();
			List<String> hList2 = new ArrayList<String>(handles2);
			if(switchToRightWindow("First Platypus Bank - OAuth Login Page",hList2)){
			      }
			// myPulse.ClickOnSignIn();
			//myPulse.ClickOnAccount();
			//myPulse.ClickOnConnectAccountInformation();
			if(switchToRightWindow("myPulse - Plaid Open Banking",hList1)){
			      }
			Sleep(4000);
			//myPulse.Congratulations();	
			Sleep(2000);
			Screenshot();
			Sleep(2000);
			WriteExtentReport =test1.createNode("Navigate Congratulations Page ");
			WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			
	}
	
	catch(Exception e) {
		String Error = e.toString();
		System.out.println(Error);
		Screenshot();
		WriteExtentReport =test1.createNode("Failed Page ");
		WriteExtentReport.log(Status.FAIL, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+Error);
        }
	}

	@AfterMethod
	public void tearDown() throws Exception {
		
		driver.quit();
		
	   }
	
	@AfterSuite
	public void Exit() {
	
	extent.flush();

	}
  }
