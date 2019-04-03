package Tomato2;

import org.testng.annotations.Test;

import Tomato2.*;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
import java.lang.reflect.Constructor;
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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import Tomato2.*;

public class MercuryDateDriver implements Runnable {
	
	public WebDriver driver ;
	public  void MercuryDateDriver(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	public  String UserName,Password,PassengersCount,DepartingFrom,DepartingStartMonth,
	DepartingStartDate,ArrivingIn,ReturningEndMonth,ReturningEndDate,Airline,ServiceClass,
	Radiobutton,FirstName,lastName,meal1,CardName,CardNumber,expirymonth,expiryyear;
    
	public  int iRow;
	
	
	public  String BrowserType;
	
	public  String str1="Chrome" + "_Iteration_" + String.valueOf(iRow);
    
    MercuryDateDriver  ( String  UserName,String  Password, String  PassengersCount,
			  String  DepartingFrom, String  DepartingStartMonth,String  DepartingStartDate,
			  String  ArrivingIn,String  ReturningEndMonth, String  ReturningEndDate,
			  String  Airline,String  ServiceClass,String  Radiobutton,
			  String  FirstName,String  lastName,String  meal1,String  CardName,
			  String  CardNumber,String  expirymonth,String  expiryyear,  int iRow ,
			  String BrowserType ,String str1 )
		
    {
    	 this.UserName=UserName;
    	 this.Password=Password;

    	 this.PassengersCount=PassengersCount;
    	 this.DepartingFrom=DepartingFrom; 
    	 this.DepartingStartMonth=DepartingStartMonth;;
    	 this.DepartingStartDate=DepartingStartDate;
    	 this.ArrivingIn=ArrivingIn;
    	 this.ReturningEndMonth=ReturningEndMonth;  
    	 this.ReturningEndDate=ReturningEndDate;
    	 this.Airline=Airline;
    	 this.ServiceClass=ServiceClass;
    	 this.Radiobutton=Radiobutton;

    	 this.FirstName=FirstName;
    	 this.lastName=lastName;
    	 this.meal1=meal1;
    	 this.CardName=CardName;
    	 this.CardNumber=CardNumber;
    	 this.expirymonth=expirymonth;
    	 this.expiryyear=expiryyear; 
    	 this.iRow=iRow;
    	 this.BrowserType=BrowserType;
    	 
    	this.str1=str1;
	}
    
   
    

	@Override
	public void run()  {  
	
		//String str1="";
		
		try {
			  
			
			synchronized(this)
			{
			  if(BrowserType.equals("Chrome"))
			  {
				  
				  driver=TestBrowser.OpenChromeBrowser();
				  Folders123.CreateFolder("TC02",str1);
			   
			  }
			}
			
			  
			  Banana1 Bn1 =new Banana1();
			  Bn1.Banana1(driver);
			  
			  Bn1.openMercuryTours();
			  Bn1.mercurylogin(UserName,Password);
			  
			  synchronized(this)
				{
			 Folders123.takeSnapShot(driver,str1 ,2,6);
				}
			  
		    Banana2 Bn2 =new Banana2();
			Bn2.Banana2(driver);
			Bn2.MerucryFlightFinderBusiness(PassengersCount,DepartingFrom,
					DepartingStartMonth,DepartingStartDate,ArrivingIn,
					ReturningEndMonth,ReturningEndDate,Airline,Radiobutton,
					ServiceClass);
			
			synchronized(this)
			{
			 Folders123.takeSnapShot(driver,str1,3,6);
			}
			
			Banana3 Bn3 =new Banana3();
			Bn3.Banana3(driver);
			Bn3.Page7();
			
			synchronized(this)
			{
			 Folders123.takeSnapShot(driver,str1,4,6);
			}
			
			Banana4 Bn4 =new Banana4();	
			Bn4.Banana4(driver);
			Bn4.Page8(FirstName,lastName,meal1,CardName,
					CardNumber,expirymonth,expiryyear);
			
			synchronized(this)
			{
			 Folders123.takeSnapShot(driver,str1,5,6);
			}
			
			Bn4.GetOutputData(iRow);

			 
			Bn1.wait5seconds();
			driver.quit();
			
			
		    
		} catch (Exception e) {
			e.printStackTrace();
		}// Try - Catch Block ends
		
	} // run block ends here



	
	
	
	
}//Main Program ends here
