package com.nucleus.qa.testcases;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
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
	
	@BeforeMethod
	public void setUp() {
		String path = "C:\\Users\\ShahrukhAatar\\OneDrive - Nucleus Services Ltd\\Documents\\Automation\\MyNucleusTest\\Screenshot\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("NucleusAutomationReports");
		reporter.config().setDocumentTitle("TestResult");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shahrukh");
		
		
		initializationInfinity();
		InfinityLogin=new InfinityLoginPage();
		InfinityHome = new InfinityHomePage();
		InfinityNewProposal=new InfinityNewProposalPage();
		
		
		
		
	}
	
	@Test
	public void InfinityTest() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:/Users/ShahrukhAatar/Documents/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
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
		InfinityNewProposal.NextButton();*/
		
		//test.fail("Result not match");
		//extent.flush();
		
		
	    }
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		
			
	}

}
