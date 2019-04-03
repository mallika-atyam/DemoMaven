//import MercuryDemoTours;

package  EPORT;
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


 
public class AdminJObEmpStatus

{
	public String UserName,Password;
	public String Name;
	
	
	public  int iRow;
	WebDriver driver;
	
	public  void AdminJobEmploymentStatus(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	@Test(priority=2)
	public  void DatadrivenTest_AddEmploymentStatus( )throws Exception
	{  
		
		  ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4");

				 for(int i=1;i<2;i++)
				 {		 
					 UserName=eat.getCellData("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4",i,0);
					 Password=eat.getCellData("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4",i,1);
					 System.out.println("User name is"+UserName);
					 System.out.println(" Password is "+Password);		 
					
					 Name=eat.getCellData("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4",i,2);
					  System.out.println("Name is"+Name);
					  
						
						
					 iRow=i;
					 call_allmethods(iRow);
				 }
				 
				 
	}
	
	
	/*@Test(priority=1)
	public  void JobStatus( String Name)throws Exception
	{   
		
		ExcelApiTest3 eat = new ExcelApiTest3();
	
	 int numberowsInputdata=eat.getRowCount("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4");

	 for(int i=1;i<2;i++)
	 {		 
		 UserName=eat.getCellData("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4",i,0);
		 Password=eat.getCellData("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4",i,1);
		 System.out.println("User name is"+UserName);
		 System.out.println(" Password is "+Password);		 
		
		 Name=eat.getCellData("E://OrangeHrm//TC04_Admin_EmpStatus.xls","Sheet4",i,2);
		  System.out.println("Name is"+Name);
		  
		  iRow=i;
		  EmpStatusAllMethods( iRow,Name);
		  
	 }
		
		
	}

		public  void EmpStatusAllMethods(int iRow,String Name)throws Exception
			{ 
			  
			  if(iRow==1)
		
			  {	  
				  driver=TestBrowser.OpenChromeBrowser();
					 
					Login l1=new Login();
					l1.Login(driver);
					l1.openOrangeHRM();
					l1.OrangeHRMlogin(UserName,Password);
					l1.OrangeHRMSigninClick();
					 
		Actions actions = new Actions(driver);   
		 WebElement ele=driver.findElement(By.xpath(OR.Admin));
		 actions.moveToElement(ele).click().perform();
		 
		 Actions actions1 = new Actions(driver);   
		 WebElement ele1=driver.findElement(By.xpath(OR.Admin_Job));
		 actions1.moveToElement(ele1).click().perform();
		 
		 driver.findElement(By.xpath(OR.Admin_Job_EmpStatus)).click();
		 
		 driver.findElement(By.xpath(OR.EmpStatusAdd)).click();
			  
			  
     driver.findElement(By.xpath(OR.AddName)).sendKeys(Name);
	System.out.println("name is"+Name);
	
	driver.findElement(By.xpath(OR.Save)).click();
	 
	
			  }	
		 driver.quit();	
	
}*/
	
	public   void call_allmethods(int iRow )throws Exception
	{  
		
		driver=TestBrowser.OpenChromeBrowser();
		 
		Login l1=new Login();
		l1.Login(driver);
		l1.openOrangeHRM();
		l1.OrangeHRMlogin(UserName,Password);
		l1.OrangeHRMSigninClick();
		
		AdminJObEmpStatus AJ=new AdminJObEmpStatus();
		AJ.AdminJobEmploymentStatus(driver);
		
	//Search by Vacancy
		System.out.println(" ");
		System.out.println("___________Starts_________________");	
		Boolean str=false;
		
		str=AJ.Add_Name_EmpSt(iRow,Name);
		if(str==true)
		System.out.println("YES-Name is present in EmpStatus");
		else
		System.out.println("No-Name is present in EmpStatus");	
		System.out.println("__________Ends__________________");	
	
		// New method starts
		System.out.println(" ");
		System.out.println("___________Starts_________________");
		System.out.println("****Export EmpStatus method starts here****");	
		AJ.ExportEmpStatus();
		System.out.println("___________Ends_________________");
		
		driver.quit();			
}		

			
			
	
					
		  		
	
	// starts method for  Vacancy Search 
			public  Boolean Add_Name_EmpSt(int iRow,String Name)throws Exception
			{ 
				
				
				System.out.println(" Name is : "+ Name);
				
				Boolean Record_Present=false;
				
			     Actions actions = new Actions(driver);   
				 WebElement ele=driver.findElement(By.xpath(OR.Admin));
				 actions.moveToElement(ele).click().perform();
				 
				 Actions actions1 = new Actions(driver);   
				 WebElement ele1=driver.findElement(By.xpath(OR.Admin_Job));
				 actions1.moveToElement(ele1).click().perform();
				 
				 driver.findElement(By.xpath(OR.Admin_Job_EmpStatus)).click();
			
				 driver.findElement(By.xpath(OR.EmpStatusAdd)).click();
				  
				  
			     driver.findElement(By.xpath(OR.AddName)).sendKeys(Name);
				System.out.println("name is"+Name);
				
				driver.findElement(By.xpath(OR.Save)).click();
				 	
			 //No.of rows 
		        List  rows = driver.findElements(By.xpath(OR.Rows)); 
		        System.out.println("No of rows are : " + rows.size());
		        
						    for ( int i=1 ; i<=rows.size() ;i++)
						    {
						      	String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + 2 +"]";
						    
						        WebElement CellText1=driver.findElement(By.xpath(str1));
						    		   
						    	String valueIneed1 = CellText1.getText();
						       
						        
							    	if (Name.equals(valueIneed1) )
							    	{
							    	    	 Record_Present=true;
							    	    	 System.out.println("True-Name Text Value is: " + valueIneed1);
							    	    	 return Record_Present;
							    	    	 //Employee ID exist in employee list
							    	}
							    	else
							    	{
							    		 System.out.println("Cell Text Value is:" + valueIneed1);
									     System.out.println("Seracching for Name is:" +Name);
							    	}
							    	
							  					    	
						    }  //After for loop
						    
						    System.out.println("*******VacancySearch method completed*****");
						    return Record_Present;
						    
		
		
	}
			
			
			public  void ExportEmpStatus()throws Exception
			{ 
				 
				
				 Actions actions = new Actions(driver);   
				 WebElement ele=driver.findElement(By.xpath(OR.Admin));
				 actions.moveToElement(ele).click().perform();
				 
				 Actions actions1 = new Actions(driver);   
				 WebElement ele1=driver.findElement(By.xpath(OR.Admin_Job));
				 actions1.moveToElement(ele1).click().perform();
				 
				 driver.findElement(By.xpath(OR.Admin_Job_EmpStatus)).click();
			
				
				  //No. of columns
			        List  columns = driver.findElements(By.xpath(OR.columns)); 
			        //System.out.println("No of columns are : " + columns.size());
			        
		       
		        
		        //No.of rows 
		        List  rows = driver.findElements(By.xpath(OR.Rows)); 
		       // System.out.println("No of rows are : " + rows.size());
		        
		       
		      
		        			ExcelApiTest3 eat = new ExcelApiTest3();
		         
						    for ( int i=1 ; i<=rows.size() ;i++)
						    {
						    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++)
						    	   {
						      		   String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + j +"]";
						      		   
						      		//*[@id="resultTable"]/tbody/tr[1]/td[2]
						    		    WebElement CellText1=driver.findElement(By.xpath(str1));
						    		   
						    	        String valueIneed1 = CellText1.getText();
						    	      //  System.out.println("Cell Text Value is: " + valueIneed1);
						    	        
						    	        if (valueIneed1 !=null)
						    	        eat.PutCellData( "E://OrangeHrm//TC04_Admin_EmpStatus","Sheet5",i,k,valueIneed1);
						    	        else
						    	        eat.PutCellData( "E://OrangeHrm//TC04_Admin_EmpStatus","Sheet5",i,k,"Blank Data");
						    	        	
						    	   }
						    }
		   		
			
			}

}	
	

