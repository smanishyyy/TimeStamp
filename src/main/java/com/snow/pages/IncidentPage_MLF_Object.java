package com.snow.pages;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;



public class IncidentPage_MLF_Object {
	public WebDriver driver;
	
	public IncidentPage_MLF_Object(WebDriver driver2) {
		driver=driver2;
		System.out.println("EMP "+driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='filter']")
	WebElement FilterBox;
	public void ClickIn_FilterBox() {
		FilterBox.click();
	}
	public void set_FilterBox(String incident)
	{
		FilterBox.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="(//*[text()='Create New'])[6]")
	WebElement MyIncidentLink;
	public void ClickOn_MyIncidentLink()
	{
		MyIncidentLink.click();	
	}
	@FindBy(how=How.XPATH,using="//*[@id='sysverb_new']")
	WebElement NewLink;
	public void ClickOn_NewLink()
	{
		NewLink.click();	
	}
	@FindBy(how=How.XPATH,using="//*[@id='sys_display.incident.requested_by']")
	WebElement RequestedBy;
	public void set_RequestedBy(String incident)
	{
		RequestedBy.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="//*[@id='sys_display.incident.caller_id']")
	WebElement RequestedFor;
	public void set_Requestedfor(String incident)
	{
		RequestedFor.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"incident.u_best_contact_number\"]")
	WebElement BestContact_EditBox;
	public void set_BestContact_EditBox(String incident)
	{
		BestContact_EditBox.sendKeys(incident);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='incident.short_description']")
	WebElement ShortDescription;
	public void set_ShortDescription(String incident)
	{
		ShortDescription.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="//*[@id='incident.description']")
	WebElement Description;
	public void set_Description(String incident)
	{
		Description.sendKeys(incident);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='sys_display.incident.assignment_group']")
	WebElement AssignmentGroup;
	public void set_AssignmentGroup(String incident)
	{
		AssignmentGroup.sendKeys(incident);
	}
	@FindBy(how=How.XPATH,using="(//*[@id='sysverb_insert'])[1]")
	WebElement SubmitButton;
	public void ClickOn_SubmitButton()
	{
		SubmitButton.click();
	}
	@FindBy(how=How.XPATH,using="//*[@id='sys_readonly.incident.number']")
	WebElement IncidentNumber;

	
	public String getIncidentNumber()
	{
		
		System.out.println("Inc"+IncidentNumber.getText());
		System.out.println("MLF incident number : "+IncidentNumber.getAttribute("value"));
		return IncidentNumber.getAttribute("value");
	}
	@FindBy(how=How.XPATH,using="(//*[text()='Related Records'])[1]")
	WebElement RelatedRecordTab;
	public void ClickOn_RelatedRecordTab(WebDriver driver)
	{
		customefunction.cFunScrollToElement("(//div//following-sibling::button[@id='resolve_incident'])[2]", driver);
		customefunction.sleep(3000);
		RelatedRecordTab.click();
		//customefunction.cFunScrollToElement("//*[@id='sys_display.incident.caused_by']", driver);
		customefunction.sleep(3000);
	}
	@FindBy(how=How.XPATH,using="//*[@id='label.ni.incident.u_unauthorized']")
	WebElement UnauthorizeChecbox;
	public boolean Verify_UnauthorizeChecbox()
	{
		Boolean flag = null;
		try
		{
		if(UnauthorizeChecbox.isDisplayed())
		{
			System.out.println("Element is present");
			flag=true;
			
		}
		else
		{
			System.out.println("Element is not present");
			flag= false;
		}
		}
		catch(Exception e)
		{
			
		}
		return flag;
	}
	@FindBy(how=How.XPATH,using="(//div[@id='element.incident.u_unauthorized']//input)[3]")
	WebElement UnauthorizeChecboxValue;
	
	public void ToggleToUnauthorizedCheckbox() {
		for(int i=0; i<2; i++)
		{
			
			UnauthorizeChecbox.click();
			customefunction.sleep(3000);	
		System.out.println("Check :" +UnauthorizeChecboxValue.getAttribute("value"));
		TestBase.captureScreenMethod(driver, "TestcaseName");
		
		}
		
	}
	@FindBy(how=How.XPATH,using="//*[@id='user_info_dropdown']/div/div/div/span[2]")
	WebElement ProfileIcon;
	public void scrollToProfileIcon(WebDriver driver)
	{
		customefunction.cFunScrollToElement("//*[@id='sys_readonly.incident.number']", driver);
		JavascriptExecutor js=( JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}
	@FindBy(how=How.XPATH,using="//*[@id='context_1']/div[28]")
	WebElement ReloadFormLink;
	public void ClickOnTo_ToReloadThepage(WebDriver driver2) {
		
		
		customefunction.sleep(2000);
		//driver2.navigate().refresh();
		
		System.out.println("Enter into catalog task");
		
		
		System.out.println("Click on Approver");
		System.out.println("Driver : "+driver2);
		
		Actions action = new Actions(driver2);
		WebElement	ele=driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
		action.contextClick(ele).build().perform();
		System.out.println(driver2);
		System.out.println("ContextMenuApprove"+ReloadFormLink);
		ReloadFormLink.click();
		customefunction.sleep(2000);
		System.out.println("Click on Approver2");
		
}
	
	
	public String cfunToRetrieveDXCIncNum(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='tabs2_section']/span[3]/span[1]/span[2]")).click();
		String data=driver.findElement(By.xpath("(//*[@id='element.incident.correlation_id']//div//div//input//following::input)[1]")).getAttribute("value");
		
	
	System.out.println(data);
	String arr[]=data.split("=");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
		data=arr[1];
		System.out.println("data split"+data);
	
	}
	return data;
	}
	public String cfunToRetrieveIBMIncNum(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='tabs2_section']/span[3]/span[1]/span[2]")).click();
		String data=driver.findElement(By.xpath("(//*[@id='element.incident.correlation_id']//div//div//input//following::input)[1]")).getAttribute("value");
		
	
	System.out.println(data);
	//String arr[]=data.split("=|\\");
	StringTokenizer st=new StringTokenizer(data,"/=@");
	LinkedList<String> ls=new LinkedList<String>();
	while(st.hasMoreElements())
	{
		ls.add(st.nextToken());
		
	}
	System.out.println("Ls : "+ls.get(3));
	return data;
	
	}
	public String getShotDescription(WebDriver driver) {
		customefunction.cFunScrollToElement("//*[@id='incident.category']", driver);
		return ShortDescription.getAttribute("value");
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"activity-stream-work_notes-textarea\"]")
	WebElement WorkNoteInput;
	@FindBy(how=How.XPATH,using="(//*[@class='comment-box container-fluid']//following-sibling::div)[8]//div//button[text()='Post']")
	WebElement PostButton;
	
	public void SendCommentInWorkNote(String comment) {
		WorkNoteInput.click();
		WorkNoteInput.sendKeys(comment);
		PostButton.click();
		
	}
	public void ScrollToPostButton(WebDriver driver)
	{
		customefunction.cFunScrollToElement("(//*[@class='comment-box container-fluid']//following-sibling::div)[8]//div//button[text()='Post']", driver);
	}
	@FindBy(how=How.XPATH,using="//*[@id='tabs2_section']/span[1]/span[1]/span[2]")
	WebElement ActivityTab;
	public void Clickon_ActivityLogTab() {
		
		ActivityTab.click();
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
	
	public void scrollToTheShortDescription(WebDriver driver2)
	{
		customefunction.cFunScrollToElement("(//*[@class='sn-stream']//button)[6]", driver2);	
	}
	@FindBy(how=How.XPATH,using="//*[@id='sn_form_inline_stream_entries']/ul/li[1]/div[3]/div/span")
	WebElement ActivityLogComment;
	public String  getActivityLogComment()
	{
		return ActivityLogComment.getText();
		
	}
	@FindBy(how=How.XPATH,using="//*[@id='incident.contact_type']")
	WebElement Source;
	public void ClickOn_SourceField() {
		
		try
		{
			Source.isEnabled();
			System.out.println("Souce is enabled");
			Source.click();
		}
		catch(Exception e)
		
		
		{
			System.out.println("Souce is not enabled");
		}
	}
	public void VerifyTheSourceValue(String arg1) {
		
		
	}
	public LinkedList<String> fetchAllValueFromSourceFiled() {
		
		//TestBase.driver.findElement(By.xpath("//*[@id='incident.category']")).click();
		Select sl = new Select(TestBase.driver.findElement(By.xpath("//*[@id='incident.contact_type']")));
		LinkedList<String> ls=new LinkedList<String>();
		
		List<WebElement> Options= sl.getOptions();
		System.out.println("Rowcount" + Options.size());

		for (WebElement option : Options) {
			System.out.println("Option " + option.getText());
			ls.add(option.getText());
	}
	return ls;
}
	@FindBy(how=How.XPATH,using="(//*[@id=\"resolve_incident\"])[1]")
	WebElement ResolveButtonIncident;
	
	public void ClickOnResolveButton() {
		
		ResolveButtonIncident.click();
	}
	public void Select_CategoryFieldByText(String text) {
		System.out.println("Categoryyyy");
		Select sl = new Select(TestBase.driver.findElement(By.xpath("//*[@id=\"incident.category\"]")));
		System.out.println("SL : "+sl);
		sl.selectByVisibleText(text);
		
	}
//	@FindBy(how=How.XPATH,using="//*[@id=\"incident.category\"]")
//	WebElement Category;
//	public void Select_CategoryFieldByText(String text) {
//		System.out.println("TestBase.driver : "+TestBase.driver);
//		System.out.println("Categoryyyy");
//		Select sl = new Select(Category);
//		sl.selectByVisibleText(text);
//		
//	}
	public void Select_SubCategoryFieldByText(String text) {
		
		Select sl = new Select(TestBase.driver.findElement(By.xpath("//*[@id=\"incident.subcategory\"]")));
		sl.selectByVisibleText(text);	
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sys_display.incident.assigned_to\"]")
	WebElement AssignedToEditBox;
	
	public void SetValue_AssignedTo(String text) {
		AssignedToEditBox.click();
		AssignedToEditBox.sendKeys(text);
		customefunction.pressEnter();
		ShortDescription.click();
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"tabs2_section\"]/span[4]/span[1]/span[2]")
	WebElement Closuretab;
	@FindBy(how=How.XPATH,using="//*[@id=\"incident.close_notes\"]")
	WebElement CloseNote;
	public void ClickOn_ClosureTabAndFillDetails() {
		Closuretab.click();
		Select sl = new Select(TestBase.driver.findElement(By.xpath("//*[@id=\"sys_select.incident.u_ml_close_code\"]")));
		sl.selectByVisibleText("Closed as per Requestor");
		CloseNote.click();
		CloseNote.sendKeys("Closed");
	}
	}

