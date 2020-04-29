package ReusableStepDefinitionFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import com.service.pageobjectmanager.PageObjectManagerIBM;
import com.service.pageobjectmanager.PageObjectManagerIETL;
import com.snow.base.SoftAsserSingleton;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.finalVariable.FinalVar;
import com.snow.pages.MLFChangeFormObj;
import com.snow.textcontext.TextContext;
import com.snow.util.DataHelper;
import com.snow.util.ListnerAdapter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ReusableMLFtoIBMChangebr extends TestBase{
	public static MLFChangeFormObj MLFChangeForm;
	public static String x1,x2,x3,val;
	public static PageObjectManagerIETL PageObjectManagerIETL;
	public static TextContext textContext;
	public static WebElement ele;
	public static String xpath;
	public static String changeRequest;
	public static String changeIBMRequest;
	public static String bufferString;
	public static PageObjectManagerIBM PageObjectManagerIBM;

	public ReusableMLFtoIBMChangebr(TextContext con) {
		textContext = con;

	}

	@Given("^click on the create new change option$")
	public void click_on_the_crete_new_change_option() throws Throwable {
		System.out.println(PageObjectManagerIETL);
		// PageObjectManagerIETL.getMLFChangeFormObj().createNewLink.click();
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().createNewLink.click();
		customefunction.sleep(3000);
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver2, "gsft_main");
		xpath = "//*[@id=\"sysverb_new\"]";
		xpath = "//*[@id=\"sys_readonly.change_request.number\"]";
		changeRequest = customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver2)
				.getAttribute("value");
		System.out.println("changeRequest : " + changeRequest);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Initiate change to bridge with IBM");
		
	}

	@Given("^select the risk as \"([^\"]*)\"$")
	public void select_the_risk_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().riskDropDown;
		customefunction.SelectValFromDrp(TestBase.driver2, ele, arg1);
		customefunction.highliteElement(ele, TestBase.driver2);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Select risk as "+arg1);
	}

	@Given("^select the type as \"([^\"]*)\"$")
	public void select_the_type_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().typeDropDown;
		customefunction.SelectValFromDrp(TestBase.driver2, ele, arg1);
