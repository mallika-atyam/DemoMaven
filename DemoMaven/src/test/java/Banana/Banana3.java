//import MercuryDemoTours;

package  Banana;

import org.testng.annotations.Test;

import DataProviderTest.ExcelApiTest3;

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
 
public class Banana3
{
	
	WebDriver driver;
	public  void Banana3(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	 
public static void allmethods()throws Exception
{
	        Banana1 Bn1= new Banana1();
	
			// Bn1.openBrowser();
			 Bn1.mercurylogin(Bn1.UserName,Bn1.Password);
			 
			 Banana2 Bn2= new Banana2();
		 
	 		 Bn2.MerucryFlightFinderBusiness(Bn2.PassengersCount,Bn2.DepartingFrom,
			 Bn2.DepartingStartMonth,Bn2.DepartingStartDate,Bn2.ArrivingIn,
			 Bn2.ReturningEndMonth,Bn2.ReturningEndDate,Bn2.Airline,Bn2.Radiobutton,Bn2.ServiceClass);
		 
	 		 
	 		 Banana3 Bn3= new Banana3();
	 		 Bn3.Page7();
	 		 
		
		 
}	 
	 
	 

public  void Page7()throws Exception
{
	
	
	driver.findElement(By.xpath(OR.SFPage_Continue_Click)).click();
	//apple1.driver.findElement(By.xpath(OR.SFPage_SelectFlightImg)).click();

}

					  
	
}
