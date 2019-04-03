package DharmajaDriverScript;

import org.testng.annotations.Test;
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

public class FlipKart1 {
	
	
    public static String baseUrl = "https://www.flipkart.com";
    static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    static WebDriver driver ; 

  
  @BeforeTest
  public void setBaseURL() {
	  
	  
	  FlipkartOpenBrowser();
	  FlipkartLogin();
	  FlipkartLogout();
	  FlipkartCloseBrowser();
	  
  }
  
    @Test
    public static void FlipkartOpenBrowser()
    {
    	System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver = new ChromeDriver(); 	 
    	 driver.get(baseUrl);
    	 driver.manage().window().maximize() ;
  }
    
    
    @Test
    public static void FlipkartLogin()
    {
    	 driver.findElement(By.xpath(" //input[@type='text' and @autocomplete='off'  and @class='_2zrpKA']")).sendKeys("sudhakarth2008@gmail.com");
    		
         driver.findElement(By.xpath(" //input[@type='password' and  @autocomplete='off' and @class='_2zrpKA _3v41xv']")).sendKeys("babli1234");
         driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
     
  }  
    
    @Test
    public static void FlipkartLogout()
    {
    	
    	try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
   
    	 Actions actions = new Actions(driver);
    	 
    	WebElement ele1=driver.findElement(By.xpath("//div[@class='_2cyQi_']"));
		new WebDriverWait(driver,9900000).until(ExpectedConditions.visibilityOf(ele1));	 
		actions.moveToElement(ele1).perform();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
   
		
		WebElement ele2=driver.findElement(By.xpath("//*[text()='Logout']"));
		new WebDriverWait(driver, 9900000).until(ExpectedConditions.visibilityOf(ele2));	 
		actions.moveToElement(ele2).click().build().perform();
  }  
    
    @Test
    public static void FlipkartCloseBrowser()
    {
    	driver.quit();
    	try {
			ExcelApiTest3 eat = new ExcelApiTest3();
			eat.PassPutCellData("E://Regression1.xls","Sheet1",3,3, "PASS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
  }  

}
