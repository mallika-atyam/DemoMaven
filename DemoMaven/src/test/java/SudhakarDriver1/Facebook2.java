package SudhakarDriver1;

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
 
public class Facebook2

{
public static String baseUrl = "https://www.facebook.com/";
public static  String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
public static WebDriver driver ; 
	 
	 @Test
	 public static void allMethods() throws Exception
	 {
		 // New coded starts
		 // create TC149_FB.xls in E:\Functional TestCases
		 Folders123.FolderCreation("TC149_FB");
		 Facebook2.OpenBlankChromeBrowser();
		 driver=OR.driver;
		 // New coded ends
		 		 
		 Facebook2.OpenFacebookURL();
		 Facebook2.loginBrowser();
		 Facebook2.logoutBrowser();
		 Facebook2.closeBrowser();
		
	 }
	 
	 
	 public static void OpenBlankChromeBrowser() 
	 {
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
	 	 System.setProperty("webdriver.chrome.driver",driverPath);
	 	 driver = new ChromeDriver(options); 
	 	 OR.driver=driver;
	 	 // driver.get(baseUrl);
	 	 driver.manage().window().maximize() ;	
	 }
	 
	 
	 public static void OpenFacebookURL() throws Exception
	 {
		 driver.get(baseUrl);
		 Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,1,6,OR.sTargetFolderPath);
	 }
		  
		 
	public static void loginBrowser() throws Exception
	{
driver.findElement(By.xpath("  //input[@type='email' and @name='email']  "))
.sendKeys("sudhakarth2009@gmail.com");

driver.findElement(By.xpath(" //input[@type='password'  and @name='pass']  ")).sendKeys("babli1234");

Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,2,6,OR.sTargetFolderPath);

driver.findElement(By.xpath(" //input[@type='submit'and @id='u_0_2']  ")).click();
		  
		  Facebook2.waitFor5Seconds();
	  	  
	}
			  
    public static void logoutBrowser() throws Exception
    {
    	
    	 Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,3,6,OR.sTargetFolderPath);
    	driver.findElement(By.xpath(" //div[text()='Account Settings']   ")).click();

    	Facebook2.waitFor5Seconds();
    	 Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,4,6,OR.sTargetFolderPath);
  	  
  	    driver.findElement(By.xpath(" //text()[.='Log Out']/ancestor::span[1]  ")).click();
  	  
  	  
    }
				  
	public static void closeBrowser() throws Exception
	{
		 Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,5,6,OR.sTargetFolderPath);
		 driver.quit();
	}
					  
	public static void waitFor5Seconds() throws Exception
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	}
}
