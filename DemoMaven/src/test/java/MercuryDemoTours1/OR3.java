package MercuryDemoTours1;

import org.openqa.selenium.WebDriver;

public class OR3 {

public static WebDriver driver ; 

// starts MercuryLoginPage by Sudhakar Date:12-Jan-2018
public static String MLPage_UserNameTextbox=" //input [  @name='userName'  ]";
public static String MLPage_PasswordTextbox="//input[@type='password' and @name='password']";
public static String MLPage_SignInButton="//input [  @name='login' and @value='Login'  ]";
public static String OneWayJourney="//input [  @name='tripType' and @value='oneway' and @type='radio' ]";
//end MercuryLoginPage 
public static String busuinessclass="//input [ @name='servClass' and  @type='radio' and  @value='Business' ]";
public static String departingfrom="//select  [  @name='fromPort'  ]";
public static String arrivingin="//select [   @name='toPort'  ]";
public static String airline="//select [ @name='airline'  ]";



}
