package Tomato2;

import org.testng.annotations.Test;



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

public class MercuryDataDriverExecute extends TestBrowser
{

	
	WebDriver driver;
	public  void MercuryLogin(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	 @Test  
	 public  static void Execute_Sessions(String BrowserType) throws Exception
	 {

		    int MYTHREADS = 30;
		    ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		     ExcelApiTest3 eat = new ExcelApiTest3();
	
			 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");

			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
		
				 
				String UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
				String Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);	 	

				String PassengersCount=eat.getCellData("E://TC25.xls","Sheet1",i,2);	
				String DepartingFrom=eat.getCellData("E://TC25.xls","Sheet1",i,3);	
				String DepartingStartMonth=eat.getCellData("E://TC25.xls","Sheet1",i,4);	
				String DepartingStartDate=eat.getCellData("E://TC25.xls","Sheet1",i,5);	
				String ArrivingIn=eat.getCellData("E://TC25.xls","Sheet1",i,6);	
				String ReturningEndMonth=eat.getCellData("E://TC25.xls","Sheet1",i,7);	
				String ReturningEndDate=eat.getCellData("E://TC25.xls","Sheet1",i,8);	
				String Airline=eat.getCellData("E://TC25.xls","Sheet1",i,9);
				 
				String ServiceClass=eat.getCellData("E://TC25.xls","Sheet1",i,10);	
				String Radiobutton=eat.getCellData("E://TC25.xls","Sheet1",i,11); 
				String FirstName=eat.getCellData("E://TC25.xls","Sheet1",i,12);
				String lastName=eat.getCellData("E://TC25.xls","Sheet1",i,13);
				String meal1=eat.getCellData("E://TC25.xls","Sheet1",i,16);
				String CardName=eat.getCellData("E://TC25.xls","Sheet1",i,14);
				String CardNumber=eat.getCellData("E://TC21.xls","Sheet1",i,15);
				String expirymonth=eat.getCellData("E://TC25.xls","Sheet1",i,17);
				String expiryyear=eat.getCellData("E://TC25.xls","Sheet1",i,18);
				
				
				   
				 int iRow=i;
				 
				 String str1="Chrome" + "_Iteration_" + String.valueOf(iRow);
				 
				 Runnable worker = new MercuryDateDriver( UserName, Password,  PassengersCount,
							   DepartingFrom,  DepartingStartMonth, DepartingStartDate,
							   ArrivingIn, ReturningEndMonth,  ReturningEndDate,
							   Airline, ServiceClass, Radiobutton,
							   FirstName, lastName, meal1, CardName,
							   CardNumber, expirymonth, expiryyear,   iRow ,BrowserType,str1
							  );
				 
				   executor.execute(worker);
				  	
			 }
		     
		     
			 
			 
			 
			executor.shutdown();
			// Wait until all threads are finish
			while (!executor.isTerminated()) {
	 
			}
			System.out.println("\nFinished all threads");
			
			
		}  //@Test Close
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @Test  
	 public static void Execute_onebyone(int i,	String BrowserType) throws Exception
	 {

		    int MYTHREADS = 30;
		    ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		     ExcelApiTest3 eat = new ExcelApiTest3();
	
			// int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");
 
				String UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
				String Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);	 	

				String PassengersCount=eat.getCellData("E://TC25.xls","Sheet1",i,2);	
				String DepartingFrom=eat.getCellData("E://TC25.xls","Sheet1",i,3);	
				String DepartingStartMonth=eat.getCellData("E://TC25.xls","Sheet1",i,4);	
				String DepartingStartDate=eat.getCellData("E://TC25.xls","Sheet1",i,5);	
				String ArrivingIn=eat.getCellData("E://TC25.xls","Sheet1",i,6);	
				String ReturningEndMonth=eat.getCellData("E://TC25.xls","Sheet1",i,7);	
				String ReturningEndDate=eat.getCellData("E://TC25.xls","Sheet1",i,8);	
				String Airline=eat.getCellData("E://TC25.xls","Sheet1",i,9);
				 
				String ServiceClass=eat.getCellData("E://TC25.xls","Sheet1",i,10);	
				String Radiobutton=eat.getCellData("E://TC25.xls","Sheet1",i,11); 
				String FirstName=eat.getCellData("E://TC25.xls","Sheet1",i,12);
				String lastName=eat.getCellData("E://TC25.xls","Sheet1",i,13);
				String meal1=eat.getCellData("E://TC25.xls","Sheet1",i,16);
				String CardName=eat.getCellData("E://TC25.xls","Sheet1",i,14);
				String CardNumber=eat.getCellData("E://TC21.xls","Sheet1",i,15);
				String expirymonth=eat.getCellData("E://TC25.xls","Sheet1",i,17);
				String expiryyear=eat.getCellData("E://TC25.xls","Sheet1",i,18);
				   
				 int iRow=i;
				 
			
				 String str1="Chrome" + "_Iteration_" + String.valueOf(iRow);
				   
				 Runnable worker = new MercuryDateDriver( UserName, Password,  PassengersCount,
							   DepartingFrom,  DepartingStartMonth, DepartingStartDate,
							   ArrivingIn, ReturningEndMonth,  ReturningEndDate,
							   Airline, ServiceClass, Radiobutton,
							   FirstName, lastName, meal1, CardName,
							   CardNumber, expirymonth, expiryyear,   iRow,BrowserType ,str1
							  );
				 
				   executor.execute(worker);
				  	
	
		     
			 
			 
			 
			executor.shutdown();
			// Wait until all threads are finish
			while (!executor.isTerminated()) {
	 
			}
			System.out.println("\nFinished all threads");
			
			
		}  //@Test Close	 
	 
	 
	 
	 
	 
	 
	 
	 
	}	//Session1 Close

