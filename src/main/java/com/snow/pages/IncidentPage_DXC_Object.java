package com.snow.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.snow.customfunction.customefunction;

public class IncidentPage_DXC_Object {
public static WebDriver driver;
public static String xpath;
	
	@SuppressWarnings("static-access")
	public IncidentPage_DXC_Object(WebDriver driver2) {
		this.driver=driver2;
		System.out.println("EMP "+driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//*[@id='user_name']")
	WebElement username;
	
	public void set_username(String incident)
	{
		username.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="//*[@id='user_password']")
	WebElement password;
	public void set_password(String incident)
	{
		password.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="//*[@id='sysverb_login']")
	WebElement LoginButton;
	public void ClickOn_LoginButton()
	{
		customefunction.sleep(3000);
		LoginButton.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id='user_info_dropdown']/div/span[1]")
	WebElement ProfileIcon;
	
	public void ClickOn_ProfileIcon(WebDriver driver)
	{
		driver.switchTo().defaultContent();
		ProfileIcon.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div/div/header/div[1]/div/div[2]/div/div[3]/div/ul/li[3]/a")
	WebElement LogoutButton;
	public void ClickOn_LogoutButton()
	{
		
		LogoutButton.click();
	}
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div/div/header/div[1]/div/div[2]/div/div[5]/form/div/label/span")
	WebElement searchIcon;
	public void ClickOn_searchIcon()
	{
		
		searchIcon.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id='sysparm_search']")
	WebElement DXCIncidentNumber;
	public void search_DXCIncidentNumber(String DXCInCNum)
	{
		DXCIncidentNumber.click();
		DXCIncidentNumber.sendKeys(DXCInCNum);
		customefunction.sleep(3000);
		customefunction.pressEnter();
		
		
	}
	@FindBy(how=How.XPATH,using="//input[@id='filter']")
	WebElement FilterBox;
	@FindBy(how=How.XPATH,using="(//*[normalize-space(text())='Open'])[1]")
	WebElement IncidentLink;
	
	
	public void serach_Link(String SerachLinkName)
	{
		FilterBox.click();
		FilterBox.sendKeys(SerachLinkName);
		customefunction.pressEnter();
		IncidentLink.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id='incident.short_description']")
	WebElement ShortDescription;
	
	public String  getShotDescription(WebDriver driver2) {
		customefunction.cFunScrollToElement("//*[@id='incident.u_external_reference_id']", driver2);
		
		return ShortDescription.getAttribute("value");
	}
	public void scrollToTheShortDescription(WebDriver driver2)
	{
		customefunction.cFunScrollToElement("(//*[@class='sn-stream']//button)[6]", driver2);	
	}
	@FindBy(how=How.XPATH,using="//*[@id='context_1']/div[21]")
	WebElement ReloadFormLink;
	public void ClickOnTo_ToReloadThepage(WebDriver driver2) {
		
		//driver2.navigate().refresh();
		
		System.out.println("Enter into catalog task");
		
		
		System.out.println("Click on Approver");
		System.out.println("Driver : "+driver2);
		
		Actions action = new Actions(driver2);
		WebElement	ele=driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
		action.contextClick(ele).build().perform();
		System.out.println(driver2);
		System.out.println("ContextMenuApprove"+ReloadFormLink);
		customefunction.sleep(3000);
		ReloadFormLink.click();
		
		System.out.println("Click on Approver2");
		
	}
	@FindBy(how=How.XPATH,using="//*[@id='sn_form_inline_stream_entries']/ul/li[1]/div[3]/div/span")
	WebElement ActivityLogComment;
	public String  getActivityLogComment()
	{
		return ActivityLogComment.getText();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='activity-stream-textarea']")
	WebElement WorkNoteInput;
	
	@FindBy(how=How.XPATH,using="(//*[@class='comment-box container-fluid']//following-sibling::div)[8]//div//button[text()='Post']")
	WebElement PostButton;
	
	
	public void SendCommentInWorkNote(String comment) {
		WorkNoteInput.click();
		WorkNoteInput.sendKeys(comment);
		PostButton.click();
		
	}
	@FindBy(how=How.XPATH,using="//*[@id='context_1']/div[2]")
	WebElement SaveButton;
	public void ClickOnSaveButton(WebDriver driver2) {
System.out.println("Enter into catalog task");
		
		
		System.out.println("Click on Approver");
		System.out.println("Driver : "+driver2);
		
		Actions action = new Actions(driver2);
		WebElement	ele=driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
		action.contextClick(ele).build().perform();
		System.out.println(driver2);
		System.out.println("ContextMenuApprove"+SaveButton);
		SaveButton.click();
		customefunction.sleep(3000);
		System.out.println("Click on Approver2");
		
	}
	
	public void ScrollToPostButton(WebDriver driver)
	{
		customefunction.cFunScrollToElement("(//*[@class='comment-box container-fluid']//following-sibling::div)[8]//div//button[text()='Post']", driver);
	}
	@FindBy(how=How.XPATH,using="//*[@id='sys_display.incident.company']")
	WebElement CompanyVariable;
	
	public void send_valueInCompanyVariable() {
		
		CompanyVariable.click();
		CompanyVariable.sendKeys("Manulife Cambodia");
		
	}
	@FindBy(how=How.XPATH,using="//*[@id='sys_display.incident.caller_id']")
	WebElement CallerVariable;
	public void send_valueInCallerVariable() {
		
		CallerVariable.click();	
		CallerVariable.sendKeys("Amara Yeb");
	}
	@FindBy(how=How.XPATH,using="//*[@id='incident.category']")
	WebElement Category;
	public void SelectValueFromCategory(int data) {
		Select sl=new Select(Category);
		
		sl.selectByIndex(1);
		customefunction.sleep(2000);
	}
	@FindBy(how=How.XPATH,using="//*[@id='incident.subcategory']")
	WebElement SubCategory;
	public void SelectValueFromSubCategory(int i) {
		Select sl=new Select(SubCategory);
		sl.selectByIndex(1);
		customefunction.sleep(2000);
		
	}
	@FindBy(how=How.XPATH,using="//*[@id='incident_filter_toggle_image']")
	WebElement FilterLink;
	@FindBy(how=How.XPATH,using="//a[@class='select2-choice']//b")
	WebElement ChooseFieldButton;
	@FindBy(how=How.XPATH,using="//*[@id='oper']/select")
	WebElement OperatorLink;
	@FindBy(how=How.XPATH,using="//*[@id='value']/input")
	WebElement InputField;
	@FindBy(how=How.XPATH,using="//*[@id='test_filter_action_toolbar_run']")
	WebElement RunButton;
	@FindBy(how=How.XPATH,using="//*[@id='incident_table']//tbody//td[3]//a")
			
	WebElement Incidentlinkkk;
	
public void search_DxcIncidentnumber(String incidentNumber,WebDriver driver) {
		
		FilterLink.click();
		ChooseFieldButton.click();
		 xpath="((//a[@class='select2-choice']//b//following::ul)[4]//li)[61]";
		customefunction.cFunSelectValueByIndexXpath(xpath, driver);
		OperatorLink.click();
		xpath="//*[@id='oper']/select//option[5]";
		customefunction.cFunSelectValueByIndexXpath(xpath, driver);
		InputField.click();
		InputField.sendKeys(incidentNumber);
		RunButton.click();
		customefunction.sleep(3000);
		Incidentlinkkk.click();
		customefunction.sleep(3000);

	}
	
}
