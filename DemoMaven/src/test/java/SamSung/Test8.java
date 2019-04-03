package SamSung;
//import MercuryDemoTours;



import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import SamSung.*;

import java.awt.Desktop;
import java.io.*;

import SamSung.*;

public class Test8 {
	

	

	@Test
	@Parameters("Browser")
	public  void TC01(String Browser) throws Exception {
		
			WebDriver driver=null;
		
		   TestHTMLReporter6 TH3 = new TestHTMLReporter6();	  
		   String HtmlOutputFileName= TH3.CretaeHTMLFile("TC01_Add Employee","Chrome");	
			  
	      if(Browser.equalsIgnoreCase("Chrome"))
		  driver=TestBrowser.OpenChromeBrowser();
		  
		  driver.get("http://www.newtours.demoaut.com/");
		  TH3.HTMLScreenShot("Open Mercury Demo tours","	Succefully Opened","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter user Name","User Name Succefully Entered","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter Password","	Password Succefully passed ","Pass", HtmlOutputFileName,driver);

		  TH3.HTMLCloser(HtmlOutputFileName);
		  driver.quit();
	
	}
	
	
	@Test
	@Parameters("Browser")
	public  void TC02(String Browser) throws Exception {
		
			WebDriver driver=null;
		
		   TestHTMLReporter6 TH3 = new TestHTMLReporter6();	  
		   String HtmlOutputFileName= TH3.CretaeHTMLFile("TC02_Add Employee","Chrome");	
			  
	      if(Browser.equalsIgnoreCase("Chrome"))
		  driver=TestBrowser.OpenChromeBrowser();
		  
		  driver.get("http://www.newtours.demoaut.com/");
		  TH3.HTMLScreenShot("Open Mercury Demo tours","	Succefully Opened","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter user Name","User Name Succefully Entered","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter Password","	Password Succefully passed ","Pass", HtmlOutputFileName,driver);

		  TH3.HTMLCloser(HtmlOutputFileName);
		  driver.quit();
	
	}
	
	
	

	@Test
	@Parameters("Browser")
	public  void TC03(String Browser) throws Exception {
		
			WebDriver driver=null;
		
		   TestHTMLReporter6 TH3 = new TestHTMLReporter6();	  
		   String HtmlOutputFileName= TH3.CretaeHTMLFile("TC03_Add Employee","Chrome");	
			  
	      if(Browser.equalsIgnoreCase("Chrome"))
		  driver=TestBrowser.OpenChromeBrowser();
		  
		  driver.get("http://www.newtours.demoaut.com/");
		  TH3.HTMLScreenShot("Open Mercury Demo tours","	Succefully Opened","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter user Name","User Name Succefully Entered","Pass", HtmlOutputFileName,driver);
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter Password","	Password Succefully passed ","Pass", HtmlOutputFileName,driver);

		  TH3.HTMLCloser(HtmlOutputFileName);
		  driver.quit();
	
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

	
	