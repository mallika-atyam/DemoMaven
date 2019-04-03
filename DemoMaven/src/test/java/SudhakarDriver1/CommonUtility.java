package SudhakarDriver1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonUtility {


 	
    public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static WebDriver driver ; 
    
    public static void  FBSetBaseURL() throws IOException
    {
         
    	 ChromeOptions options = new ChromeOptions();
    	 options.addArguments("--disable-notifications");
    	 
    	 System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver =new ChromeDriver(options);
    	 driver.manage().window().maximize() ;
     	
    }
    
    
    public static WebDriver  GetDriverFromCommonUtility() throws IOException
    {
    	driver = driver;
    	 return driver;
    }
    
    public static void  SetDriverInCommonUtility(WebDriver driver) throws IOException
    {
    	driver = driver;
    }
    
    
    
    
    
    
    
    
    
    
    public static void   CloseBrowser() throws IOException
    {
    	driver=OR.driver;
    	Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,2,7,OR.sTargetFolderPath);
    	driver.quit();
    	System.out.println("CommonUtility Close Broswser called");
    }
    
    //LogoutFaceBook starts
    public static void LogoutFaceBook() throws IOException
    {
    	try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	  
	  
      driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();

    	
      try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
      driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")).click();
     
    }
   
    //LogoutFaceBook ends
    

}
