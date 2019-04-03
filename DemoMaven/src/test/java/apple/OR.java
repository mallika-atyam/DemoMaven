package apple;


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
public static String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
public static String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";



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
public static String SFPage_Continue_Click ="//input[@name='reserveFlights']";
//End Mercury Select Flight Page 

public static String BookFlightPage_FirstName ="//*[@name='passFirst0']";


public static String BookFlightPage_lastName ="//input[@name='passLast0']";
public static String BookFlightPage_meal1 ="//select[@name='pass.0.meal']";
public static String BookFlightPage_CardName ="//select[@name='creditCard']";
public static String BookFlightPage_CardNumber ="//input[@name='creditnumber']";
public static String BookFlightPage_expirymonth="//select [@name='cc_exp_dt_mn']";
public static String BookFlightPage_expiryyear="//select [@name='cc_exp_dt_yr']";
public static String BookFlightPage_SecurePurchase_Click="//input [@name='buyFlights']";



public static String Output_FlightConfirmation_Number = "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::font[6]";
public static String Output_FlightBookingDate_Time="(.//*[normalize-space(text()) and normalize-space(.)='Departing'])[1]/preceding::b[1]";
public static String Output_DepartingDetails= "(.//*[normalize-space(text()) and normalize-space(.)='Departing'])[1]/following::td[1]";
public static String Output_ReturningDetails= "(.//*[normalize-space(text()) and normalize-space(.)='Returning'])[1]/following::td[1]";
public static String Output_PassengersDetails="(.//*[normalize-space(text()) and normalize-space(.)='Passengers'])[1]/following::td[1]";
public static String Output_BilledToDetails="(.//*[normalize-space(text()) and normalize-space(.)='Billed To'])[1]/following::p[1]";
public static String Output_DeliveryAddressDetails="(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address (N/A for Ticketless Travel)'])[1]/following::p[1]";
public static String Output_TotalTaxes="(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address (N/A for Ticketless Travel)'])[1]/following::font[9]";
public static String Output_TotalPrice="(.//*[normalize-space(text()) and normalize-space(.)='$89 USD'])[1]/following::font[7]";
public static String Logout="//img[@src='/images/forms/Logout.gif']";

}