//		System.out.println("SoftAsserSingleton.getInstance() :" +SoftAsserSingleton.getInstance());
//		SoftAsserSingleton.getInstance().softAssert().assertEquals(true, false);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Select type as "+arg1);
	}

	@Given("^select the category as \"([^\"]*)\"$")
	public void select_the_category_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().categoryDropDown;
		customefunction.SelectValFromDrp(TestBase.driver2, ele, arg1);
		System.out.println("SoftAsserSingleton.getInstance() :" +SoftAsserSingleton.getInstance());
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Select category as "+arg1);
	
	}

	@Given("^passed the affected CI as \"([^\"]*)\"$")
	public void passed_the_affected_CI_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().affectedCIEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
		customefunction.pressEnter();
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Put the affected CI as "+arg1);
		
	}

	@Given("^select the impact as \"([^\"]*)\"$")
	public void select_the_impact_as(String arg1) throws Throwable {
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().impactButton.click();
		xpath = "//*[@id='change_request.short_description']";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver2);
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().impactEdit.click();
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().impactEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
		customefunction.pressEnter();
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Select impact as "+arg1);

	}

	@Given("^fill the change summary change as \"([^\"]*)\"$")
	public void fill_the_change_summary_change_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().summaryEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Fill the  summary change with "+": "+arg1);
	}

	@Given("^fill the description as \"([^\"]*)\"$")
	public void fill_the_description_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().DescriptionEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Fill the description change with "+": "+arg1);
	}

	@Given("^select the owner group as \"([^\"]*)\"$")
	public void select_the_owner_group_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().ownerGrouopEdit;
		customefunction.sendKeysEle(ele, "ADO-RunOps-IPCR-Asia", TestBase.driver2);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Select owner group as "+arg1);
	}

	@Given("^select the change owner as \"([^\"]*)\"$")
	public void select_the_change_owner_as(String arg1) throws Throwable {
		customefunction.sleep(3000);
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().changeOwnerEdit;
		customefunction.sendKeysEle(ele, "Abbie Luo", TestBase.driver2);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Select change owner as "+arg1);
	}

	@Given("^select the planned date$")
	public void select_the_planned_date() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().plannedStartEdit;
		customefunction.cfunToEnterDate(2, ele, TestBase.driver2,0,2);
	}

	@Given("^select the start date$")
	public void select_the_start_date() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().plannedEndEdit;
		customefunction.cfunToEnterDate(4, ele, TestBase.driver2,0,2);
		
	}

	@Given("^clicks on the plan tab$")
	public void clicks_on_the_plan_tab() throws Throwable {

	}

	@Given("^fill the implementation plan$")
	public void fill_the_implementation_plan() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().implementationEdit;
		customefunction.sendKeysEle(ele, "Implementation", TestBase.driver2);
	}

	@Given("^fill the test plan$")
	public void fill_the_test_plan() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().testPlanEdit;
		customefunction.sendKeysEle(ele, "Test", TestBase.driver2);
	}

	@Given("^fill the backout plan$")
	public void fill_the_backout_plan() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().backoutPlanEdit;
		customefunction.sendKeysEle(ele, "back", TestBase.driver2);
	}

	@Given("^fill the outrage description$")
	public void fill_the_outrage_description() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().outrageEdit;
		customefunction.sendKeysEle(ele, "Outrage", TestBase.driver2);
	}

	@Given("^fill the justification$")
	public void fill_the_justification() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().jsutificationEdit;
		customefunction.sendKeysEle(ele, "Outrage", TestBase.driver2);
	}

	@Then("^clicks on the submit button to submitting the change$")
	public void clicks_on_the_submit_button_to_submitting_the_change() throws Throwable {
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().changeSubmitEdit.click();
		customefunction.sleep(3000);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Fille the rest details and submit the change ");
	}

	@Then("^move to the filter navigator$")
	public void move_to_the_filter_navigator() throws Throwable {

	}

	@Then("^click on the open change$")
	public void click_on_the_open_change() throws Throwable {

	}

	@Then("^clicks on the filter icon$")
	public void clicks_on_the_filter_icon() throws Throwable {
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().filterChangetableIcon.click();
		customefunction.sleep(3000);
	}

	@Then("^select the choose option as \"([^\"]*)\" from change table$")
	public void select_the_choose_option_as_from_change_table(String arg1) throws Throwable {
		customefunction.sleep(3000);
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().chooseFilterDropDwon.click();
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().chooseSearchEdit;
		ele.click();
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().chooseOptionDrpval.click();

	}

	@Then("^pass the sumitted change in input box$")
	public void pass_the_sumitted_change_in_input_box() throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().chooseInputEdit;
		System.out.println("Change request : " + this.changeRequest);
		customefunction.sendKeysEle(ele, this.changeRequest, TestBase.driver2);
	}

	@Then("^clicks on the run button$")
	public void clicks_on_the_run_button() throws Throwable {
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().runButton.click();
		xpath = "((//*[@id='change_request_table']//tr)[3]//a)[2]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver2);
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().changeNumLink.click();
		
	}

	@Then("^clicks on the new button under the change task$")
	public void clicks_on_the_new_button_under_the_change_task() throws Throwable {
		xpath = "//*[@id=\"tabs2_list\"]/span[3]/span";
		customefunction.waitVisibilityOfElementLocated(xpath, 50, TestBase.driver2);
		customefunction.cFunScrollToElement(xpath, TestBase.driver2);
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver2).click();
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskNewButton.click();
		customefunction.sleep(3000);
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Create task over the chnage with IBM synced group");
	}

	@Then("^fill the change task short description as \"([^\"]*)\"$")
	public void fill_the_change_task_short_description_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskShortDescEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
	}

	@Then("^fill the change task description as \"([^\"]*)\"$")
	public void fill_the_change_task_description_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskDescEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
	}

	@Then("^assigned the task to synced IBM group as \"([^\"]*)\"$")
	public void assigned_the_task_to_synced_IBM_group_as(String arg1) throws Throwable {
		ele = textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskAssignmentGrpEdit;
		customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
		customefunction.pressEnter();
		
		
		
		if(this.changeIBMRequest==null)
		{
			ReusableMLFIncBrigdeWithEX.logger.log(Status.FAIL, "MLF change is not getting bridge with IBM "+arg1);   
			Assert.assertEquals(false, true);
		}
		else
		{
			ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "MLF change got bridge with IBM successfully and the note the IBM change number : "+changeIBMRequest);
			Assert.assertEquals(true, true);	
		}
		
	}

	@Then("^submit the task and row as \"([^\"]*)\"$")
	public void submit_the_task(String arg1) throws Throwable {
		try
		{
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskSubmitButton.click();
		xpath = "//*[@id=\"change_request.start_date\"]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver2);

		xpath = "//*[@id=\"sys_readonly.change_request.correlation_id\"]";

		ele = customefunction.FluentWait(xpath, 200, TestBase.driver2);
		System.out.println("IBM  : " + ele.getAttribute("value"));
		changeIBMRequest=customefunction.cfunToRetrieveIBMNum(TestBase.driver2, xpath, ele.getAttribute("value"));
		
		
		if(this.changeIBMRequest==null)
		{
			ReusableMLFIncBrigdeWithEX.logger.log(Status.FAIL, "MLF change is not getting bridge with IBM "+arg1);   
			Assert.assertEquals(true, false);
		}
		else
		{
			ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "MLF change got bridge with IBM successfully and the note the IBM change number : "+changeIBMRequest);
			Assert.assertEquals(true, true);	
		}
		}
	
		catch(Exception e)
		{
			DataHelper.setCellData("Fail", Integer.parseInt(arg1), 7,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");	
		}
		
		

	}
	@Then("^verify IBM number is not getting generated and row as \"([^\"]*)\"$")
	public void verify_IBM_number_is_not_getting_generated(String arg1) throws Throwable {
		try
		{
		textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskSubmitButton.click();
		xpath = "//*[@id=\"change_request.start_date\"]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver2);

		xpath = "//*[@id=\"sys_readonly.change_request.correlation_id\"]";

		ele = customefunction.FluentWait(xpath, 30, TestBase.driver2);
		System.out.println("IBM  : " + ele.getAttribute("value"));
		changeIBMRequest=customefunction.cfunToRetrieveIBMNum(TestBase.driver2, xpath, ele.getAttribute("value"));
		Reporter.addStepLog("IBM request number is  : " + changeIBMRequest);
		if(this.changeIBMRequest==null)
		{
			Reporter.addStepLog("IBM request number is  : " + changeIBMRequest);   
			Assert.assertEquals(true, false);
		}
		else
		{
			Reporter.addStepLog("IBM request number is  : " + changeIBMRequest);   
			Assert.assertEquals(true, true);	
		}
		
		}
		catch(Exception e)
		{
			DataHelper.setCellData("Fail", Integer.parseInt(arg1), 7,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");	
		}
		
		
	}

	@Then("^refresh the page untile IBm tciket gets populate in vendor field$")
	public void refresh_the_page_untile_IBm_tciket_gets_populate_in_vendor_field() throws Throwable {

	}

	@Then("^open the IBM url$")
	public void open_the_IBM_url() throws Throwable {
		initialization("ibmURL");
		customefunction.sleep(3000);
		xpath="//*[@id=\"user_name\"]";
		ele=TestBase.driver.findElement(By.xpath(xpath));
		customefunction.IsElementExist(ele);
		PageObjectManagerIBM=new PageObjectManagerIBM(TestBase.driver);	
		if(customefunction.IsElementExist(ele))
		{
			textContext.getPageObjectManagerIBM().getIBMChangeFormObj().userNameEdit.sendKeys("MChaurasia@jhancock.com");
			customefunction.sleep(3000);
			textContext.getPageObjectManagerIBM().getIBMChangeFormObj().userPasswordEdit.sendKeys("Password123");
			textContext.getPageObjectManagerIBM().getIBMChangeFormObj().loginButton.click();
		
			customefunction.sleep(3000);
		}
		else {
			System.out.println("Already login");
		}
		
	}

	@Then("^serach the bridged change in their portal$")
	public void serach_the_bridged_change_in_their_portal() throws Throwable {
		
		
	}
	
	@Then("^type \"([^\"]*)\" in IBM filter navigator$")
	public void type_in_IBM_filter_navigator(String arg1) throws Throwable {
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().filterNavigatorIBM.click();
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().filterNavigatorIBM.sendKeys(arg1);
	}

	@Then("^click on the open change in IBM$")
	public void click_on_the_open_change_in_IBM() throws Throwable {
		xpath="((//*[text()='Open'])[3])//..//div";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver);
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().openChangetableIBM.click();
		customefunction.sleep(3000);
	}

	@Then("^clicks on the filter icon in IBM$")
	public void clicks_on_the_filter_icon_in_IBM() throws Throwable {
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().filterChangetableIconIBM.click();
	}

	@Then("^select the choose option as \"([^\"]*)\" from IBM change table$")
	public void select_the_choose_option_as_from_IBM_change_table(String arg1) throws Throwable {
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().chooseFilterDropDwonIBM.click();
		customefunction.sleep(3000);
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().chooseSearchEditIBM.click();
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().chooseSearchEditIBM.sendKeys(arg1);
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().chooseOptionDrpvalIBM.click();		
	}

	@Then("^pass the sumitted change in IBM input box$")
	public void pass_the_sumitted_change_in_IBM_input_box() throws Throwable {
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().chooseInputEditIBM.sendKeys(this.changeIBMRequest);
	}
	
	@Given("^store the MLF change number in sheet for row as \"([^\"]*)\"$")
	public void store_the_tciket_MLF_change_number_in_sheet_for_row_as(String arg1) throws Throwable {
		DataHelper.setCellData(this.changeRequest, Integer.parseInt(arg1), 3,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");
		//DataHelper.setCellData(this.getClass().getName().substring(15), Integer.parseInt(arg1), 1,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");
		ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "MLF change number is "+this.changeRequest);
	}
	@Then("^clicks on the IBM run button$")
	public void clicks_on_the_IBM_run_button() throws Throwable {
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().runButtonIBM.click();
		textContext.getPageObjectManagerIBM().getIBMChangeFormObj().changeNumLinkIBM.click();
		customefunction.sleep(5000);
		
		
	}
	@Then("^move to MLF change form$")
	public void move_to_MLF_change_form() throws Throwable {
		customefunction.switchWindow(TestBase.driver2);
		customefunction.sleep(3000); 
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver2, "gsft_main");
		
		textContext.getPageObjectManagerIETL().MLFChangeForm.plannedEndEdit.click();
		
	}
	
	@Given("^store the MLF owner group as \"([^\"]*)\" in sheet for row as \"([^\"]*)\"$")
	public void store_the_MLF_owner_group_as_in_sheet_for_row_as(String arg1, String arg2) throws Throwable {
		DataHelper.setCellData(arg1, Integer.parseInt(arg2), 6,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");
		
	}

	@Then("^store the IBM synced group as \"([^\"]*)\" in sheet for row as \"([^\"]*)\"$")
	public void store_the_IBM_synced_group_as_in_sheet_for_row_as(String arg1, String arg2) throws Throwable {
		DataHelper.setCellData(arg1, Integer.parseInt(arg2), 5,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");
	}

	@Then("^store the IBM change number in sheet for row as \"([^\"]*)\"$")
	public void store_the_IBM_change_number_in_sheet_for_row_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DataHelper.setCellData(this.changeIBMRequest, Integer.parseInt(arg1), 4,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange");
	}


@Then("^pass the work as \"([^\"]*)\" at MLF change form$")
public void pass_the_work_as_at_MLF_change_form(String arg1) throws Throwable {
	customefunction.cFunScrollToElement("//*[@id='activity-stream-textarea']", TestBase.driver2);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().activityTab.click();
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNoteEdit.click();
	customefunction.sleep(3000);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNoteEdit.sendKeys(arg1);
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver2);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().postButton.click();
	customefunction.sleep(3000);
	
	this.bufferString=arg1;
	}

@Then("^move to IBM change form$")
public void move_to_IBM_change_form() throws Throwable {
	try
	{
	customefunction.switchWindow(TestBase.driver);
	customefunction.sleep(3000); 
	customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
	
	
//	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().requestedByIBM.click();
	xpath="//*[@id=\"activity-stream-textarea\"]";
	customefunction.waitVisibilityOfElementLocated(xpath, 20,  TestBase.driver).click();
	System.out.println("Text3");
	customefunction.sleep(3000);
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	


}

@Then("^verify the passed work note at IBm end$")
public void verify_the_passed_work_note_at_IBm_end() throws Throwable {
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver);
	ele=customefunction.FluentWaitVerifyWorkNote(this.bufferString, 50, TestBase.driver);
	if(ele!=null)
	{
		Assert.assertTrue(true);
		Reporter.addStepLog("Worknote passed frome MLF is being reflected at IBM end as : "+ele.getText());
	}
	else
	{
		Assert.assertTrue(false);
	}
	customefunction.sleep(4000); 
}

@Then("^pass the additional comment as \"([^\"]*)\"$")
public void pass_the_additional_comment_as(String arg1) throws Throwable {
	customefunction.cFunScrollToElement("//*[@id='activity-stream-textarea']", TestBase.driver2);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().activityTab.click();
	
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNoteEdit.click();
	customefunction.sleep(3000);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNoteEdit.sendKeys(arg1);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().postButton.click();
	customefunction.sleep(3000);
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver2);
	this.bufferString=arg1;
}

