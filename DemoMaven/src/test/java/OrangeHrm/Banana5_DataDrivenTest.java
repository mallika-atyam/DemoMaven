//import MercuryDemoTours;

package  OrangeHrm;
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
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
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
import Tomato5.*;


public class Banana5_DataDrivenTest
{
		
		 WebDriver driver;
		 public  void Banana5_DataDrivenTest(WebDriver driver )throws Exception
		 {  
			 this.driver=driver;

		 }
		
		public    String  UserName,  Password,   PassengersCount,
		 DepartingFrom,   DepartingStartMonth,  DepartingStartDate,
		    ArrivingIn,  ReturningEndMonth,   ReturningEndDate,
		    Airline,  ServiceClass,  Radiobutton,
		    FirstName,  lastName,  meal1,  CardName,
		    CardNumber,  expirymonth,  expiryyear; 
		    
		public  int iRow;
		
//	public final boolean str=true;
	//	enabled=str	 
		
@Test()
public void DataDrivenTest_Chrome() throws Exception
{

     ExcelApiTest3 eat = new ExcelApiTest3();
	 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");

		 for(int i=1;i<numberowsInputdata;i++)
		 {		 
					 UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
					 Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);		 		
					 PassengersCount=eat.getCellData("E://TC25.xls","Sheet1",i,2);		
					 DepartingFrom=eat.getCellData("E://TC25.xls","Sheet1",i,3);		
					 DepartingStartMonth=eat.getCellData("E://TC25.xls","Sheet1",i,4);		
					 DepartingStartDate=eat.getCellData("E://TC25.xls","Sheet1",i,5);		
					 ArrivingIn=eat.getCellData("E://TC25.xls","Sheet1",i,6);		
					 ReturningEndMonth=eat.getCellData("E://TC25.xls","Sheet1",i,7);		
					 ReturningEndDate=eat.getCellData("E://TC25.xls","Sheet1",i,8);		
					 Airline=eat.getCellData("E://TC25.xls","Sheet1",i,9);
					 ServiceClass=eat.getCellData("E://TC25.xls","Sheet1",i,10);		
					 Radiobutton=eat.getCellData("E://TC25.xls","Sheet1",i,11); 			 
					 FirstName=eat.getCellData("E://TC25.xls","Sheet1",i,12);
					 lastName=eat.getCellData("E://TC25.xls","Sheet1",i,13);
					 CardName=eat.getCellData("E://TC25.xls","Sheet1",i,14);
					 CardNumber=eat.getCellData("E://TC21.xls","Sheet1",i,15);
					 meal1=eat.getCellData("E://TC25.xls","Sheet1",i,16);
					 expirymonth=eat.getCellData("E://TC25.xls","Sheet1",i,17);		
					 expiryyear=eat.getCellData("E://TC25.xls","Sheet1",i,18);	
					 iRow=i;
					 call_allmethods(iRow);
		 }	
		 
		 Banana5 Bn5 =new Banana5();		
		 Bn5.Banana5(driver);
		 driver.quit();
}



public void call_allmethods(int iRow) throws Exception
{
	
	Folders123 F1= new Folders123();
	String str1="TC06"+"_Chrome" + "_Iteration_" + String.valueOf(iRow);
	
	System.out.println("str1 values is "+str1);
	
	 List<String> Myarray1 = F1.CreateFolder("TC06",str1); 
	  F1.sTargetTestCasePath=Myarray1.get(0);
	  F1.FolderPath=Myarray1.get(1);
	  System.out.println(" Myarray1.get(0) "+Myarray1.get(0));
	  System.out.println(" Myarray1.get(1) "+Myarray1.get(1)); 
	
		if(iRow==1) 
		{
			driver=TestBrowser.OpenChromeBrowser();
   
		}
		 
		
		  Login Bn1 =new Login();	
		  Bn1.Banana1(driver);
		  
		  Bn1.openMercuryTours();
		  
		 
		  Bn1.mercurylogin(UserName,Password); 
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,1,6,F1.FolderPath);
		  Bn1.mercurySigninClick();
		
		  
 		  AddEmployees Bn2 =new AddEmployees();
		  Bn2.Banana2(driver);
		  
		  Bn2.MerucryFlightFinderBusiness(PassengersCount,DepartingFrom,
		  DepartingStartMonth,DepartingStartDate,ArrivingIn,
		  ReturningEndMonth,ReturningEndDate,Airline,Radiobutton,
		  ServiceClass);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,2,6,F1.FolderPath);
		  Bn2.Page2_Continue_Click();

		 
		
		  Banana3 Bn3 =new Banana3();
		  Bn3.Banana3(driver);
		  
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,3,6,F1.FolderPath);
		  Bn3.Page3_Continue_Click();
		
		 
		 
		  Banana4 Bn4 =new Banana4();		
		  Bn4.Banana4(driver);
		  
		  Bn4.EnterCardDetails(FirstName,lastName,meal1,CardName,CardNumber,expirymonth,expiryyear);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,4,6,F1.FolderPath);
		  Bn4.Page4_Continue_Click();
		  
		  Banana5 Bn5 =new Banana5();		
		  Bn5.Banana5(driver);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,5,6,F1.FolderPath);
     
		  Bn5.GetOutputData(iRow);
		  
		   Bn5.backtoflights();

		  //driver.quit();
		
}




}
