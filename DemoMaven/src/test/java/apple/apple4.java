//import MercuryDemoTours;

package  apple;
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
 
public class apple4
{
	
	public static String FirstName,lastName,meal1,CardName,CardNumber,expirymonth,expiryyear;
	public static int iRow;
	
	 @Test
	 public static void DatadrivenTest()throws Exception
	 {
		 ExcelApiTest3 eat = new ExcelApiTest3();
		 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");
		 
		 for(int i=1;i<2;i++)
		 {	 
			 apple1.UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
			 apple1.Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);	 	
 
			 apple2.PassengersCount=eat.getCellData("E://TC25.xls","Sheet1",i,2);	
			 apple2.DepartingFrom=eat.getCellData("E://TC25.xls","Sheet1",i,3);	
			 apple2.DepartingStartMonth=eat.getCellData("E://TC25.xls","Sheet1",i,4);	
			 apple2.DepartingStartDate=eat.getCellData("E://TC25.xls","Sheet1",i,5);	
			 apple2.ArrivingIn=eat.getCellData("E://TC25.xls","Sheet1",i,6);	
			 apple2.ReturningEndMonth=eat.getCellData("E://TC25.xls","Sheet1",i,7);	
			 apple2.ReturningEndDate=eat.getCellData("E://TC25.xls","Sheet1",i,8);	
			 apple2.Airline=eat.getCellData("E://TC25.xls","Sheet1",i,9);
			 
			  apple2.ServiceClass=eat.getCellData("E://TC25.xls","Sheet1",i,10);	
			 //  System.out.println("apple2.ServiceClass value is :"+apple2.ServiceClass);
			   
			   apple2.Radiobutton=eat.getCellData("E://TC25.xls","Sheet1",i,11); 
			//     System.out.println("apple2.Radiobutton value is  :"+apple2.Radiobutton);

			   
			   apple4.FirstName=eat.getCellData("E://TC25.xls","Sheet1",i,12);
			  
			   apple4.lastName=eat.getCellData("E://TC25.xls","Sheet1",i,13);
			   apple4.meal1=eat.getCellData("E://TC25.xls","Sheet1",i,16);
			   apple4.CardName=eat.getCellData("E://TC25.xls","Sheet1",i,14);
			   apple4.CardNumber=eat.getCellData("E://TC21.xls","Sheet1",i,15);
			   apple4.expirymonth=eat.getCellData("E://TC25.xls","Sheet1",i,17);
			   apple4.expiryyear=eat.getCellData("E://TC25.xls","Sheet1",i,18);
			   
			   apple4.iRow=i;
			   
			   apple4.allmethods();	
		 }
	 		 
	 }
	 
	
	 
public static void allmethods()throws Exception
{
	apple1.openBrowser();
	apple1.mercurylogin(apple1.UserName,apple1.Password);
				 
	apple2.MerucryFlightFinderBusiness(apple2.PassengersCount,apple2.DepartingFrom,
			apple2.DepartingStartMonth,apple2.DepartingStartDate,apple2.ArrivingIn,
			apple2.ReturningEndMonth,apple2.ReturningEndDate,apple2.Airline,apple2.Radiobutton,
			apple2.ServiceClass);
		
	apple3.Page7();
	
	apple4.Page8(apple4.FirstName,apple4.lastName,apple4.meal1,apple4.CardName,
			apple4.CardNumber,apple4.expirymonth,apple4.expiryyear);
	
	apple4.GetOutputData(apple4.iRow);
	apple4.Logout();
	 
		 apple1.wait5seconds();
		 apple1.CloseBrowser(); 
}	 
	 
	 

public static void Page8(String FirstName,String lastName,String meal1,String CardName,String CardNumber,String expirymonth,String expiryyear)throws Exception
{
	
	
	apple1.driver.findElement(By.xpath(OR.BookFlightPage_FirstName)).sendKeys(FirstName);
	
	apple1.driver.findElement(By.xpath(OR.BookFlightPage_lastName)).sendKeys(lastName);
	Select listbox9 =new Select(apple1.driver.
			findElement(By.xpath(OR.BookFlightPage_meal1)));
	
			listbox9.selectByVisibleText(meal1);
			
	Select listbox8 =new Select(apple1.driver.
			findElement(By.xpath(OR.BookFlightPage_CardName)));
	
			listbox8.selectByVisibleText(CardName);
			
			apple1.driver.findElement(By.xpath(OR.BookFlightPage_CardNumber)).sendKeys(CardNumber);
	
	Select listbox10 =new Select(apple1.driver.
			findElement(By.xpath(OR.BookFlightPage_expirymonth)));
	
			listbox10.selectByVisibleText(expirymonth);
			
			Select listbox11 =new Select(apple1.driver.
					findElement(By.xpath(OR.BookFlightPage_expiryyear)));
			
					listbox11.selectByVisibleText(expiryyear);
	
					apple1.driver.findElement(By.xpath(OR.BookFlightPage_SecurePurchase_Click)).click();
	

	
	
}


public static void GetOutputData(int i)throws Exception
{
	 ExcelApiTest3 eat = new ExcelApiTest3();
	 
		 
		String Output_FlightConfirmation_Number= apple1.driver.findElement(By.xpath(OR.Output_FlightConfirmation_Number)).getText();
		String Output_FlightBookingDate_Time= apple1.driver.findElement(By.xpath(OR.Output_FlightBookingDate_Time)).getText();
		String Output_DepartingDetails= apple1.driver.findElement(By.xpath(OR.Output_DepartingDetails)).getText();
		String Output_ReturningDetails= apple1.driver.findElement(By.xpath(OR.Output_ReturningDetails)).getText();
		String Output_PassengersDetails= apple1.driver.findElement(By.xpath(OR.Output_PassengersDetails)).getText();
		String Output_BilledToDetails= apple1.driver.findElement(By.xpath(OR.Output_BilledToDetails)).getText();
		String Output_DeliveryAddressDetails= apple1.driver.findElement(By.xpath(OR.Output_DeliveryAddressDetails)).getText();
		String Output_TotalPrice= apple1.driver.findElement(By.xpath(OR.Output_TotalPrice)).getText();
		String Output_TotalTaxes= apple1.driver.findElement(By.xpath(OR.Output_TotalTaxes)).getText();


		 eat.PutCellData( "E://TC25.xls","Sheet2",i,0,Output_FlightConfirmation_Number);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,1,Output_FlightBookingDate_Time);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,2,Output_DepartingDetails);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,3,Output_ReturningDetails);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,4,Output_PassengersDetails);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,5,Output_BilledToDetails);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,6,Output_DeliveryAddressDetails);
		 eat.PutCellData( "E://TC25.xls","Sheet2",i,7,Output_TotalPrice);
		eat.PutCellData( "E://TC25.xls","Sheet2",i,8,Output_TotalTaxes);


}
public static void Logout()throws Exception
{

     apple1.driver.findElement(By.xpath(OR.Logout)).click();
				  
}
}
