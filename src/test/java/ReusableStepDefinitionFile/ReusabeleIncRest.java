package ReusableStepDefinitionFile;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;
import com.snow.pages.ACLNetwrkFldrPage_Obj;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.textcontext.TextContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ReusabeleIncRest {

	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static ACLNetwrkFldrPage_Obj ACLNetwrkFldrPage;
	public static TextContext textContext;
	public static String xpath;
	public static Object a;
	public static Object string;
	public static JSONParser parser;
	public static JSONObject json;
	public static List<Object> ls;
	public static List<Object> ls2;
	public static StringTokenizer st;
	public static Iterator it1;
	public static Iterator it2;
	public static int i=0;
	public ReusabeleIncRest(TextContext con)
	{
		textContext=con;
		IncidentPage_MLF=textContext.getPageObjectManagerIETL().getIncidentPage_MLF_Object();
	}
	
	@Given("^set the priority as high$")
	public void set_the_priority_as_high() throws Throwable {
		
		xpath="//*[@id=\"incident.priority\"]";
		//customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		//customefunction.sleep(3000);
		customefunction.SelectValueFromDrp(TestBase.driver, xpath, "1 - Critical");
		customefunction.sleep(2000);
	}
	
	
	@And("^set the key contact$")
	public void set_the_key_contact()
	{
		xpath="//*[@id=\"sys_display.incident.key_contact\"]";
		customefunction.sendKeys(xpath, "Abhijit Sarkar", TestBase.driver);	
		customefunction.pressEnter();
	}
	
	
	@Given("^set the priority as \"([^\"]*)\"$")
	public void set_the_priority_as(String arg1) throws Throwable {
		xpath="//*[@id=\"incident.priority\"]";
		customefunction.SelectValueFromDrp(TestBase.driver, xpath, "2 - High");
		customefunction.sleep(2000);
	}
	@Given("^select the priority as \"([^\"]*)\"$")
	public void select_the_priority_as(String arg1) throws Throwable {
		xpath="//*[@id=\"incident.priority\"]";
		customefunction.SelectValueFromDrp(TestBase.driver, xpath, arg1);
		customefunction.sleep(2000);
	}

	@Given("^select the business CI$")
	public void select_the_business_CI() throws Throwable {
		xpath="//*[@id='sys_display.incident.cmdb_ci']";
		
		customefunction.sendKeys(xpath, "CGEFAIBMGLBP1",  TestBase.driver);
		customefunction.pressEnter();
		customefunction.sleep(3000);
		//.sendKeys("CGEFAIBMGLBP1", xpath,  TestBase.driver);
		
	}

	@Then("^submit the incident$")
	public void submit_the_incident() throws Throwable {
		try
		{
			
			
			System.out.println("IncidentPage_MLF NNN : "+IncidentPage_MLF);
			xpath="//*[@id='sys_display.incident.assignment_group']";
			
			customefunction.sendKeys(xpath, "IBM_Integ-I-MLF-ACCESS",  TestBase.driver);
			//IncidentPage_MLF.AssignmentGroup.click();
			
//		IncidentPage_MLF.set_AssignmentGroup("AVAYA_Integ-ServiceDesk-IPCR");
		customefunction.sleep(3000);
		customefunction.pressEnter();

	//	IncidentPage_MLF.ClickOn_SubmitButton();
		xpath="(//*[@id='sysverb_insert'])[1]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
	}

//	@Then("^again search the incident$")
//	public void again_search_the_incident() throws Throwable {
//		try {
//			
//			
//			TestBase.driver.switchTo().defaultContent();
//	AdminHomePage=textContext.getPageObjectManagerIETL().getAdminHomePageApproveRequestItemtObj();
//		
//System.out.println("AdminHomePage : "+AdminHomePage);
//		AdminHomePage.SearchRequestNumberInAdmin(IncidentNumber);
//		customefunction.SwitchToFrmaeByNameOrID(driver, "gsft_main");
//		customefunction.sleep(6000);  
//	}

	@Then("^scroll to the work note$")
	public void scroll_to_the_work_note() throws Throwable {
		xpath="//*[@id=\"incident.u_updated_description\"]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver);
	}
	@Then("^scroll to the description$")
	public void scroll_to_the_description() throws Throwable {
		xpath="//*[@id=\"incident.description\"]";
		customefunction.cFunScrollToElement(xpath, TestBase.driver);
	}

	@Then("^verify the priority incident tab is being displayed$")
	public void verify_the_priority_incident_tab_is_being_displayed() throws Throwable {
		
		
	}
	@Then("^verify the priority incident tab is not being displayed$")
	public void verify_the_priority_incident_tab_being_displayed() throws Throwable {
		
		
	}

	@Then("^then click on the priority incident tab$")
	public void then_click_on_the_priority_incident_tab() throws Throwable {
		xpath="//*[@id=\"tabs2_section\"]/span[6]/span[1]/span[2]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}

	@Then("^verify the \"([^\"]*)\" is getting displayed$")
	public void verify_the_is_getting_displayed(String arg1) throws Throwable {
		xpath="//*[@id='incident.u_rca_last_updated']";  
		customefunction.cFunScrollToElement(xpath, TestBase.driver);
		customefunction.sleep(3000);
	}
	
	@Then("^click on the \"Customer facing$")
	public void click_on_the_Customer_facing() throws Throwable {
		
		xpath="//*[@id=\"incident.u_customer_facing\"]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}

	@Then("^verify the values \\(None, Yes, No \\)$")
	public void verify_the_values_None_Yes_No() throws Throwable {
		
		customefunction.cfunToRetrieveDataFromDrpDown(TestBase.driver, xpath);  
	}
	@Then("^then select \"([^\"]*)\"$")
	public void then_select(String arg1) throws Throwable {
		
		xpath="//*[@id='incident.u_customer_facing']//option[2]";
		customefunction.cFunSelectValueByIndexXpath(xpath, TestBase.driver);
	}
	
	@Then("^Click on the REST tab$")
	public void click_on_the_REST_tab() throws Throwable {
		xpath="//*[@id=\"tabs2_list\"]/span[5]/span/span[2]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	}

	@Then("^then click on the rest link$")
	public void then_click_on_the_rest_link() throws Throwable {
		xpath="//*[@id='incident.u_rest_transaction.u_integrated_item_table']//tbody//tr[1]//td[3]//a";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
	
		customefunction.sleep(3000);
	}
	@Then("^get the JSON rest request$")
	public void get_The_JSON() throws Throwable {
		xpath="//*[@id=\"u_rest_transaction.u_request\"]";
		customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).click();
		String t=customefunction.waitVisibilityOfElementLocated(xpath, 15, TestBase.driver).getText();	
	System.out.println("JSON request : "+t);
	String q="["+t+"]";
	//JSONObject jsnobject = new JSONObject(q);
	 parser = new JSONParser();
	 json = (JSONObject) parser.parse(t);
	 a=json.get("description");
	 string=ReusableMLFIncBrigdeWithEX.ShortDescription;
		System.out.println("description : "+a);
		System.out.println("ShortDescription : "+string);
		
		
		
	 Assert.assertEquals(a.toString(),string);
	 Reporter.addStepLog("REST Description fields value : "+a);
	 
	 a=json.get("external_tool_details");
	 
	 System.out.println("external_tool_details"+a); 
	 
	  st = new StringTokenizer(a.toString(),"\n");
	  i=0;
	 ls=new LinkedList<Object>();
	  while (st.hasMoreTokens()) { 
	 	 ls.add(st.nextToken().toString());
	   
	      i++;
	      
	 }
	  System.out.println("List : "+ls);  
	  it1=ls.iterator();
	   i = 0;
	  while(it1.hasNext())
	  {
	 	 System.out.println("["+i+"]"+":"+(it1.next()));  
	 	 i++;
	  }
	  System.out.println("Keyy "+ls.get(9));
	  
	  a=ls.get(7);
	  System.out.println("Ob : "+a);
	  st = new StringTokenizer(a.toString(),":");
	  System.out.println("st  : "+st);
	 ls=new LinkedList<Object>();
	 i=0;
	  while (st.hasMoreTokens()) { 
	 	 
	     System.out.println("[["+i+"]"+":"+ls.add(st.nextToken())); 
	      i++;
	      
	 }
	  it1=ls.iterator();
	  i = 0;
	  ls=new LinkedList<Object>();
	  while(it1.hasNext())
	  {
	 	// System.out.println("["+i+"]]"+":"+(it1.next()));
		 
		  ls.add( it1.next());
	 	 i++;
	  }
	
	  Reporter.addStepLog("REST Assignement group  : "+ls.get(0)+ " : "+ls.get(1));
	
	
	
	}




}
