//import MercuryDemoTours;

package  MercuryDemoTours1;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
 
public class MercuryFlightFinderPage
{
	public static WebDriver driver ; 
	
	@Test
	public static void Allmethods() throws Exception
	{
		 // create TC149_FB.xls in E:\Functional TestCases
		 Folders123.FolderCreation("TC01_Business_Class");
		 CommonUtility.OpenBlankChromeBrowser();
		 driver=OR.driver;
		 
		 CommonUtility.OpenMercuryDemoToursURL();
		 MercuryLoginPage.MerucryLogin();
		 
		 
		 MercuryFlightFinderPage.MerucryFlightFinderFirst();
		 CommonUtility.CloseBrowser();
	}
	
	
	 
public static void MerucryFlightFinderBusiness() throws Exception
{
	driver=OR.driver;
	
	driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();

	Select listbox =new Select(driver.
	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	listbox.selectByVisibleText("2");
	
	Select listbox1 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
    listbox1.selectByVisibleText("London");
		
	Select listbox2 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	listbox2.selectByVisibleText("February");
		
	Select listbox3 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	listbox3.selectByVisibleText("10");
				
	Select listbox4 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	listbox4.selectByVisibleText("Paris");	
	
	Select listbox5 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	listbox5.selectByVisibleText("March");
				
	Select listbox6 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	listbox6.selectByVisibleText("14");
	
	driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();
	
	Select listbox7 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	listbox7.selectByVisibleText("Unified Airlines");
	
	
	
	//Screenshot2
	CommonUtility.waitFor6Seconds();
	Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,3,6,OR.sTargetFolderPath);
	
	driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
	
	CommonUtility.waitFor6Seconds();

}
			  	  



public static void MerucryFlightFinderEconomy() throws Exception
{
	driver=OR.driver;
	
	driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();

	Select listbox =new Select(driver.
	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	listbox.selectByVisibleText("2");
	
	Select listbox1 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
    listbox1.selectByVisibleText("London");
		
	Select listbox2 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	listbox2.selectByVisibleText("February");
		
	Select listbox3 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	listbox3.selectByVisibleText("10");
				
	Select listbox4 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	listbox4.selectByVisibleText("Paris");	
	
	Select listbox5 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	listbox5.selectByVisibleText("March");
				
	Select listbox6 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	listbox6.selectByVisibleText("14");
	
	driver.findElement(By.xpath(OR.MFFPage_EconomyclassRadioButton)).click();
	
	Select listbox7 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	listbox7.selectByVisibleText("Unified Airlines");
	
	
	
	//Screenshot2
	CommonUtility.waitFor6Seconds();
	Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,3,6,OR.sTargetFolderPath);
	
	driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
	
	CommonUtility.waitFor6Seconds();

}
	
public static void MerucryFlightFinderFirst() throws Exception
{
	driver=OR.driver;
	
	driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();

	Select listbox =new Select(driver.
	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	listbox.selectByVisibleText("2");
	
	Select listbox1 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
    listbox1.selectByVisibleText("London");
		
	Select listbox2 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	listbox2.selectByVisibleText("February");
		
	Select listbox3 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	listbox3.selectByVisibleText("10");
				
	Select listbox4 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	listbox4.selectByVisibleText("Paris");	
	
	Select listbox5 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	listbox5.selectByVisibleText("March");
				
	Select listbox6 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	listbox6.selectByVisibleText("14");
	
	driver.findElement(By.xpath(OR.MFFPage_FirstClassRadioButton)).click();
	
	Select listbox7 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	listbox7.selectByVisibleText("Unified Airlines");
	
	
	
	//Screenshot2
	CommonUtility.waitFor6Seconds();
	Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,3,6,OR.sTargetFolderPath);
	
	driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
	
	CommonUtility.waitFor6Seconds();
	

}    
					  
	
}
