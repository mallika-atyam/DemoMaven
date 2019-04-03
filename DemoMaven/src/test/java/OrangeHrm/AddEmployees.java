//import MercuryDemoTours;

package  OrangeHrm;
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
 
public class AddEmployees
{
	public String UserName,Password;
	public String FirstName,MiddleName,LastName,
	EmployeeId,CreateLogincheckbox,UserName1,Password1,ConfirmPassword,Status;
	
	
	
	public  int iRow;
	WebDriver driver;
	public  void AddEmployees(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	@Test
	public  void DatadrivenTest_AddEmployess( )throws Exception
	{  
		
		  ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC01.xls","Sheet1");

				 for(int i=1;i<2;i++)
				 {		 
					 UserName=eat.getCellData("E://TC01.xls","Sheet1",i,0);
					 Password=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					 System.out.println("User name is"+UserName);
					 System.out.println(" Password is "+Password);
					
					 
					 FirstName=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					 MiddleName=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					 LastName=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					//EmployeeId=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					//CreateLogincheckbox=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					UserName1=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					Password1=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					ConfirmPassword=eat.getCellData("E://TC01.xls","Sheet1",i,1);
					Status=eat.getCellData("E://TC01.xls","Sheet1",i,1);
						
						
					 iRow=i;
					 call_allmethods(iRow);
				 }
				 
				 
	}
	
	
	public  void PIM_MenuBar( )throws Exception
	{  
		driver.findElement(By.xpath(OR.Home_MainMenu_PIM_click)).click();
	}
	
	
	
	public  void AddEmployees( )throws Exception
	{  
		driver.findElement(By.xpath(OR.PIM_Addemployee_click)).click();
		
	}
	
	
	public  void call_allmethods(int iRow )throws Exception
	{  
		
		driver=TestBrowser.OpenChromeBrowser();
		
		Login l1=new Login();
		l1.Login(driver);
		l1.openOrangeHRM();
		l1.OrangeHRMlogin(UserName,Password);
		l1.OrangeHRMSigninClick();
		
		
		AddEmployees Ae=new AddEmployees();
			Ae.AddEmployees(driver);
			Ae.PIM_MenuBar();
			Ae.AddEmployees();
		
		
	}
	
	
}
