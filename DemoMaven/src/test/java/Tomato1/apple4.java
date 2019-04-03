package Tomato1;



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
 
public class apple4

{

	 
	  public  String baseUrl1 = "http://www.newtours.demoaut.com/";
	  public String baseUrl2 = "https://www.facebook.com/";
	  public String baseUrl3 = "https://www.amazon.in/";
	  
	  //public  String baseUrl = "https://www.facebook.com/";
	 
	  public String ChromedriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	  public String IEdriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
	  public String FirefoxdriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\geckodriver-v0.24.0-win64\\geckodriver.exe";
	  
	  public static String TestName,ExecutionFlag,TestPriority,TestGroup,TestExecutionStatus,TestExecutionDateTime,
	  Comments,ChromeBrowser,ChromeBrowserPath,IEBrowser,IEBrowserPath,FireFoxBrowser,FireFoxBrowserPath,
	  OperatingSystem, RemoteorLocalDriver ,NodeId;
	
	  
	  
		 Map<String, List <String>> hMap = new HashMap<String , List<String>>();
		
		 @BeforeTest
		 public  void DatadrivenTest()throws Exception
		 {
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC27.xls","Sheet1");

			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
				 apple4.TestName=eat.getCellData("E://TC27.xls","Sheet1",i,0);
				 apple4.ExecutionFlag=eat.getCellData("E://TC27.xls","Sheet1",i,1);
				 
				 apple4.TestPriority=eat.getCellData("E://TC27.xls","Sheet1",i,2);
				 apple4.TestGroup=eat.getCellData("E://TC27.xls","Sheet1",i,3);
				 apple4.ChromeBrowser=eat.getCellData("E://TC27.xls","Sheet1",i,4);
				 apple4.IEBrowser=eat.getCellData("E://TC27.xls","Sheet1",i,5);
				 apple4.FireFoxBrowser=eat.getCellData("E://TC27.xls","Sheet1",i,6);
				
				 
				 List<String> values = new ArrayList<String>();
				 values.add(apple4.ExecutionFlag); //0
				 values.add(apple4.TestPriority); //1
				 values.add(apple4.TestGroup);  // 2
				 values.add(apple4.ChromeBrowser); // 3
				 values.add(apple4.IEBrowser);//4
				 values.add(apple4.FireFoxBrowser);//5
				 hMap.put(apple4.TestName,values);

			System.out.println(" apple1.TestName  is :"+apple4.TestName);				
			System.out.println(" apple1.Test Name Parameters are  is :"+hMap.get(apple4.TestName));
			 
		} //for loop ends
			 
		 
	System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(0));
	System.out.println(" apple1.TestName TC01 TestPriority   is :"+hMap.get("TC01").get(1));
	System.out.println(" apple1.TestName TC01 TestGroup   is :"+hMap.get("TC01").get(2));
	
	System.out.println(" apple1.TestName TC01 Chrome  is :"+hMap.get("TC01").get(3));
	System.out.println(" apple1.TestName TC01 IE  is :"+hMap.get("TC01").get(4));
	System.out.println(" apple1.TestName TC01 Firefox  is :"+hMap.get("TC01").get(5));
	//System.out.println(" apple1.TestName TC01 ChromeBrowser Flag is :"+hMap.get("TC01").get(2));
			
} //Test Method ends
		 
			
		  @Test  
		  public  void ExecuteSession1()throws Exception
			 {
 
				 if (hMap.get("TC01").get(0).equals("Yes")  && hMap.get("TC01").get(3).equals("Yes") )
				 {
				 WebDriver driver1 ; 
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-notifications");
				 System.setProperty("webdriver.chrome.driver",ChromedriverPath);
				 driver1 = new ChromeDriver(options); 
				 driver1.manage().window().maximize() ;	
				 driver1.get(baseUrl1);
				 driver1.close();
				 }
				 
				 if (hMap.get("TC01").get(0).equals("Yes")  && hMap.get("TC01").get(4).equals("Yes") )
				 {
				 WebDriver driver1 ; 
				 System.setProperty("webdriver.ie.driver",IEdriverPath);
				 driver1 = new InternetExplorerDriver();
				 driver1.manage().window().maximize() ;	
				 driver1.get(baseUrl1);
				 driver1.close();
				 }
				 
			    if (hMap.get("TC01").get(0).equals("Yes")  && hMap.get("TC01").get(5).equals("Yes") )
				 {
				 WebDriver driver1 ; 
				 System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 driver1 = new FirefoxDriver();
				 driver1.manage().window().maximize() ;	
				 driver1.get(baseUrl1);
				 driver1.close();
				 }

				 
				 
		 
			 }
		
	  
	  
}