@Then("^verify the passed  additional comment at IBM end$")
public void verify_the_passed_additional_comment_at_IBM_end() throws Throwable {
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver);
	ele=customefunction.FluentWaitVerifyWorkNote(this.bufferString, 50, TestBase.driver);
	if(ele!=null)
	{
		Assert.assertTrue(true);
		Reporter.addStepLog("Additional comment passed frome MLF is being reflected at IBM end as : "+ele.getText());
	}
	else
	{
		Assert.assertTrue(false);
	}
	customefunction.sleep(4000); 
}

@Then("^update the test status in sheet in row as \"([^\"]*)\"$")
public void update_the_test_status_in_sheet_in_row_as(String arg1) throws Throwable {
	DataHelper.setCellData("Pass", Integer.parseInt(arg1), 7,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"MLF_InitiatedChange"); 
}

@Then("^cliks on the change task tab$")
public void cliks_on_the_change_task_tab() throws Throwable {
	ele=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().changeTaskTab;
	customefunction.cFunScrollToElementt(ele, TestBase.driver2);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().changeTaskTab.click();
}
@Then("^click on the task$")
public void click_on_the_task() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().changeTasklink.click();
}

@Then("^clicks on the notes tab$")
public void clicks_on_the_notes_tab() throws Throwable {
	xpath="//*[@id='tabs2_section']/span[1]/span[1]/span[2]";
	customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver);
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().notesTaskTab.click();
}

