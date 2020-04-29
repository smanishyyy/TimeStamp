package ReusableStepDefinitionFile;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.service.pageobjectmanager.PageObjectManager;
import com.service.pageobjectmanager.PageObjectManagerIETL;
import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.EmployeePortaltestObj;

import com.snow.pages.HomepageObj;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.pages.RPSSDTechnicalSupportModeObj;
import com.snow.pages.RequestServiceObj;
import com.snow.pages.RequestedItemObj;
import com.snow.pages.SubmitNewIncidentObj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ReusableIncidentRaiseFromSp extends TestBase {
	public static HomepageObj hompage;
	public static RequestServiceObj RequestService;
	public static WebDriver driver;
	public static WebDriver driver2;
	public static WebDriver driverPa;
	public static EmployeePortaltestObj EmployeePortaltest;
	public static int whichIndexYouWantToSelect;
	public static String RequestNumber;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static CatalogtaskPageObj CatalogtaskPage;
	public static PageObjectManager PageObjectManager;
	public static PageObjectManagerIETL PageObjectManagerIETL;
	public static RequestedItemObj RequestedItem;
	public static RPSSDTechnicalSupportModeObj RPSSDTechnicalSupportMode;
	public static String PartailText;
	public static String FullText;
	public static String stringVal;

	public static File fl;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static SubmitNewIncidentObj SubmitNewIncident;
	
	public static String IncidentNumber;
@SuppressWarnings("static-access")
@Then("^clicks on the report incident link$")
public void clicks_on_the_report_incident_link() throws Throwable {
	
	hompage=PageObjectManager.getHomepageObj();
	hompage.ClickOn_ReportIncidentLink();
	
}

@SuppressWarnings("static-access")
@Then("^Agin clicks on the report incident link$")
public void agin_clicks_on_the_report_incident_link() throws Throwable {
	hompage.ClickOn_ReportAnIncidentLink(); 
	SubmitNewIncident=PageObjectManager.getSubmitNewIncidentObj();
	
}

@And("^Fill the mandatory incident field$")
public void fill_the_mandatory_incident_field() throws Throwable {
	SubmitNewIncident.SelectValue_WorkingRemotely();
	SubmitNewIncident.Set_ShortDescription();
	SubmitNewIncident.Set_ShiftHour();
	
}

@Then("^Click on the submit button$")
public void click_on_the_submit_button() throws Throwable {
	SubmitNewIncident=PageObjectManager.getSubmitNewIncidentObj();
	System.out.println("SubmitNewIncident");
	SubmitNewIncident.Click_SubmitButton();
	customefunction.sleep(6000);
}




@And("^get the incident number and take screenshot \"(.*)\"$")
public void get_the_incident_number(String ScreenshotFoldername) throws Throwable {
	IncidentNumber=SubmitNewIncident.Get_IncidentNumber();
	System.out.println("Reusable Inc : "+IncidentNumber);
	fl=TestBase.captureScreenMethod(TestBase.driver, ScreenshotFoldername);
	Reporter.addScreenCaptureFromPath(fl.toString());
}
@SuppressWarnings("static-access")
@And("^User launch the IETL view to serach the request$")
public void User_launch_the_IETL() throws Throwable 
{
	driver2=initialization2( "url2");
	System.out.print("Driver2 :"+driver2);
	PageObjectManagerIETL = new PageObjectManagerIETL(TestBase.driver2);
	RPSSDTechnicalSupportMode=	PageObjectManager.getRPSSDTechnicalSupportModeObj();
	
	//System.out.println("RequestNumber.getText() "+RPSSDTechnicalSupportMode.getRequestNumber());
	AdminHomePage=PageObjectManagerIETL.getAdminHomePageApproveRequestItemtObj();
	//customefunction.captureScreenMethod(driver2, XpathRepository.path, ScreenshotFoldername);
	AdminHomePage.SearchRequestNumberInAdmin(IncidentNumber);
	//customefunction.captureScreenMethod(driver2, XpathRepository.path, ScreenshotFoldername);	
}

@Then("^Switch to frame$")
public void switch_to_frame() throws Throwable {
    
}
}
