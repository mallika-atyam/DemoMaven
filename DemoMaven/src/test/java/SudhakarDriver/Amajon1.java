package SudhakarDriver;

import org.testng.annotations.Test;

import DharmajaDriverScript.ExcelApiTest3;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
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
public class Amajon1 {
	

    public static String baseUrl = "https://www.amazon.in/";
    static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    static WebDriver driver ; 
     //String TestCase1;
   //  String TestClassName="TC147_Amazon";
    
  
  @Test
  public static void setBaseURL(){
  	
  	
	 // OpenBrowser();
	 //HelloSignIn();
	//  Login();
	//  Logout();
	 // CloseBrowser() ;
   	 
 }


 public static void OpenBrowser() 
 {
	
 	 System.setProperty("webdriver.chrome.driver",driverPath);
 	 driver = new ChromeDriver(); 
 	 driver.get(baseUrl);
 	 driver.manage().window().maximize() ;	 
 	 
 	
 }
  
  

 public static void CloseBrowser() 
 {
	 
	 driver.quit();
			
			try {
				ExcelApiTest3 eat = new ExcelApiTest3();
				eat.PassPutCellData("E://Regression1.xls","Sheet1",6,3, "PASS");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	 
	 
 }
 

 public static void HelloSignIn()
 {
	 
	  Actions actions = new Actions(driver);
	  WebElement ele=driver.findElement(By.xpath("//*[text()='Hello. Sign in']"));
	  new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele));	 
	  actions.moveToElement(ele).click().build().perform();
	 
 }
 

 public static  void Login()
 {
	   driver.findElement(By.xpath(" //input[@type='email' and @maxlength='128' and  @id='ap_email' and  @name='email']")).sendKeys("sudhakarth2008@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("babli1234");
	   driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
 }
  

 public static void Logout()
 {
	 
	  Actions actions = new Actions(driver);
	    WebElement ele1=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]"));
		new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele1));	 
		actions.moveToElement(ele1).perform();

		WebElement ele2=driver.findElement(By.xpath("//*[text()='Sign Out']"));
		new WebDriverWait(driver, 1990000000).until(ExpectedConditions.visibilityOf(ele2));	 
		actions.moveToElement(ele2).click().build().perform();
 }
  

}
