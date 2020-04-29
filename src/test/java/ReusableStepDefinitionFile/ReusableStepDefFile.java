package ReusableStepDefinitionFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import com.service.pageobjectmanager.PageObjectManager;
import com.service.pageobjectmanager.PageObjectManagerIETL;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.finalVariable.FinalVar;
import com.snow.log.Log;
import com.snow.pages.ACLNetwrkFldrPage_Obj;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.EmployeePortaltestObj;
import com.snow.pages.HPPrinterItemObj;
import com.snow.pages.HomepageObj;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.pages.RPSSDTechnicalSupportModeObj;
import com.snow.pages.RequestServiceObj;
import com.snow.pages.RequestedItemObj;
import com.snow.textcontext.TextContext;
import com.snow.util.DataHelper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReusableStepDefFile extends TestBase{
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
	public static String xpath;;
	public static String stringVal;
	public static HPPrinterItemObj HPPrinterItem;
	public static File fl;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static ACLNetwrkFldrPage_Obj ACLNetwrkFldrPage;
	public static TextContext textContext;
	public static WebDriverWait wait;
	public static String ReqNum;
	List<HashMap<String, String>> dataSet;
	
	@SuppressWarnings("static-access")
	public ReusableStepDefFile(TextContext con) {
		textContext=con;
		RequestService=textContext.getPageObjectManager().getRequestServiceObj();
		
		System.out.println("Initial RequestService : "+RequestService);
	
		
		
	}
	@SuppressWarnings({ "static-access", "deprecation" })
	@Given("^User logged into Service Now Portal$")
	public void User_logged_into_Service_Now_Portal()
	{
		driver=initialization("url");
	
		PageObjectManager = new PageObjectManager(driver);		
	
		hompage=PageObjectManager.getHomepageObj();
			
				
	}
	
	@When("^get the data from sheet as \"([^\"]*)\" and column anme as \"([^\"]*)\"$")
	public void get_the_data_from_sheet_as_and_column_anme_as(String arg1, String arg2) throws Throwable {
		try {
			dataSet = DataHelper.readExcelDatafromFile(System.getProperty("user.dir")+
					FinalVar.ExcelPathRead, "Data");
			System.out.println("FinalVar : "+System.getProperty("user.dir")+FinalVar.ExcelPathWrite);
			System.out.println("Dataset : "+
			dataSet);
			System.out.println("dataSet.get(dataRow).get(\"MLF Category Requirment\") : "+dataSet.get(Integer.parseInt(arg1)).get(arg2));

			} catch (Exception e) {
			e.printStackTrace();
			}
		
	}


	@When("^Clicks on Request service link on the home page$")
	public void Clicks_on_Request_service_link_on_the_home_page()
	{
		
		hompage.clickOn_RequestLink();	
		
	}
	
	@SuppressWarnings("static-access")
	@Then("^user select the requested for as with index \"(.*)\"$")
	public void user_select_the_requested_for_Index(String RequesterFor)
	{
		RequestService=PageObjectManager.getRequestServiceObj();
		
		System.out.println("RequestService : "+RequestService);
		RequestService.ClickOn_RequestedForContext();
//		customefunction.sleep(4000);
		RequestService.ClickOn_RequestedForEditBox();
		
		RequestService.set_RequestedForEditBox(RequesterFor);

		RequestService.ClickOn_RequestedForLink_withIndex(7,RequesterFor,TestBase.driver);
	}
	@SuppressWarnings("static-access")
	@And("^User gets select the country as \"(.*)\"$")
	public void User_gets_select_the_country_and_searches_to_the_Item(String Country)
	{
		RequestService=PageObjectManager.getRequestServiceObj();	
		
		RequestService.ClickOn_CountryCatlog();
		RequestService.ClickOn_CountryCatlogEditBox();
		RequestService.set_CountryCatlogEditBox(Country);
		RequestService.ClickOn_CountryListLink();
		
		RequestService.ClickOn_GoButtonk();	
	}
	@SuppressWarnings("static-access")
	@When("^user search the item \"(.*)\"$")
	public void user_search_the_item(String ItemName)
	{
		EmployeePortaltest=	PageObjectManager.getEmployeePortaltestObj();
		EmployeePortaltest.ClickOn_Placeholder();
		EmployeePortaltest.set_Placeholder(ItemName);
		customefunction.pressEnter();
		
	}
	@When("^user impersonate the user \"([^\"]*)\"$")
	public void user_impersonate_the_user(String arg1) throws Throwable {
		customefunction.sleep(3000);
	   xpath="//*[@id=\"user_info_dropdown\"]";
	   customefunction.sleep(3000);
	   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	   xpath="(//*[text()='Impersonate User'])[1]";
	   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	   
	   xpath="//*[@id=\"select2-chosen-2\"]";
	   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	   xpath="//*[@id=\"s2id_autogen2_search\"]";
	   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	   customefunction.sendKeys(xpath, arg1, TestBase.driver);
	   customefunction.sleep(2000);
	   xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
	   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	   customefunction.sleep(4000);
	}
	
	@When("^verify the user profile$")
	public void verify_the_user_profile() throws Throwable {
		xpath="//*[@id=\"user_info_dropdown\"]";
		   customefunction.sleep(3000);
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click(); 
		   xpath="(//*[text()='Profile'])";
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}




	
	@SuppressWarnings("static-access")
	@And("^Click on the Item link$")
	public void Click_on_the_Item_link()
	{
		System.out.println("link : "+driver);
		
		EmployeePortaltest=PageObjectManager.getEmployeePortaltestObj();
		
		customefunction.sleep(2000);
	    EmployeePortaltest.ClickOn_ItemLink_RPSSDTechnicalSupportModeObj();	
	  
	}
	@SuppressWarnings("static-access")
	@When("^Verify the title \"(.*)\"$")
	public void Verify_The_Form_title(String FormTitle)
	{
		
		RPSSDTechnicalSupportMode=	PageObjectManager.getRPSSDTechnicalSupportModeObj();
		
		System.out.println("RPSSDTechnicalSupportMode :"+RPSSDTechnicalSupportMode);
		PartailText=FormTitle;
		String pagetitle=customefunction.cFunToVrfyStaticTextGeneric(TestBase.driver,FormTitle,FormTitle);
		Log.info("Form page title is :"+pagetitle );
		Reporter.addStepLog("Form page title is : "+pagetitle);
		//customefunction.cFunScrollToElement("(//*[contains(text(),'Employee Portal - Test')])", TestBase.driver);
		customefunction.cFunScrollToElement(RPSSDTechnicalSupportMode.getTitleXpath(), TestBase.driver);
		
		
	}
	@SuppressWarnings("static-access")
	@And("^click on add cart button and submit the request for HP Item \"(.*)\"$")
			public void click_on_add_cart_button_and_submit_the_request(String ScreenShotFolderName)
			{
		HPPrinterItem=	PageObjectManager.getHPPrinterItemObj();
		HPPrinterItem.ClickOn_AddCartButton();
		
		HPPrinterItem.ClickOn_CartLink();
		HPPrinterItem.ClickOn_ProceedToCheckOut();
		RPSSDTechnicalSupportMode=	PageObjectManager.getRPSSDTechnicalSupportModeObj();
		System.out.println("RSS "+RPSSDTechnicalSupportMode);
		RPSSDTechnicalSupportMode.ClickOn_CheckOutButton();
		System.out.println("RequestNumber.getText() "+RPSSDTechnicalSupportMode.getRequestNumber());
		Log.info("RequestNumber : "+ RPSSDTechnicalSupportMode.getRequestNumber());
		ReqNum=RPSSDTechnicalSupportMode.getRequestNumber();
		Reporter.addStepLog("MLF Request number "+ReqNum);
		
		fl=TestBase.captureScreenMethod(TestBase.driver, ScreenShotFolderName);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
			}
	
	@Then("^store the tciket number in sheet for row as \"([^\"]*)\"$")
	public void store_the_tciket_number_in_sheet_for_row_as(String arg1) throws Throwable {
		DataHelper.setCellData(ReqNum, Integer.parseInt(arg1), 2,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"Data");
		DataHelper.setCellData(this.getClass().getName().substring(15), Integer.parseInt(arg1), 1,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"Data");
	}


	@SuppressWarnings("static-access")
	@And("User launch the IETL view and search the request$")
	public void And_User_launch_the_IETL_view_and_search_the_request()
	{
		
		driver2=initialization2( "url2");
		System.out.print("Driver2 :"+driver2);
		PageObjectManagerIETL = new PageObjectManagerIETL(TestBase.driver2);
		RPSSDTechnicalSupportMode=	PageObjectManager.getRPSSDTechnicalSupportModeObj();
				System.out.println("RequestNumber.getText() "+RPSSDTechnicalSupportMode.getRequestNumber());
		AdminHomePage=PageObjectManagerIETL.getAdminHomePageApproveRequestItemtObj();
		
		System.out.println("AdminHomePage111111 : "+AdminHomePage);
		
	AdminHomePage.SearchRequestNumberInAdmin(RPSSDTechnicalSupportMode.getRequestNumber());
		//AdminHomePage.SearchRequestNumberInAdmin("REQ01731637");
		
		
	}
	@And("^user_approve_the_request$")
	public void user_approve_the_request()
	{
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver2, "gsft_main");
		customefunction.sleep(2000);
		
		
	}
	
	@Then("^Verify if manager approval is required for the Item \"([^\"]*)\" and take snap as \"([^\"]*)\"$")
	public void verify_if_manager_approval_is_required_for_the_Item_and_take_snap_as(String arg1, String arg2) throws Throwable {
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver2, "gsft_main");
		customefunction.sleep(2000);
		System.out.println("ff");
		customefunction.sleep(3000);
		customefunction.cFunScrollToElement("//*[@id=\"page_timing_div\"]/button", TestBase.driver2);
		
		fl=TestBase.captureScreenMethod(TestBase.driver2, arg2);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		AdminHomePage.ApproverTab.click();
		WebElement ele=AdminHomePage.ApproverTab;
		//customefunction.cFunScrollToElementt(ele, TestBase.driver2);
		System.out.println("ff2");
		
