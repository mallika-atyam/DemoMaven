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

public class TC01_FacebookPF {
	
	
	
	@Test
	public void hai()
	{
		FacebookLoginPage fl2= new FacebookLoginPage();
		fl2.setBaseURL();
		FacebookHomePage FH = new FacebookHomePage();
		FH.Hello();
		FH.setBaseURL1();
	}
	
}
