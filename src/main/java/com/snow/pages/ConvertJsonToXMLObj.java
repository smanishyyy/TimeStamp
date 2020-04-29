package com.snow.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConvertJsonToXMLObj {
	public static WebDriver driver;
	public ConvertJsonToXMLObj(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using ="//*[@id='txt1']")
	WebElement JSONData_EditBox;
	
	public void CopyToJSON_Data() {
		
		JSONData_EditBox.click();
		JSONData_EditBox.clear();
		JSONData_EditBox.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}
	@FindBy(how=How.XPATH,using ="//*[@id='btnRun']")
	WebElement ConvertToJSONToXML_Button;
	public void ClcikOn_ConvertToJSONToXML() {
		ConvertToJSONToXML_Button.click();
		
	}
	@FindBy(how=How.XPATH,using ="//*[@id='txta']")
	WebElement getXMLData_EditBox;
	
	public void getXMLData() {
		
		getXMLData_EditBox.click();
		System.out.println("XML :"+getXMLData_EditBox.getText());
		
	}

}