@Then("^clicks on the work notes$")
public void clicks_on_the_work_notes() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNotesTaskEdit.click();
	
}

//@Then("^pass the input as \"([^\"]*)\"$")
//public void pass_the_input_as(String arg1) throws Throwable {
//	ele=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNotesTaskEdit;
//	customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
//	this.bufferString=arg1;
//	customefunction.cFunScrollToElement("//*[@id=\"sysverb_update_bottom\"]", TestBase.driver2);
//	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().updateActivityLogTaskButton.click();
//}

@Then("^pass the input as \"([^\"]*)\"$")
public void pass_the_input_as(String arg1) throws Throwable {
	ele=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().workNotesTaskEdit;
	customefunction.sendKeysEle(ele, arg1, TestBase.driver2);
	this.bufferString=arg1;
	customefunction.cFunScrollToElement("(//*[@id='sysverb_update'])[2]", TestBase.driver2);
//	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().updateActivityLogTaskButton.click();
	Actions action = new Actions(TestBase.driver2);
	ele=TestBase.driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
	action.contextClick(ele).build().perform();
	TestBase.driver2.findElement(By.xpath("//*[@id='context_1']/div[2]")).click();

}

@Then("^clicks on the change task tab at IBM$")
public void clicks_on_the_change_task_tab_at_IBM() throws Throwable {
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().changeTaskTabIBM.click();
}

@Then("^clicks on the task link$")
public void clicks_on_the_task_link() throws Throwable {
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().changeTasklinkIBM.click();
}

