package com.nucleus.qa.testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
import com.mycollection.qa.pages.mycollectionLoginPage;
import com.nucleus.qa.base.TestBase;

public class mycollection extends TestBase {
	
	
	mycollectionLoginPage mycollectionLogin;
	
	ExtentReports extent;
	String Datepath;
	String FilePath;
	ExtentTest test1,test2;	
	static ExtentTest WriteExtentReport;
	datadriven d;
	String path = "C:\\Users\\ShahrukhAatar\\Documents\\TestDataMyCollection.xls";
	
	@BeforeSuite
	public void start() throws FileAlreadyExistsException {
	
	     String  path2 = System.getProperty("user.dir")+ "\\reports\\Mycollection.html";
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
		     ExtentSparkReporter reporter=new ExtentSparkReporter(FilePath);
		     reporter.config().setReportName("Web Automation Results");
			 reporter.config().setDocumentTitle("TestResult");
			 extent = new ExtentReports();
		     extent.attachReporter(reporter); 
	}
	
	@BeforeMethod
	public void setUp() {
	
		initializationInfinity();
		mycollectionLogin=new mycollectionLoginPage();
		
		 d = new datadriven();
		 
	  }
	
	
	@Test(enabled=true)
	public void TestCase1() throws Exception  {
		
		 test1 = extent.createTest("Test Case 1", "Posting Deals");
	
		try {
		ArrayList data=d.getData("TestCase1", path);
		System.out.println(path);
		String url = (String) data.get(2);
		System.out.println(url);
		driver.get(url);
		String Username= (String) data.get(3);
		String Password= (String) data.get(4);
		String Product = (String) data.get(5);
	
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Application landing page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		mycollectionLogin.login(Username,Password);
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Home Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'DASHBOARD')]"))).isDisplayed();
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//nav[@id='sidebar']//child::ul//preceding::li)[3]"))).isDisplayed();
		driver.findElement(By.xpath("(//nav[@id='sidebar']//child::ul//preceding::li)[3]")).click();
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to BOUNCE & POSTING Page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		System.out.println("8888888888888888888888888");
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='product']"))).isDisplayed();
		 System.out.println("99999999999999999999999999999999");
	
		 mycollectionLogin.ClickOnSelectProduct();
		 
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'NBL')]"))).isDisplayed();
		 driver.findElement(By.xpath("//option[contains(text(),'NBL')]")).click();
		 Sleep(2000);
		 driver.findElement(By.xpath("//span[@id='dd_date']")).click();
		 Sleep(2000);
		 
		 driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
		 Sleep(2000);
		 
		 driver.findElement(By.xpath("(//div[@class='datepicker-days']//child::table//child::tbody//child::tr)[4]//td[contains(text(),'21')]")).click();
		 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		 Sleep(3000);
		// WebElement Expected=driver.findElement(By.xpath("((//table[@class='bounpost']//child::tbody//child::tr)[3]//child::td)[10]"));
		 
		 
		// ((//table[@class='bounpost']//child::tbody//child::tr)[3]//child::td)[10]
		 String Expected1=driver.findElement(By.xpath("((//table[@class='bounpost']//child::tbody//child::tr)[3]//child::td)[10]")).getText();
		 
		 System.out.println("56565655656556565565655655665");
		 
		 
		//String Expected1 = Expected.getAttribute("value");
		 
		String[] parts = Expected1.split("\\£");
		 //double d = parts;
		  //String v = String.valueOf(parts).replace(".", "");
		 //int val = Integer.parseInt(v);
		 //System.out.println(val);
		//System.out.println(val);
		
		       
		        // Split the string on the dollar sign
		        
		        // The first part will be empty because the string starts with the dollar sign
		        // The second part will be the number
		       String number = parts[1];
		        
		        // Split the number part on the decimal point
		        String[] numberParts = number.split("\\.");
		        
		        System.out.println("Dollars: " + number);
		 driver.findElement(By.xpath("//a[contains(text(),'Posting Deals')]")).click();
		 Sleep(3000);
		
		 driver.findElement(By.xpath("(//div[@id='PostingDeals']//child::div//child::div//child::div//child::input)[1]")).click();
		 Sleep(3000);
		 
		 WebElement TxtBoxContent = driver.findElement(By.xpath("(//div[@id='PostingDeals']//child::div//child::div//child::div//child::input)[1]"));
		 System.out.println("Printing " + TxtBoxContent.getAttribute("value"));
		 String Expected2 = TxtBoxContent.getAttribute("value");
		 String PostingDealsAmount= driver.findElement(By.xpath("(//div[@id='PostingDeals']//child::div//child::div//child::div//child::input)[1]")).getText();
		
		 System.out.println("22222222222222220"+Expected2);
        if(number.equalsIgnoreCase(Expected2)) {
			 
			 System.out.println("pass");
		 }
        else {
        	System.out.println("Pass");
        }
		
        Screenshot();
		WriteExtentReport = test1.createNode("Navigate to Posting Deals Page");
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
	
	

	@Test(enabled=false)
	public void TestCase2() throws Exception  {
		
		 test1 = extent.createTest("Test Case 2", "Post Manual Payment");
	
		try {
		
		ArrayList data=d.getData("TestCase2", path);
		
		System.out.println(path);
		String url = (String) data.get(2);
		System.out.println(url);
		driver.get(url);
		String Username= (String) data.get(3);
		String Password= (String) data.get(4);
		String Product = (String) data.get(5);
		String CompanyName = (String) data.get(6); 
		String CollectionsStatus = (String) data.get(7); 
		String DDMandateStatus = (String) data.get(8);
		String Portfolio = (String) data.get(9);
		String Actions = (String) data.get(10);
		String CollectionStatus1 = (String) data.get(11);
		String PaymentMethod1 = (String) data.get(12);
		String PaymentAmount = (String) data.get(13); 
		String CollectionFees = (String) data.get(14);
		String FeesCharges = (String) data.get(15);
		String DisbursementType = (String) data.get(16);
		String DisbursementAmount = (String) data.get(17);
		String CWID = (String) data.get(18);
	
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Application landing page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		
		mycollectionLogin.login(Username,Password);
		Sleep(2000);
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Home Page");
	    WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'DASHBOARD')]"))).isDisplayed();
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//nav[@id='sidebar']//child::ul//preceding::li)[3]"))).isDisplayed();
     
		driver.findElement(By.xpath("(//nav[@id='sidebar']//child::ul//preceding::li)[3]")).click();
		Sleep(3000);
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Payments Page");
	    WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'POST MANUAL PAYMENT')]"))).isDisplayed();
		
		 driver.findElement(By.xpath("//h3[contains(text(),'POST MANUAL PAYMENT')]")).click();
		 Sleep(2000);
		 Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to POST MANUAL PAYMENT Page");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
				
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("comp_name"))).isDisplayed();
			
		 driver.findElement(By.id("comp_name")).sendKeys(Product);
		 Sleep(2000);
		 Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to Enter CW Name Page");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
				
		 System.out.println(CompanyName);
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CompanyName+"')]"))).isDisplayed();
		 System.out.println(CompanyName);                                                                            
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'CW-28191')]"))).isDisplayed();
		 System.out.println(CompanyName);	
		 System.out.println(CWID);
		 
		 driver.findElement(By.xpath("//td[contains(text(),'"+CompanyName+"')]")).click();
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+CompanyName+"')])[2]"))).isDisplayed();
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'CW-28191')])[2]"))).isDisplayed();
		 String Message=driver.findElement(By.xpath("((//td[contains(text(),'"+CompanyName+"')])[2]//following::td)[2]")).getText();
		 String Message1=driver.findElement(By.xpath("((//td[contains(text(),'"+CompanyName+"')])[2]//following::td)[3]")).getText();
		 String Message2=driver.findElement(By.xpath("((//td[contains(text(),'"+CompanyName+"')])[2]//following::td)[4]")).getText();
		 
		 System.out.println(Message);
		 System.out.println(Message1);
		 System.out.println(Message2);
		 
		 if(Message.equalsIgnoreCase(CollectionsStatus)) {
			 
			 System.out.println("pass");
			 
		 }
		 
         if(Message1.equalsIgnoreCase(DDMandateStatus)) {
			 
			 System.out.println("pass");
		 }
        if(Message2.equalsIgnoreCase(Portfolio)) {
			 
			 System.out.println("pass");
			 
		 }
        else {
        	System.out.println("Fail");
        }
     
        driver.findElement(By.xpath("(//td[contains(text(),'"+CompanyName+"')])[2]")).click();
        
        Sleep(3000);
         Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to MANUAL PAYMENT Page");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='action']"))).isDisplayed();
        
        WebElement Action = driver.findElement(By.xpath("//select[@id='action']"));
       
        Select dropdown = new Select(Action); 
		 dropdown.selectByValue(Actions);
		 
		 WebElement CollectionStatus= driver.findElement(By.xpath("//select[@id='collection_status']"));
		 
		 Select dropdown1 = new Select(CollectionStatus); 
		 dropdown1.selectByValue(CollectionStatus1);
		 
		 WebElement PaymentMethod= driver.findElement(By.xpath("//select[@id='payment_method']"));
		 
		 Select dropdown2 = new Select(PaymentMethod); 
		 dropdown2.selectByValue(PaymentMethod1);
		 
		 driver.findElement(By.xpath("//input[@id='payment_amount']")).sendKeys("1000");
		 
		 driver.findElement(By.xpath("//input[@id='post_payment_date']")).click();
		 Sleep(1000);
		 driver.findElement(By.xpath("//div[@class='datepicker-days']//child::table//child::tbody//child::tr//td[@class='day']")).click();
		 
		 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Payment update");
		 
		 Sleep(1000);
	   		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   		Sleep(1000);
	   	 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Confirm')]"))).isDisplayed();
	   		driver.findElement(By.xpath("//a[contains(text(),'Confirm')]")).click();
		 
		 Sleep(2000);
		 Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to MANUAL PAYMENT Page1");
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

	@Test(enabled=false)
	public void TestCase3() throws Exception  {
		
		 test1 = extent.createTest("Test Case 3", "Post Manual Payment");
	
		try {
				
		ArrayList data=d.getData("TestCase3", path);
		
		System.out.println(path);
		String url = (String) data.get(2);
		System.out.println(url);
		driver.get(url);
		String Username= (String) data.get(3);
		String Password= (String) data.get(4);
		String Product = (String) data.get(5);
		String CompanyName = (String) data.get(6); 
		String CollectionsStatus = (String) data.get(7); 
		String DDMandateStatus = (String) data.get(8);
		String Portfolio = (String) data.get(9);
		String Actions = (String) data.get(10);
		String CollectionStatus1 = (String) data.get(11);
		String PaymentMethod1 = (String) data.get(12);
		String PaymentAmount = (String) data.get(13); 
		String CollectionFees = (String) data.get(14);
		String FeesCharges = (String) data.get(15);
		String DisbursementType = (String) data.get(16);
		String DisbursementAmount = (String) data.get(17);
		String CWID = (String) data.get(18);
		
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Application landing page");
		WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		mycollectionLogin.login(Username,Password);
		Sleep(2000);
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Home Page");
	    WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'DASHBOARD')]"))).isDisplayed();
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//nav[@id='sidebar']//child::ul//preceding::li)[3]"))).isDisplayed();
		driver.findElement(By.xpath("(//nav[@id='sidebar']//child::ul//preceding::li)[3]")).click();
		Sleep(2000);
		Screenshot();
		WriteExtentReport =test1.createNode("Navigate to Payments Page");
	    WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'POST MANUAL PAYMENT')]"))).isDisplayed();
		
		 driver.findElement(By.xpath("//h3[contains(text(),'POST MANUAL PAYMENT')]")).click();
		 Sleep(2000);
		 Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to POST MANUAL PAYMENT Page");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
				
		 
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("comp_name"))).isDisplayed();
			
		 driver.findElement(By.id("comp_name")).sendKeys(Product);
		 Sleep(2000);
		 Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to Enter CW Name Page");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
				
		
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CompanyName+"')]"))).isDisplayed();
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CWID+"')]"))).isDisplayed();
			
		 driver.findElement(By.xpath("//td[contains(text(),'"+CompanyName+"')]")).click();
		 
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+CompanyName+"')])[2]"))).isDisplayed();
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+CWID+"')])[2]"))).isDisplayed();
		 String Message=driver.findElement(By.xpath("((//td[contains(text(),'"+CompanyName+"')])[2]//following::td)[2]")).getText();
		 String Message1=driver.findElement(By.xpath("((//td[contains(text(),'"+CompanyName+"')])[2]//following::td)[3]")).getText();
		 String Message2=driver.findElement(By.xpath("((//td[contains(text(),'"+CompanyName+"')])[2]//following::td)[4]")).getText();
		 
		 System.out.println(Message);
		 System.out.println(Message1);
		 System.out.println(Message2);
		 
		 if(Message.equalsIgnoreCase(CollectionsStatus)) {
			 System.out.println("pass"); 
		 }
		 
         if(Message1.equalsIgnoreCase(DDMandateStatus)) {
			 
			 System.out.println("pass");
			 
		 }
        if(Message2.equalsIgnoreCase(Portfolio)) {
			 
			 System.out.println("pass");
			 
		 }
        else {
        	System.out.println("Fail");
        }
        
        
        
        
        driver.findElement(By.xpath("(//td[contains(text(),'"+CompanyName+"')])[2]")).click();
        
        Sleep(2000);
         Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to MANUAL PAYMENT Page");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
			
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='action']"))).isDisplayed();
        
        WebElement Action = driver.findElement(By.xpath("//select[@id='action']"));
       
        Select dropdown = new Select(Action); 
		 dropdown.selectByValue(Actions);
		 
		 WebElement CollectionStatus= driver.findElement(By.xpath("//select[@id='collection_status']"));
		 
		 Select dropdown1 = new Select(CollectionStatus);
		 dropdown1.selectByValue(CollectionStatus1);
		 
		 WebElement PaymentMethod= driver.findElement(By.xpath("//select[@id='payment_method']"));
		 
		 Select dropdown2 = new Select(PaymentMethod); 
		 dropdown2.selectByValue(PaymentMethod1);
		 
		 driver.findElement(By.xpath("//input[@id='payment_amount']")).sendKeys(PaymentAmount);
		 
		 driver.findElement(By.xpath("//input[@id='post_payment_date']")).click();
		 Sleep(2000);
		 driver.findElement(By.xpath("//div[@class='datepicker-days']//child::table//child::tbody//child::tr//td[@class='day']")).click();
		 
		 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Payment update");
		 
		 Sleep(1000);
		 Screenshot();
		 WriteExtentReport =test1.createNode("Navigate to MANUAL PAYMENT Page1");
		 WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"pass");
		 
		 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='collection_fees']"))).isDisplayed();
		 driver.findElement(By.xpath("//input[@id='collection_fees']")).sendKeys(CollectionFees);
		 driver.findElement(By.xpath("//input[@id='fees_charges']")).sendKeys(FeesCharges);
		Sleep(1000);
		 driver.findElement(By.xpath("//option[contains(text(),'"+DisbursementType+"')]")).click();
		 driver.findElement(By.xpath("//input[@id='disbursement_amount']")).sendKeys(DisbursementAmount);
		 driver.findElement(By.xpath("//label[contains(text(),'Browse files')]")).click();
		 Robot robot = new Robot();
	   		
	   		Sleep(4000);
	   		
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
	   		Sleep(1000);
	   		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   		Sleep(1000);
	   	 new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Confirm')]"))).isDisplayed();
	   		driver.findElement(By.xpath("//a[contains(text(),'Confirm')]")).click();
	 
		
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