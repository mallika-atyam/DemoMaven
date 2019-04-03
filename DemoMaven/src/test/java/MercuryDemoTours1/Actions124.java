package MercuryDemoTours1;

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

public class Actions124 {
	
   public static WebDriver driver ; 

	public static void OpenBrowserURL() 
	 {
		//Folders123.FolderCreation("TC147_Amazon");
		//Actions124.OpenBlankChromeBrowser();
		//Amajon.OpenAmajonURL();
	 }
	
	
	public static void OpenBrowserURLTC148() 
	 {
	
		//Folders123.FolderCreation("TC148_Amazon");
		//Actions124.OpenBlankChromeBrowser();
		//Amajon.OpenAmajonURL();
	 }
	
	
	public static void CloseBrowser() throws Exception
	 {	
		CommonUtility.CloseBrowser();
	 }
	
	
	public static void TC01_Business_Class() throws Exception
	 {
		Folders123.FolderCreation("TC01_Business_Class");
		CommonUtility.OpenBlankChromeBrowser();
		driver=OR.driver;
		CommonUtility.OpenMercuryDemoToursURL();
	 }
	
	public static void TC02_Economy_Class() throws Exception
	 {
		Folders123.FolderCreation("TC02_Economy_Class");
		CommonUtility.OpenBlankChromeBrowser();
		driver=OR.driver;
		CommonUtility.OpenMercuryDemoToursURL();
	 }
	
	public static void TC03_First_Class() throws Exception
	 {
		Folders123.FolderCreation("TC03_First_Class");
		CommonUtility.OpenBlankChromeBrowser();
		driver=OR.driver;
		CommonUtility.OpenMercuryDemoToursURL();
	 }
	
	public static void MercuryLogin() throws Exception
	 {	
		MercuryLoginPage.MerucryLogin();
	 }
	
	public static void MercuryFlightFinder_BusinessClass() throws Exception
	 {	
		MercuryFlightFinderPage.MerucryFlightFinderBusiness();
	 }
	
	public static void MercuryFlightFinder_EconomyClass() throws Exception
	 {	
		MercuryFlightFinderPage.MerucryFlightFinderEconomy();
	 }
	
	public static void MercuryFlightFinder_FirstClass() throws Exception
	 {	
		MercuryFlightFinderPage.MerucryFlightFinderFirst();
	 }
	
}