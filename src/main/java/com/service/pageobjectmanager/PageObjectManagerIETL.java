package com.service.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.ConfirmationPage;
import com.snow.pages.IncidentPage_DXC_Object;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.pages.MLFChangeFormObj;
import com.snow.pages.RITMpageObj;


public class PageObjectManagerIETL {
	public static WebDriver driver;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static CatalogtaskPageObj CatalogtaskPage;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static IncidentPage_DXC_Object IncidentPage_DXC;
	public static RITMpageObj RITMpage;
	public static WebDriverManager WebDriverManager;
	public static ConfirmationPage ConfirmationPage;
	public static MLFChangeFormObj MLFChangeForm;
	public PageObjectManagerIETL(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 public static AdminHomePageApproveRequestItemtObj getAdminHomePageApproveRequestItemtObj(){
		AdminHomePage=null;
			 return (AdminHomePage == null) ? AdminHomePage = new AdminHomePageApproveRequestItemtObj(driver) : AdminHomePage;
			 
			 }
public static CatalogtaskPageObj getCatalogtaskPageObj(){
	CatalogtaskPage=null;
			 return (CatalogtaskPage == null) ? CatalogtaskPage = new CatalogtaskPageObj(driver) : CatalogtaskPage;
			 
			 }
public static IncidentPage_MLF_Object getIncidentPage_MLF_Object(){
	IncidentPage_MLF=null;
	 return (IncidentPage_MLF == null) ? IncidentPage_MLF = new IncidentPage_MLF_Object(driver) : IncidentPage_MLF;
	 
	 }
public static IncidentPage_DXC_Object getIncidentPage_DXC_Object(){
	IncidentPage_DXC = null;
	 return (IncidentPage_DXC == null) ? IncidentPage_DXC = new IncidentPage_DXC_Object(driver) : IncidentPage_DXC;
	 
	 }
public static RITMpageObj getRITMpageObj(){
IncidentPage_DXC = null;
	RITMpage=null;
	 return (RITMpage == null) ? RITMpage = new RITMpageObj(driver) : RITMpage;
	 
	 }
public static WebDriverManager getWebDriverManager(){
	WebDriverManager=null;
		 return (WebDriverManager == null) ? WebDriverManager = new WebDriverManager() : WebDriverManager;
		 
		 }
public static ConfirmationPage getConfirmationPage(){
	ConfirmationPage=null;
		 return (ConfirmationPage == null) ? ConfirmationPage = new ConfirmationPage(driver) : ConfirmationPage;
		 
		 }
public static MLFChangeFormObj getMLFChangeFormObj(){
	MLFChangeForm=null;
		 return (MLFChangeForm == null) ? MLFChangeForm = new MLFChangeFormObj(driver) : MLFChangeForm;
		 
		 }

}