@Then("^cliks on the notes tabe at IBM$")
public void cliks_on_the_notes_tabe_at_IBM() throws Throwable {
	xpath="//*[@id='tabs2_section']/span[1]/span[1]/span[2]";
	customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver); 
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().notesTaskTabIBM.click();
}

@Then("^verify the passed work note at IBm's task form$")
public void verify_the_passed_work_note_at_IBm_s_task_form() throws Throwable {
//	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM;
//	customefunction.cFunScrollToElementt(ele, TestBase.driver);
	
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver);
	ele=customefunction.FluentWaitVerifyWorkNote(this.bufferString, 50, TestBase.driver);
	if(ele!=null)
	{
		Assert.assertTrue(true);
		Reporter.addStepLog("Additional comment passed frome MLF is being reflected at IBM end as : "+ele.getText());
	}
	else
	{
		Assert.assertTrue(false);
	}
	customefunction.sleep(4000); 
}
@And("^cliks on the activity log tab on task form$")
public void cliks_on_the_activity_log_tab_on_task_form() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().activitLogTaskTab.click();
}

@Then("^pass the input as \"([^\"]*)\" at IBM task form$")
public void pass_the_input_as_at_IBM_task_form(String arg1) throws Throwable {
	xpath="//*[@id='activity-stream-textarea']";
	customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().workNotesTaskEdit.click(); 
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().workNotesTaskEdit;
	customefunction.sendKeysEle(ele, arg1, TestBase.driver);
	this.bufferString=arg1;
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver);
	System.out.println("Hello");
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM.click();
	customefunction.sleep(2000); 
	System.out.println("Hello");
}
@Then("^move to MLF change taks form$")
public void move_to_MLFTask_Form() throws Throwable {
	customefunction.switchWindow(TestBase.driver2);
	customefunction.sleep(3000); 
	customefunction.SwitchToFrmaeByNameOrID(TestBase.driver2, "gsft_main");
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().activitLogTaskTab.click();
}



@Then("^verify the passed work note at MLF's task form$")
public void verify_the_passed_work_note_at_MLF_s_task_form() throws Throwable {
	xpath="//*[@id='page_timing_div']/button";
	customefunction.cFunScrollToElement(xpath, TestBase.driver2);
	ele=customefunction.FluentWaitVerifyWorkNote(this.bufferString, 50, TestBase.driver2);
	if(ele!=null)
	{
		Assert.assertTrue(true);
		Reporter.addStepLog("Additional comment passed frome MLF is being reflected at IBM end as : "+ele.getText());
	}
	else
	{
		Assert.assertTrue(false);
	}
	customefunction.sleep(4000); 
}

@Then("^pass additional comment at IBM change form as \"([^\"]*)\"$")
public void pass_additional_comment_at_IBM_change_form_as(String arg1) throws Throwable {
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().additionalCommentEdit.click();
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().additionalCommentEdit;
	customefunction.sendKeysEle(ele, arg1, TestBase.driver);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM.click();
	customefunction.sleep(2000);
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM;
	customefunction.cFunScrollToElementt(ele, TestBase.driver);
	this.bufferString=arg1;
	
}

@Then("^verify the passed additional comment at MLF change form$")
public void verify_the_passed_additional_comment_at_MLF_change_form() throws Throwable {
	
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().activitLogChangeTab.click();
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver2);
	ele=customefunction.FluentWaitVerifyWorkNoteAtMLFChange(this.bufferString, 50, TestBase.driver2);
	if(ele!=null)
	{
		Assert.assertTrue(true);
		Reporter.addStepLog("Additional comment passed frome MLF is being reflected at IBM end as : "+ele.getText());
	}
	else
	{
		Assert.assertTrue(false);
	}
	customefunction.sleep(4000);   
}

@Then("^pass work note at IBM change form as \"([^\"]*)\"$")
public void pass_work_note_at_IBM_change_form_as(String arg1) throws Throwable {
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM;
	customefunction.cFunScrollToElementt(ele, TestBase.driver);
	customefunction.sleep(2000);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().workNotesCheckBox.click();
	customefunction.sleep(2000);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().additionalCommentEdit.click();
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().additionalCommentEdit;
	customefunction.sendKeysEle(ele, arg1, TestBase.driver);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM.click();
	customefunction.sleep(2000);
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM;
	customefunction.cFunScrollToElementt(ele, TestBase.driver);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().additionalCommentEdit.click();
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().additionalCommentEdit;
	this.bufferString="Second Work Note from IBM";
	customefunction.sendKeysEle(ele, this.bufferString, TestBase.driver);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM.click();
	customefunction.sleep(2000);
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().postButtonIBM;
	customefunction.cFunScrollToElementt(ele, TestBase.driver);

	
}

@Then("^verify the passed  work notes at MLF change form$")
public void verify_the_passed_work_notes_at_MLF_change_form() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().activitLogChangeTab.click();
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver2);

	ele=customefunction.FluentWaitVerifyWorkNoteAtMLFChange(this.bufferString, 50, TestBase.driver2);
	if(ele!=null)
	{
		Assert.assertTrue(true);
		Reporter.addStepLog("Additional comment passed frome MLF is being reflected at IBM end as : "+ele.getText());
	}
	else
	{
		Assert.assertTrue(false);
	}
	customefunction.sleep(4000); 
}


