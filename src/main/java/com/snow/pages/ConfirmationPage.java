package com.snow.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
		public static WebDriver driver;

			public ConfirmationPage(WebDriver driver2) {
				this.driver=driver2;
				PageFactory.initElements(driver, this);	
			}
			
			@FindBy(how=How.XPATH,using ="//select[@id='proc_po.total_cost.currency']")
			private List<WebElement> prd_List;	
			
			public List<String> getTotaCostCurrency() {
				List<String> Currency = new ArrayList<>();
				for(WebElement element : prd_List) {
					Currency.add(element.getText());
					System.out.println("Currency :"+Currency);
				}
				return Currency;
			}
	}

