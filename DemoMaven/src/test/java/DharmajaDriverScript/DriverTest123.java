package DharmajaDriverScript;
import org.testng.annotations.Test;
import java.nio.file.*;
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
import java.lang.reflect.*;
public class DriverTest123 {
	
	public static Actions124 actionKeywords;
	public static String sActions;
	//public static String sActions1,sTestCase,sActions1Flag;
	public static Method method[];
	
	@Test
	public static void main()throws Exception
	{
		
		//DriverScript1("TC147");  amazon
		
		//DriverScript1("TC148");  //flikart
		
		DriverScript();
		
	} //main 
	

	
	// new driver script starts________
		public static void DriverScript1(String sActions1) throws Exception
		{
		  
			String sActions1Flag,sRegressionSheetPath;
			int NumberofKeywords = 0;
			
		  //sActions1 is for TC143
		  //sActions1Flag is Yes or No
		  //sRegressionSheetPath Check TC01 in E:\ drive
			ExcelApiTest3 eat = new ExcelApiTest3();
			boolean result2 = false;	
	   		//sActions1 = "TC143" ;
	   		sActions1Flag= "Yes" ;
	   		sRegressionSheetPath = "E://"+sActions1 + ".xls";
	   		
	   		
	   		// starts Number of Keywords in a Test Script
	   		try
	   		{
		   		NumberofKeywords=eat.getRowCount(sRegressionSheetPath,"Sheet1");
		   		NumberofKeywords=NumberofKeywords-1;
		   		System.out.println("Row Count  :"+NumberofKeywords);
	    	}   catch(Exception e) { e.printStackTrace(); }	
	 		// ends Number of Keywords in a Test Script
	   		
	   		
	   		
	   		Path path = Paths.get(sRegressionSheetPath);
	   	   	if (Files.exists(path) && sActions1Flag.equals("Yes")) // Check TC01 with Yes or No
	   	   	{
		   		System.out.println("_____________Starts__________________");
		   		System.out.println("Excel Sheet Name is :" +sRegressionSheetPath);
		   		System.out.println("Execution Falg is :" +sActions1Flag);
	   		
		    	for (int iRow=1;iRow<=NumberofKeywords;iRow++) // Number of Keywords in TC# Excel
		    	 {
		    		sActions = eat.getCellData(sRegressionSheetPath,"Sheet1",iRow,1); 
		    		//execute_Actions();

		    		result2=methodExists();
		    		if (result2)
		    		{
		    			execute_Actions();
		    		}
		    		else
		    		{
		    			System.out.println("This Method is not implemented :" +sActions);
		    			System.out.println("Excel Sheet path :" +sRegressionSheetPath);
		    			//break;
		    	   	 	
		    		} 
		    		
		    	 }  
		    	
		    	
		    	System.out.println("______________Ends___________________");
		     	System.out.println("");
		     	System.out.println("");
	    	
	   	   	}//if
	   	   	else
	   	   	{
	   	   		System.out.println("Excel Sheet not existed in the path :" +sRegressionSheetPath);
	   	   		System.out.println("Execution Falg is either No selected :" +sActions1Flag);
	   	   		
	   	   		
	   	   	}
	   	   	

	   		
		}
		//Drive Script ends
		
	
	//new driver script ends______________________ 
	
	
	
	private static void execute_Actions() throws Exception
	{
		actionKeywords = new Actions124();
		method= actionKeywords.getClass().getMethods();
	
		for (int i=0;i<method.length;i++)
		{   
			
			if (method[i].getName().equals(sActions))
			{
				method[i].invoke(actionKeywords);
				break;
			} 
			
		} 
	}  // Private method
	
	
	//methodExists  starts 
	
	private static boolean methodExists() throws Exception
	{
		actionKeywords = new Actions124();
		method= actionKeywords.getClass().getMethods();
		
		boolean result1 = false;
		//String result2="No";
		// starts
		
		for (int i=0;i<method.length;i++)
		{   
			
			if (method[i].getName().equals(sActions))
			{
				//method[i].invoke(actionKeywords);
				result1 = true;
			} 
		
		} // for loop
		
		return result1;
		
	}
	
	//methodExists  ends
	
	
	
	
	
	//Driver SCript starts
		public static void DriverScript() throws Exception
		{
		  
			String sActions1,sActions1Flag,sRegressionSheetPath;
		  //sActions1 is for TC01 
		  //sActions1Flag is Yes or No
		  //sRegressionSheetPath Check TC01 in E:\ drive
			int NumberofKeywords = 0;
			int NumberofTestScripts = 0;
			ExcelApiTest3 eat = new ExcelApiTest3();
			boolean result2 = false;
			
			
			//extra code starts
			
			  try
	            {
				  
				 // System.out.println("NumberofTestScripts Count in excel :"+eat.getRowCount("E://Regression1.xls","Sheet1"));
				  NumberofTestScripts=eat.getRowCount("E://Regression1.xls","Sheet1");
				 // NumberofTestScripts=NumberofKeywords-1;
		   		System.out.println("Numberof TestScripts Count  :"+NumberofTestScripts);
		    	}catch(Exception e) { e.printStackTrace(); }
			//extra code ends
			
			
			for (int iRow1=1;iRow1<=NumberofTestScripts-1;iRow1++)  // Number of Test Cases in Regression Sheet
			{
	   		sActions1 = eat.getCellData("E://Regression1.xls","Sheet1",iRow1,1); 
	   		sActions1Flag=eat.getCellData("E://Regression1.xls","Sheet1",iRow1,2); 
	   		
	   		sRegressionSheetPath = "E://"+sActions1 + ".xls";
	   		
            try
            {
	   		NumberofKeywords=eat.getRowCount(sRegressionSheetPath,"Sheet1");
	   	 	NumberofKeywords=NumberofKeywords-1;
	   		System.out.println("Row Count  :"+NumberofKeywords);
	    	}catch(Exception e) { e.printStackTrace(); }
            
       
            
            Path path = Paths.get(sRegressionSheetPath);
	   		
	   		
	   	   	if (Files.exists(path) && sActions1Flag.equals("Yes")) // Check TC01 with Yes or No
	   	   	{
		   		System.out.println("_____________Starts__________________");
		   		System.out.println("Excel Sheet Name is :" +sRegressionSheetPath);
		   		System.out.println("Execution Falg is :" +sActions1Flag);
	   		
		    	for (int iRow=1;iRow<=NumberofKeywords;iRow++) // Number of Keywords in TC# Excel
		    	 {
		    		
		    		sActions = eat.getCellData(sRegressionSheetPath,"Sheet1",iRow,1); 
		    		//execute_Actions();
		    
		    	
		    		result2=methodExists();
		    		if (result2)
		    		{
		    			execute_Actions();
		    		}
		    		else
		    		{
		    			System.out.println("This Method is not implemented :" +sActions);
		    			System.out.println("Excel Sheet path :" +sRegressionSheetPath);
		    			//break;
		    	   	 	
		    		} 
		    		
		    	 }  
		    	
		    	
		    	System.out.println("______________Ends___________________");
		     	System.out.println("");
		     	System.out.println("");
	    	
	   	   	}//if
	   	   	else
	   	   	{
	   	   		System.out.println("Excel Sheet not existed in the path :" +sRegressionSheetPath);
	   	   		System.out.println("Execution Falg is either No selected :" +sActions1Flag);
	   	   		
	   	   		
	   	   	}
	   	   	
		}	//for
			
			
		
		
		}
		//Drive Script ends
	
}	
	
	