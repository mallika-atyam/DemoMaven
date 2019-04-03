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
 
public class apple2

{

	 
	  public  String baseUrl1 = "http://www.newtours.demoaut.com/";
	  public String baseUrl2 = "https://www.facebook.com/";
	  public String baseUrl3 = "https://www.amazon.in/";
	  
	  public static String TestName,ExecutionFlag,TestGroup,TestExecutionStatus,TestExecutionDateTime,
	  Comments,ChromeBrowser,ChromeBrowserPath,IEBrowser,IEBrowserPath,FireFoxBrowser,FireFoxBrowserPath,
	  OperatingSystem, RemoteorLocalDriver ,NodeId;
	
	  
	  
		 Map<String, List <String>> hMap = new HashMap<String , List<String>>();
		
		 @BeforeTest
		 public  void DatadrivenTest()throws Exception
		 {
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC26.xls","Sheet1");

			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
				 apple2.TestName=eat.getCellData("E://TC26.xls","Sheet1",i,0);
				 apple2.ExecutionFlag=eat.getCellData("E://TC26.xls","Sheet1",i,1);
				 apple2.TestGroup=eat.getCellData("E://TC26.xls","Sheet1",i,2);
				 
				 apple2.ChromeBrowser=eat.getCellData("E://TC26.xls","Sheet1",i,3);
				 apple2.ChromeBrowserPath=eat.getCellData("E://TC26.xls","Sheet1",i,4);
				 apple2.IEBrowser=eat.getCellData("E://TC26.xls","Sheet1",i,5);
				 apple2.IEBrowserPath=eat.getCellData("E://TC26.xls","Sheet1",i,6);
				 apple2.FireFoxBrowser=eat.getCellData("E://TC26.xls","Sheet1",i,7);
				 apple2.FireFoxBrowserPath=eat.getCellData("E://TC26.xls","Sheet1",i,8);
				 
				 apple2.OperatingSystem=eat.getCellData("E://TC26.xls","Sheet1",i,9);
				 apple2.RemoteorLocalDriver=eat.getCellData("E://TC26.xls","Sheet1",i,10);
				 apple2.NodeId=eat.getCellData("E://TC26.xls","Sheet1",i,11);
				 
				 apple2.TestExecutionStatus=eat.getCellData("E://TC26.xls","Sheet1",i,12);
				 apple2.TestExecutionDateTime=eat.getCellData("E://TC26.xls","Sheet1",i,13);
				 apple2.Comments=eat.getCellData("E://TC26.xls","Sheet1",i,14);
				 
				 List<String> values = new ArrayList<String>();
				 values.add(apple2.ExecutionFlag); //0
				 values.add(apple2.TestGroup);  // 1
			
				 values.add(apple2.ChromeBrowser); // 2
				 values.add(apple2.ChromeBrowserPath); //3
				 values.add(apple2.IEBrowser);//4
				 values.add(apple2.IEBrowserPath);//5
				 values.add(apple2.FireFoxBrowser);//6
				 values.add(apple2.FireFoxBrowserPath);//7
				 values.add(apple2.OperatingSystem);//8
				 values.add(apple2.RemoteorLocalDriver);//9
				 values.add(apple2.NodeId);//10
				 
				 values.add(apple2.TestExecutionStatus);//11
				 values.add(apple2.TestExecutionDateTime);//12
				 values.add(apple2.Comments);//13
				 
				 
				 hMap.put(apple2.TestName,values);

			System.out.println(" apple1.TestName  is :"+apple2.TestName);				
			System.out.println(" apple1.Test Name Parameters are  is :"+hMap.get(apple2.TestName));
			 
		} //for loop ends
			 
		 
	//System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(0));
	//System.out.println(" apple1.TestName TC01 Group  is :"+hMap.get("TC01").get(1));
	//System.out.println(" apple1.TestName TC01 ChromeBrowser Flag is :"+hMap.get("TC01").get(2));
			
} //Test Method ends
	  
	  
	
	/*	
	  @Test  
	  public  void ExecuteSession1()throws Exception
		 {
		  
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(0));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(2));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(8));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(9));
		 // System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(3));
			 
		  	if(hMap.get("TC01").get(0).contains("ExecutionFlagYes") && 
			hMap.get("TC01").get(2).contains("ChromeYes")  &&
			hMap.get("TC01").get(8).contains("Windows7") &&
			hMap.get("TC01").get(9).contains("LocalDriver")
			) 
		  		
			 {
		  		
			 WebDriver driver1 ; 
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 
			 //hMap.get("TC01").get(3);Chrome DriverPath
			 System.setProperty("webdriver.chrome.driver",hMap.get("TC01").get(3));
			 driver1 = new ChromeDriver(options); 
			 driver1.manage().window().maximize() ;	
			 driver1.get(baseUrl1);
			
			 // Take screenshot and store as a file format
			 File src= ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
			 try {
			  // now copy the  screenshot to desired location using copyFile //method
			 FileUtils.copyFile(src, new File("C:/selenium/TC01.png"));
			 }catch (IOException e){System.out.println(e.getMessage()); }
			 
			 
			 driver1.close();
			 }  // If Conditions ends
			 
		 }	//ExecuteSession1 Chrome Ends
	  
	  */
	  
	 ///////////////////////////////////////////////////////
	/*  @Test  
	  public  void ExecuteSession2()throws Exception
		 {
		  
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(0));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(2));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(8));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(9));
		 // System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(3));
			 
		  	if(hMap.get("TC01").get(0).contains("ExecutionFlagYes") && 
			hMap.get("TC01").get(2).contains("ChromeYes")  &&
			hMap.get("TC01").get(8).contains("Windows7") &&
			hMap.get("TC01").get(9).contains("LocalDriver")
			) 
		  		
			 {
		  		
			 WebDriver driver2 ; 
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 
			 //hMap.get("TC01").get(3);Chrome DriverPath
			 System.setProperty("webdriver.chrome.driver",hMap.get("TC01").get(3));
			 driver2 = new ChromeDriver(options); 
			 driver2.manage().window().maximize() ;	
			 driver2.get(baseUrl2);
			
			 // Take screenshot and store as a file format
			 File src= ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
			 try {
			  // now copy the  screenshot to desired location using copyFile //method
			 FileUtils.copyFile(src, new File("C:/selenium/TC01.png"));
			 }catch (IOException e){System.out.println(e.getMessage()); }
			 
			 
			 driver2.close();
			 }  // If Conditions ends
			 
		 }	//ExecuteSession1 Chrome Ends
	  
	  */
	  
	  //////////////////////////////////////////////////
	  
			 
			 

 @SuppressWarnings("deprecation")
