package com.snow.pages;

import java.io.File;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.servicenow.XpathRepository.XpathRepository;
import com.servicenow.readxml.getOrVal;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.textcontext.TextContext;




public class HomepageObj extends getOrVal  {

String u_company="u_company"; 
String u_last_name="u_last_name";
String u_ticket_number="u_ticket_number";
String u_external_ticket_id="u_external_ticket_id";
String u_first_name="u_first_name";
String u_description="u_description";
String u_workinfo_notes="u_workinfo_notes";
String u_email="u_email";
String u_status="u_status";
public static WebElement element;
public static WebDriver driver;
public static  getOrVal gt;
public static TextContext textContext;


 String xpathVal;
public  String text="<u_impact>4 - Low</u_impact>";
	@SuppressWarnings({ "static-access", "deprecation" })
	public HomepageObj(WebDriver driver2) {
		 try {
	this.driver=driver2;
	textContext=new TextContext();
	
	
		PageFactory.initElements(driver, this);
		
		 gt=new getOrVal();
		
			customefunction.writeFile("C:\\Users\\chaurma\\eclipse-workspace\\SnowNowPageObjectFramework\\Obj2.xml", text);
		 
		 System.out.println("Value of u_company : "+gt.getORvalue(u_company));
		 System.out.println("Value of u_last_name  : "+gt.getORvalue(u_last_name));
		 System.out.println("Value of u_ticket_number  : "+gt.getORvalue(u_ticket_number));
		 System.out.println("Value of u_first_name  : "+gt.getORvalue(u_first_name));
		 System.out.println("Value of u_description  : "+gt.getORvalue(u_description));
		 System.out.println("Value of u_description  : "+gt.getORvalue(u_description));
		 System.out.println("Value of u_workinfo_notes  : "+gt.getORvalue(u_workinfo_notes));
		 System.out.println("Value of u_email  : "+gt.getORvalue(u_email));
		 System.out.println("Value of u_email  : "+gt.getORvalue(u_status));


		 System.out.println("xpathVal without inheritance : "+	getORvalue2(u_company));
		 }
		 catch (IOException e) {
				
				e.printStackTrace();
			}	
			
	}
	
	@FindBy(how = How.XPATH,using = "//*[text()=' Request Service ']")
 WebElement RequestServLink;
	
	
	public void clickOn_RequestLink()
	{
		
		

		customefunction.waitVisibilityOfElementLocated("//*[text()=' Request Service ']", 15,TestBase.driver).click();;
	
	}
	@FindBy(how = How.XPATH,using = XpathRepository.homelink)
	 WebElement homelink;
	
	@SuppressWarnings("static-access")
	public void  Clickon_HomeLink() {

		element=textContext.getPageObjectManager().getHomepageObj().homelink;
		//customefunction.waitElementTobeCLickable(element,15,TestBase.driver).click();;
		

	}
	
	private String getORvalue2(String data) {
		try {
			File inputFile = new File("C:\\Users\\chaurma\\eclipse-workspace\\SnowNowPageObjectFramework\\ObjectRepository.xml");									
		    SAXReader saxReader = new SAXReader();					
		    Document document;
			
				document = saxReader.read(inputFile);
									
		    String GoogleSearch =document.selectSingleNode("//menu/"+data).getText();
		   
		    data=GoogleSearch;
			}
		    catch (DocumentException e) {
				
				e.printStackTrace();
			}
				return data;
				
			}

	
	
	@FindBy(how = How.XPATH,using = "//span[text()='Report Incident']")
	WebElement ReportIncidentLink;
	public void ClickOn_ReportIncidentLink() {
		
		ReportIncidentLink.click();
	}
	@FindBy(how = How.XPATH,using = "//*[text()='Report an Incident']")
	WebElement ReportAnIncidentLink;
	
public void ClickOn_ReportAnIncidentLink() {
		
	ReportAnIncidentLink.click();
	}
	
	
	
		
	}
	
	
	
	
	
	

	


	

