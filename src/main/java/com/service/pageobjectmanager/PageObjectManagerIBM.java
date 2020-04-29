package com.service.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.ConfirmationPage;
import com.snow.pages.IBMChangeFormObj;
import com.snow.pages.IncidentPage_DXC_Object;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.pages.MLFChangeFormObj;
import com.snow.pages.RITMpageObj;

public class PageObjectManagerIBM {
	public static WebDriver driver;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static CatalogtaskPageObj CatalogtaskPage;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static IncidentPage_DXC_Object IncidentPage_DXC;
	public static RITMpageObj RITMpage;
	public static WebDriverManager WebDriverManager;
	public static ConfirmationPage ConfirmationPage;
	public static MLFChangeFormObj MLFChangeForm;
	public static IBMChangeFormObj IBMChangeForm;
	public PageObjectManagerIBM(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 public static IBMChangeFormObj getIBMChangeFormObj(){
			 IBMChangeForm=null;
			 return (IBMChangeForm == null) ? IBMChangeForm = new IBMChangeFormObj(driver) : IBMChangeForm;
			 
			 }
}
