package com.nucleus.qa.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegisterStudentTest {
    
	//creating object of ExcelUtils class
    static ExcelUtils excelUtils = new ExcelUtils();
    
    //using the Constants class values for excel file path 
    static String excelFilePath =Constants.Path_TestData+Constants.File_TestData;

    public static  void main(String args[]) throws IOException {
        //set the Chrome Driver path
        System.setProperty("webdriver.chrome.driver","E:\\Projects\\chromedriver.exe");
        
        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        //launching the specified URL
        driver.get("https://demoqa.com/automation-practice-form");
        
       
        //Identify the WebElements for the student registration form
       
        
        //calling the ExcelUtils class method to initialise the workbook and sheet
        excelUtils.setExcelFile(excelFilePath,"STUDENT_DATA");

        //iterate over all the row to print the data present in each cell.
        for(int i=1;i<=excelUtils.getRowCountInSheet();i++)
        {
        	
        	//Verify the confirmation message
            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            
            //check if confirmation message is displayed
            if (confirmationMessage.isDisplayed()) {
            	// if the message is displayed , write PASS in the excel sheet using the method of ExcelUtils
            	excelUtils.setCellValue(i,6,"PASS",excelFilePath);
            } else {
                //if the message is not displayed , write FAIL in the excel sheet using the method of ExcelUtils
                excelUtils.setCellValue(i,6,"FAIL",excelFilePath);
            }

            //close the confirmation popup
            WebElement closebtn=driver.findElement(By.id("closeLargeModal"));
            closebtn.click();
         
            //wait for page to come back to registration page after close button is clicked
            driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        }
        //closing the driver
        driver.quit();
    }
}