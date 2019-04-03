package apple;
//import MercuryDemoTours;


import org.testng.annotations.Test;
import DataProviderTest.ExcelApiTest3;

import subha.Facebook2;

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
 
public class apple1

{
	public static WebDriver driver ; 
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static String baseUrl = "http://www.newtours.demoaut.com/";
	
	public static String UserName,Password;
	
	
	@Test
	
	 public static void DatadrivenTest()throws Exception
	 {
		 ExcelApiTest3 eat = new ExcelApiTest3();
		 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");

		 for(int i=1;i<2;i++)
		 {	 
			 apple1.UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
			 apple1.Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);	 	
			 apple1.allmethods();	
		 }
	 }
		 public static void allmethods()throws Exception
		 {
			 apple1.openBrowser();
			 apple1.mercurylogin(apple1.UserName,apple1.Password);
			 apple1.CloseBrowser();
			 
		 }
		 public static void openBrowser()throws Exception
		 {
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 apple1.driver = new ChromeDriver(options); 
			 apple1.driver.manage().window().maximize() ;	
			 apple1.driver.get(baseUrl);
		
			 
		 }
		 public static void mercurylogin(String Username,String Password)throws Exception
		 {
			 
			 
	
			 apple1.driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys(Username);
			 apple1.driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys(Password);
			
			 apple1.driver.findElement(By.xpath(OR.MLPage_SignInButton)).click();
			 apple1.wait5seconds();
		 }
		 
		 public static void wait5seconds() throws Exception
		 {
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
							e.printStackTrace();
				}
		 }
		 
		 public static void CloseBrowser() throws Exception
		 {
			 apple1.wait5seconds();
			 apple1.driver.quit();
		 }
		 
	 }
	


	
	