@Then("^click on the review button$")
public void click_on_the_review_button() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().reviewButton.click();
	
}

@Then("^verify IBM the state after MLF access to change from their end$")
public void verify_IBM_the_state_after_MLF_access_to_change_from_their_end() throws Throwable {
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().stateDrp;
	
	ele=customefunction.FluentWaitIBMState(ele, 50, TestBase.driver, "Assess");

	if(ele!=null)
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	}

}

@Then("^verify the pahse state as assess at MLF$")
public void verify_the_pahse_state_as_assess_at_MLF() throws Throwable {
ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().stateDrp;
	x1="//*[@id=\"change_request.phase_state\"]";
	x2="//*[@id='connectFollowWidgetAction']/span[1]";
	x3="//*[@id='context_1']/div[20]";
	ele=customefunction.FluentWaitAtMLFIBMState(ele, 50, TestBase.driver2, x1, x2, "Assess", x3);

	if(ele!=null)
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	}

}

@Then("^verify the pahse as review at MLF$")
public void verify_the_pahse_as_review_at_MLF() throws Throwable {
	xpath="(//*[@class='section-content'])[1]//li[2]//a";
	ele=customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver2);
xpath=ele.getAttribute("aria-selected");
System.out.println("value : "+xpath);

if(xpath.equals("true"))
{
	Assert.assertTrue(true);
	Reporter.addStepLog("MLF is in review state : "+xpath);
}
else
{
	Assert.assertTrue(false);
}
}

@Then("^close the task$")
public void close_the_task()
{
	customefunction.waitVisibilityOfElementLocated("//*[@id=\"sysverb_update\"]", 20, TestBase.driver2).click();
}


@Then("^click on the request approval at MLF$")
public void click_on_the_request_approval_at_MLF() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().requestApprovalButton.click();
}

@Then("^verify the pahse state as \"([^\"]*)\" at MLF$")
public void verify_the_pahse_state_as_at_MLF(String arg1) throws Throwable {
	ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().stateDrp;
	x1="//*[@id=\"change_request.phase_state\"]";
	x2="//*[@id='connectFollowWidgetAction']/span[1]";
	x3="//*[@id='context_1']/div[20]";
	ele=customefunction.FluentWaitAtMLFIBMState(ele, 90, TestBase.driver2, x1, x2, arg1, x3);

	if(ele!=null)
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	} 
}

@Then("^verify the pahse as authorize at MLF$")
public void verify_the_pahse_as_authorize_at_MLF() throws Throwable {
	xpath="(//*[@class='section-content'])[1]//li[3]//a";
	ele=customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver2);
xpath=ele.getAttribute("aria-selected");
System.out.println("value : "+xpath);

if(xpath.equals("true"))
{
	Assert.assertTrue(true);
	Reporter.addStepLog("MLF is in authorize state : "+xpath);
}
else
{
	Assert.assertTrue(false);
}
}

@Then("^verify IBM the state at IBM as \"([^\"]*)\"$")
public void verify_IBM_the_state_at_IBM_as(String arg1) throws Throwable {
ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().stateDrp;
	
	ele=customefunction.FluentWaitIBMState(ele, 90, TestBase.driver, arg1);

	if(ele!=null)
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	} 
}

@Then("^verify the IBM approval state$")
public void verify_the_IBM_approval_state() throws Throwable {
	ele=customefunction.FluentWaitIBMApprovalState(ele, 90, TestBase.driver, "Approved");

	if(ele!=null)
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	}  
}


@Then("^cliks on the group approval tab at MLF$")
public void cliks_on_the_group_approval_tab_at_MLF() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().groupApprovalTab.click();
}

@Then("^find the MLF group as \"([^\"]*)\" and click on the requested link$")
public void find_the_MLF_group_as_and_click_on_the_requested_link(String arg1) throws Throwable {
    xpath="//*[@id='change_request.sysapproval_group.parent_table']//tbody//tr//td[4]//a";
     x1="(//*[@id='change_request.sysapproval_group.parent_table']//tbody//tr//td[3]//a)";
    customefunction.clickSpecificApprovalGroupAtMLF(TestBase.driver2, xpath, arg1,x1);
}

@Then("^click on the first requested link on the group$")
public void click_on_the_first_requested_link_on_the_group() throws Throwable {
//	xpath="//*[@id=\"tabs2_list\"]/span[2]/span/span[2]";
//	customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver2).click();
}

@Then("^approve the change$")
public void approve_the_change() throws Throwable {
  xpath="//*[@id='sysapproval_group.sysapproval_approver.group_table']//tbody//tr[1]//td[3]//a";
  customefunction.contextAction(xpath,TestBase.driver2);
  xpath="//*[@id=\"context_list_rowsysapproval_group.sysapproval_approver.group\"]/div[10]";
  customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver2).click();
}

@Then("^clik on the update button$")
public void clik_on_the_update_button() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().groupApprovlaUpdateButton.click(); 
xpath="//*[@id=\"page_timing_div\"]/button";
customefunction.cFunScrollToElement(xpath, TestBase.driver2);

}

