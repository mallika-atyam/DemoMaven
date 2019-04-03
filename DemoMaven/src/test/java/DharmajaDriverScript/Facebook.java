package DharmajaDriverScript;
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

public class Facebook {
	
    public static String baseUrl = "https://www.facebook.com/";
    static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static WebDriver driver ; 

  @Test
  public static void FaceBookExecution () throws Exception{
	  openBrowser();
	  FBLogin() ;
	  FBLogout() ;
	 CloseBrowser();
  }
 
  
 
	  public static void openBrowser()
	  
	  {
		  
		  	 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver =new ChromeDriver(options);
			 driver.get(baseUrl);
		 	 driver.manage().window().maximize() ;  
		  
	  }
	  
	  //STARTS FBLogin
	  public static void FBLogin() 
	  
	  {
		 
		  
		  try {
		  ExcelApiTest3 eat = new ExcelApiTest3();
		  String Uname=eat.getCellData("E://TC15.xls","Sheet1",1,0);
		  String Pwd=eat.getCellData("E://TC15.xls","Sheet1",1,1);
		 // System.out.println("Uname Values from excel "+Uname);
		
		   driver.findElement(By.xpath(" //*[@id='email'] ")).sendKeys(Uname);
	       driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Pwd);
	       driver.findElement(By.xpath("//input[@value='Log In'  and @aria-label='Log In']")).click();
	       
		  }catch(Exception e) { }
	      

		  try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}  
		  
		  }
	  //End FBLogin
	  
	 //FB Logout 
	  
	  public static void FBLogout() 
	  
	  {
		  driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
		   	
	      try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
	      
	      driver.findElement
	      (By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")).click();
	     
		}  
	  // Ends FBLogout        
  
	  //Starts CloseBrowser
		public static void CloseBrowser()
		{
		  
			driver.quit(); 
		} 
		//Ends CloseBrowser 
	  }
	  
	                                  
