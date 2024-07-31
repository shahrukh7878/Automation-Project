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
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search_name']"))).isDisplayed();
		
		driver.findElement(By.xpath("//input[@id='search_name']")).sendKeys(CompanyName);
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Company Search Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'SEARCH')]"))).isDisplayed();
			
		 driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'PLMD GROUP LTD')])[1]"))).isDisplayed();
		
		driver.findElement(By.xpath("(//a[contains(text(),'"+CompanyName+"')])[1]")).click();
	
		//Sleep(800000);
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Nucleus Business Loan')]"))).isDisplayed();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Loan Information Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		driver.findElement(By.xpath("//div[contains(text(),'Nucleus Business Loan')]")).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='popupmessage']"))).isDisplayed();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to OutSide Risk Criteria Pop-Up Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(2000);
		driver.findElement(By.xpath("//a[@id='npreason']//parent::div[1]//child::a[1]")).click();
	
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Revenue Based Loan')]"))).isDisplayed();
        Sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Based Loan')]")).click();
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='popupmessage']"))).isDisplayed();
        
        Screenshot();
		WriteExtentReport =test1.createNode("Navigate to OutSide Risk Criteria Pop-Up Page1");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		Sleep(2000);
		driver.findElement(By.xpath("//a[@id='npreason']//parent::div[1]//child::a[1]")).click();
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Growth Loans')]"))).isDisplayed();
		 Sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Growth Loans')]")).click();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate Growth Loans ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'Confirm')])[1]"))).isDisplayed();
			
		 driver.findElement(By.xpath("(//a[contains(text(),'Confirm')])[1]")).click();
			
         new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Merchant cash advance')]"))).isDisplayed();
         Sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'Merchant cash advance')]")).click();
			
		Screenshot();
		WriteExtentReport = test1.createNode("Navigate to Merchant cash advance Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(5000);
		
	}
	
	catch(Exception e) {
		String Error = e.toString();
		System.out.println(Error);
		Screenshot();
		WriteExtentReport =test1.createNode("Failed Page ");
		WriteExtentReport.log(Status.FAIL, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+Error);
        }
	}

	
	@Test(enabled=true)
	public void TestCase2() throws Exception  {
		
		 test1 = extent.createTest("Test Case 2", "InfinityTestCase ");
	
		try {
				
		ArrayList data=d.getData("TestCase2", path);
		
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
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search_name']"))).isDisplayed();
		
		driver.findElement(By.xpath("//input[@id='search_name']")).sendKeys(CompanyName);
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Company Search Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'SEARCH')]"))).isDisplayed();
			
		 driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'PLMD GROUP LTD')])[1]"))).isDisplayed();
		
		driver.findElement(By.xpath("(//a[contains(text(),'"+CompanyName+"')])[1]")).click();
	
		//Sleep(800000);
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Nucleus Business Loan')]"))).isDisplayed();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Loan Information Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		driver.findElement(By.xpath("//div[contains(text(),'Nucleus Business Loan')]")).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='popupmessage']"))).isDisplayed();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to OutSide Risk Criteria Pop-Up Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(2000);
		driver.findElement(By.xpath("//a[@id='npreason']//parent::div[1]//child::a[1]")).click();
	
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Revenue Based Loan')]"))).isDisplayed();
        Sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Based Loan')]")).click();
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='popupmessage']"))).isDisplayed();
        
        Screenshot();
		WriteExtentReport =test1.createNode("Navigate to OutSide Risk Criteria Pop-Up Page1");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		Sleep(2000);
		driver.findElement(By.xpath("//a[@id='npreason']//parent::div[1]//child::a[1]")).click();
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Growth Loans')]"))).isDisplayed();
		 Sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Growth Loans')]")).click();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate Growth Loans ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'Confirm')])[1]"))).isDisplayed();
			
		 driver.findElement(By.xpath("(//a[contains(text(),'Confirm')])[1]")).click();
			
         new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Merchant cash advance')]"))).isDisplayed();
         Sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'Merchant cash advance')]")).click();
			
		Screenshot();
		WriteExtentReport = test1.createNode("Navigate to Merchant cash advance Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(5000);
		
	}
	
	catch(Exception e) {
		String Error = e.toString();
		System.out.println(Error);
		Screenshot();
		WriteExtentReport =test1.createNode("Failed Page ");
		WriteExtentReport.log(Status.FAIL, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+Error);
        }
	}

	
	
	
	@Test(enabled=true)
	public void TestCase3() throws Exception  {
		
		 test1 = extent.createTest("Test Case 3", "InfinityTestCase ");
	
		try {
				
		ArrayList data=d.getData("TestCase3", path);
		
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
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search_name']"))).isDisplayed();
		
		driver.findElement(By.xpath("//input[@id='search_name']")).sendKeys(CompanyName);
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Company Search Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'SEARCH')]"))).isDisplayed();
			
		 driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'"+CompanyName+"')])[1]"))).isDisplayed();
		
		driver.findElement(By.xpath("(//a[contains(text(),'"+CompanyName+"')])[1]")).click();
	
		//Sleep(800000);
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Nucleus Business Loan')]"))).isDisplayed();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Loan Information Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		driver.findElement(By.xpath("//div[contains(text(),'Nucleus Business Loan')]")).click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='popupmessage']"))).isDisplayed();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to OutSide Risk Criteria Pop-Up Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(2000);
		driver.findElement(By.xpath("//a[@id='npreason']//parent::div[1]//child::a[1]")).click();
	
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Revenue Based Loan')]"))).isDisplayed();
        Sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Based Loan')]")).click();
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='popupmessage']"))).isDisplayed();
        
        Screenshot();
		WriteExtentReport =test1.createNode("Navigate to OutSide Risk Criteria Pop-Up Page1");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		Sleep(2000);
		driver.findElement(By.xpath("//a[@id='npreason']//parent::div[1]//child::a[1]")).click();
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Growth Loans')]"))).isDisplayed();
		 Sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Growth Loans')]")).click();
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate Growth Loans ");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'Confirm')])[1]"))).isDisplayed();
			
		 driver.findElement(By.xpath("(//a[contains(text(),'Confirm')])[1]")).click();
			
         new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Merchant cash advance')]"))).isDisplayed();
         Sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'Merchant cash advance')]")).click();
			
		Screenshot();
		WriteExtentReport = test1.createNode("Navigate to Merchant cash advance Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		Sleep(5000);
		
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
