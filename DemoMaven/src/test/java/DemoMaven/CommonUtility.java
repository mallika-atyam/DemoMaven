package DemoMaven;

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
    
    public static WebDriver  FBSetBaseURL() throws IOException
    {
         
    	 ChromeOptions options = new ChromeOptions();
    	 options.addArguments("--disable-notifications");
    	 
    	 System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver =new ChromeDriver(options);
    	 driver.manage().window().maximize() ;
     	 
     	 return driver;
     	 
    }
    
    public static void   CloseBrowser() throws IOException
    {
    	driver.quit();
    }
    
   
    
    

}
