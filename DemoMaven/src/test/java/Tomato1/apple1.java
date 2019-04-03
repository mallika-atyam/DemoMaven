package Tomato1;



import org.testng.annotations.Test;

import DataProviderTest.ExcelApiTest3;


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

	  public String driverPath = "E:\\seleni\\seleni\\chromedriver_win32\\chromedriver.exe";
	  public  String baseUrl = "http://www.newtours.demoaut.com/";
	  
	  
	  public static String TestName,ExecutionFlag;
		 HashMap<String,String> hMap = new HashMap<>();
		
		 @BeforeTest
		 public  void DatadrivenTest()throws Exception
		 {
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC26.xls","Sheet1");

			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
				 apple1.TestName=eat.getCellData("E://TC26.xls","Sheet1",i,0);
				 apple1.ExecutionFlag=eat.getCellData("E://TC26.xls","Sheet1",i,1);
				 hMap.put(apple1.TestName,apple1.ExecutionFlag);

					System.out.println(" apple1.TestName  is :"+apple1.TestName);
					System.out.println(" apple1.ExecutionFlag  is :"+apple1.ExecutionFlag);
			 }
			 
		

			 
		 }
	  
	  
	  
		
	  @Test  
	  public  void ExecuteSession1()throws Exception
		 {
		  
			 
			 if (hMap.get("TC01").equals("Yes"))
			 {
			 WebDriver driver1 ; 
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver1 = new ChromeDriver(options); 
			 driver1.manage().window().maximize() ;	
			 driver1.get(baseUrl);
			 driver1.close();
			 }
			 
			 
			
			 
		 }
		 
	 @Test  
		 public  void ExecuteSession2()throws Exception
		 {
			 if (hMap.get("TC02").equals("Yes"))
			 {
			 WebDriver driver2 ; 
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver2 = new ChromeDriver(options); 
			 driver2.manage().window().maximize() ;	
			 driver2.get(baseUrl);
			 driver2.close();
			 }
		 }
	 
	 
		 
	  	@Test  
		 public  void ExecuteSession3()throws Exception
		 {
	  		if (hMap.get("TC03").equals("Yes"))
			 {
			 WebDriver driver3 ; 
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver3 = new ChromeDriver(options); 
			 driver3.manage().window().maximize() ;	
			 driver3.get(baseUrl);
			 driver3.close();
			 }
	  		else
	  		{

				 System.out.println("TC03 Test Case Execution Flag is : "+hMap.get("TC03"));
	  		}
		
			 
		 }
		 
		 
}