@Then("^reload the IBM change from page$")
public void reload_the_IBM_change_from_page() throws Throwable {
	Actions action = new Actions(TestBase.driver);
	ele=TestBase.driver.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
	action.contextClick(ele).build().perform();
	TestBase.driver.findElement(By.xpath("//*[@id='context_1']/div[17]")).click();
	
}

@Then("^click on approver tab at IBM$")
public void click_on_approver_tab_at_IBM() throws Throwable {
//	Actions action = new Actions(TestBase.driver);
//	ele=TestBase.driver.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
//	action.contextClick(ele).build().perform();
//	TestBase.driver.findElement(By.xpath("//*[@id='context_1']/div[16]")).click();
	Actions action = new Actions(TestBase.driver);
	ele=TestBase.driver.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
	action.contextClick(ele).build().perform();
	TestBase.driver.findElement(By.xpath("//*[@id='context_1']/div[17]")).click();
	xpath="//*[@id=\"page_timing_div\"]/button";
	customefunction.cFunScrollToElement(xpath, TestBase.driver);
	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().groupApprovalTab.click();
}

@Then("^find the IBM group as \"([^\"]*)\" and approver$")
public void find_the_IBM_group_as_and_approver(String arg1) throws Throwable {
	
	xpath="//*[@id=\"page_timing_div\"]/button";
	customefunction.cFunScrollToElement(xpath, TestBase.driver);
	x1="(//*[@id='change_request.sysapproval_approver.sysapproval_table']//tbody//tr//td[3]//a)";
	xpath="//*[@id='change_request.sysapproval_approver.sysapproval_table']//tbody//tr//td[5]//a";
	customefunction.clickSpecificApprovalGroupAtMLF(TestBase.driver, xpath, arg1,x1);
	xpath="(//*[@id=\"approve\"])[1]";
	customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
}

@Then("^find the IBM group as \"([^\"]*)\" and reject the chnage$")
public void find_the_IBM_group_as_and_reject_the_change(String arg1) throws Throwable {
	
	xpath="//*[@id=\"page_timing_div\"]/button";
	customefunction.cFunScrollToElement(xpath, TestBase.driver);
	x1="(//*[@id='change_request.sysapproval_approver.sysapproval_table']//tbody//tr//td[3])";
	xpath="//*[@id='change_request.sysapproval_approver.sysapproval_table']//tbody//tr//td[5]//a";
	ele=customefunction.clickSpecificApprovalGroupAtIBM(TestBase.driver, xpath, arg1,x1);
	System.out.println("Element : "+ele);
	Actions action = new Actions(TestBase.driver);
	
	action.doubleClick(ele).perform();
	customefunction.sleep(2000);
	xpath="//*[@id=\"cell_edit_value\"]";
	customefunction.SelectValueFromDrp(TestBase.driver, xpath, "Rejected");
	xpath="//*[@id=\"cell_edit_ok\"]";
	customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver).click();
	
}

@Then("^reload the MLF change from page$")
public void reload_the_MLF_change_from_page() throws Throwable {
	customefunction.sleep(2000);
	Actions action = new Actions(TestBase.driver2);
	ele=TestBase.driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
	action.contextClick(ele).build().perform();
	TestBase.driver2.findElement(By.xpath("//*[@id='context_1']/div[20]")).click();
}

@Then("^verify the pahse as implement at MLF$")
public void verify_the_pahse_as_implement_at_MLF() throws Throwable {
	xpath="(//*[@class='section-content'])[1]//li[4]";
	ele=customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver2);
xpath=ele.getAttribute("aria-selected");
System.out.println("value : "+xpath);

if(xpath.equals("true"))
{
	Assert.assertTrue(true);
	Reporter.addStepLog("MLF is in authorize state : "+xpath);
}
else
{
	Assert.assertTrue(false);
}
}
@Then("^verify the pahse as close at MLF$")
public void verify_the_pahse_as_close_at_MLF() throws Throwable {
	xpath="(//*[@class='section-content'])[1]//li[5]//a";
	ele=customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver2);
xpath=ele.getAttribute("aria-selected");
System.out.println("value : "+xpath);

if(xpath.equals("true"))
{
	Assert.assertTrue(true);
	Reporter.addStepLog("MLF is in authorize state : "+xpath);
}
else
{
	Assert.assertTrue(false);
}
}
@Then("^deny the change$")
public void deny_the_change()
{
	xpath="//*[@id='sysapproval_group.sysapproval_approver.group_table']//tbody//tr[1]//td[3]//a";
	  customefunction.contextAction(xpath,TestBase.driver2);
	  xpath="//*[@id=\"context_list_rowsysapproval_group.sysapproval_approver.group\"]/div[11]";
	  customefunction.waitVisibilityOfElementLocated(xpath, 30, TestBase.driver2).click();
}

@Then("^select the task state as \"([^\"]*)\"$")
public void select_the_task_state_as(String arg1) throws Throwable {
	
ele=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().taskStateDrp;
	customefunction.SelectValFromDrp(TestBase.driver2, ele, arg1);
}

@Then("^save the MLF task page$")
public void save_the_MLF_task_page() throws Throwable {
	Actions action = new Actions(TestBase.driver2);
	ele=TestBase.driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
	action.contextClick(ele).build().perform();
	TestBase.driver2.findElement(By.xpath("//*[@id='context_1']/div[2]")).click();
}

