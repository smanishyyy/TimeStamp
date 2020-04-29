package com.snow.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.textcontext.TextContext;

public class AdminHomePageApproveRequestItemtObj {
	public static WebDriver driver;
	public static WebElement ele;
	public static String ItemrequestApproverName;
	public static TextContext textContext;
	public static File fl;


@SuppressWarnings("static-access")
public AdminHomePageApproveRequestItemtObj(WebDriver driver2)
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
	@FindBy(how=How.XPATH,using =XpathRepository.GlobalSearchBoxXpath)
	WebElement GlobalSearchBox;
	
	public WebDriver SearchRequestNumberInAdmin(String ReqNum)
	{
		System.out.println("In AdminHomePageObj");
		customefunction.sleep(4000);
		System.out.println("driver Admin :"+driver);
		
		System.out.println("GlobalSearchBox :"+GlobalSearchBox);
		GlobalSearchBox.click();
		GlobalSearchBox.clear();
		GlobalSearchBox.sendKeys(ReqNum);
		customefunction.sleep(2000);
		customefunction.pressEnter();
		return driver;
	}
	public void SearchRequestNumberInAdmin2(String ReqNum)
	{
		System.out.println("In AdminHomePageObj");
		customefunction.sleep(2000);
		System.out.println("driver Admin :"+driver);
		GlobalSearchBox.click();
		GlobalSearchBox.clear();
		GlobalSearchBox.sendKeys(ReqNum);
		customefunction.sleep(2000);
		customefunction.pressEnter();
		
	}
	@FindBy(how=How.XPATH,using =XpathRepository.RITMNumberXpath)
	WebElement RITMNumber;
	
	@FindBy(how=How.XPATH,using =XpathRepository.ContextMenuApproveXpath)
	WebElement ContextMenuApprove;
	
	
	
	public void ClickOn_RITMNumberLink()
	{
		RITMNumber.click();
	}
	
	@FindBy(how=How.XPATH,using =XpathRepository.ApproverTabXpath)
	public WebElement ApproverTab;
	@FindBy(how=How.XPATH,using =XpathRepository.RequestedXpath)
	WebElement Requested;
	@FindBy(how=How.XPATH,using =XpathRepository.RequestedTabXpath)
	WebElement RequestedTab;
	@FindBy(how=How.XPATH,using =XpathRepository.RITMNumberXpath)
	WebElement RITMNumberXpath;
	@FindBy(how=How.XPATH,using ="(//*[@id='sc_request.sc_req_item.request_table']//tbody//td[3]//a)")
	List<WebElement> ListOfRITM;
	@FindBy(how=How.XPATH,using ="(//*[@id='sc_request.sc_req_item.request_table']//tbody//td)[8]")
	WebElement RequestApprovalCol;
	//*[@id="tabs2_list"]/span[1]/span/span[2]
	
	@FindBy(how=How.XPATH,using ="(//*[@id='sc_request.sc_req_item.request_table']//tbody//td[3]//a)")
	WebElement RITMnumberLink;
	
	@FindBy(how=How.XPATH,using ="//*[@id='sc_request.sysapproval_approver.sysapproval_table']//tbody//td[3]//a")
	WebElement RequestedApproverTab;
	@FindBy(how=How.XPATH,using ="//*[@id=\"page_timing_div\"]/button")
	WebElement PageTimingButton;
	
	
	
