package com.servicenow.XpathRepository;

public class XpathRepository {

	public static final String RequestServLinkXpath = "//*[text()=' Request Service ']";
	public static final String CountryCatlogXpath = "//*[text()='-- None --']";
	public static final String CountryCatlogEditBox = "(//input[@aria-autocomplete='list'])[2]";
	public static final String CountryListLink = "(//div[@class='select2-result-label']//..)[1]";
	public static final String GoButton = "//*[text()='Go! ']";
	public static final String Placeholder = "//div[contains(@class,'input-group input-group-m')]//input";
	public static final String ItemLinkList = "((//div[@class=\"container\"])[2]//div)[4]//form //div//span//button";
	public static final String ItemLink = "(//*[contains(text(),'Search results for')]//following::div//span)[1]";
	public static final String Verify_bullet_point_text_BUCO_Reference_Listing = "//*[contains(text(),'BUCO Reference Listing [')]";
	public static final String Verify_bullet_point_text_DCCO_Reference_Listing = "//*[contains(text(),'DCCO Reference Listing [')]";
	public static final String Verify_label_text_What_is_the_region_domain_of_the_recipient =  "//*[contains(text(),'What is the region-domain of the rec')]";
	public static final String Verify_label_text_Recipents_Division = "//*[contains(text(),'Recipents Division')]";
	public static final String Verify_label_text_Are_you_a = "(//*[contains(text(),'you or select Other')])[1]";
	public static final String Verify_label_text_Business_Unit_of = "//*[contains(text(),'Business Unit of the')]";
	public static final String Verify_label_text_Business_Rationale = "//*[contains(text(),'Business Rationale')]";
	public static final String Verify_text_As_part_of_the_approval = "//*[contains(text(),'o provide a cross-cut shredd')]";
	public static final String Verify_the_label_text_business_Unit_VP = "//*[contains(text(),'Business Unit VP')]";
	public static final String Verify_the_label_text_BUCO = "//*[contains(text(),'BUCO (Business Unit Compliance Officer)')]";
	

	public static final String Verify_the_text_list_Of_BUCO ="//*[contains(text(),'ose the one from the list that references')]";
	public static final String Verify_the_label_text_Please_enter = "//*[contains(text(),'Please enter description of the device dri')]";
	public static final String Verify_the_text_Please_provide = "//*[contains(text(),'well as any additional information.')]";
	public static final String Verify_the_text_Standard_service_le = "//*[contains(text(),'agreement (SLA) and fulfillment')]";
	
//	public static final String path = "C:\\Users\\chaurma\\Downloads\\WorkSpaceEclOxy\\ServiceNowMavenProject\\Screenshot";
	public static final String DomainOfRecipent = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]";
	public static final String Form_DomainDrpvarXpath = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]";
//	public static final String selectValue_From_DomainDrpvarXpath = "//*[contains(@id,'select2-drop')]//div//following::ul//child::li[2]";
	public static final String selectValue_From_DomainDrpvarXpath = "//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
	public static final String clickon_From_RecipientDomainDrpvarXpath="(//*[contains(text(),'-- None --')]//following::span//input[text()='Recipents Division undefined']//..)[1]";
	public static final String clickon_ContextMenu_AreYou = "(//*[contains(@id,'id_sp_formfield_{{::field.name}}')]/a//span//b)[3]";
	public static final String SelectValue_Select_that_applies_to_you_or_select_Other = "//div//a//*[text()='-- None --']//following::ul//li";
	public static final String I_understand_and_agree_that_checkbox ="//label[@for='sp_formfield_checkBox']//input";
	public static final String Business_Unit_VP_context ="//*[contains(@id,'Unit_VP')]//a//span[2]//b";
	public static final String SelectValue_Business_Unit_VP_context ="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
	public static final String Business_Rational ="//*[@id='sp_formfield_businessRationale']";
	public static final String AddToCartButton ="//*[text()=' Add to Cart ']//..//button";
	public static final String CartLink ="(//*[text()='Cart'])[1]";
	public static final String ProceedToCheckButton ="//button//span[contains(text(),'Proceed ')]";
	public static final String CheckOutButton ="(//button//span[contains(text(),'Check')])[3]";
	public static final String RequestNumber="//div[@class='offer-content']//h3";
	public static final String GlobalSearchBoxXpath = "//*[@id='sysparm_search']";
	public static final String RITMNumberXpath = "(//*[@id='sc_request.sc_req_item.request_table']//tbody//td[4]//a)[1]";
	public static final String ApproverTabXpath = "//*[@id='tabs2_list']/span[2]/span/span[2]";
	////*[@id="tabs2_list"]/span[2]/span/span[2]
	public static final String RequestedXpath = "(//*[text()='Requested'])[2]";
	public static final String ContextMenuApproveXpath ="(//*[text()='Approve'])[2]";
	public static final String RequestedTabXpath = "//*[@id='tabs2_list']/span[1]/span/span[2]";
	public static final String CatalogTaskTabXpath = "//*[@id='tabs2_list']/span[1]/span/span[2]";
	public static final String SelectStateXpath = "//*[@id='sc_task.state']";
	public static final String CatalogTaskNumberLinkXpath = "(//*[@class='linked formlink'])[1]";
	public static final String AssignedToXpath = "//*[@id='sys_display.sc_task.assigned_to']";
	public static final String WorkNoteXpath = "//*[@id='activity-stream-work_notes-textarea']";
	public static final String CloseCompleteButtonXpath = "(//*[@id='close_task'])[1]";
	public static final String FullfillmentButtonXpath = "//*[@id='sc_task.u_fulfillment_details']";
	public static final String ItemrequestApproverNameXpath = "//*[@id='sc_req_item.sysapproval_approver.sysapproval_table']//tbody//tr[1]//td[4]";
	public static final String path = "\\ENTSSERVER85\\Cognizant\\01 GSM\\2019\\July_19\\Automation\\ServicenowCF_Manish_July\\STRY0019941\\SnowNowPageObjectFramework\\Screenshot_";
	public static final String homelink="(//*[@id='sp-nav-bar']//ul//a//span//following::span)[1]";
	public static final String RequestedForinfromationLink="//*[@id='viewr.sc_req_item.request.requested_for']";
	public static final String SoftwareProductOwner="(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]";
	public static final String selectValue_SoftwareProductOwner = "//*[contains(@id,'select2-drop')]//div//following::ul//child::li[1]";
	public static final String NoteComment = "//*[@id='sp_formfield_comments']";
	public static final String WorkOrder = "//*[@id='sp_formfield_workorder_project']";
	public static final String MoreInformation="(//*[@class='sc_variable_editor']//following::div[37]//following::textarea)[1]";
	

	
	 

	
	  

	
	

	
	


	
	


	

	
	

	
	

	
	

			
		
	

			
	public static String disclaimerXpath = "//*[@id='reg_form_box']//p";
	public static String BirthdayXpath = "//*[@title='Click for more information']";
	public static String BottomXpathFalse = "// div[@id='reg_pages_ms']";
	public static String BottomXpathTrue = "// div[@id='reg_pages_msg']";
	public static String Verify_text_Install_Printer_Driver_Exception = "//*[contains(text(),'request approval/setup of')]";
	public static String verify_passge_In_your_busines="//*[contains(text(),'d handle the documents on you')]";
	public static String verify_the_text_Attachments_can_be_added="//*[contains(text(),'ded using the paperclip')]";
	public static String selectValue_From_RecipientDomainDrpvarXpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
	


	

	

}
