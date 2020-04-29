package com.snow.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.textcontext.TextContext;



public class RequestServiceObj  {
	static WebElement element;
	static WebDriver driver;
	public static WebDriverWait wait;
	public static TextContext textContext;
	public static String xpath;
	
		
		public RequestServiceObj(WebDriver driver2) {
			textContext=new TextContext();
			System.out.println("Textcontext :"+textContext);
	
			this.driver=driver2;
			System.out.println("SDrrrr :"+driver);
			PageFactory.initElements(driver, this);
			
		}
	
	

		
		@FindBy(how=How.XPATH,using=XpathRepository.CountryCatlogXpath)
		WebElement CountryCatlog;
		

		
		public boolean AssertTrueCountryCatlogEle()
		{
			return CountryCatlog.isDisplayed();	
		}
		public void ClickOn_CountryCatlog()
		{
			 CountryCatlog.click();	
		}
		@FindBy(how=How.XPATH,using=XpathRepository.CountryCatlogEditBox)
		WebElement CountryCatlogEditBox;
		public void AssertTrueCountryCatlogEditBox()
		{
			org.testng.Assert.assertTrue(CountryCatlogEditBox.isDisplayed());
			
			
		}
		public void ClickOn_CountryCatlogEditBox()
		{
			CountryCatlogEditBox.click();	
		}
		public void set_CountryCatlogEditBox(String country)
		{
			CountryCatlogEditBox.sendKeys(country);
		}
		
		@FindBy(how=How.XPATH,using=XpathRepository.CountryListLink)
		WebElement CountryListLink;
		


		public void ClickOn_CountryListLink()
		{
			
			wait=new WebDriverWait(TestBase.driver,15);
			
			wait.until(ExpectedConditions.elementToBeClickable(textContext.getPageObjectManager().getRequestServiceObj().CountryListLink)).click();;
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		@FindBy(how=How.XPATH,using=XpathRepository.GoButton)
		WebElement GoButton;
		@SuppressWarnings("static-access")
		public void ClickOn_GoButtonk()
		{

//			element=textContext.getPageObjectManager().getRequestServiceObj().GoButton;
//			customefunction.waitVisibilityOf(element, 15, TestBase.driver).click();
			xpath="//*[text()='Go! ']";
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
			customefunction.sleep(5000);

		
		}
		@FindBy(how=How.XPATH,using="//*[@id='s2id_autogen1']/a/span[2]")
		public WebElement RequestedForContext;
		
		public void ClickOn_RequestedForContext() {
			
	
		xpath="//*[@id='s2id_autogen1']/a/span[2]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		}
		
		@FindBy(how=How.XPATH,using="//*[@id='s2id_autogen2_search']")
		WebElement RequestedForEditBox;
		
		public void ClickOn_RequestedForEditBox() {
			
			
			xpath="//*[@id='s2id_autogen2_search']";
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver);
			
		}
		
		
		public void set_RequestedForEditBox(String requesterFor) {
			xpath="//*[@id='s2id_autogen2_search']";
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).sendKeys(requesterFor);;
			 
		}
		@FindBy(how=How.XPATH,using="(//*[@class='select2-search']//following-sibling::ul[1]//div)[2]")
		WebElement RequestedForLink;
		
		public void ClickOn_RequestedForLink() {
			
			RequestedForLink.click();
		}
		public void ClickOn_RequestedForLink_withIndex(int i, String requesterFor, WebDriver driver2) {
			
			String xpath="(//*[@class='select2-search']//following-sibling::ul[1]//div)["+i+"]";
			
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();;
		}
		
		
		
		
	
		
}