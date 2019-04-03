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

public  class OR {
	
public  WebDriver driver;
public String baseUrl = "https://www.facebook.com/";
String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	
@FindBy(xpath = "//*[@id='email']")
public WebElement EmailTextBox;

@FindBy(xpath = "//*[@id='pass']")
public WebElement PasswordTextBox;

@FindBy(xpath = "//input[@value='Log In'  and @aria-label='Log In']")
public WebElement LoginButton;


@FindBy(xpath = "//*[@id='pageLoginAnchor']")
public WebElement LogoutMenuInvoke;

@FindBy(xpath = "//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")
public WebElement LogoutInvokeLink;



@BeforeTest
public   void  Hello(WebDriver driver)
{
  this.driver = driver;
  PageFactory.initElements(driver, this);
}


public void wait123()
{

	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
				e.printStackTrace();
	}
	
}




public void OpenBrowser()
{

	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 System.setProperty("webdriver.chrome.driver",driverPath);
	 driver =new ChromeDriver(options);
	 driver.get(baseUrl);
	 driver.manage().window().maximize() ;
}


}
