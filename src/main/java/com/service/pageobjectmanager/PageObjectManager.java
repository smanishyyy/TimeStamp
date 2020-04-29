package com.service.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.snow.pages.ACLNetwrkFldrPage_Obj;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.EmployeePortaltestObj;
import com.snow.pages.HPPrinterItemObj;
import com.snow.pages.HomepageObj;
import com.snow.pages.RPSSDTechnicalSupportModeObj;
import com.snow.pages.RequestServiceObj;
import com.snow.pages.RequestedItemObj;
import com.snow.pages.SubmitNewIncidentObj;



public class PageObjectManager {
	public static HomepageObj hompage;
	private static  String TC01_STRY0019078="TC01_STRY0019078";
	private static  String SearchItemname="New Software or new version of existing Software";
	public static RequestServiceObj RequestService;
	public static WebDriver driver;
	public static WebDriver driverPa;
	public static EmployeePortaltestObj EmployeePortaltest;
	public static int whichIndexYouWantToSelect;
	public static String RequestNumber;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static CatalogtaskPageObj CatalogtaskPage;
	public static RequestedItemObj RequestedItem;
	public static HPPrinterItemObj HPPrinterItem;
	public static SubmitNewIncidentObj SubmitNewIncident;
	public static ACLNetwrkFldrPage_Obj ACLNetwrkFldrPage;
	public static WebDriverManager WebDriverManager;
	 
	public static RPSSDTechnicalSupportModeObj RPSSDTechnicalSupportMode;
	 public PageObjectManager(WebDriver driver) {
	 
	 this.driver = driver;
	 
	 }
	 public static EmployeePortaltestObj getEmployeePortaltestObj(){
		 EmployeePortaltest=null;
		 return (EmployeePortaltest == null) ? EmployeePortaltest = new EmployeePortaltestObj(driver) : EmployeePortaltest;
		 
		 }
 public static HomepageObj getHomepageObj(){
	 hompage=null;
		 return (hompage == null) ? hompage = new HomepageObj(driver) : hompage;
		 
		 }
 public static RequestServiceObj getRequestServiceObj(){
 RequestService=null;
	 return (RequestService == null) ? RequestService = new RequestServiceObj(driver) : RequestService;
	 
	 }
 
	 
	 
	 
 public static RPSSDTechnicalSupportModeObj getRPSSDTechnicalSupportModeObj(){
	RPSSDTechnicalSupportMode=null;
		 return (RPSSDTechnicalSupportMode == null) ? RPSSDTechnicalSupportMode = new RPSSDTechnicalSupportModeObj(driver) : RPSSDTechnicalSupportMode;
		 
		 }
	 
public static RequestedItemObj getRequestedItemObj(){
		 System.out.println("RequesteItem :"+RequestedItem);
		 System.out.println("RequesteItem driver :"+driver);
		 RequestedItem=null;
		 return (RequestedItem == null) ? RequestedItem = new RequestedItemObj(driver) : RequestedItem;
		 
		 }
public static HPPrinterItemObj getHPPrinterItemObj(){
	HPPrinterItem=null;
		 return (HPPrinterItem == null) ? HPPrinterItem = new HPPrinterItemObj(driver) : HPPrinterItem;
		 
		 }

public static SubmitNewIncidentObj getSubmitNewIncidentObj(){
	SubmitNewIncident=null;
		 return (SubmitNewIncident == null) ? SubmitNewIncident = new SubmitNewIncidentObj(driver) : SubmitNewIncident;
		 
		 }
public static ACLNetwrkFldrPage_Obj getACLNetwrkFldrPage_Obj(){
	ACLNetwrkFldrPage=null;
		 return (ACLNetwrkFldrPage == null) ? ACLNetwrkFldrPage = new ACLNetwrkFldrPage_Obj(driver) : ACLNetwrkFldrPage;
		 
		 }

public static WebDriverManager getWebDriverManager(){
	WebDriverManager=null;
		 return (WebDriverManager == null) ? WebDriverManager = new WebDriverManager() : WebDriverManager;
		 
		 }



}
