package com.servicenow.practice;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.servicenow.XpathRepository.XpathRepository;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.EmployeePortaltestObj;
import com.snow.pages.HomepageObj;

import com.snow.pages.RequestServiceObj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ServicePortalCommonTask extends TestBase  {
	public static HomepageObj hompage;
	public static RequestServiceObj RequestService;
	public static WebDriver driver;
	public static WebDriver driverPa;
	public static EmployeePortaltestObj EmployeePortaltest;
	public static int whichIndexYouWantToSelect;
	public static String RequestNumber;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static CatalogtaskPageObj CatalogtaskPage;
	
	
	
	public ServicePortalCommonTask(String tC01_SubmitRequest, String searchItemname)
	{
		super();
driver=initialization("url");
		
		hompage=new HomepageObj(driver);
		Reporter.log( "User logged into Service Now Portal " );
//		RequestService=	hompage.clickOn_RequestLink();
		customefunction.captureScreenMethod(driver, XpathRepository.path, tC01_SubmitRequest);
		Reporter.log( "Clicks on Request service link on the home page" );
		RequestService.ClickOn_CountryCatlog();
		RequestService.ClickOn_CountryCatlogEditBox();
		RequestService.set_CountryCatlogEditBox("United States");
		RequestService.ClickOn_CountryListLink();
		customefunction.captureScreenMethod(driver, XpathRepository.path, tC01_SubmitRequest);
//		EmployeePortaltest=	RequestService.ClickOn_GoButtonk();
		EmployeePortaltest.ClickOn_Placeholder();
		EmployeePortaltest.set_Placeholder(searchItemname);
		customefunction.pressEnter();
		customefunction.captureScreenMethod(driver, XpathRepository.path, tC01_SubmitRequest);
		
//		InstallPrinterItem_FormPage=EmployeePortaltest.ClickOn_ItemLinkList_NavigateToFormPage();
		
	}
	
	public static WebDriver ReturnDriver()
	{
		System.out.println("Static"+driver);
		return driver;

	}
	
	
}
