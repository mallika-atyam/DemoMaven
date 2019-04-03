package SudhakarPageFactoryGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_FacebookPFGlobal  {
	
	
	//Facebook Login Page ends

	//public String baseUrl = "https://www.facebook.com/";
	//String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	//public  WebDriver driver ; 

@BeforeTest
public void setBaseURL()
	{
      
	 OR or1= new OR();
	 or1.OpenBrowser();
	 
	 FacebookLoginPage FL = new FacebookLoginPage();
	 FL.Hai();
	 
	 FacebookHomePage FH = new FacebookHomePage();
	 FH.setBaseURL1();

}




}
