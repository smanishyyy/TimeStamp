package com.snow.pages;

import java.util.LinkedList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubmitNewIncidentObj {
public static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public SubmitNewIncidentObj(WebDriver driver2) {
		this.driver=driver2;
		System.out.println("EMP "+driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH,using = "(//*[contains(@id,'s2id_sp_formfield_')]//a)[7]")
	WebElement ClickOnWorkingRemotely;
	
	@FindBy(how = How.XPATH,using = "//*[contains(@id,'select2-drop')]//div//following::ul//child::li[3]")
	WebElement SelectWorkingRemotely;
	@FindBy(how = How.XPATH,using = "//*[@id=\"sp_formfield_short_description\"]")
	WebElement ShortDescription;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"sp_formfield_shift_hours\"]")
	WebElement ShiftHour;
	@FindBy(how = How.XPATH,using = "//*[text()='Submit']")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH,using = "(//*[@class=\"timeline-badge\"]//following-sibling::div)[4]//div[2]//p")
	WebElement IncidentNumber;
public void SelectValue_WorkingRemotely() {
		
	ClickOnWorkingRemotely.click();
	SelectWorkingRemotely.click();
	}
public void Set_ShortDescription() {
	
	ShortDescription.sendKeys("Avaya incident");
	}
public void Set_ShiftHour() {
	
	ShiftHour.sendKeys("7-4");
	}
public void Click_SubmitButton() {
	
	SubmitButton.click();
	}
public String Get_IncidentNumber() {
	
	System.out.println("Sp inc : "+IncidentNumber.getText());
	String [] arr=IncidentNumber.getText().split(" ");
	LinkedList<String> ls=new LinkedList<String>();
	int Len=arr.length;
	System.out.println("Length : "+Len);
	
	for(int i=0; i<Len;i++)
	{
	System.out.println(i+" : "+arr[i]);	
	ls.add(arr[i]);
	}
	System.out.println("List :"+ls.get(0));
	return ls.get(0);
	}




	
}


