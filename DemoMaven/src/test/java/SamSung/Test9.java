package SamSung;
//import MercuryDemoTours;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//import MercuryDemoTours.OR;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import SamSung.*;

import java.awt.Desktop;
import java.io.*;

//import SamSung.*;


public class Test9 {
	

	WebDriver driver;
	TestHTMLReporter6 TH3 = new TestHTMLReporter6();	
	String HtmlOutputFileName;
	String error;

	@Test
	public  void MyHtm4() throws Exception {
		
		 
		  try {
		        
		 HtmlOutputFileName= TH3.CretaeHTMLFile("TC07_Add Employee","Chrome");
		  
		 // System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		   driver=TestBrowser.OpenChromeBrowser();
				  
		  driver.get("http://www.newtours.demoaut.com/");
		  TH3.HTMLScreenShot("Open Mercury Demo tours","	Succefully Opened","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter user Name","User Name Succefully Entered","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter Password","	Password Succefully passed ","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_SignInButton)).click();
		 
		  
		  
		  
		  
		WebElement ele=  driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton));
		  
		if(ele.isDisplayed())
		{
			
			MerucryFlightFinderFirst() ;
			TH3.HTMLScreenShot("Login Success ","	Navigated to  Flight Finder Page  ","Pass", HtmlOutputFileName,driver);
		}
		else
		{
			
			TH3.HTMLScreenShot("Login Failed ","	Invalid Credentials  ","Fail", HtmlOutputFileName,driver);
		
		}


		  
	} catch (NoSuchElementException e) {
			  
			 error=  e.getMessage();
			TH3.HTMLScreenShot(error,error,"Fail", HtmlOutputFileName,driver);
		
			
		    	
	 }
		  
	  
		  
     finally
     {
    	 
    	 
    		 
         TH3.HTMLCloser(HtmlOutputFileName); 
    	 driver.quit();
     }
		  
	
	}

	
public  void MerucryFlightFinderFirst() throws Exception
{

	
	driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();
	
	TH3.HTMLScreenShot("One Way Selected","	Successfully Selected  ","Pass", HtmlOutputFileName,driver);

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
	
	Select listbox5 =new Select(driver.findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	listbox5.selectByVisibleText("March");
				
	Select listbox6 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	listbox6.selectByVisibleText("14");
	
	driver.findElement(By.xpath(OR.MFFPage_FirstClassRadioButton)).click();
	
	Select listbox7 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	listbox7.selectByVisibleText("Unified Airlines");
	
	
}    
					  
	

	

@BeforeSuite
public void suiteSetup1() throws Exception {
	
	 String xlsFile="C://HTML Report//HtmlTemplates//TC05.xls";
	 String xlsFileSheet="Sheet1";
	 
	 ExcelApiTest3 eat = new ExcelApiTest3();
	 eat.clearsheetdata(xlsFile,xlsFileSheet);
}  	

@AfterSuite
public void AftersuiteSetup2() throws Exception {
	 
	 TestHTMLReporter6 TH5 = new TestHTMLReporter6();	
	 TH5.Regression_CretaeHTMLFile();
	
	
}    
		
			
	
}

	
	