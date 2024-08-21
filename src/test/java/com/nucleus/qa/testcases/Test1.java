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

public class Test1 extends TestBase {

	
	public static void main(String[] args) {
		
		
		
		//shahrukhaatar58@gmail.com
		//brokerportal
		System.setProperty("webdriver.edge.driver","C://Users//ShahrukhAatar//OneDrive - Nucleus Services Ltd//Downloads//edgedriver_win32//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://myfunding.ncf-sandbox.com/mynucleus");
		Sleep(30000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		FluentWait wait1 = new FluentWait(driver);
		wait1.withTimeout(5000, TimeUnit.SECONDS);
		wait1.pollingEvery(250, TimeUnit.SECONDS);
		wait1.ignoring(NoSuchElementException.class);
		
		
		
		
		WebElement Element1 = driver.findElement(By.id(""));
		Actions action = new Actions(driver);
		action.moveToElement(Element1).build().perform();
		action.doubleClick(Element1).perform();
		action.dragAndDrop(Element1, Element1);
		
		WebElement Element = driver.findElement(By.id("purpose_funding"));
		Select select = new Select(Element);
		
		
		select.selectByVisibleText("Acquiring another business within UK");
		
		
		
		Sleep(5000);
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("");
		
		
		//System.setProperty("webdriver.edge.driver","C://Users//ShahrukhAatar//OneDrive - Nucleus Services Ltd//Downloads//edgedriver_win32//msedgedriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.browserstack.com/");

	//((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	
	   Sleep(5000);
	   driver.findElement(By.tagName("a")).click();
		
		//Actions action = new Actions(driver); 
		WebElement live= driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
		Sleep(5000);
		action.moveToElement(live).build().perform();
		Sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(),'Accessibility Testing')])[3]")).click();
		System.out.println("111111111111111111111");
		action.doubleClick(live).perform();
		
		action.dragAndDrop(live, live);
		action.contextClick();
		
		
		//System.setProperty("webdriver.edge.driver", "C://Users//ShahrukhAatar//OneDrive - Nucleus Services Ltd//Downloads//edgedriver_win32//msedgedriver.exe");
		//driver = new EdgeDriver();
		
		//driver.get("https://demo.guru99.com/test/newtours/");
		
		/*WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		
		@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
		FluentWait wait1=new FluentWait(driver);
		
		wait1.withTimeout(5000,TimeUnit.MILLISECONDS).pollingEvery(250,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
*/
		Sleep(5000);
		//driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.partialLinkText("REGISTER")).click();
		//WebElement Element=driver.findElement(By.cssSelector("td.mouseOut"));
		
		///html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a
		
		System.setProperty("webdriver.edge.driver", "C://Users//ShahrukhAatar//OneDrive - Nucleus Services Ltd//Downloads//edgedriver_win32");
		
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("");
		
		//WebDriverWait Wait=new WebDriverWait(driver,30);
		//Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
		
		FluentWait Wait = new FluentWait(driver);
		
		Wait.withTimeout(5000, TimeUnit.SECONDS);
		Wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		Wait.ignoring(NoSuchElementException.class);
		
		//xpath=tagname[@attribute='value'];
		
		//*[@id="email"]
		///html/body/form/div[2]/div[1]/input
		
	
		/*WebElement Element1 =driver.findElement(By.xpath(""));
		Select select=new Select(Element1);
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("");*/
		 //Select dropdowns = new Select(PurposeFunding); 
		 //dropdown.selectByValue("Research & Development activities");
	
	/*	 Select select=new Select(Element);
		 
		select.selectByValue("");
		select.selectByIndex(0);
		select.selectByVisibleText("");
		select.getOptions();
		select.deselectAll();*/
		
				
		
	}

}
