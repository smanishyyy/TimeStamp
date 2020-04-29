package com.snow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.servicenow.XpathRepository.XpathRepository;
import com.snow.customfunction.customefunction;





public class RPSSDTechnicalSupportModeObj {
	WebDriver driver;
	WebDriverWait wait; 
	
	
	public RPSSDTechnicalSupportModeObj(WebDriver driver2) {
		//super();
		this.driver=driver2;
		System.out.println("driver1"+driver);
		System.out.println("Formpage "+driver);
		PageFactory.initElements(driver, this);
		  wait = new WebDriverWait(driver,30);
	}

	
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]")
	 WebElement Domain;
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[4]")
	 WebElement Typeofrequest;
	@FindBy(how = How.XPATH,using = "//*[@class='guide-nav']//button[@id='submit']")
	 WebElement NextButton;
	@FindBy(how = How.XPATH,using = "//*[@class='guide-nav guide-nav-setp1']//button[@id='submit']")
	 WebElement NextButton2;
	@FindBy(how = How.XPATH,using = "(//*[@class='accordion-header b ng-scope ng-isolate-scope']/div[1]/div/div/span/div/div[3]/span[3])[1]")
	 WebElement Ec500ContextLink;
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]")
	 WebElement PhoneExtension;
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[2]")
	 WebElement Select;
	@FindBy(how = How.XPATH,using = "//*[@id='sp_formfield_Extension']")
	 WebElement Extension;
	@FindBy(how = How.XPATH,using = "(//*[contains(text(),'Works on Windows 10 and Windows 7.')])[1]")
	 WebElement Techsmith;
	@FindBy(how = How.XPATH,using = "//*[@id='s2id_sp_formfield_cost_app']/a/span[2]")
	 WebElement CostCenterApprover;
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[44]")
	 WebElement ChoosePrimaryLocation;
	@FindBy(how = How.XPATH,using = "(//*[contains(text(),'Request to add, modify or remove access for the ServiceNow tool')])[1]")
	 WebElement RequestToAddModifyContextLink;
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[57]")
	 WebElement ReqToSelect;
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[58]")
	 WebElement ReqToGroupName;
	@FindBy(how = How.XPATH,using = "//*[@id='sp_formfield_Acknowledgement']")
	 WebElement ReqToCheckBox;
	@FindBy(how = How.XPATH,using = "//*[@id='sp_formfield_user_text']")
	 WebElement TechsmithCheckBox;
	@FindBy(how = How.XPATH,using = "//button[text()='Add to Cart']")
	 WebElement AddToCartButton;
	@FindBy(how = How.XPATH,using = "//button[text()='View Cart']")
	 WebElement ViewCartButton;
	@FindBy(how = How.XPATH,using = "//button//span[text()='Checkout']")
	 WebElement CheckOutButton;
	@FindBy(how = How.XPATH,using = "//div[@class='offer-content']//h3")
	 WebElement RequestNumber;
	
	
	
	
	
	
	
	
	
	

	public void getTitleFormPage() {
	
		
	}


	public String getTitleXpath() {
		
String xpath="(//*[contains(text(),'Employee Portal - Test')])";
		return xpath;
		
		
	}
	public String getStartDateXpath() {
		
		String xpath="//*[@id='sp_formfield_buba_start_date']";
				return xpath;
				
				
			}


	public void ClickOn_DomainDrp() {
		Domain.click();
	}
	public void selectValue_From_DomainDrp(int i)
	{
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();
		
	}


	public void ClickOn_TypeOfRequestDrp() {
		Typeofrequest.click();	
		
	}


	public void selectValue_From_TypeOfRequestDrp(int i) {
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();	
		
	}


	public void ClickOn_NextButton() {
		NextButton.click();
		
	}


	public void ClickOn_EC500ContextLink() {
		Ec500ContextLink.click();
		
	}


	public void ClickOn_PhoneExtension() {
		
		PhoneExtension.click();
	}


	public void selectValue_From_PhoneExtensionDrp(int i) {
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();		
		
	}


	public void ClickOn_Select() {
		
		Select.click();	
	}


	public void selectValue_From_SelectDrp(int i) {
		
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();	
	}


	public void SetValueIn_Extension(String extensionVal) {
		Extension.click();
		Extension.sendKeys(extensionVal);
		
	}


	public void ClickOn_TechsmithContextLink() {
		
		Techsmith.click();
	}


	public void ClickOn_CostCentreApprover() {
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", CostCenterApprover);
		CostCenterApprover.click();
	}


	public void selectValue_From_CostCentreApprover(int i) {
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();	
		
	}


	public void ClickOn_ChoosePrimaryLocation() {
		
		ChoosePrimaryLocation.click();
	}


	public void selectValue_From_ChoosePrimaryLocation(int i) {
		
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();	
	}


	public void ClickOn_RequestToAddModifyContextLink() {
		
		RequestToAddModifyContextLink.click();
	}


	public void ClickOn_ReqTo_select() {
		ReqToSelect.click();
		
	}
public void selectValue_From_ReqTo_select(int i) {
		
		String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
		String data=xpath+"["+i+"]";
		System.out.println(data);
		driver.findElement(By.xpath(xpath+"["+i+"]")).click();	
	}


public void ClickOn_GroupName() {
	ReqToGroupName.click();	
}


public void selectValue_From_GroupName(int i) {
	String xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li";
	String data=xpath+"["+i+"]";
	System.out.println(data);
	driver.findElement(By.xpath(xpath+"["+i+"]")).click();	
	
}


public void CheckToCheckBox() {
	ReqToCheckBox.click();
	
}
public void CheckToCheckBox_TechsmithCheckBox() {
	TechsmithCheckBox.click();
	
}


public void ClickOn_AddToCartButton() {
	AddToCartButton.click();
}
public void ClickOn_ViewCartButton() {
	ViewCartButton.click();
}


public void ClickOn_CheckOutButton() {
	CheckOutButton.click();
	
}


public String getRequestNumber() {
	
	return RequestNumber.getText();
	
	
}


public void scrolldown_ToRequestNumber(WebDriver driver2) {
	
	customefunction.cFunScrollToElement("//div[@class='offer-content']//h3", driver2);
}

@FindBy(how=How.XPATH,using=XpathRepository.ItemLink)
WebElement ItemLink;
public void ClickOn_ItemLink_RPSSDTechnicalSupportModeObj() {
	
	ItemLink.click();
	customefunction.sleep(4000);
}


public void ClickOn_NextButton2() {
	System.out.println("Next : "+driver);
	
	//wait.until(ExpectedConditions.elementToBeClickable(NextButton2));
	NextButton2.click();
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", NextButton2);
}





	
}
