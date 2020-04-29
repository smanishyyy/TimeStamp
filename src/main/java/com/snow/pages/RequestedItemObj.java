package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.service.pageobjectmanager.PageObjectManager;
import com.servicenow.XpathRepository.XpathRepository;

public class RequestedItemObj {
	public static WebElement element;
	public static WebDriver driver;
		public RequestedItemObj(WebDriver driver2) {
			System.out.println("POM driver2"+driver2);
			RequestedItemObj.driver=driver2;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.XPATH,using=XpathRepository.MoreInformation)
		WebElement MoreInformation;
		public void Set_MoreInformation(String text)
		{
			System.out.println("Set_MoreInformation");
			System.out.println("Set_MoreInformation driver"+driver);
			MoreInformation.click();
			MoreInformation.sendKeys(text);
		}
		
}