@Then("^move to the IBM task form page$")
public void move_to_the_IBM_task_form_page() throws Throwable {
	customefunction.switchWindow(TestBase.driver);
	customefunction.sleep(3000); 
	customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
	//textContext.getPageObjectManagerIBM().IBMChangeForm.affectedCiEditIBM.click();
}

@Then("^verify the IBM task sate is getting populated as \"([^\"]*)\"$")
public void verify_the_IBM_task_sate_is_getting_populated_as(String arg1) throws Throwable {
//ele=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().stateDrp;
	xpath="//*[@id=\"sys_readonly.change_task.state\"]";
	ele=customefunction.waitVisibilityOfElementLocated(xpath, 20, TestBase.driver);
	ele=customefunction.FluentWaitIBMTaskState(ele, 90, TestBase.driver, arg1);

	if(ele!=null)
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	}    
}
@Then("^click on the schedule tab$")
public void click_on_the_schedule_tab() throws Throwable {
//	customefunction.cFunScrollToElement("//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]", TestBase.driver);
//	textContext.getPageObjectManagerIBM().getIBMChangeFormObj().scheduleIBM.click();
	customefunction.cFunScrollToElement("//*[text()='Post']", TestBase.driver);
	xpath="//div[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
	customefunction.waitVisibilityOfElementLocated(xpath, 20,  TestBase.driver).click();
	xpath=textContext.getPageObjectManagerIBM().getIBMChangeFormObj().externalToolsIBM.getText();
	System.out.println("Text :  "+xpath);
}

@Then("^verify the MLF group is getting displayed as approved$")
public void verify_the_MLF_group_is_getting_displayed_as_approved() throws Throwable {
	String str="DS-L2SUPP-A-CAN : CDT_CEA_AMS@manulife.comTEST : Approved";
   if(xpath.contains(str))
   {
	   Assert.assertTrue(true);  
	   Reporter.addStepLog("Text under ETD : "+xpath);
   }
   else
   {
	   Assert.assertTrue(false);  
   }
}

@Then("^click on the vendor details tab$")
public void click_on_the_vendor_details_tab() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().vendorDetailsTab.click();
	xpath=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().externalToolEdit.getText();
	System.out.println("Text :  "+xpath);
}

@Then("^verify the IBM group is getting displayed as approved$")
public void verify_the_IBM_group_is_getting_displayed_as_approved() throws Throwable {
	String str="approved:IBM-SD-ACCESS";
	   if(xpath.contains(str))
	   {
		   Assert.assertTrue(true);  
		   Reporter.addStepLog("Text under ETD : "+xpath);
	   }
	   else
	   {
		   Assert.assertTrue(false);  
	   }
	
}

@Then("^click on the close button$")
public void click_on_the_close_button() throws Throwable {
	textContext.getPageObjectManagerIETL().getMLFChangeFormObj().closeButton.click();
	customefunction.IsWebAlertPresent(TestBase.driver2, 15);
}

@Then("^handle the pop up$")
public void handle_the_pop_up() throws Throwable {
	customefunction.IsWebAlertPresent(TestBase.driver2, 15);
	customefunction.IsWebAlertPresent(TestBase.driver2, 15);
	customefunction.sleep(2000);
}

@Then("^select the actual start time$")
public void select_the_actual_start_time() throws Throwable {
	ele=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().actualStartDate;
	customefunction.cfunToEnterDate(2, ele, TestBase.driver2,0,1);
}

@Then("^select the actual end time$")
public void select_the_actual_end_time() throws Throwable {
	
	ele=textContext.getPageObjectManagerIETL().getMLFChangeFormObj().actualEndDate;
	customefunction.cfunToEnterDate(4, ele, TestBase.driver2,0,1);
	customefunction.IsWebAlertPresent(TestBase.driver2, 15);
}

@Then("^select the closure code$")
public void select_the_closure_code() throws Throwable {
	xpath="//*[@id=\"change_request.u_closure_code\"]";
	ele=TestBase.driver2.findElement(By.xpath(xpath));
	
	customefunction.SelectValFromDrp(driver2, ele, "Success");
}

@Then("^fill the closure details$")
public void fill_the_closure_details() throws Throwable {
   
}

@Then("^handle the last pop up$")
public void handle_the_last_pop_up() throws Throwable {
	customefunction.IsWebAlertPresent(TestBase.driver2, 15); 
	xpath="//*[@id='change_request_table']//tbody//tr[1]//td[3]//a";
	customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver2).click();
	
	
}

@Then("^then verify the error message$")
public void then_verify_the_erro_message() throws Throwable {
	customefunction.cFunScrollToElement("//*[@id=\"sys_readonly.change_request.number\"]", TestBase.driver2);
	ele=TestBase.driver2.findElement(By.xpath("(//*[@id='output_messages']/div/div)[1]//div[contains(text(),'You must close')]"));
	xpath=ele.getText().trim();
	System.out.println("Error message : "+xpath);
	String str="You must close all change tasks before this change request can be closed";
	   if(xpath.contains(str.trim()))
	   {
		   Assert.assertTrue(true);  
		   Reporter.addStepLog("Error message : "+xpath);
	   }
	   else
	   {
		   Assert.assertTrue(false);  
	   }
}

}
