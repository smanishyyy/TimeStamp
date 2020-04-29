package ReusableStepDefinitionFile;

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

public class ReusableSIR {
	public static TextContext textContext;
	
	public static String xpath;
	
	public static PageObjectManager PageObjectManager;

	public static PageObjectManagerIETL PageObjectManagerIETL;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static String SIRNum;
	List<HashMap<String, String>> dataSet;
	
	public ReusableSIR(TextContext con)
	{

		textContext=	con;
		

		
	}
	
	
	@Then("^Click on the bA/BU lock button$")
	public void click_on_the_bA_BU_lock_button() throws Throwable {
		try
		{
			xpath="//*[@id=\"u_security_admin_database.u_ba_bu_models_unlock\"]/span[1]";
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
			customefunction.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	  
	}

	@Given("^type \"([^\"]*)\" in filter navigator$")
	public void type_in_filter_navigator(String arg1) throws Throwable {
		try {
			IncidentPage_MLF=PageObjectManagerIETL.getIncidentPage_MLF_Object();
			IncidentPage_MLF.ClickIn_FilterBox();
			

			IncidentPage_MLF.set_FilterBox(arg1);
			customefunction.pressEnter();

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Given("^Cliks on the \"([^\"]*)\" option$")
	public void cliks_on_the_option(String arg1) throws Throwable {
		try
		{
			xpath="//*[contains(text(),'Visible to Me')]";
			customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
			customefunction.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		} 
	}

	@Given("^Clicks on the New button$")
	public void clicks_on_the_New_button() throws Throwable {
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main");
	  xpath="//*[@id=\"sysverb_new\"]";
	  customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		customefunction.sleep(4000);
	}

	@Given("^Fill the requested by as \"([^\"]*)\"$")
	public void fill_the_requested_by_as(String arg1) throws Throwable {
	 xpath="//*[@id=\"sys_display.sn_si_incident.caller\"]";
	 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	 customefunction.sendKeys(xpath, arg1, TestBase.driver);
	 customefunction.pressEnter();
	 xpath="//*[@id=\"sn_si_incident.short_description\"]";
	 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}

	@Given("^Fille the short description as \"([^\"]*)\"$")
	public void fille_the_short_description_as(String arg1) throws Throwable {
		customefunction.sendKeys(xpath, arg1, TestBase.driver); 
	}

	@Given("^Scroll to the submit button$")
	public void scroll_to_the_submit_button() throws Throwable {
		 xpath="(//*[@id=\"sysverb_insert\"])[2]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver);  
	}

	@When("^clicks on the submit button$")
	public void clicks_on_the_submit_button() throws Throwable {
		
		xpath="//*[@id=\"sys_readonly.sn_si_incident.number\"]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver); 
		xpath="//*[@id=\"sys_readonly.sn_si_incident.number\"]";
		SIRNum=TestBase.driver.findElement(By.xpath(xpath)).getAttribute("value");
		xpath="(//*[@id=\"sysverb_insert\"])[1]"; 
		 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		 customefunction.sleep(3000);
	}
	@Given("^Store SIR number in sheet in row \"([^\"]*)\"$")
	public void store_SIR_number_in_sheet_in_row(String arg1) throws Throwable {
		
		System.out.println("dataRow : "+arg1+SIRNum);
		DataHelper.setCellData(SIRNum, Integer.parseInt(arg1), 2,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"Data");
		DataHelper.setCellData(this.getClass().getName().substring(15), Integer.parseInt(arg1), 1,System.getProperty("user.dir")+FinalVar.ExcelPathWrite,"Data");
	System.out.println("System.getProperty(\"user.dir\")+FinalVar.ExcelPathWrite : "+System.getProperty("user.dir")+FinalVar.ExcelPathWrite);
	}

	@Then("^SIR should be submitted sucessfully$")
	public void sir_should_be_submitted_sucessfully() throws Throwable {
		
	}
	@Given("^check the unauthorize check box$")
	public void check_the_unauthorize_check_box() throws Throwable {
		xpath="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver);  
		xpath="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
		 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		 xpath="//*[@id=\"label.ni.sn_si_incident.u_unauthorized\"]";
		 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}



	@Then("^search created SIR$")
	public void search_created_SIR() throws Throwable {
		TestBase.driver.switchTo().defaultContent();
		customefunction.cusFunSerrachINCorREQ(TestBase.driver, SIRNum);
		 customefunction.sleep(3000);
	}

	@When("^scroll to the update button$")
	public void scroll_to_the_update_button() throws Throwable {
		customefunction.SwitchToFrmaeByNameOrID(TestBase.driver, "gsft_main"); 
		 xpath="(//*[@id=\"sysverb_update\"])[2]";
			customefunction.cFunScrollToElement(xpath, TestBase.driver);  
	}

	@Then("^Verify whether field \"([^\"]*)\" in the \"([^\"]*)\" tab underneath \"([^\"]*)\"$")
	public void verify_whether_field_in_the_tab_underneath(String arg1, String arg2, String arg3) throws Throwable {
		xpath="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver);  
		xpath="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
		 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}
	@Then("^Verify field  Checkbox, \"([^\"]*)\" in the \"([^\"]*)\" tab underneath \"([^\"]*)\"$")
	public void verify_field_Checkbox_in_the_tab_underneath(String arg1, String arg2, String arg3) throws Throwable {
		xpath="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver);  
		xpath="//*[@id=\"tabs2_section\"]/span[2]/span[1]/span[2]";
		 customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}






}
