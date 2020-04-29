package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MLFChangeFormObj {
	public static WebDriver driver;
	public static WebElement ele;
	
	public MLFChangeFormObj(WebDriver dr)
	{
		this.driver=dr;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(how=How.XPATH,using="(//*[contains(text(),'Create New')])[8]")
	@CacheLookup
	public WebElement createNewLink;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.risk\"]")
	@CacheLookup
	public WebElement riskDropDown;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.type\"]")
	@CacheLookup
	public WebElement typeDropDown;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.category\"]")
	@CacheLookup
	public WebElement categoryDropDown;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_request.cmdb_ci\"]")
	@CacheLookup
	public WebElement affectedCIEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.u_ml_impact_unlock\"]")
	@CacheLookup
	public WebElement impactButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_request.u_ml_impact\"]")
	
	public WebElement impactEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.short_description\"]")
	@CacheLookup
	public WebElement summaryEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.description\"]")
	@CacheLookup
	public WebElement DescriptionEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.implementation_plan\"]")
	@CacheLookup
	public WebElement implementationEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.test_plan\"]")
	@CacheLookup
	public WebElement testPlanEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.backout_plan\"]")
	@CacheLookup
	public WebElement backoutPlanEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.u_outage_description\"]")
	@CacheLookup
	public WebElement outrageEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.justification\"]")
	@CacheLookup
	public WebElement jsutificationEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_request.assignment_group\"]")
	@CacheLookup
	public WebElement ownerGrouopEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_request.assigned_to\"]")
	@CacheLookup
	public WebElement changeOwnerEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.start_date\"]")
	@CacheLookup
	public WebElement plannedStartEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.end_date\"]")
	@CacheLookup
	public WebElement plannedEndEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"sysverb_insert\"]")
	@CacheLookup
	public WebElement changeSubmitEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request_filter_toggle_image\"]")
	@CacheLookup
	public WebElement filterChangetableIcon;
	@FindBy(how=How.XPATH,using="((//table[@id='change_requestfilters_table']//tr)[5]//a//span)[2]")
	@CacheLookup
	public WebElement chooseFilterDropDwon;
	@FindBy(how=How.XPATH,using="//*[@id='select2-drop']//input")
	@CacheLookup
	public WebElement chooseSearchEdit;
	@FindBy(how=How.XPATH,using="(//*[@id='select2-drop']//input//following::ul//li//div)[1]")
	@CacheLookup
	public WebElement chooseOptionDrpval;
	@FindBy(how=How.XPATH,using="//*[@id=\"value\"]/input")
	@CacheLookup
	public WebElement chooseInputEdit;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"test_filter_action_toolbar_run\"]")
	@CacheLookup
	public WebElement runButton;
	@FindBy(how=How.XPATH,using="((//*[@id=\"change_request_table\"]//tr)[3]//a)[2]")
	@CacheLookup
	public WebElement changeNumLink;
	@FindBy(how=How.XPATH,using="(//*[@id=\"sysverb_new\"])[2]")
	@CacheLookup
	public WebElement taskNewButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_task.short_description\"]")
	@CacheLookup
	public WebElement taskShortDescEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_task.description\"]")
	@CacheLookup
	public WebElement taskDescEdit;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_task.assignment_group\"]")
	@CacheLookup
	public WebElement taskAssignmentGrpEdit;
	@FindBy(how=How.XPATH,using="(//*[@id=\"sysverb_insert\"])[1]")
	@CacheLookup
	public WebElement taskSubmitButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"activity-stream-textarea\"]")
	@CacheLookup
	public WebElement workNoteEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_section\"]/span[3]/span[1]")
	@CacheLookup
	public WebElement activityTab;
	@FindBy(how=How.XPATH,using="//*[text()='Post']")
	@CacheLookup
	public WebElement postButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"comments-96-journal-checkbox\"]")
	@CacheLookup
	public WebElement additionalCheckBox;
	@FindBy(how=How.XPATH,using="//*[@id='tabs2_list']/span[3]/span/span[2]")
	@CacheLookup
	public WebElement changeTaskTab;
	@FindBy(how=How.XPATH,using="(//*[@id='change_request.change_task.change_request_table']//tbody//tr//td)[3]//a")
	@CacheLookup
	public WebElement changeTasklink;
	@FindBy(how=How.XPATH,using="//*[@id='tabs2_section']/span[1]/span[1]/span[2]")
	@CacheLookup
	public WebElement notesTaskTab;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_task.work_notes\"]")
	@CacheLookup
	public WebElement workNotesTaskEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"sysverb_update_bottom\"]")
	@CacheLookup
	public WebElement updateActivityLogTaskButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_task.state\"]")
	@CacheLookup
	public WebElement taskStateDrp;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_task.cmdb_ci\"]")
	@CacheLookup
	public WebElement configEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_section\"]/span[4]/span[1]/span[2]")
	@CacheLookup
	public WebElement vendorDetailsTab;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_readonly.change_request.u_external_tool_detail\"]")
	@CacheLookup
	public WebElement externalToolEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"mlcm_close_auth\"]")
	@CacheLookup
	public WebElement closeButton;
	//*[@id="mlcm_close_auth"]
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.work_start\"]")
	@CacheLookup
	public WebElement actualStartDate;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]")
	@CacheLookup
	public WebElement activitLogTaskTab;
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_section\"]/span[3]/span[1]/span[2]")
	@CacheLookup
	public WebElement activitLogChangeTab;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"mlcm_review_assess\"]")
	@CacheLookup
	public WebElement reviewButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"request.approval\"]")
	@CacheLookup
	public WebElement requestApprovalButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_list\"]/span[2]/span/span[2]")
	@CacheLookup
	public WebElement groupApprovalTab;
	
	@FindBy(how=How.XPATH,using="(//*[@id='change_request.sysapproval_group.parent_table']//tbody//tr//td)[3]//a")
	@CacheLookup
	public WebElement firstGroupApprovalLink;
	@FindBy(how=How.XPATH,using="(//*[@id='sysapproval_group.sysapproval_approver.group_table']//tbody//tr//td)[3]//a")
	@CacheLookup
	public WebElement firstGroupApproverlLink;
	@FindBy(how=How.XPATH,using="//*[@id=\"approve\"]")
	@CacheLookup
	public WebElement approveButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"sysverb_update\"]")
	@CacheLookup
	public WebElement groupApprovlaUpdateButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request.work_end\"]")
	@CacheLookup
	public WebElement actualEndDate;
	
	
	
	 
	
	
	
	
	
		
}
