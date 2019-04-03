package MercuryDemoTours1;

import org.openqa.selenium.WebDriver;

public class OR {
	
public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	
public static WebDriver driver ; 

//Pages
//1.MercuryFlightFinderPage  = MFFPage
//2.MercuryLoginPage  = MLPage
//3.SelectFlightPage = SFPage


// starts MercuryLoginPage by Sudhakar Date:12-Jan-2018
public static String MLPage_UserNameTextbox="//input[@type='text'and @name='userName']";
public static String MLPage_PasswordTextbox="//input[@type='password' and @name='password']";
public static String MLPage_SignInButton="//*[@name='login']";
//end MercuryLoginPage 


//Starts MercuryFlightFinderPage by Sudhakar Date:12-Jan-2018
public static String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
public static String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";
public static String MFFPage_PassengersCountListbox="//select[@name='passCount']";
public static String MFFPage_DepartingFromListbox="//select[@name='fromPort']";
public static String MFFPage_DepartingStartMonthListbox="//select[@name='fromMonth']";
public static String MFFPage_DepartingStartDateListbox="//select[@name='fromDay']";
public static String MFFPage_ArrivingIn="//select[@name='toPort']";
public static String MFFPage_ReturningEndMonthListbox="//select[@name='toMonth']";
public static String MFFPage_ReturningEndDateListbox="//select[@name='toDay']";
public static String MFFPage_EconomyclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Coach']";
public static String MFFPage_BusinessclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Business']";
public static String MFFPage_FirstClassRadioButton ="//input[@type='radio' and @name='servClass' and @value='First']";
public static String MFFPage_AirLineListbox ="//select[@name='airline']";
public static String MFFPage_ContinueButton ="//*[@name='findFlights']";
public static String MFFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_flightfinder.gif' and @width='492' and @height='30']";
//End MercuryFlightFinderPage


//starts Mercury Select Flight Page by Sudhakar Date:12-Jan-2018
public static String SFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_selectflight.gif' and @width='492' and @height='30']";
//End Mercury Select Flight Page 

}