//		Log.info("Manager approavl : "+ AdminHomePage.ApproveToRequest());
		
		Reporter.addStepLog(AdminHomePage.ApproveToRequest());
//		fl=TestBase.captureScreenMethod(TestBase.driver2, arg2);
//		try {
//			Reporter.addScreenCaptureFromPath(fl.toString());
//			AdminHomePage.ApproveToRequest();
//			System.out.println("ff3");
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		}
//		System.out.println("ff4");
	}
	
	@And("^user search the Permissions Model RITM$")
	public void And_user_clicks_on_the_Permissions_Model_RITM()
	{

		
			
	}
	@Then("^approve the requested item$")
	public void Then_approve_the_requested_item()
	{
		System.out.println("ff");
		AdminHomePage.ApproveToRequest();
	//	customefunction.captureScreenMethod(driver2, XpathRepository.path, ScreenshotFoldername);
	}
	@SuppressWarnings("static-access")
	@And("^click on the requested tab and click on the RITM link \"(.*)\"$")
	public void click_on_the_requested_tab_and_click_on_the_RITM_link(String ScreenShotFolderName )
	{
		AdminHomePage=PageObjectManagerIETL.getAdminHomePageApproveRequestItemtObj();
		AdminHomePage.Click_OnTheRITMLink();
		customefunction.sleep(3000);
		fl=TestBase.captureScreenMethod(TestBase.driver2,ScreenShotFolderName);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("static-access")
	@And("^click on the task link and close the task till automate task gets triggered and pass \"(.*)\" , \"(.*)\"$")
	
	public void click_on_the_task_link_and_close_the_task_till_automate_task_gets(String ShortDesc, String AssignedTo)
	{
		AdminHomePage.ApproveToRequestItem(TestBase.driver2);
		CatalogtaskPage=	PageObjectManagerIETL.getCatalogtaskPageObj() ;
		IncidentPage_MLF=PageObjectManagerIETL.getIncidentPage_MLF_Object();
		AdminHomePage.CloseCompleteTheTaskTill_AssigningToOrchestrationGroup_DataDriven(CatalogtaskPage, IncidentPage_MLF, TestBase.driver2, ShortDesc, AssignedTo);
	}
	@And("^click on the task link$")
	public void click_on_the_task_link ()
	{
		
		AdminHomePage.ApproveToRequestItem(TestBase.driver2);
		AdminHomePage.Click_OnCatalogTaskLink();
	}
//	@After(order=1)
	@Then("^close the browser$")
	public  void close_the_browser() {
	try
	{
		if(TestBase.driver!=null)
		{
	TestBase.driver.quit();
	System.out.println("Close first browser");
	if(TestBase.driver2!=null)
	{
		TestBase.driver2.quit();
		System.out.println("Close Second browser");	
	}
		}
		
		System.out.println("End");
	}
	catch(Exception e)
	{
		e.printStackTrace();	
	}
		finally
        { 
            System.out.println("Finally"); 
        } 
		
		}
	
	
//	@After(order=0)
	@And("^close the second browser$")
	public static void And_close_the_second_browser()
	{
		
		TestBase.driver2.quit();
		}
	
	
	@Given("^User launch the IETL view to serach the request or incident \"([^\"]*)\" take screenshot \"([^\"]*)\"$")
	public void user_launch_the_IETL_view_to_serach_the_request_or_incident(String arg1,String ScreenshotFoldername) throws Throwable {
		//driver2=initialization2( "url2");
		System.out.print("Driver2 :"+driver2);

		
		customefunction.cusFunSerrachINCorREQ(TestBase.driver2, arg1);
		fl=TestBase.captureScreenMethod(TestBase.driver2, ScreenshotFoldername);
		Reporter.addScreenCaptureFromPath(fl.toString());
	}
	
	@Then("^Take Screenshot \"([^\"]*)\" from first driver$")
	public void take_Screenshot_from_first_driver(String arg1) throws Throwable {
		fl=TestBase.captureScreenMethod(TestBase.driver,arg1);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
		} catch (IOException e) {
		
			e.printStackTrace();
		}  
	}

	@Then("^Take Screenshot \"([^\"]*)\" from second driver$")
	public void take_Screenshot_from_second_driver(String arg1) throws Throwable {
		customefunction.sleep(3000);
		fl=TestBase.captureScreenMethod(TestBase.driver2,arg1);
		
		try {
			ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Take screenhot");
			ReusableMLFIncBrigdeWithEX.logger.addScreenCaptureFromPath(fl.toString());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}


	@SuppressWarnings("static-access")
	@And("^Approve the task and click on the Catalog task tab$")
	public void Approve_the_task_and_click_on_the_Catalog()
	{
		
		
		AdminHomePage=	textContext.getPageObjectManagerIETL().getAdminHomePageApproveRequestItemtObj();
		System.out.println("AdminHomePage111111 : "+AdminHomePage);
		
		AdminHomePage.ApproveToRequestItem(TestBase.driver2);	
		customefunction.sleep(3000);
		customefunction.cFunScrollToElement("//*[@id=\"page_timing_div\"]/button", TestBase.driver2);
		customefunction.sleep(3000);
	}
	@Then("^user serach the item as \"([^\"]*)\"$")
	public void user_serach_the_item_as(String arg1) throws Throwable {
		
		
		customefunction.waitVisibilityOfElementLocated("//*[text()='Communication Services-Canada']", 15, TestBase.driver).click();
	
		customefunction.waitVisibilityOfElementLocated("//*[text()='Mobile Services-Canada']", 15, TestBase.driver).click();
		
		customefunction.waitVisibilityOfElementLocated("//*[text()='iPhone (Incident)']", 15, TestBase.driver).click();
		
		
	}
	@Then("^user serach the item2 as \"([^\"]*)\"$")
	public void user_serach_the_item2_as(String arg1) throws Throwable {
		
		
		customefunction.waitVisibilityOfElementLocated("//*[text()='Hardware-Canada']", 15, TestBase.driver).click();
	
		//customefunction.waitVisibilityOfElementLocated("//*[text()='Mobile Services-Canada']", 15, TestBase.driver).click();
		
		customefunction.waitVisibilityOfElementLocated("//*[text()='Loaner Asset (TechLounge)']", 15, TestBase.driver).click();
		
		
	}
	@SuppressWarnings("static-access")
	@Then("^click on add cart button and submit the request \"([^\"]*)\" and take snap as \"([^\"]*)\"$")
	public void click_on_add_cart_button_and_submit_the_request_and_take_snap_as(String arg1, String arg2) throws Throwable {
		ACLNetwrkFldrPage=textContext.getPageObjectManager().getACLNetwrkFldrPage_Obj();
		ACLNetwrkFldrPage.Button_AddToCart.click();
		customefunction.sleep(4000);
		ACLNetwrkFldrPage.link_CartLink.click();
		customefunction.sleep(4000);
		//customefunction.cFunScrollToElement("(//*[text()='View Cart'])[1]", TestBase.driver);
		ACLNetwrkFldrPage.Button_ViewCart.click();
		ACLNetwrkFldrPage.Button_CheckOut.click();
		System.out.println("RSS "+RPSSDTechnicalSupportMode);
		//RPSSDTechnicalSupportMode.ClickOn_CheckOutButton();
		System.out.println("RequestNumber.getText() "+RPSSDTechnicalSupportMode.getRequestNumber());
		Log.info("RequestNumber : "+ RPSSDTechnicalSupportMode.getRequestNumber());
		String ReqNum=RPSSDTechnicalSupportMode.getRequestNumber();
		Reporter.addStepLog("MLF Request number "+ReqNum);
		fl=TestBase.captureScreenMethod(TestBase.driver, arg2);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
		} catch (IOException e) {
		
			e.printStackTrace();
	}
	}
	@When("^Scroll to the Top$")
	public void scroll_to_the_Top() throws Throwable {
		customefunction.cFunScrollToElement("//*[contains(text(),'Employee Portal - Development')]", TestBase.driver);  
	}
	
	@And("^Approve the taskk and click on the Catalog task tab$")
	public void Approve_the_taskk_and_click_on_the_Catalog()
	{
		
		
		AdminHomePage=	textContext.getPageObjectManagerIETL().getAdminHomePageApproveRequestItemtObj();
		System.out.println("AdminHomePage111111 : "+AdminHomePage);
		
		AdminHomePage.ApproveByAllApprover(TestBase.driver2);	
		customefunction.sleep(3000);
		//customefunction.cFunScrollToElement("//*[@id=\"page_timing_div\"]/button", TestBase.driver2);
		//customefunction.sleep(3000);
	}
	@When("^user impersonate the user(\\d+) \"([^\"]*)\"$")
	public void user_impersonate_the_user(int arg1, String arg2) throws Throwable {
		TestBase.driver.switchTo().defaultContent();
		customefunction.sleep(3000);
		   xpath="//*[@id=\"user_info_dropdown\"]";
		   customefunction.sleep(3000);
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		   xpath="(//*[text()='Impersonate User'])[1]";
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		   
		   xpath="//*[@id=\"select2-chosen-2\"]";
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		   xpath="//*[@id=\"s2id_autogen2_search\"]";
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		   customefunction.sendKeys(xpath, arg2, TestBase.driver);
		   customefunction.sleep(2000);
		   xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		   customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		   customefunction.sleep(4000);
	}
	@When("^user swicth frame$")
	public void user_swicth_frame() throws Throwable {
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
	}
	@Then("^user search the incident number$")
	public void user_search_the_incident_number() throws Throwable {
		try {
			
			
			TestBase.driver.switchTo().defaultContent();
	AdminHomePage=textContext.getPageObjectManagerIETL().getAdminHomePageApproveRequestItemtObj();
	customefunction.sleep(50000);	
System.out.println("AdminHomePage : "+AdminHomePage);
		AdminHomePage.SearchRequestNumberInAdmin(ReusableMLFIncBrigdeWithEX.IncidentNumber);
		TestBase.driver.switchTo().defaultContent();
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
		customefunction.sleep(3000);

	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	}
	@Then("^verify if the email notifiaction has italics message as \"([^\"]*)\"$")
	public void verify_if_the_email_notifiaction_has_italics_message_as(String arg1) throws Throwable {
		try
		{
			xpath="(//*[text()='Activity Log'])[1]";
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
			xpath="//*[text()='Post']";
			//customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
			customefunction.cFunScrollToElement(xpath, TestBase.driver);
			customefunction.sleep(4000);
			WebElement ele=TestBase.driver.findElement(By.xpath("//*[text()='Show email details']"));
			customefunction.clickByJs(ele, TestBase.driver);
			customefunction.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}  
	}
	
	


}
