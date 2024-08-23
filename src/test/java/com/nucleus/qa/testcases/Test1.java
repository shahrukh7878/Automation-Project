package com.nucleus.qa.testcases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import com.nucleus.qa.base.TestBase;

public class Test1 {

	
	public static void main(String[] args) {
  
		System.setProperty("webdriver.edge.driver", "C://Users//ShahrukhAatar//OneDrive - Nucleus Services Ltd//Downloads//edgedriver_win32//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://mycollection.myfundingportal.co.uk/ptx-contact");
		driver.findElement(By.xpath("//img[@alt='myCollection']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shahrukh.aatar@mypulse.io");
	
		
		driver.findElement(By.partialLinkText("REGISTER")).sendKeys("shahrukh.aatar@mypulse.io");
		
		
				
				
				
				
		
				WebDriverWait wait=new  WebDriverWait (driver,90);
				
				wait.until(ExpectedConditions.elementToBeClickable(By.id("input.form-control custominput")));
				
				driver.findElement(By.cssSelector("input.form-control custominput")).click();
				
				
			 
				WebElement Element = driver.findElement(By.id("purpose_funding"));
				
			Select select = new Select(Element);
			
			select.selectByVisibleText("MBO");
			select.selectByValue("MBO");
			
			
			driver.switchTo().alert().dismiss();
			
			driver.switchTo().alert().sendKeys("");
			
			WebElement Element1 = driver.findElement(By.xpath("//button[contains(text(),'Finance')]"));
			
			Actions action = new Actions(driver);
			
			action.moveToElement(Element1).build().perform();
			
			driver.close();
			driver.quit();
			
			
			 
			 
			 
			
				
		
		
		
	}
	}
		
		
		
		//shahrukhaatar58@gmail.com
		//brokerportal
		