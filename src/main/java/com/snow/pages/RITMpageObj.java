package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RITMpageObj {
	public static WebDriver driver;
	public static WebElement ele;
	

@SuppressWarnings("static-access")
public RITMpageObj(WebDriver driver2)
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH,using ="//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[7]")
public WebElement FirstRow_ShortDescription;
@FindBy(how=How.XPATH,using ="//*[@id='sc_req_item.sc_task.request_item_table']//tbody//tr[1]//td[4]")
public WebElement FirstRow_AssignementGroup;
}
