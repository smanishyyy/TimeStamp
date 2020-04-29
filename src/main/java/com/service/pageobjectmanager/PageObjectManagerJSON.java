package com.service.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.snow.pages.ConvertJsonToXMLObj;


public class PageObjectManagerJSON {
	public static WebDriver driver;
	public static ConvertJsonToXMLObj ConvertJsonToXML;
	 public PageObjectManagerJSON(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 public static ConvertJsonToXMLObj getConvertJsonToXMLObj(){
			 ConvertJsonToXML=null;
			 return (ConvertJsonToXML == null) ? ConvertJsonToXML = new ConvertJsonToXMLObj(driver) : ConvertJsonToXML;
			 
			 }
}
