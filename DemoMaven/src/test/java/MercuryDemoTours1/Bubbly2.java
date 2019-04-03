//import MercuryDemoTours;

package  MercuryDemoTours1;
import org.testng.annotations.Test;

import subha.ExcelApiTest3;

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
 
public class Bubbly2
{

	public static WebDriver driver ; 
	
	 public static String Airlines, arrivingin;
	 
	@Test 
	public static void Hai() throws Exception
	{
		Bubbly.openBrowser();
		Bubbly.mercurylogin();
		Bubbly2.mercuryHomePage();
	}
		 
	public static void mercuryHomePage()throws Exception
	 {	
		 
		driver=OR3.driver;
		Bubbly2.GetInputData();
		
		driver.findElement(By.xpath(OR3.OneWayJourney)).click();
		 
		Bubbly.wait5seconds();
		 
		driver.findElement(By.xpath(OR3.busuinessclass)).click();
		 
		Bubbly.wait5seconds();
		 
	//driver.findElement(By.xpath(OR3.MLPage_UserNameTextbox)).sendKeys("mercury");	 
	Select listbox =new Select(driver.findElement(By.xpath(OR3.airline)));
	listbox.selectByVisibleText(Bubbly2.Airlines);		 
	Bubbly.wait5seconds();
	
	Select listbox1 =new Select(driver.findElement(By.xpath(OR3.arrivingin)));
	listbox1.selectByVisibleText(Bubbly2.arrivingin);
	 
	Bubbly.wait5seconds();
	
	Select listbox2 =new Select(driver.findElement(By.xpath(OR3.departingfrom)));
	listbox2.selectByVisibleText("Paris");
	
	Bubbly.wait5seconds();
	
	driver.findElement(By.xpath(OR3.departingfrom)).click();
	
	Bubbly.wait5seconds();
	
	 driver.quit();
		
	 }
	
	public static void GetInputData() throws Exception
		{
			
		  ExcelApiTest3 eat = new ExcelApiTest3();
		   Bubbly2.Airlines=eat.getCellData("E://TC17.xls","Sheet1",1,0);
		   //Bubbly2.Password=eat.getCellData("E://TC17.xls","Sheet1",1,1);
		   Bubbly2.arrivingin=eat.getCellData("E://TC17.xls","Sheet1",1,1);
		
}

	
	
}
