package com.nucleus.qa.testcases;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Framework {
	
	public static String Basepathet;
	public static String sReportPath;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest WriteExtentReport;
	public static ExtentTest test;
	public static boolean sStatus;
	
	public static void getreportfilename()
	{
		Basepathet = System.getProperty("user.dir") + "/Reports and Screenshots";
		Calendar cal = Calendar.getInstance();    
		File Dir = new File(Basepathet);
		Dir.mkdir();
		int year = cal.get(Calendar.YEAR);
		Dir = new File(Basepathet+"/"+year);
		Dir.mkdir();
		int month = cal.get(Calendar.MONTH);
		Dir = new File(Basepathet+"/"+year+"/"+(month+1));
		Dir.mkdir();
		int day = cal.get(Calendar.DATE);
		Dir = new File(Basepathet+"/"+year+"/"+(month+1)+"/"+day);
		Dir.mkdir();
		Dir = new File(Basepathet+"/"+year+"/"+(month+1)+"/"+day+"/"+System.getProperty("user.name"));
		Dir.mkdir();
		Date sDate = new Date();
		Dir = new File(Basepathet+"/"+year+"/"+(month+1)+"/"+day+"/"+System.getProperty("user.name")+"/Testrun_"+sDate.getHours()+"_"+sDate.getMinutes()+"_"+sDate.getSeconds());
		Dir.mkdir();
		sReportPath = Dir.getAbsolutePath();
	}
	
	public static void statextentreport() throws UnknownHostException
	{
		htmlReporter = new ExtentSparkReporter(sReportPath+"/Report.html");
		htmlReporter.config().setDocumentTitle("Functional Testing");
		htmlReporter.config().setReportName("Functional Testing report");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//extent.setSystemInfo("Environment",Execution_Environment);
		//extent.setSystemInfo("Browser", ExecutionBrowser);
		extent.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostName());
		extent.setSystemInfo("User", System.getProperty("user.name"));
	}
	
	public static void CreateResults(boolean iStatus,String sActualResult)
	{
		try
		{
			String sStatus = "";
			if(iStatus==true)
			{
				sStatus = "Passed";
				//GetScreenshot();
				WriteExtentReport.log(Status.PASS, WriteExtentReport+sActualResult);
			}
			else
			{
				sStatus = "Failed";
				if(sActualResult.equalsIgnoreCase("Skip"))
				{
					WriteExtentReport.log(Status.WARNING,"Keyword Skipped as dependent Test case was failed");
					sStatus = "Skip";
				}
				else if(sActualResult.equalsIgnoreCase("SkipTC"))
				{
					WriteExtentReport.log(Status.WARNING,"Keyword Skipped as previous keywords were failed");
					sStatus = "Skip";
				}
				else if(sActualResult.equalsIgnoreCase("No"))
				{
					WriteExtentReport.log(Status.SKIP,"Keyword Skipped as Runstatus is No");
					sStatus = "Skip";
				}
				else if(sActualResult.equalsIgnoreCase("TC_Was_Pass_Status"))
				{
					WriteExtentReport.log(Status.PASS,"Keyword Skipped as keyword already executed with Pass status");
					sStatus = "Skip";
				}
				else
				{
					//GetScreenshot();
					WriteExtentReport.log(Status.FAIL, WriteExtentReport+sActualResult);
					//baseclass.ChangeBrowser(globalIdentifiers.ExecutionBrowser);
				}
				
			}
			
			//saveresultstatustotestcase();
			extent.flush();
			
		}
		catch(Exception e)
		{
			System.out.println("Error while generating report !!!!");
			e.printStackTrace();
			try
			{
				//baseclass.ChangeBrowser(globalIdentifiers.ExecutionBrowser);
				extent.flush();
			}
			catch(Exception e1)
			{	
			}
		}
	}
	
	
	
	
	

}