	public String ApproveToRequest()
	{
		driver.findElement(By.xpath("//*[@id='tabs2_list']/span[2]/span/span[2]")).click();
		customefunction.sleep(2000);
		String str =null;
		Boolean flag=customefunction.IsElementExist(RequestedApproverTab);
		System.out.println("Flag :"+flag);
		try
		{
		if(flag)
		{
	customefunction.sleep(2000);
//		ApproverTab.click();
			//customefunction.cusScrollDownByPixel(TestBase.driver2);
			customefunction.cFunScrollToElement("//*[@id=\"page_timing_div\"]/button", TestBase.driver2);
//			fl=TestBase.captureScreenMethod(TestBase.driver2, "STRY0019941_TC01");
//			try {
//				Reporter.addScreenCaptureFromPath(fl.toString());
//				
//			} catch (IOException e) {
//			
//				e.printStackTrace();
//			}
		System.out.println("Click on Approver");
		
		Actions action = new Actions(driver);
		ele=driver.findElement(By.xpath(XpathRepository.RequestedXpath));
		action.contextClick(ele).build().perform();
		System.out.println(driver);
		System.out.println("ContextMenuApprove"+ContextMenuApprove);
		ContextMenuApprove.click();
		customefunction.sleep(4000);
		RequestedTab.click();
		str="manager approval is required for this Item";
		}
		else
		{
			str="manager approval is not required for this Item";
			System.out.println("Else executed");
			
			
		}
		}
		catch(Exception e)
		{
			
		}
		return str;
		
	}
	public void ApproveByAllApprover(WebDriver driver2)
	{
		
		System.out.println("driver2 :"+driver2);
		System.out.println("RequestedElement :"+RequestedElement);
		Boolean flag=customefunction.IsElementExist(RequestedElement);
		System.out.println("Flag :"+flag);
		if(flag)
		{
		customefunction.sleep(2000);
		//driver2.navigate().refresh();
		
		System.out.println("Enter into catalog task");
		//customefunction.cFunScrollToElement(XpathRepository.ApproverTabXpath, driver);
		ApproverTab.click();
		System.out.println("Click on Approver");
		ItemrequestApproverName=ItemrequestApproverName2.getText();
		//Actions action = new Actions(driver2);
		String x="(//*[@class='list_decoration list_decoration_pad list_hide_empty input-group-checkbox '])[2]//label";
		customefunction.waitVisibilityOfElementLocated(x, 15, driver2).click();
		driver2.findElement(By.xpath("(//*[@class='list_action_option form-control '])[2]")).click();
//		action.contextClick(ele).build().perform();
		System.out.println(driver2);
		String x2="((//*[@class='list_action_option form-control '])[2]//following ::option)[1]";
		customefunction.cFunSelectValueByIndexXpath(x2, driver2);
//		System.out.println("ContextMenuApprove"+ContextMenuApprove);
//		ContextMenuApprove.click()
//		customefunction.sleep(2000);
		CatalogTaskTab.click();
		}
		else
		{
			System.out.println("Out");
			
		}
	}
	
	public void Click_OnTheRITMLink()
	{
		customefunction.cFunScrollToElementt(RequestedTab,TestBase.driver);
		RequestedTab.click();
		RITMnumberLink.click();		
	}
	

	public void Click_OnTheRITLink(WebDriver driver2, String permissionVal)
	{
		try {
			RequestedTab.click();
			customefunction.cFunScrollToElement(XpathRepository.RequestedTabXpath, driver2);
			List<WebElement>ListOfRITM=driver2.findElements(By.xpath("(//*[@id='sc_request.sc_req_item.request_table']//tbody//td[3]//a)"));
			System.out.println("ListOfRITM.size(): "+ListOfRITM.size());
			customefunction.cFunScrollToElement("(//*[@id='sc_request.sc_req_item.request_table']//tbody//td[3]//a)[6]", driver2);
			for (int i=0;i<ListOfRITM.size();i++) {
				System.out.println("List :"+ListOfRITM.get(i).getText());
				customefunction.sleep(2000);
				if(ListOfRITM.get(i).getText().equalsIgnoreCase(permissionVal))
						{
					customefunction.sleep(2000);
					System.out.println("Selecetd value : "+ListOfRITM.get(i).getText());
						@SuppressWarnings("unused")
						int j=i+1;
						driver.findElement(By.xpath("(//*[@id='sc_request.sc_req_item.request_table']//tbody//td[4]//a)["+j+"]")).click();
						customefunction.sleep(2000);
						System.out.println("RITM number clicked successfully");
						}
			}	
		}
		
		catch(Exception e)
		{
		e.getMessage();
		}
			}
	
	
	
