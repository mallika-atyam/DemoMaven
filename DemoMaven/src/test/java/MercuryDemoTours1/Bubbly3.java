//import MercuryDemoTours;

package  MercuryDemoTours1;
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
 
public class Bubbly3
{
	
	public static WebDriver driver ; 
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static String baseUrl = "http://www.newtours.demoaut.com/";


	@Test 
	public static void Hai()
	{
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver",driverPath);
		 driver = new ChromeDriver(options); 
		
		 driver.manage().window().maximize() ;	
		 driver.get(baseUrl);
	
		 driver.findElement(By.xpath(OR3.MLPage_UserNameTextbox)).sendKeys("mercury");
		 driver.findElement(By.xpath(OR3.MLPage_PasswordTextbox)).sendKeys("mercury");
		 driver.findElement(By.xpath(OR3.MLPage_SignInButton)).click();
		// driver.quit();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
		 
		 driver.findElement(By.xpath(OR3.OneWayJourney)).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
		 
		 
		 
		 driver.findElement(By.xpath(OR3.busuinessclass)).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
		 
	//driver.findElement(By.xpath(OR3.MLPage_UserNameTextbox)).sendKeys("mercury");	 
	Select listbox =new Select(driver.findElement(By.xpath(OR3.airline)));
	listbox.selectByVisibleText("Unified Airlines");		 
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	Select listbox1 =new Select(driver.findElement(By.xpath(OR3.arrivingin)));
	listbox1.selectByVisibleText("London");
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	Select listbox2 =new Select(driver.findElement(By.xpath(OR3.departingfrom)));
	listbox2.selectByVisibleText("Paris");
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	driver.findElement(By.xpath(OR3.departingfrom)).click();
	
	 try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		 
	 
	
		//	 driver.quit();
		 
	}
	
}