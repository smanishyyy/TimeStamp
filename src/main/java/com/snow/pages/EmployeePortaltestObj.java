package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;

public class EmployeePortaltestObj {
	 WebElement element;
	 public  static  WebDriver driver;
		public EmployeePortaltestObj(WebDriver driver2) {
			this.driver=driver2;
			System.out.println("EMP "+driver);
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.XPATH,using=XpathRepository.Placeholder)
		WebElement Placeholder;
		

		
		public void AssertTruePlaceholder()
		{
			org.testng.Assert.assertTrue(Placeholder.isDisplayed());
			
			
		}
		public void ClickOn_Placeholder()
		{
			Placeholder.click();	
		}
		public void set_Placeholder(String ItemName)
		{
			Placeholder.sendKeys(ItemName);
			//customefunction.pressEnter();
		}
		@FindBy(how=How.XPATH,using=XpathRepository.ItemLinkList)
		WebElement ItemLinkList;
		

		
		public void AssertTrueItemLinkList()
		{
			org.testng.Assert.assertTrue(Placeholder.isDisplayed());
			
			
		}
		public void ClickOn_ItemLinkList()
		{
			Placeholder.click();	
		}
		@FindBy(how=How.XPATH,using=XpathRepository.ItemLink)
		WebElement ItemLink;
		

		
		public void AssertTrueItemLink()
		{
			org.testng.Assert.assertTrue(ItemLink.isDisplayed());
			
			
		}
//		public InstallPrinterItem_FormPageObj ClickOn_ItemLinkList_NavigateToFormPage()
//		{
//			ItemLink.click();
//			customefunction.sleep(4000);
//			return new InstallPrinterItem_FormPageObj(driver);
//		}
	
//		public NewSoftwareOrNewVersionObj ClickOn_Item_New_NavigateToFormPage() {
//			ItemLink.click();
//			customefunction.sleep(4000);
//			return new NewSoftwareOrNewVersionObj(driver);
//		}
		public void ClickOn_ItemLink_RPSSDTechnicalSupportModeObj()
		{
			ItemLink.click();
			customefunction.sleep(4000);
			
		}
		
		
		
		
}
