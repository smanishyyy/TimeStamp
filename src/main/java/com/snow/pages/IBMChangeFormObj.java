package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IBMChangeFormObj {
	public static WebDriver driver;
	public static WebElement ele;
	
	public IBMChangeFormObj(WebDriver dr)
	{
		this.driver=dr;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"user_name\"]")
	@CacheLookup
	public WebElement userNameEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"user_password\"]")
	@CacheLookup
	public WebElement userPasswordEdit;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sysverb_login\"]")
	@CacheLookup
	public WebElement loginButton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"filter\"]")
	@CacheLookup
	public WebElement filterNavigatorIBM;
	@FindBy(how=How.XPATH,using="((//*[text()='Open'])[3])//..//div")
	@CacheLookup
	public WebElement openChangetableIBM;
	@FindBy(how=How.XPATH,using="//*[@id=\"change_request_filter_toggle_image\"]")
	@CacheLookup
	public WebElement filterChangetableIconIBM;
	@FindBy(how=How.XPATH,using="((//table[@id='change_requestfilters_table']//tr)[5]//a//span)[2]")
	@CacheLookup
	public WebElement chooseFilterDropDwonIBM;
	@FindBy(how=How.XPATH,using="//*[@id='select2-drop']//input")
	@CacheLookup
	public WebElement chooseSearchEditIBM;
	@FindBy(how=How.XPATH,using="(//*[@id='select2-drop']//input//following::ul//li//div)[1]")
	@CacheLookup
	public WebElement chooseOptionDrpvalIBM;
	@FindBy(how=How.XPATH,using="//*[@id=\"value\"]/input")
	@CacheLookup
	public WebElement chooseInputEditIBM;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"test_filter_action_toolbar_run\"]")
	@CacheLookup
	public WebElement runButtonIBM;
	@FindBy(how=How.XPATH,using="((//*[@id=\"change_request_table\"]//tr)[3]//a)[2]")
	@CacheLookup
	public WebElement changeNumLinkIBM;
	@FindBy(how=How.XPATH,using="//*[text()='Post']")
	@CacheLookup
	public WebElement postButtonIBM;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_request.requested_by\"]")
	@CacheLookup
	public WebElement requestedByIBM;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.change_task.cmdb_ci\"]")
	@CacheLookup
	public WebElement affectedCiEditIBM;
	@FindBy(how=How.XPATH,using="(//*[@id='tabs2_section']/span[2]/span[1]/span[2]//parent::span)[1]")
	@CacheLookup
	public WebElement scheduleIBM;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_readonly.change_request.u_external_tool_details\"]")
	@CacheLookup
	public WebElement externalToolsIBM;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]")
	@CacheLookup
	
	public WebElement changeTaskTabIBM;
	@FindBy(how=How.XPATH,using="(//*[@id='change_request.change_task.change_request_table']//tbody//tr//td)[3]//a")
	@CacheLookup
	public WebElement changeTasklinkIBM;
	@FindBy(how=How.XPATH,using="//*[@id='tabs2_section']/span[1]/span[1]/span[2]")
	@CacheLookup
	public WebElement notesTaskTabIBM;
	@FindBy(how=How.XPATH,using="//*[@id='activity-stream-textarea']")
	@CacheLookup
	public WebElement workNotesTaskEdit;
	@FindBy(how=How.XPATH,using="//*[@id=\"activity-stream-textarea\"]")
	@CacheLookup
	public WebElement additionalCommentEdit;
	@FindBy(how=How.XPATH,using="//*[@id='work_notes-69-journal-checkbox']//..")
	@CacheLookup
	public WebElement workNotesCheckBox;
	@FindBy(how=How.XPATH,using="//*[@id='connectFollowWidgetAction']/span[1]")
	@CacheLookup
	public WebElement followButton;
	@FindBy(how=How.XPATH,using="//*[@id='context_1']/div[17]")
	@CacheLookup
	public WebElement reloadLink;
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_list\"]/span[4]/span/span[2]")
	@CacheLookup
	public WebElement groupApprovalTab;
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_readonly.change_request.state\"]")
	
	public WebElement stateDrp;
	
	
	
	
	
	
	
}
