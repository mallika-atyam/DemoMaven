package Tomato2;

import org.testng.annotations.Test;

import Tomato1.Folders123;

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

import Tomato2.TestBrowser;
 
public class TC02 extends TestBrowser

{
	
	WebDriver driver;
	public  void TC02(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
		  
	 @Test
	  public void TC02_Chrome() throws Exception
	  {
		   TC02 test2 = new TC02();
		   test2.TC02_Allmethods("Chrome");
	  }
	 
	/* @Test
	 public void TC02_IE() throws Exception
	  {
		   TC02 test2 = new TC02();
		   test2.TC02_Allmethods("IE");
	  }
	
	 @Test
	 public void TC02_Firefox() throws Exception
	  {
		   TC02 test2 = new TC02();
		   test2.TC02_Allmethods("Firefox");
	  }
	 	*/
	 	
		  
		  
		public  void TC02_Allmethods(String BrowserType) throws Exception
		  {
		     
			      if(BrowserType.equals("Chrome"))
			      {
				  Folders123.CreateFolder("TC02","Chrome");
				  driver=TestBrowser.OpenChromeBrowser();
				  TC02 test2 = new TC02();
				  test2.TC02(driver);
			      }
			      
			      if(BrowserType.equals("IE"))
			      {
				  Folders123.CreateFolder("TC02","IE");
				  driver=TestBrowser.OpenIEBrowser();
				  TC02 test2 = new TC02();
				  test2.TC02(driver);
			      }
			      
			      if(BrowserType.equals("Firefox"))
			      {
				  Folders123.CreateFolder("TC02","Firefox");
				  driver=TestBrowser.OpenFirefoxBrowser();
				  TC02 test2 = new TC02();
				  test2.TC02(driver);
			      }
				  
				  
				  
			 
			  
			  String baseUrl1 = "http://www.newtours.demoaut.com/";
			  driver.get(baseUrl1);
			  
			  Folders123.takeSnapShot(driver,"TC02",2,6);
			  // comm.takeFullPageScreenShot();
			 
			  CommonUtility comm = new CommonUtility();
			  comm.CommonUtility(driver);
			  
			   comm.CloseBrowser();
	
		  }
		  
		
			
	  
}