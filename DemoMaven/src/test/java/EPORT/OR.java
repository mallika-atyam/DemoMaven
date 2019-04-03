package EPORT;


import org.openqa.selenium.WebDriver;

public class OR {
	

public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	

public static String username_sendkey="//input[@id='txtUsername']";
public static String password_sendkey="//input[@id='txtPassword']";
public static String login_click="//input[@id='btnLogin']";

//EMP EXPORT


public static String pim_focus="//a[@id='menu_pim_viewPimModule']";
public static String EMPlist_click="//a[@id='menu_pim_viewEmployeeList']";
public static String EMPcolumn="//*[@id='resultTable']/thead/tr/th";
public static String EMProws="//*[@id='resultTable']/tbody/tr/td[2]";

//ADMIN EXPORT

public static String ADMIN_focus="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_USERMANAGEMENT_focus="//a[@id='menu_admin_UserManagement']";


public static String ADMIN_USERS_click="//a[@id='menu_admin_viewSystemUsers']";

public static String ADMIN_COLUMNS_click="//*[@id='resultTable']/thead/tr/th";

public static String ADMIN_ROWS_click="//*[@id='resultTable']/tbody/tr/td[2]";

//admin qualifications export
public static String ADMIN_FOCUS="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_QUALIFICATIONS_FOCUS="//a[@id='menu_admin_Qualifications']";


public static String ADMIN_SKILLS_CLICK="//a[@id='menu_admin_viewSkills']";

public static String ADMIN_NUMOFCOLUMNS="//*[@id='recordsListTable']/thead/tr/th";

public static String ADMIN_NUMOFROWS="//*[@id='recordsListTable']/tbody/tr/td[2]";

//LeaveList Export
public static String Leave_focus="//*[@id='menu_leave_viewLeaveModule']";
public static String Leavelist_click="//a[@id='menu_leave_viewLeaveList']";
public static String Leave_all_checkbox="//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";
public static String Leave_search_click="//*[@id='btnSearch']";
public static String Leave_Num_columns="//*[@id='resultTable']/thead/tr/th";
public static String Leave_Num_rows="//*[@id='resultTable']/tbody/tr/td[2]";

//admin qualifications languages



public static String languages="//*[@id='menu_admin_viewLanguages']";

public static String languages_columns="//*[@id='recordsListTable']/thead/tr/th";

public static String languages_rows="//*[@id='recordsListTable']/tbody/tr/td[2]/a";

// admin Organization locations


public static String admin_org_focus="//a[@ id='menu_admin_Organization']";
public static String admin_org_locationsClick="//*[@id='menu_admin_viewLocations']";

public static String adminOrgLoc_columns="//*[@id='resultTable']/thead/tr/th";
public static String adminOrgLoc_rows="//*[@id='resultTable']/tbody/tr/td[2]";
}