@Test  
	  public  void ExecuteSession2()throws Exception
		 {
		  
		 System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(0));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(4));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(8));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(9));
		  System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(3));
			 
		  	if(hMap.get("TC01").get(0).contains("ExecutionFlagYes") && 
			hMap.get("TC01").get(4).contains("IEYes")  &&
			hMap.get("TC01").get(8).contains("Windows7") &&
			hMap.get("TC01").get(9).contains("LocalDriver")
			) 
		  		
			 {
		  		
			 WebDriver driver2 ; 
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();	
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

			 System.setProperty("webdriver.ie.driver",hMap.get("TC01").get(5));

			 driver2 = new InternetExplorerDriver(capabilities);
			 
			 
			 
			 
			 driver2.manage().window().maximize() ;	
			 driver2.get(baseUrl2);
			
			 // Take screenshot and store as a file format
			 File src= ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
			 try {
			  // now copy the  screenshot to desired location using copyFile //method
			 FileUtils.copyFile(src, new File("C:/selenium/TC01.png"));
			 }catch (IOException e){System.out.println(e.getMessage()); }
			 
			 Thread.sleep(7000);
			 driver2.close();
			 }  // If Conditions ends
			 
		 }	//ExecuteSession1 Chrome Ends
			 
			 
	  

	 
	  
	  
	 
		 
}