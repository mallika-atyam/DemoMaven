package project1;

import org.testng.annotations.Test;
//import MercuryData.ExcelApiTest3;
//import MercuryData.Test5;
//import Tomato5.OR;

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

public class Project4 {
	
	WebDriver driver;
	
	public  void Project4(WebDriver driver )throws Exception
	       {  
			  this.driver=driver;
	       }
	
	public  void EnterCardDetails(
			String CardName,String CardNumber,String expirymonth,
			String expiryyear)throws Exception
	{
		
		
		//driver.findElement(By.xpath(OR.BookFlightPage_FirstName)).sendKeys(FirstName);
		
		//driver.findElement(By.xpath(OR.BookFlightPage_lastName)).sendKeys(lastName);
		
		//Select listbox9 =new Select(driver.findElement(By.xpath(OR.BookFlightPage_meal1)));
		//listbox9.selectByVisibleText(meal1);
				
		Select listbox8 =new Select(driver.findElement(By.xpath(OR.BookFlightPage_CardName)));
		listbox8.selectByVisibleText(CardName);
				
		driver.findElement(By.xpath(OR.BookFlightPage_CardNumber)).sendKeys(CardNumber);
		
		Select listbox10 =new Select(driver.findElement(By.xpath(OR.BookFlightPage_expirymonth)));
		listbox10.selectByVisibleText(expirymonth);
				
		Select listbox11 =new Select(driver.findElement(By.xpath(OR.BookFlightPage_expiryyear)));
		listbox11.selectByVisibleText(expiryyear);
			}
	
	public  void Page4_Continue_Click()throws Exception
	{
		driver.findElement(By.xpath(OR.BookFlightPage_SecurePurchase_Click)).click();
		
	}
	public void passengerCount_1(int i, String FirstName, String lastName,String meal1)throws Exception
	{
		//if (passCount=="1")
		System.out.println("meal1  value is"+meal1);
			
		// {
			
			driver.findElement(By.xpath(OR.firstname1_text)).sendKeys(FirstName);
			
			driver.findElement(By.xpath(OR.lastname1_text)).sendKeys(lastName);
			Select listbox3a =new Select(driver.findElement(By.xpath(OR.meal1_visibletext)));
			listbox3a.selectByVisibleText(meal1);
			
		//}
		
	}
	public void passengerCount_2(int i, String FirstName, String lastName,String meal1)throws Exception
	{
		
		System.out.println("meal2 value is"+meal1);
		driver.findElement(By.xpath(OR.pass2first)).sendKeys(FirstName);
		driver.findElement(By.xpath(OR.pass2last)).sendKeys(lastName);
		Select listbox3a =new Select(driver.findElement(By.xpath(OR.pass2meal)));
		listbox3a.selectByVisibleText(meal1);
			
	}
	public void passengerCount_3(int i, String FirstName, String lastName,String meal1)throws Exception
	{
		
		System.out.println("meal3 value is"+meal1);
		driver.findElement(By.xpath(OR.pass3first)).sendKeys(FirstName);
		driver.findElement(By.xpath(OR.pass3last)).sendKeys(lastName);
		Select listbox3a =new Select(driver.findElement(By.xpath(OR.pass3meal)));
		listbox3a.selectByVisibleText(meal1);
			
	}
	public void passengerCount_4(int i, String FirstName, String lastName,String meal1)throws Exception
	{
		
		System.out.println("meal4 value is"+meal1);
		driver.findElement(By.xpath(OR.pass4first)).sendKeys(FirstName);
		driver.findElement(By.xpath(OR.pass4last)).sendKeys(lastName);
		Select listbox3a =new Select(driver.findElement(By.xpath(OR.pass4meal)));
		listbox3a.selectByVisibleText(meal1);
			
	}
	}

