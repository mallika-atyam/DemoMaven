package SudhakarPageFactory;
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

public class FacebookLoginPage {
	
	
	//Facebook Login Page ends

	public String baseUrl = "https://www.facebook.com/";
	String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static WebDriver driver ; 

//Facebook Login Page starts	

@FindBy(xpath = "//*[@id='email']")
public WebElement EmailTextBox;

@FindBy(xpath = "//*[@id='pass']")
public WebElement PasswordTextBox;

@FindBy(xpath = "//input[@value='Log In'  and @aria-label='Log In']")
public WebElement LoginButton;



@BeforeTest
public void setBaseURL()
	{

	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 System.setProperty("webdriver.chrome.driver",driverPath);
	 driver =new ChromeDriver(options);
	 driver.get(baseUrl);
	    //This initElements method will create all WebElements
     PageFactory.initElements(driver, this);
     
	 driver.manage().window().maximize() ;
	
	 EmailTextBox.sendKeys("sudhakarth2009@gmail.com");
	 PasswordTextBox.sendKeys("babli12345");
	 LoginButton.click();

}

public static WebDriver sendnextbusstop()
{
 return driver;
}

}
