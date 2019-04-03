package Tomato2;

import org.testng.annotations.Test;

import Mango1.ExcelApiTest3;

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
 
public class DriverScript2
{
	
	public static String TestName,ExecutionFlag,
	TestPriority,TestGroup,ChromeBrowser,IEBrowser,FireFoxBrowser;
	
	public static Map<String, List <String>> hMap = new HashMap<String , List<String>>();

	
		@BeforeTest
		public void Call_DriverScript()throws Exception
		{
			DriverScript2.DatadrivenTest();
		}
		
		

	    @Test 
		public void MercuryParllal()throws Exception
		{
			MercuryDataDriverExecute.Execute_Sessions("Chrome");
		}
		
		
		


		/*@Test
		public void MercuryOneafterone_Chrome()throws Exception
		{
			
			    ExcelApiTest3 eat = new ExcelApiTest3();
				
				 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");

				 for(int i=1;i<numberowsInputdata;i++)
				 {	 
					MercuryDataDriverExecute.Execute_onebyone(i,"Chrome");
				 }
		}*/
		
	 /*
	@Test  
	public  void TC02_Chrome_01() throws Exception
	{

		if (hMap.get("TC02").get(0).equals("Yes") && hMap.get("TC02").get(3).equals("Yes") )
				 {
				   TC02 test2 = new TC02();
				   test2.TC02_Allmethods("Chrome");
				 }
	}
	
	@Test  
	public  void TC02_IE() throws Exception
	{
		
		
		if (hMap.get("TC02").get(0).equals("Yes")  && hMap.get("TC02").get(4).equals("Yes") )
				 {
					TC02 test2 = new TC02();
					test2.TC02_Allmethods("IE");
				 }
	}

		
	
	@Test  
	public  void TC02_Firefox() throws Exception
	{
		if (hMap.get("TC02").get(0).equals("Yes")  && hMap.get("TC02").get(5).equals("Yes") )
				 {
					TC02 test2 = new TC02();
					test2.TC02_Allmethods("Firefox");
				 }
			
	 }
	 
	 */

		 
	//////////////////////////////Driver Script Method starte here//////////////////////
		 

		 public static void DatadrivenTest()throws Exception
		 {
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC27.xls","Sheet1");

			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
				 DriverScript2.TestName=eat.getCellData("E://TC27.xls","Sheet1",i,0);
				 DriverScript2.ExecutionFlag=eat.getCellData("E://TC27.xls","Sheet1",i,1);
				 
				 DriverScript2.TestPriority=eat.getCellData("E://TC27.xls","Sheet1",i,2);
				 DriverScript2.TestGroup=eat.getCellData("E://TC27.xls","Sheet1",i,3);
				 DriverScript2.ChromeBrowser=eat.getCellData("E://TC27.xls","Sheet1",i,4);
				 DriverScript2.IEBrowser=eat.getCellData("E://TC27.xls","Sheet1",i,5);
				 DriverScript2.FireFoxBrowser=eat.getCellData("E://TC27.xls","Sheet1",i,6);
				
				 
				 List<String> values = new ArrayList<String>();
				 values.add(DriverScript2.ExecutionFlag); //0
				 values.add(DriverScript2.TestPriority); //1
				 values.add(DriverScript2.TestGroup);  // 2
				 values.add(DriverScript2.ChromeBrowser); // 3
				 values.add(DriverScript2.IEBrowser);//4
				 values.add(DriverScript2.FireFoxBrowser);//5
				 hMap.put(DriverScript2.TestName,values);

			System.out.println(" apple1.TestName  is :"+DriverScript2.TestName);				
			System.out.println(" apple1.Test Name Parameters are  is :"+hMap.get(DriverScript2.TestName));
			 
		} //for loop ends
			 
		 
	System.out.println(" apple1.TestName TC01 Execution Flag  is :"+hMap.get("TC01").get(0));
	System.out.println(" apple1.TestName TC01 TestPriority   is :"+hMap.get("TC01").get(1));
	System.out.println(" apple1.TestName TC01 TestGroup   is :"+hMap.get("TC01").get(2));
	System.out.println(" apple1.TestName TC01 Chrome  is :"+hMap.get("TC01").get(3));
	System.out.println(" apple1.TestName TC01 IE  is :"+hMap.get("TC01").get(4));
	System.out.println(" apple1.TestName TC01 Firefox  is :"+hMap.get("TC01").get(5));
	
			
	}//DatadrivenTest1 methods ends
	 
		
//////////////////////////////Driver Script Method ends here//////////////////////		
	 
} //Main class Method ends
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
