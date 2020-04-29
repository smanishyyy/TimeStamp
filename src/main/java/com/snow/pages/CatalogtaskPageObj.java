package com.snow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.servicenow.XpathRepository.XpathRepository;
import com.snow.customfunction.customefunction;

public class CatalogtaskPageObj {
public static WebDriver driver;

	public CatalogtaskPageObj(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.XPATH,using =XpathRepository.SelectStateXpath)
	WebElement SelectState;
	@FindBy(how=How.XPATH,using =XpathRepository.WorkNoteXpath)
	WebElement WorkNote;
	@FindBy(how=How.XPATH,using =XpathRepository.CloseCompleteButtonXpath)
	WebElement CloseCompleteButton;
	@FindBy(how=How.XPATH,using =XpathRepository.FullfillmentButtonXpath)
	WebElement Fullfillment;
	@FindBy(how=How.XPATH,using ="(//table[@class='container_table'])[3]//tbody//tr[7]//input[2]")
	WebElement BUBAOrderGuiDeVal;
	@FindBy(how=How.XPATH,using ="//*[@id='sc_task.short_description']")
	WebElement ShortDescVal;
	
	
	
	
	
	
	
	
	
	
	public void SelectValueFromState(String selectValueState)
	{
		customefunction.SelectValueFromDrp(driver, XpathRepository.SelectStateXpath, selectValueState);
	}
	@FindBy(how=How.XPATH,using =XpathRepository.AssignedToXpath)
	WebElement AssignedTo;
	
	public void AssignedToSomeone(String assignedTo2)
	{
		AssignedTo.sendKeys(assignedTo2);	
		customefunction.sleep(2000);
		customefunction.pressEnter();
		System.out.println("Working");
		Fullfillment.click();
		System.out.println("Working2");
	}
	public void Set_WorkNote()
	{
		System.out.println("Working3");
		WorkNote.click();
		WorkNote.sendKeys("WorkNote");	
		
	}
	public void ClickOn_CloseButton()
	{
		
		CloseCompleteButton.click();
		
	}
	@FindBy(how=How.XPATH,using =XpathRepository.RequestedForinfromationLink)
	WebElement RequestedForinfromationLink;
	public void ClickOn_RequestedForInformationLink()
	{
		RequestedForinfromationLink.click();	
	}
	@FindBy(how=How.XPATH,using =XpathRepository.MoreInformation)
	WebElement MoreInformation;
	
	public void Set_MoreInformation(String text)
	{
		MoreInformation.click();
		MoreInformation.sendKeys(text);
	}
	public String getValueOf_BUBAOrderGuideName() {
		
		return BUBAOrderGuiDeVal.getAttribute("value");
	}
	public String getValueOf_ShortDesc() {
		
		return ShortDescVal.getAttribute("value");
	}
	public void scrollTo_BUBAOrderGuideName(WebDriver driver2)
	{
		customefunction.cFunScrollToElement("(//table[@class='container_table'])[3]//tbody//tr[5]//select", driver2);
	}
	public void scrollTo_ShortDesc(WebDriver driver2)
	{
		customefunction.cFunScrollToElement("//*[@id='sc_task.short_description']", driver2);
	}
	@FindBy(how=How.XPATH,using ="//*[@id='sys_display.sc_task.assignment_group']")
	WebElement AssignementGroup;
	
	public void AssignedTogroup(String string) {
		AssignementGroup.clear();
		AssignementGroup.sendKeys(string);
		customefunction.sleep(2000);
		customefunction.pressEnter();
		System.out.println("Working");
		Fullfillment.click();
		System.out.println("Working2");
	}
	
	@FindBy(how=How.XPATH,using ="(//*[@id='sysverb_update'])[1]")
	WebElement UpdateButton;
	
