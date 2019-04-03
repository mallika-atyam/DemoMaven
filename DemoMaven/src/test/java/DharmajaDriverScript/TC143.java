package DharmajaDriverScript;

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
public class TC143 {
	
	public static Actions124 actionKeywords;
	public static String sActions,sActionsy;
	public static Method method[];
	
	public static void main(String[] args)throws Exception
	{
		
		ExcelApiTest3 eat = new ExcelApiTest3();
		
		/*Set<String> set = new HashSet<String>();
		for (int iRowa=1;iRowa<=4;iRowa++) {
			sActionsy = eat.getCellData("E://TC143.xls","Sheet1",iRowa,1); 
            set.add(sActionsy);
         }*/
		
    	    	   	
    	for (int iRow=1;iRow<=4;iRow++)
    	 {
    		sActions = eat.getCellData("E://TC143.xls","Sheet1",iRow,1); 
    		execute_Actions();
    	 }
		
	}
	
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
	
		
	}
	
}