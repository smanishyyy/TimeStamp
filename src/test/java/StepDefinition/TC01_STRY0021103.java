package StepDefinition;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.service.pageobjectmanager.PageObjectManager;
import com.service.pageobjectmanager.PageObjectManagerIETL;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.finalVariable.FinalVar;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.textcontext.TextContext;
import com.snow.util.DataHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_STRY0021103 {
	public static TextContext textContext;
	
	public static String xpath;
	
	public static PageObjectManager PageObjectManager;

	public static PageObjectManagerIETL PageObjectManagerIETL;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static String SIRNum;
	List<HashMap<String, String>> dataSet;
	
	public TC01_STRY0021103(TextContext con)
	{

		textContext=	con;
		

		
	}
	

	@Then("^Fill all the mandatory fields$")
	public void fill_all_the_mandatory_fields() throws Throwable {
		xpath="(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		xpath="(//*[contains(@id,'select2-drop')]//div//following::ul//child::li//..)[1]//preceding-sibling::div//input";
		customefunction.sendKeys(xpath, "Portia Deb", TestBase.driver);
		customefunction.sleep(4000);
		xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li[1]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		xpath="//*[@id=\"sp_formfield_name_des\"]";
		customefunction.sendKeys(xpath, "1099 Pro, Inc.", TestBase.driver);
		xpath="//*[@id=\"sp_formfield_u_vendor\"]";
		customefunction.sendKeys(xpath, "Manulife", TestBase.driver);
		
		xpath="//*[@id=\"sp_formfield_es_cost\"]";
		customefunction.sendKeys(xpath, "1234", TestBase.driver);
		xpath="//*[@id=\"sp_formfield_deskside_team\"]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		xpath="(//*[contains(@id,'s2id_sp_formfield_')]//a)[3]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		xpath="(//*[contains(@id,'select2-drop')]//div//following::ul//child::li//..)[1]//preceding-sibling::div//input";
		customefunction.sendKeys(xpath, "7815", TestBase.driver);
		customefunction.sleep(3000);
		xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li[1]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		xpath="(//*[contains(@id,'s2id_sp_formfield_')]//a)[4]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		customefunction.sleep(3000);
		xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li[1]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		
	}
	@Then("^scroll donwn to ship to stockroom$")
	public void scroll_donwn_to_ship_to_stockroom() throws Throwable {
	    xpath="((//*[contains(text(),'Cost Center')])//ancestor::span//ancestor::div)[178]";
	    customefunction.cFunScrollToElement(xpath, TestBase.driver2);
	}




}
