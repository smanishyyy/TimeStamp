package ReusableStepDefinitionFile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.cucumber.listener.Reporter;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.pages.ACLNetwrkFldrPage_Obj;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.pages.RITMpageObj;
import com.snow.textcontext.TextContext;

import cucumber.api.java.en.Then;

public class ReusableForApproval {
	public static File fl;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static ACLNetwrkFldrPage_Obj ACLNetwrkFldrPage;
	public static TextContext textContext;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static RITMpageObj RITMpage;
	@SuppressWarnings("static-access")
	public ReusableForApproval(TextContext con)
	{
		textContext=con;
		AdminHomePage=textContext.getPageObjectManagerIETL().getAdminHomePageApproveRequestItemtObj();
		RITMpage=textContext.getPageObjectManagerIETL().getRITMpageObj();
	}
	
	@Then("^Clicks on the approver tab$")
	public void clicks_on_the_approver_tab() throws Throwable {
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver2, "gsft_main");
		customefunction.sleep(2000);
		
		 
	}

	@Then("^Scroll down to the bottom and takse snap as \"([^\"]*)\"$")
	public void scroll_down_to_the_bottom_and_takse_snap_as(String arg1) throws Throwable {
		AdminHomePage.ApproverTab.click(); 
		customefunction.cFunScrollToElement("//*[@id=\"page_timing_div\"]/button", TestBase.driver2);
		fl=TestBase.captureScreenMethod(TestBase.driver2, arg1);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Then("^Click on the RITM link and take snap as \"([^\"]*)\"$")
	public void click_on_the_RITM_link_and_take_snap_as(String arg1) throws Throwable {
		AdminHomePage.Click_OnTheRITMLink(); 
	}

	@Then("^Scroll donw to the bottom and take snap as \"([^\"]*)\"$")
	public void scroll_donw_to_the_bottom_and_take_snap_as(String arg1) throws Throwable {
		customefunction.cFunScrollToElement("//*[@id=\"page_timing_div\"]/button", TestBase.driver2); 
	
		fl=TestBase.captureScreenMethod(TestBase.driver2, arg1);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Then("^verify the task short description and assignement group$")
	public void verify_the_task_short_description_and_assignement_group() throws Throwable {
	   
	}

	@Then("^assignement group should be \"([^\"]*)\"$")
	public void assignement_group_should_be(String arg1) throws Throwable {
		RITMpage=textContext.getPageObjectManagerIETL().getRITMpageObj();
		Reporter.addStepLog("Assignement Group : "+RITMpage.FirstRow_AssignementGroup.getText());
	}

	@Then("^task short description should be \"([^\"]*)\"$")
	public void task_short_description_should_be(String arg1) throws Throwable {
		
		Reporter.addStepLog("Task Short description :  "+RITMpage.FirstRow_ShortDescription.getText());
	}
	
	@Then("^Approve the request for \"([^\"]*)\" and take snap as \"([^\"]*)\"$")
	public void verify_if_manager_approval_is_required_for_the_Item_and_take_snap_as(String arg1, String arg2) throws Throwable {

		System.out.println("ff");
		customefunction.sleep(3000);
		
		fl=TestBase.captureScreenMethod(TestBase.driver2, arg2);
		try {
			Reporter.addScreenCaptureFromPath(fl.toString());
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		AdminHomePage.ApproverTab.click();
		WebElement ele=AdminHomePage.ApproverTab;

		System.out.println("ff2");

		
		Reporter.addStepLog(AdminHomePage.ApproveToRequest());

	}
	


}
