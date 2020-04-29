package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class ACLNetwrkFldrPage_Obj {
	public static WebDriver driver;
	public static WebElement ele;
	

@SuppressWarnings("static-access")
public ACLNetwrkFldrPage_Obj(WebDriver driver2)
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH,using ="//*[text()=' Add to Cart ']")
public WebElement Button_AddToCart;//no
@FindBy(how=How.XPATH,using ="(//*[text()='View Cart'])[1]")
public WebElement Button_ViewCart;//no
@FindBy(how=How.XPATH,using ="(//*[text()='Checkout'])[1]")
public WebElement Button_CheckOut;//no
@FindBy(how=How.XPATH,using ="(//*[contains(@id,'s2id_sp_formfield_')]//a)[1]")
public WebElement ACL_Drp_ACLOrderGuide;//no
@FindBy(how=How.XPATH,using ="//*[@id=\"cart-dropdown\"]/span[2]")
public WebElement link_CartLink;//no




}
