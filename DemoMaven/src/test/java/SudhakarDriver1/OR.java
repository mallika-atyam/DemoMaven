package SudhakarDriver1;

import org.openqa.selenium.WebDriver;

public class OR {
	
	
public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	
public static WebDriver driver ; 


	

//Facebook Login Page starts	
public static String EmailTextBox="//*[@id='email']";
public static String PasswordTextBox="//*[@id='pass']";
public static String LoginButton="//input[@value='Log In'  and @aria-label='Log In']";
//Facebook Login Page ends

//Facebook Homepage Page starts	
public static String FBLogoutMenuInvoke="//*[@id='pageLoginAnchor']";
public static String FBLogout="//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']";
//Facebook Home Page ends

//Amazon Login Starts
public static String HelloSignIn="//*[@id='nav-link-yourAccount']";
public static String Email="//*[@id='ap_email']";
public static String EmailContinue="//*[@id='continue']";
public static String PassWord="//*[@id='ap_password']" ;    
public static String Login="//*[@id='signInSubmit']";
//Amazon Login Ends

//Amazon Home Page starts
public static String LogoutMenuInvoke="//*[@id='nav-link-yourAccount']";
public static String LogoutLink="//*[@id='nav-item-signout']";
//Amazon Home Page ends

}