			@FindBy(how=How.XPATH,using ="(//*[text()='Requested'])[2]")
			WebElement RequestedElement;
	@FindBy(how=How.XPATH,using =XpathRepository.ItemrequestApproverNameXpath)
	WebElement ItemrequestApproverName2;
	public void ApproveToRequestItem(WebDriver driver2)
	{
		
		System.out.println("driver2 :"+driver2);
		System.out.println("RequestedElement :"+RequestedElement);
		Boolean flag=customefunction.IsElementExist(RequestedElement);
		System.out.println("Flag :"+flag);
		if(flag)
		{
		customefunction.sleep(2000);
		//driver2.navigate().refresh();
		
		System.out.println("Enter into catalog task");
		//customefunction.cFunScrollToElement(XpathRepository.ApproverTabXpath, driver);
		ApproverTab.click();
		System.out.println("Click on Approver");
		ItemrequestApproverName=ItemrequestApproverName2.getText();
		Actions action = new Actions(driver2);
		ele=driver.findElement(By.xpath(XpathRepository.RequestedXpath));
		action.contextClick(ele).build().perform();
		System.out.println(driver2);
		System.out.println("ContextMenuApprove"+ContextMenuApprove);
		ContextMenuApprove.click();
		customefunction.sleep(2000);
		CatalogTaskTab.click();
		}
		else
		{
			System.out.println("Out");
			
		}
	}
	
	
	public String ItemrequestApproverName()
	{
		
		
		
		return ItemrequestApproverName;
		
	}
	@FindBy(how=How.XPATH,using =XpathRepository.CatalogTaskTabXpath)
	WebElement CatalogTaskTab;
	@FindBy(how=How.XPATH,using =XpathRepository.CatalogTaskNumberLinkXpath)
	WebElement CatalogTaskNumberLink;
	@FindBy(how=How.XPATH,using ="(//*[@class='linked formlink'])[2]")
	WebElement CatalogTaskNumberLink2;
	
	
	
	public void Click_OnCatalogTaskLink()
	{
		
		Boolean flag=customefunction.IsElementExist(CatalogTaskNumberLink2);
		System.out.println("Flag :"+flag);
		if(flag)
		{
		//customefunction.cFunScrollToElemet(XpathRepository.CatalogTaskTabXpath, driver);
			customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
			System.out.println("out2");
			customefunction.sleep(2000);
			CatalogTaskNumberLink2.click();
		}
		else
		{
			System.out.println("Click_OnTheRITLink");
			customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
			CatalogTaskTab.click();
			customefunction.sleep(2000);
			CatalogTaskNumberLink.click();
			
		}
		
	}
	
