package DemoMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

import org.apache.commons.io.FileUtils;
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

public class FacebookLoginPage3 {
	
   
     WebDriver driver ; 
    

     //LogoutMenuInvoke,Logout;
	    
	 public  FacebookLoginPage3(WebDriver driver) throws IOException
	 {
		  this.driver=driver;
		  
	  }  
		 
    public void LoginFaceBook(String UserName,String Password )
    {
    	
    	 driver.findElement(By.xpath(OR.EmailTextBox)).sendKeys(UserName);
         driver.findElement(By.xpath(OR.PasswordTextBox)).sendKeys(Password);
         driver.findElement(By.xpath(OR.LoginButton)).click();
         
         try 
         {
 			Thread.sleep(6000);
 		 } 
         catch (InterruptedException e) 
         {
 			e.printStackTrace(); 
 		 }
         
    	
    }
    
  ///starts
    public  void  HighlightElement() {
        WebElement elem =  driver.findElement(By.xpath(OR.EmailTextBox));
        
        // draw a border around the found element
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
        }
        
        
 WebElement elem1 =  driver.findElement(By.xpath(OR.PasswordTextBox));
        
        // draw a border around the found element
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem1);
        }
       
        
 WebElement elem2 =  driver.findElement(By.xpath(OR.LoginButton));
        
        // draw a border around the found element
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem2);
        }
        
       
    }
    
  //ends

}
