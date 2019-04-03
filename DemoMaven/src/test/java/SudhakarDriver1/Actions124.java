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

public class Actions124 {
	
	//public static String baseUrl = "https://www.facebook.com/";
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static WebDriver driver ; 
	public static String sTargetTestCaseExcelPath="",sTargetFolderPath="";
	
	
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
	 
	 // starts TC147_Amazon folder creation  
	public static void TC147_Amazon()
	{
		OR.sTestCaseName="TC147_Amazon";
		System.out.println("Amazon Execution started");	
		
	    // TC147_Amazon folder creation starts
		Folders123.CreateFolder(OR.sTestCaseName);
		System.out.println("AT 95 Line");
		try {
				List<String> Myarray1 = Folders123.Hello(OR.sTestCaseName); // KeyImp
				OR.sTargetTestCaseExcelPath=Myarray1.get(0);
				OR.sTargetFolderPath=Myarray1.get(1);
				System.out.println("AT 100 Line");
				}catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	 // TC147_Amazon folder creation ends
	
	
	
		
	
	public static void OpenBrowserURL() 
	 {
		Folders123.FolderCreation("TC147_Amazon");
		Actions124.OpenBlankChromeBrowser();
		Amajon.OpenAmajonURL();
	 }
	
	
	public static void OpenBrowserURLTC148() 
	 {
	
		Folders123.FolderCreation("TC148_Amazon");
		Actions124.OpenBlankChromeBrowser();
		Amajon.OpenAmajonURL();
	 }
	
	
	public static void CloseBrowser() throws Exception
	 {	
		CommonUtility.CloseBrowser();
	 }
	
	
}