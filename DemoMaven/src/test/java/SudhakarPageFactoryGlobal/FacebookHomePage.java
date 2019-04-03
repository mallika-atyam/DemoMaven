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

public class FacebookHomePage {
	
	static WebDriver driver;

@Test
public  void setBaseURL1()
	{
	
	OR or1= new OR();
     or1.Hello(driver);
	 PageFactory.initElements(driver, this);
     
	  or1.wait123();
	  or1.LogoutMenuInvoke.click();	
	  or1.wait123();
	  or1.LogoutInvokeLink.click();
      
	  driver.quit();
   
	}


}
