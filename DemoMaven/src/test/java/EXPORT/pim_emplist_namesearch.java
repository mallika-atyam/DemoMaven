package  EXPORT;
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
/*
Openbrowser
openurl
login
booleanJobtitle_CEO
export
logout
*/


 
public class pim_emplist_namesearch
{
	public String UserName,Password;
	public String empname;
	
	public  int iRow;
	WebDriver driver;
	
	public  void pim_emplist_namesearch (WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	@Test
	public  void DatadrivenTest( )throws Exception
	{  
		
		  ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberofrows=eat.getRowCount("E://OrangeHrm//TC05_EMPLIST.xls","Sheet1");

				 for(int i=1;i<2;i++)
				 {		 
					 UserName=eat.getCellData("E://OrangeHrm//TC05_EMPLIST.xls","Sheet1",i,0);
					 Password=eat.getCellData("E://OrangeHrm//TC05_EMPLIST.xls","Sheet1",i,1);
					 System.out.println("User name is"+UserName);
					 System.out.println(" Password is "+Password);
					 empname=eat.getCellData("E://OrangeHrm//TC05_EMPLIST.xls","Sheet1",i,4);
					 System.out.println(" Employee name "+empname);
					 iRow=i;
					 call_allmethods(iRow);
				 }
				 
				 
	}
	
	
	
	
	public   void call_allmethods(int iRow )throws Exception
	{  
		
		driver=TestBrowser.OpenChromeBrowser();
		 
		Login l1=new Login();
		l1.Login(driver);
		l1.openOrangeHRM();
		l1.OrangeHRMlogin(UserName,Password);
		l1.OrangeHRMSigninClick();
		
		pim_emplist_namesearch pns=new pim_emplist_namesearch();
		pns.pim_emplist_namesearch(driver);
		pns.empname_search(iRow, empname);
		driver.quit();
				
}		

	public  void empname_search(int iRow,String name)throws Exception
	{ 
		
		
		System.out.println(" Searching on empname "+ name);
		int temp=0;
		Boolean Record_Present=false;
		
	     Actions actions = new Actions(driver);   
		 WebElement ele=driver.findElement(By.xpath(OR.Pim_focus));
		 actions.moveToElement(ele).click().perform();
		 
		
		 driver.findElement(By.xpath(OR.EMPlist_click)).click();
		
		driver.findElement(By.xpath(OR.Pim_empname)).sendKeys(name);
					
        //No. of columns
        List  columns = driver.findElements(By.xpath(OR.EMPcolumn)); 
        System.out.println("No of columns are : " + columns.size());
        
        //No.of rows 
        List  rows = driver.findElements(By.xpath(OR.EMProws)); 
        System.out.println("No of rows are : " + rows.size());
        
				    for ( int i=1 ; i<=rows.size() ;i++)
				    {
				      	String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[3]";
				    
				        WebElement CellText1=driver.findElement(By.xpath(str1));
				    		   
				    	String nameinapp = CellText1.getText();
				    	 //System.out.println("name in the application is " + nameinapp);
				        
					    	if ( name.equals(nameinapp) )
					    	{
					    	    	 Record_Present=true;
					    	    	 System.out.println("Emp name found " + nameinapp + "Emp in " + i +"rwo" );
					    	    	 temp=i;
					    	    	 	}
					  		    	
					  					    	
				    } 
				    
							
					if(Record_Present==true)
					{
					System.out.println("YES Employee name found");
					 ExcelApiTest3 eat = new ExcelApiTest3();
					 int rownum=eat.getRowCount("E://OrangeHrm//TC05_EMPLIST.xls","Sheet6");
					 // export data
         		    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++)
				    	   {
				      		   String str1="//*[@id='resultTable']/tbody/tr["  + temp +  "]"  + "/td" + "[" + j +"]";
				      		   
				      		   WebElement CellText1=driver.findElement(By.xpath(str1));
				    		   
				    	        String valueIneed1 = CellText1.getText();
				    	       if (valueIneed1 !=null)
				    	        eat.PutCellData( "E://OrangeHrm//TC05_EMPLIST.xls","Sheet6",rownum,k,valueIneed1);
				    	        else
				    	        eat.PutCellData( "E://OrangeHrm//TC05_EMPLIST.xls","Sheet6",rownum,k,"Blank Data");
				    	        	
				    	   }
					}
					
					else
					System.out.println("No-Employee name not found");	
					}
}