	public void Clickon_UpdateButton() {
		
		UpdateButton.click();
	}
	@FindBy(how=How.XPATH,using ="(//div[@id='sc_task.form_header']//span[1]//div)[1]")
	WebElement UpperRibbon;
	@FindBy(how=How.XPATH,using ="//*[@id='context_1']/div[17]")
	WebElement ReloadForm;
	
	public void ClickOnTo_ToReloadThepage(WebDriver driver2) {
		
		
				customefunction.sleep(4000);
				//driver2.navigate().refresh();
				
				System.out.println("Enter into catalog task");
				
				
				System.out.println("Click on Approver");
				System.out.println("Driver : "+driver2);
				
				Actions action = new Actions(driver2);
				WebElement	ele=driver2.findElement(By.xpath("(//div[@id='sc_task.form_header']//span[1]//div)[1]"));
				action.contextClick(ele).build().perform();
				System.out.println(driver2);
				System.out.println("ContextMenuApprove"+ReloadForm);
				ReloadForm.click();
				customefunction.sleep(3000);
				System.out.println("Click on Approver2");
				
	}
	public void ClickOnTo_ToReloadThepage_RITM(WebDriver driver2) {
		
		
		customefunction.sleep(4000);
		//driver2.navigate().refresh();
		
		System.out.println("Enter into catalog task");
		
		
		System.out.println("Click on Approver");
		System.out.println("Driver : "+driver2);
		
		Actions action = new Actions(driver2);
		WebElement	ele=driver2.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
		action.contextClick(ele).build().perform();
		System.out.println(driver2);
		System.out.println("ContextMenuApprove"+ReloadForm);
		ReloadForm.click();
		customefunction.sleep(3000);
		System.out.println("Click on Approver2");
		
}

	@FindBy(how=How.XPATH,using ="//*[@id='tabs2_list']/span[4]/span/span[2]")
	WebElement RestTransactionTab;
public void Clickon_RestTransactionTab() {
		
	RestTransactionTab.click();
	}
@FindBy(how=How.XPATH,using ="(//*[@id='sc_task.u_rest_transaction.u_integrated_item_table']//tbody//tr[1]//a)[2]")
WebElement RestTransactionlink;
public void Clickon_RestTransactionlink() {
	
	RestTransactionlink.click();
	}
@FindBy(how=How.XPATH,using ="//*[@id='u_rest_transaction.u_request']")
WebElement RestPayloadReqtextArea;
public void ClickIn_RestPayloadReqtextArea() {
	
	RestPayloadReqtextArea.click();	
}
public void copyRestPayload() {
	RestPayloadReqtextArea.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	RestPayloadReqtextArea.sendKeys(Keys.chord(Keys.CONTROL, "c"));
	
}

public void ScrollToPostButton(WebDriver driver)
{
	customefunction.cFunScrollToElement("(//*[@class='comment-box container-fluid']//following-sibling::div)[8]//div//button[text()='Post']", driver);
}

@FindBy(how=How.XPATH,using ="//*[text()='Orchestration not triggered - missing  userID']")
WebElement ActivityComment;

public String getActivityComment() {
	return ActivityComment.getText();
	
}
public WebElement getActivityCommentElement()
{
	return ActivityComment;
}
@FindBy(how=How.XPATH,using ="//*[contains(text(),\"/RequestedFor's userId\")]")
WebElement ActivityComment2;
public WebElement getActivityCommentElement2()
{
	return ActivityComment2;
}
public String getActivityComment2() {
	return ActivityComment2.getText();
	
}
@FindBy(how=How.XPATH,using ="//*[contains(text(),'assigned to User')]")
WebElement ActivityComment3;

public String getActivityComment3() {
	// TODO Auto-generated method stub
	return ActivityComment3.getText();
}
@FindBy(how=How.XPATH,using ="//*[contains(text(),'has been retired')]")
WebElement ActivityComment4;

public String getActivityComment4() {
	// TODO Auto-generated method stub
	return ActivityComment4.getText();
}



	
	
	

}

