package DharmajaBasic1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Amajon {

	  public String baseUrl = "https://www.amazon.in/";
	  String driverPath = "E:\\seleni\\seleni\\chromedriver_win32\\chromedriver.exe";
	  public WebDriver driver ; 

  // starts Before Class 	  
  @BeforeTest
  public void setBaseURL() {
  	
 	 System.setProperty("webdriver.chrome.driver",driverPath);
 	 driver = new ChromeDriver(); 
     driver.get(baseUrl);
     driver.manage().window().maximize() ;
     
     Actions actions = new Actions(driver);   
		 
	 WebElement ele=driver.findElement(By.xpath("//*[text()='Hello. Sign in']"));
	 new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele));	 
	 actions.moveToElement(ele).click().build().perform();
   
	   driver.findElement
	   (By.xpath(" //input[@type='email' and @maxlength='128' and  @id='ap_email' and  @name='email']"))
	   .sendKeys("sudhakarth2008@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("babli1234");
	   driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
      
    WebElement ele1=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]"));
	new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele1));	 
	actions.moveToElement(ele1).perform();

    WebElement ele2=driver.findElement(By.xpath("//*[text()='Sign Out']"));
	new WebDriverWait(driver, 1990000000).until(ExpectedConditions.visibilityOf(ele2));	 
	actions.moveToElement(ele2).click().build().perform();
 	 
  	}// Ends Before Class  

	  @AfterTest
	  public void afterTest() {
		  	driver.quit();
	  }
	  

	}
