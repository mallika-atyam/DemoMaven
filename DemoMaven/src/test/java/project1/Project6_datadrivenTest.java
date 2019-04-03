package project1;

import org.testng.annotations.Test;
//import MercuryData.ExcelApiTest3;
//import MercuryData.Test5;
/*import Tomato5.Banana1;
import Tomato5.Banana2;
import Tomato5.Banana3;
import Tomato5.Banana4;
import Tomato5.Folders123;
import Tomato5.OR;
import Tomato5.TestBrowser;*/
import project1.*;
//import mercurysudha.Mercury3;

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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
import org.apache.poi.xssf.*;

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

public class Project6_datadrivenTest {
	
	WebDriver driver;
	
	public  void Project6(WebDriver driver )throws Exception
	       {  
			  this.driver=driver;
	       }
	
		public    String  UserName,  Password,   PassengersCount,pass4first,pass4last,pass4meal,pass3first,pass3last,pass3meal,
		pass2first,pass2last,pass2meal,
		DepartingFrom,   DepartingStartMonth,  DepartingStartDate,
	    ArrivingIn,  ReturningEndMonth,   ReturningEndDate,
	    Airline,  ServiceClass,  Radiobutton,
	    FirstName,  lastName,  meal1,  CardName,
	    CardNumber,  expirymonth,  expiryyear; 
	    
	public  int iRow;
	 
	
@Test
public void DataDrivenTest_Chrome() throws Exception
{

 ExcelApiTest3 eat = new ExcelApiTest3();
 //File src=new File("E://TC25.xls");
 //FileInputStream fis=new FileInputStream(src);
// XSSFWorkbook wb=new XSSFWorkbook(fis);
 //XSSFSheet sh1=wb.getSheetAt(0);
 int counter=0,pcount;
 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");
 
	 for(int i=1;i<=3;i++)
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
				CardNumber=eat.getCellData("E://TC25.xls","Sheet1",i,15);
				meal1=eat.getCellData("E://TC25.xls","Sheet1",i,16);
				pass2first=eat.getCellData("E://TC25.xls","Sheet1",i,19);
				 pass2last=eat.getCellData("E://TC25.xls","Sheet1",i,20);
				 pass2meal=eat.getCellData("E://TC25.xls","Sheet1",i,21);
				 pass3first=eat.getCellData("E://TC25.xls","Sheet1",i,22);
				 pass3last=eat.getCellData("E://TC25.xls","Sheet1",i,23);
				 pass3meal=eat.getCellData("E://TC25.xls","Sheet1",i,24);
				 pass4first=eat.getCellData("E://TC25.xls","Sheet1",i,25);
				 pass4last=eat.getCellData("E://TC25.xls","Sheet1",i,26);
				 pass4meal=eat.getCellData("E://TC25.xls","Sheet1",i,27);
				 
				 
		
				 expirymonth=eat.getCellData("E://TC25.xls","Sheet1",i,17);		
				 expiryyear=eat.getCellData("E://TC25.xls","Sheet1",i,18);	
				 iRow=i;
				 call_allmethods(iRow);
				 
	 }	
	 Project5 Pro5 =new Project5();		
	 Pro5.Project5(driver);
	 driver.quit();
}


public void call_allmethods(int iRow) throws Exception
{
	  Folders123 F1= new Folders123();
	  String str1="TC06"+"_Chrome" + "_Iteration_" + String.valueOf(iRow);
	  List<String> Myarray1 = F1.CreateFolder("TC06",str1); 
	  F1.sTargetTestCasePath=Myarray1.get(0);
	  F1.FolderPath=Myarray1.get(1);
	  System.out.println(" Myarray1.get(0) "+Myarray1.get(0));
	  System.out.println(" Myarray1.get(1) "+Myarray1.get(1)); 
	
	
	if(iRow==1)
	{
		  driver=TestBrowser.OpenChromeBrowser();

		  Project1 Pro1 =new Project1();	
		  Pro1.Project1(driver);
		  Pro1.openMercuryTours();
		  Pro1.mercurylogin(UserName,Password); 
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,1,6,F1.FolderPath);
		  Pro1.mercurySigninClick();
	}
	 		
		  Project2 Pro2 =new Project2();
		  Pro2.Project2(driver);
		  Pro2.MerucryFlightFinderBusiness(PassengersCount,DepartingFrom,
		  DepartingStartMonth,DepartingStartDate,ArrivingIn,
		  ReturningEndMonth,ReturningEndDate,Airline,Radiobutton,
		  ServiceClass);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,2,6,F1.FolderPath);
		  Pro2.Page2_Continue_Click();
		
		  Project3 Pro3 =new Project3();
		  Pro3.Project3(driver);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,3,6,F1.FolderPath);
		  Pro3.Page3_Continue_Click();
		 
		  Project4 Pro4 =new Project4();		
		  Pro4.Project4(driver);
		  
		  if (PassengersCount.equals("1"))
		  {
			  Pro4.passengerCount_1(iRow, FirstName,lastName,meal1);  
			  
		  }
		 
		  
		  if (PassengersCount.equals("2"))
		  {
			  Pro4.passengerCount_1(iRow, FirstName,lastName,meal1); 
			  Pro4.passengerCount_2(iRow, pass2first,pass2last,pass2meal);
					  
		  } 
		  if (PassengersCount.equals("3"))
		  {
			  Pro4.passengerCount_1(iRow, FirstName,lastName,meal1); 
			  Pro4.passengerCount_2(iRow, pass2first,pass2last,pass2meal);
			  Pro4.passengerCount_3(iRow, pass3first,pass3last,pass3meal);
					  
		  } 
		  if (PassengersCount.equals("4"))
		  {
			  Pro4.passengerCount_1(iRow, FirstName,lastName,meal1); 
			  Pro4.passengerCount_2(iRow, pass2first,pass2last,pass2meal);
			  Pro4.passengerCount_3(iRow, pass3first,pass3last,pass3meal);
			  Pro4.passengerCount_4(iRow, pass4first,pass4last,pass4meal);
			  
					  
		  } 
		 
		 
		  
		  
		  
		  
		  Pro4.EnterCardDetails(CardName,CardNumber,expirymonth,expiryyear);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,4,6,F1.FolderPath);
		  Pro4.Page4_Continue_Click();
		  
		  Project5 Pro5 =new Project5();		
		  Pro5.Project5(driver);
		  Pro5.GetOutputData(iRow);
		  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,5,6,F1.FolderPath);
		  Pro5.backtoflight();
		 // counter=counter+pcount;
		
}
		
			}

