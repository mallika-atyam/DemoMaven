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

public class FacebookHomePage {
	
	static WebDriver driver;
	
//Facebook Home Page starts	

@FindBy(xpath = "//*[@id='pageLoginAnchor']")
public WebElement LogoutMenuInvoke;

@FindBy(xpath = "//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")
public WebElement LogoutInvokeLink;

@BeforeTest
public static void Hello()
{
  driver = FacebookLoginPage.sendnextbusstop();
}


@Test
public void setBaseURL1()
	{
	
 
     PageFactory.initElements(driver, this);
     
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	  
	  
	  LogoutMenuInvoke.click();

  	
    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
    LogoutInvokeLink.click();
    driver.quit();
   
	}


}
