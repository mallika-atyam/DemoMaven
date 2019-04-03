//import MercuryDemoTours;

package  DataProviderTest;
import org.testng.annotations.Test;
import DataProviderTest.ExcelDataProvider;

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
 
public class Bubbly
{

	public static WebDriver driver ; 
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static String baseUrl = "http://www.newtours.demoaut.com/";

	 public static String UserName,Password;
	
	/*@Test 
	public static void Hai() throws Exception
	{

	//	Bubbly.openBrowser();
		//Bubbly.mercurylogin();
	}*/
	
	@Test(dataProvider="Authentication1")
	public static void Authentication1(String sTestCaseName,String sUserName,String sPassword) throws Exception
	{
		
		System.out.println(sTestCaseName); 
		System.out.println(sUserName);
		System.out.println(sPassword);
	
	}
	
	@Test(dataProvider="Authentication")
	public static void Authentication1(String sUserName,String sPassword) throws Exception
	{
		
		//System.out.println(sTestCaseName); 
		System.out.println(sUserName);
		System.out.println(sPassword);
	
	}
		 
		 //driver.quit();
		 public static void openBrowser()throws Exception
		 {
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver = new ChromeDriver(options); 
			 
			 OR3.driver=driver;
			 //driver=OR3.driver;
			 driver.manage().window().maximize() ;	
			 driver.get(baseUrl);
		 }
		 
		 public static void mercurylogin()throws Exception
		 {
			 
			 Bubbly.GetInputData();
			 driver.findElement(By.xpath(OR3.MLPage_UserNameTextbox)).sendKeys(Bubbly.UserName);
			 driver.findElement(By.xpath(OR3.MLPage_PasswordTextbox)).sendKeys(Bubbly.Password);
			 driver.findElement(By.xpath(OR3.MLPage_SignInButton)).click();
		 }
		
		 public static void wait5seconds() throws Exception
		 {
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
							e.printStackTrace();
				}
		 }
		 
			public static void GetInputData() throws Exception
			{
	
						ExcelApiTest3 eat = new ExcelApiTest3();
					   Bubbly.UserName=eat.getCellData("E://TC16.xls","Sheet1",1,0);
					   Bubbly.Password=eat.getCellData("E://TC16.xls","Sheet1",1,1);
 
					
			}
			
			 @DataProvider(name = "Authentication")
			 
			  public static Object[][] credentials() {
			 
			        // The number of times data is repeated, test will be executed the same no. of times
			 
			        // Here it will execute two times
			 
			        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
			 
			  }
			 
			 @DataProvider (name = "Authentication1")
			 
			    public static  Object[][] Authentication1() throws Exception{
				 
				// ExcelApiTest3 eat= new ExcelApiTest3();
			 
			         Object[][] testObjArray = ExcelDataProvider.getTableArray("E://Batch2Source//TestData.xls","Sheet1");
			 
			         return (testObjArray); 
			 }
			 
			 
			 
			 
}
			 
			 
			
					 

				 
