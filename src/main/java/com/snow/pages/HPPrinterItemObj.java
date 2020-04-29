package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.snow.base.TestBase;
import com.snow.customfunction.customefunction;



public class HPPrinterItemObj {
	public static WebElement element;
	public static WebDriver driver;
	public static String xpath;
	public HPPrinterItemObj(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.XPATH,using ="(//*[contains(@id,'s2id_sp_formfield_')]//a)[3]")
	WebElement SelectDomain;
	@FindBy(how=How.XPATH,using ="(//*[contains(@id,'s2id_sp_formfield_')]//a)[2]")
	WebElement ReqType;
	
	public void selectVal_fromDomainVar(int i,WebDriver driver)
	{
		SelectDomain.click();	
		customefunction.cFunSelectValueByIndexXpath("//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]", driver);
	}
	
	public void selectVal_ReqType(int i,WebDriver driver)
	{
		ReqType.click();	
		customefunction.cFunSelectValueByIndexXpath("//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]", driver);
	}
	@FindBy(how=How.XPATH,using ="//*[@id='sc_cat_item']/div[1]/div[2]/div/div[2]/div[2]/button")
	WebElement AddCartButton;
	public void ClickOn_AddCartButton() {
		
		AddCartButton.click();	
	}
	@FindBy(how=How.XPATH,using ="//*[contains(text(),'Proceed to Check')]")
	WebElement ProceedToCheckOut;
	
	public void ClickOn_ProceedToCheckOut() {
		
		ProceedToCheckOut.click();
	}
	@FindBy(how=How.XPATH,using ="//*[@id='cart-dropdown']/span[2]")
	WebElement CartLink;
	
	public void ClickOn_CartLink() {
		
		CartLink.click();
	}
	@FindBy(how = How.XPATH,using = "//button//span[text()='Checkout']")
	 WebElement CheckOutButton;
public void ClickOn_CheckOutButto() {
		
	CheckOutButton.click();
	}
@FindBy(how = How.XPATH,using = "//*[@id='sp_formfield_comments']")
WebElement IfYouHaveAnyAdd;
public void set_IfYouHaveAnyAdd_EditBox(String text) {
	IfYouHaveAnyAdd.click();
	IfYouHaveAnyAdd.sendKeys(text);
	System.out.println("If you have : "+text);
	
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[7]")
WebElement ChoosePrimaryLoc;

//*[contains(@id,'select2-drop')]//div//following::ul//child::li[2]
public void Select_ChoosePrimaryLoc_Drp(int i,WebDriver driver) {
	
	ChoosePrimaryLoc.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver);
}

@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[22]")
WebElement Select_WillTheuserBe;

public void Select_WillTheuserBe(int i, WebDriver driver) {
	
	Select_WillTheuserBe.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver);
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[6]")
WebElement AddAVirtualComp;
public void Select_AddAVirtualComp(int i, WebDriver driver) {

	AddAVirtualComp.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver);	
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[19]")
WebElement DoesTheRecipient;
public void Select_DoesTheRecipient(int i, WebDriver driver2) {
	
	DoesTheRecipient.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver2);	
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[21]")
WebElement WhatTheRecipeient;
public void Select_WhatTheRecipeient(int i, WebDriver driver2) {
	
	WhatTheRecipeient.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver2);

}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[23]")
WebElement IsThisComputer;
public void Select_IsThisComputer(int i, WebDriver driver2) {
	
	IsThisComputer.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver2);	
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[6]")
WebElement WhatIsTheDomain;
public void Select_WhatIsTheDomain(int i, WebDriver driver2) {
	WhatIsTheDomain.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver2);
	
}
@FindBy(how = How.XPATH,using = "//*[@id=\"sp_formfield_virtual_computer_name\"]")
WebElement ComputerName;

public void Set_ComputerName(String string) {
	ComputerName.click();
	ComputerName.sendKeys(string);
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]")
WebElement Select_ApproverResourec;
public void Select_ApproverResourec(int i, WebDriver driver2) {

	Select_ApproverResourec.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver2);
}
@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[2]")
WebElement Select_ResourceName;
public void select_resourcename(int i, WebDriver driver2) {
	
	Select_ResourceName.click();
	xpath="//*[contains(@id,'select2-drop')]//div//following::ul//child::li["+i+"]";
	customefunction.cFunSelectValueByIndexXpath(xpath, driver2);
	customefunction.sleep(4000);
	customefunction.pressEnter();
}




}
