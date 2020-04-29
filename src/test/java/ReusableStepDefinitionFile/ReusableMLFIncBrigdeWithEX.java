package ReusableStepDefinitionFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import com.service.pageobjectmanager.PageObjectManager;
import com.service.pageobjectmanager.PageObjectManagerIETL;
import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.SoftAsserSingleton;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.finalVariable.FinalVar;
import com.snow.log.Log;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.IncidentPage_DXC_Object;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.textcontext.TextContext;
import com.snow.util.DataHelper;
import com.snow.util.ListnerAdapter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReusableMLFIncBrigdeWithEX  extends TestBase {
	
	
	
	
	public static WebDriver driver;
	public static ExtentTest logger;
	 public static WebDriver driver2;
	public static PageObjectManagerIETL PageObjectManagerIETL;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static String IncidentNumber;
	
	public static String AvaySearchINCNum;
	public static IncidentPage_DXC_Object IncidentPage_DXC;
	public static String Comment;
	public static File fl;
	public static String text;
	public static PageObjectManager PageObjectManager;
	
	public static TextContext textContext;
	public static String ShortDescription;
	
	List<HashMap<String, String>> dataSet;
	@SuppressWarnings("static-access")
	public ReusableMLFIncBrigdeWithEX(TextContext context)

	{
		
//		driver=initialization("url2");
		textContext=	context;
		
		try {
			dataSet = DataHelper.readExcelDatafromFile(System.getProperty("user.dir")+
					FinalVar.ExcelPathRead, "Sheet1");
			System.out.println("FinalVar : "+System.getProperty("user.dir")+FinalVar.ExcelPathWrite);
	System.out.println("Dataset : "+
		dataSet);

			//@SuppressWarnings("rawtypes")
			//Iterator itr = dataSet.iterator();
//
//			while (itr.hasNext()) {
//			System.out.println("rrr : " + "\n" + itr.next());
//			}
			} catch (Exception e) {
			e.printStackTrace();
			}
		
		
	}
	@Given("^user launch the ITIL view and pass test name \"([^\"]*)\"$")
	public void user_launch_the_ITIL_view_and_pass_test_name(String arg1) throws Throwable {
			
		
		driver=initialization2("url2");
		logger=ListnerAdapter.extent.createTest(arg1);
		
				logger.log(Status.PASS, "Login into MLF ITIL");
			PageObjectManagerIETL = new PageObjectManagerIETL(TestBase.driver2);
			PageObjectManager=new PageObjectManager(TestBase.driver);
			
			System.out.println("SoftAsserSingleton.getInstance() :" +SoftAsserSingleton.getInstance());
			SoftAsserSingleton.getInstance().softAssert().assertEquals(true, true);
		
	}
	@Given("^user launch the ITIL view$")
	public void user_launch_the_ITIL_view()
	{
	//driver=initialization2("url2");
	driver=initialization("url2");
	/*logger=ListnerAdapter.extent.createTest("Login Test");
	
			logger.log(Status.FAIL, "Login");*/
		PageObjectManagerIETL = new PageObjectManagerIETL(TestBase.driver);
		PageObjectManager=new PageObjectManager(TestBase.driver);
		
		System.out.println("SoftAsserSingleton.getInstance() :" +SoftAsserSingleton.getInstance());
		SoftAsserSingleton.getInstance().softAssert().assertEquals(true, true);
	}
	
	@Given ("^User logged into Service Home Portal$")
	public void User_logged_into_Service_Home_Portal()
	{
		driver=initialization("url7");
		
		PageObjectManager = new PageObjectManager(TestBase.driver);		
	
		
			
				
	}
	@SuppressWarnings("static-access")
	@And("^Open new ticket in ServiceNow at MLF$")
	public void Open_new_ticket_in_ServiceNow_at_MLF()
	{
		
		try {
			System.out.println("Clickkkk filter");
			IncidentPage_MLF=textContext.getPageObjectManagerIETL().getIncidentPage_MLF_Object();
			//IncidentPage_MLF=PageObjectManagerIETL.getIncidentPage_MLF_Object();
			IncidentPage_MLF.ClickIn_FilterBox();
			System.out.println("Clickkkk filter"+IncidentPage_MLF);
			

			IncidentPage_MLF.set_FilterBox("Incident");
			customefunction.pressEnter();
			IncidentPage_MLF.ClickOn_MyIncidentLink();
			
			customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
			
			
			

			IncidentPage_MLF.scrollToProfileIcon(driver);
			customefunction.sleep(2000);

		} catch (Exception e) {
			
			
		}
		
	}
	
	@And("^Fill description and short description along with all mandatory field$")
	public void Fill_description_and_short_description_along_with_all_mandatory_field()
	{
		try
		{
		IncidentPage_MLF.set_RequestedBy("Manish Chaurasia");
		customefunction.pressEnter();
		IncidentPage_MLF.set_Requestedfor("Payel Podder");
		customefunction.pressEnter();
		IncidentPage_MLF.set_ShortDescription("Check if MLF is getting bridged with Avaya");
		ShortDescription="Check if MLF is getting bridged with Avaya";
		IncidentPage_MLF.set_Description("Check if MLF is getting bridged with Avaya");
		customefunction.cFunSelectValueByIndexXpath("//*[@id=\"incident.u_best_contact_number\"]", TestBase.driver);
		customefunction.sendKeys("//*[@id=\"incident.u_best_contact_number\"]","8697884711",TestBase.driver);
	
		IncidentNumber=IncidentPage_MLF.getIncidentNumber();
		
		Reporter.addStepLog("MLF incident number"+IncidentNumber);
		Log.info("MLF Incident Number :"  +IncidentPage_MLF.getIncidentNumber());

		}
		catch(Exception e)
		{
		
		}
	}
	@Then("^Store the Incident number in variable$")
	public void store_the_Incident_number_in_variable() throws Throwable {
		IncidentNumber=IncidentPage_MLF.getIncidentNumber();
		Reporter.addStepLog("MLF incident number"+IncidentNumber);
		Log.info("MLF Incident Number :"  +IncidentPage_MLF.getIncidentNumber());
	}

	@SuppressWarnings("static-access")
	@Then("^Search The incident from the gloable search box$")
	public void search_The_incident_from_the_gloable_search_box() throws Throwable {
		try {
			
			
			driver.switchTo().defaultContent();
			customefunction.cusFunSerrachINCorREQ(TestBase.driver, IncidentNumber);
			customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
			customefunction.sleep(3000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	@Given("^Fill description as \"([^\"]*)\"$")
	public void fill_description_as(String arg1) throws Throwable {
		
		
		IncidentPage_MLF.set_ShortDescription(arg1);
	}

	@Given("^Fill the short description as \"([^\"]*)\"$")
	public void fill_the_short_description_as(String arg1) throws Throwable {
		IncidentPage_MLF.set_Description(arg1); 
	}
	@Given("^Select requested for as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void select_requested_for_as(String arg1, String arg2) throws Throwable {
		IncidentPage_MLF.set_RequestedBy(arg1);
		customefunction.pressEnter();
		
	//String arg2="sdfsdgdfgdfg";
	//	AvaySearchINCNum=IncidentPage_MLF.cfunToRetrieveIBMIncNum(TestBase.driver);
		fl=TestBase.captureScreenMethod(TestBase.driver, arg2);
	}

	@Given("^Select the requestedBy as \"([^\"]*)\"$")
	public void select_the_requestedBy_as(String arg1) throws Throwable {
		IncidentPage_MLF.set_Requestedfor(arg1);
		customefunction.pressEnter();
	}

	@Given("^Fill the best contact number as \"([^\"]*)\"$")
	public void fill_the_best_contact_number_as(String arg1) throws Throwable {
		IncidentPage_MLF.set_BestContact_EditBox(arg1);
	}


	@Given("^Fill the assignment group as \"([^\"]*)\"$")
	public void fill_the_assignment_group_as(String arg1) throws Throwable {
		IncidentPage_MLF.set_AssignmentGroup(arg1);
		customefunction.pressEnter();
	}


	
	@Given("^verify if source field does not have value \"(.*)\" and take screenshot \"(.*)\"$")
	public void verify_if_source_field_does_not_have_value(String arg1,String ScreenshotFoldername) throws Throwable  {
	    
		IncidentPage_MLF.ClickOn_SourceField();
		customefunction.sleep(3000);
		fl=TestBase.captureScreenMethod(TestBase.driver, ScreenshotFoldername);
		Reporter.addScreenCaptureFromPath(fl.toString());
		IncidentPage_MLF.VerifyTheSourceValue(arg1);
	}
	
	@Given("^fetch all the contains field of source field$")
	public void fetch_all_the_contains_field_of_source_field() throws Throwable {
		
		Reporter.addStepLog("MLF Source field value "+IncidentPage_MLF.fetchAllValueFromSourceFiled());
	}
	
	@Then("^Assign ticket to activated ServiceNow interface which is \"(.*)\"$")
	public void Assign_ticket_to_activated_ServiceNow(String assigned)
	{
		try
		{
		IncidentPage_MLF.set_AssignmentGroup(assigned);
		customefunction.sleep(3000);
		customefunction.pressEnter();

		IncidentPage_MLF.ClickOn_SubmitButton();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	@And("^Refresh the page$")
	public void Refresh_the_page()
	{
		try {
			
		
			TestBase.driver.switchTo().defaultContent();
	AdminHomePage=textContext.getPageObjectManagerIETL().getAdminHomePageApproveRequestItemtObj();
		
System.out.println("AdminHomePage : "+AdminHomePage);
		AdminHomePage.SearchRequestNumberInAdmin(IncidentNumber);
		customefunction.SwitchToFrmaeByNameOrID(driver, "gsft_main");
		customefunction.sleep(6000);

	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	
	}
	
	@When("^MLF incident gets bridge with CSC$")
	public void MLF_incident_gets_bridge_with_CSC()
	{

		IncidentPage_MLF.ClickOnTo_ToReloadThepage(TestBase.driver);
		customefunction.sleep(5000);	
		IncidentPage_MLF.ClickOn_RelatedRecordTab(TestBase.driver);
		customefunction.sleep(2000);	
	}
	@Then("^Reload the page to get the outbound rest trasaction$")
	public void reload_the_page_to_get_the_outbound_rest_trasaction() throws Throwable {
		IncidentPage_MLF.ClickOnTo_ToReloadThepage(TestBase.driver);
		customefunction.sleep(5000);
		IncidentPage_MLF.ClickOnTo_ToReloadThepage(TestBase.driver);
		customefunction.sleep(2000);
		
		 
	}

	@Then("^Click on the the related record$")
	public void click_on_the_the_related_record() throws Throwable {
		IncidentPage_MLF.ClickOn_RelatedRecordTab(TestBase.driver);
		customefunction.sleep(5000);	
	}

	@Then("^Store the external vendor ticket number and take screenshot in folder \"([^\"]*)\"$")
	public void store_the_external_vendor_ticket_number_and_take_screenshot_in_folder(String arg1) throws Throwable {
		customefunction.sleep(5000);
//		AvaySearchINCNum=IncidentPage_MLF.cfunToRetrieveIBMIncNum(TestBase.driver);
//		fl=TestBase.captureScreenMethod(TestBase.driver, arg1);
//		Reporter.addScreenCaptureFromPath(fl.toString());
//		Log.info("IBM Incident Number :"  +IncidentPage_MLF.cfunToRetrieveIBMIncNum(TestBase.driver));
//		Reporter.addStepLog("IBM incident number "+AvaySearchINCNum);
	}

	@Then("^take the CSC incident ticket number and take screenshot \"(.*)\"$")
	public void take_the_CSC_incident_ticket_number(String ScreenshotFoldername) throws IOException
	{
//		AvaySearchINCNum=IncidentPage_MLF.cfunToRetrieveDXCIncNum(TestBase.driver);
//		fl=TestBase.captureScreenMethod(TestBase.driver, ScreenshotFoldername);
//		Reporter.addScreenCaptureFromPath(fl.toString());
//		Log.info("DXC Incident Number :"  +IncidentPage_MLF.cfunToRetrieveDXCIncNum(driver));
//		Reporter.addStepLog("Avaya incident number "+IncidentNumber);
	}
//	@SuppressWarnings("static-access")
//	@And("^Clicks on the resolve button after filling category and subcategory as \"([^\"]*)\"$")
//	public void clicks_on_the_resolve_button(String excelDataRow)  {
//		try
//		{
//		int dataRow = Integer.parseInt(excelDataRow)-1;
//		System.out.println("DD :"+dataRow);
//		
//		IncidentPage_MLF=PageObjectManagerIETL.getIncidentPage_MLF_Object(); 
//		IncidentPage_MLF.ClickOnResolveButton();
//		customefunction.sleep(3000);
//		IncidentPage_MLF.Clickon_ActivityLogTab();
//		customefunction.sleep(2000);
//		IncidentPage_MLF.SendCommentInWorkNote("Work");
//		customefunction.sleep(2000);
//		IncidentPage_MLF.ClickOnResolveButton();
//		customefunction.sleep(2000);
//		text="svcAvayaRestIntegration";
//		IncidentPage_MLF.SetValue_AssignedTo(text);
//		customefunction.sleep(2000);
//		//text="Customer Resolved";
//		System.out.println("dataSet.get(dataRow).get(\"MLF Category Requirment\") : "+dataSet.get(dataRow).get("MLF Category Requirment"));
//		text=dataSet.get(dataRow).get("MLF Category Requirment").trim();
//		
//	
//		IncidentPage_MLF.Select_CategoryFieldByText(text);
//		customefunction.sleep(2000);
//		System.out.println("Cons2");
//		text=dataSet.get(dataRow).get("MLF SubCategory Requirment").trim();
//		IncidentPage_MLF.Select_SubCategoryFieldByText(text);
//		customefunction.sleep(2000);
//		DataHelper.setCellData("Pankaj Chaurasia", dataRow+1, 12,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"Sheet1");
//		IncidentPage_MLF.ClickOn_ClosureTabAndFillDetails();
//		IncidentPage_MLF.ClickOnResolveButton();
//	}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
	
	@SuppressWarnings("static-access")
	@And("^Clicks on the resolve button after filling category and subcategory as \"([^\"]*)\"$")
	public void clicks_on_the_resolve_button(String excelDataRow)  {
		try
		{
		int dataRow = Integer.parseInt(excelDataRow)-1;
		System.out.println("DD :"+dataRow);
		PageObjectManagerIETL = new PageObjectManagerIETL(TestBase.driver);
		IncidentPage_MLF=PageObjectManagerIETL.getIncidentPage_MLF_Object(); 
		IncidentPage_MLF.ClickOnResolveButton();
		customefunction.sleep(3000);
		IncidentPage_MLF.Clickon_ActivityLogTab();
		System.out.println("C0");
		customefunction.sleep(2000);
		try
		{
		IncidentPage_MLF.SendCommentInWorkNote("Work");
		}
		catch(Exception e)
		{
			System.out.println("Catch");	
		}
		System.out.println("C1");
		customefunction.sleep(2000);
		IncidentPage_MLF.ClickOnResolveButton();
		System.out.println("C2");
		customefunction.sleep(2000);
		text="IBM Escalation";
		IncidentPage_MLF.SetValue_AssignedTo(text);
		System.out.println("C3");
		customefunction.sleep(2000);
		//text="Customer Resolved";
		System.out.println("dataSet.get(dataRow).get(\"MLF Category Requirment\") : "+dataSet.get(dataRow).get("MLF Category Requirment"));
		text=dataSet.get(dataRow).get("MLF Category Requirment").trim();
		
	
		IncidentPage_MLF.Select_CategoryFieldByText(text);
		customefunction.sleep(2000);
		System.out.println("Cons2");
		text=dataSet.get(dataRow).get("MLF SubCategory Requirment").trim();
		IncidentPage_MLF.Select_SubCategoryFieldByText(text);
		customefunction.sleep(2000);
		DataHelper.setCellData("Pankaj Chaurasia", dataRow+1, 12,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"Sheet1");
		IncidentPage_MLF.ClickOn_ClosureTabAndFillDetails();
		IncidentPage_MLF.ClickOnResolveButton();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