	@FindBy(how=How.XPATH,using ="//*[@id='sc_req_item.sc_task.request_item_filter_toggle_image']")
	WebElement FilterButtonTask;
	
	
	public void CloseCompleteTheTaskTill_AssigningToOrchestrationGroup(CatalogtaskPageObj catalogtaskPage,IncidentPage_MLF_Object incidentPage_MLF, WebDriver driver2) {
String ShortDescriptionTask=driver.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[7]")).getText();
System.out.println("Orchestration driver : "+ShortDescriptionTask);
System.out.println("OrchestrationAssignmentGroup : "+driver2);
		while(ShortDescriptionTask!="Assign user to software - Mac")
		{
			System.out.println("Check while condition :"+ShortDescriptionTask);
			if(ShortDescriptionTask.contains("Assign user to software"))
			{
				driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[3]")).click();
				customefunction.sleep(2000);
				System.out.println("Exit form loop");
				break;
			}
			else
			{
			customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
			CatalogTaskTab.click();
			customefunction.sleep(2000);
			driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[3]")).click();
			String selectValueState="Closed Complete";
			
			catalogtaskPage.SelectValueFromState(selectValueState);
			customefunction.sleep(2000);
			if(ShortDescriptionTask.equalsIgnoreCase("Order software in VPP Store"))
			{
				
			catalogtaskPage.AssignedToSomeone("Angel Ureta");
			}
			else if (ShortDescriptionTask.equalsIgnoreCase("Allocate VPP Software License in JSS"))
			{
				catalogtaskPage.AssignedToSomeone("Antonio Lam Ong");	
			}
			
			
			customefunction.sleep(2000);
			catalogtaskPage.Set_WorkNote();
			customefunction.sleep(2000);
			catalogtaskPage.ClickOn_CloseButton();
			customefunction.sleep(3000);
//			catalogtaskPage.ClickOnTo_ToReloadThepage_RITM(driver2);
//			customefunction.sleep(3000);
			customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
			ShortDescriptionTask=driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[7]")).getText();
			System.out.println("OrchestrationAssignmentGroup in while : "+ShortDescriptionTask);
			}
			System.out.println("End of while loop");
		}	
		System.out.println("Out of this method");
		
	}
	@FindBy(how=How.XPATH,using ="//*[@class='cat_item_option sc-content-pad form-control']")
	WebElement HostNumber;
	
	public void CloseCompleteTheTaskTill_AssigningToOrchestrationGroup_DataDriven(CatalogtaskPageObj catalogtaskPage,IncidentPage_MLF_Object incidentPage_MLF, WebDriver driver2,String ShortDescDatatable,String AssignedTO) {
		customefunction.sleep(4000);
		customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
		System.out.println("Hi Catalog");
		ele=driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[7]"));
		String ShortDescriptionTask=driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[7]")).getText();
		
		System.out.println("ele short : "+ele);
		System.out.println("Task desc : "+ShortDescriptionTask);
		System.out.println("OrchestrationAssignmentGroup : "+driver2);
				while(ShortDescriptionTask!=ShortDescDatatable)
				{
					System.out.println("Check while condition :"+ShortDescriptionTask);
					if(ShortDescriptionTask.contains(ShortDescDatatable))
					{
						driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[3]")).click();
						customefunction.sleep(2000);
						System.out.println("Exit form loop");
						break;
					}
					else
					{
					customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
					CatalogTaskTab.click();
					customefunction.sleep(2000);
					driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[3]")).click();
					String selectValueState="Closed Complete";
					
					catalogtaskPage.SelectValueFromState(selectValueState);
					customefunction.sleep(2000);
					
						
					catalogtaskPage.AssignedToSomeone(AssignedTO);
					
					if(customefunction.IsElementExist(HostNumber))
					{
						HostNumber.sendKeys("1234");
					}
					customefunction.SetIfExist(HostNumber,"1234");
					
					customefunction.sleep(2000);
					catalogtaskPage.Set_WorkNote();
					customefunction.sleep(2000);
					catalogtaskPage.ClickOn_CloseButton();
					customefunction.sleep(3000);
//					catalogtaskPage.ClickOnTo_ToReloadThepage_RITM(driver2);
//					customefunction.sleep(3000);
					customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
					ShortDescriptionTask=driver2.findElement(By.xpath("//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[7]")).getText();
					System.out.println("OrchestrationAssignmentGroup in while : "+ShortDescriptionTask);
					}
					System.out.println("End of while loop");
				}	
				System.out.println("Out of this method");
				
			}
	public void Click_OnFirstCatalogTaskLink() {
		System.out.println("Click_OnTheRITLink");
		customefunction.cFunScrollToElementt(CatalogTaskTab, TestBase.driver2);
		CatalogTaskTab.click();
		customefunction.sleep(2000);
		CatalogTaskNumberLink.click();
		
	}
	
	
	
	
}

