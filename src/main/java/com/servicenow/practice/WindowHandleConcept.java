package com.servicenow.practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.snow.customfunction.customefunction;
import com.snow.util.TestUtil;

public class WindowHandleConcept {
	public static void main(String[] args) throws InterruptedException
	{
	 
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	System.out.println("Initial3.1 : "+driver);
	driver.manage().window().maximize();
	System.out.println("Initial4 : "+driver);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	String parentWindowHandle = driver.getWindowHandle();
	System.out.println("Parent window's handle -> " + parentWindowHandle);
	customefunction.cFunScrollToElement("//*[@id=\"button1\"]", driver);
	WebElement clickElement = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	 
	for(int i = 0; i < 3; i++)
	{
		System.out.println("Window");
		customefunction.clickByJs(clickElement, driver);
	
	Thread.sleep(3000);
	}
	 
	Set<String> allWindowHandles = driver.getWindowHandles();
	String lastWindowHandle = "";
	for(String handle : allWindowHandles)
	{
	System.out.println("Switching to window - > " + handle);
	System.out.println("Navigating to google.com");
	driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
	
	driver.manage().window().maximize();
	System.out.println("Initial4 : "+driver);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	driver.get("http://google.com");
	lastWindowHandle = handle;
	}
	 
	//Switch to the parent window
	driver.switchTo().window(parentWindowHandle);
	//close the parent window
	driver.get("http://facebook.com");
	driver.close();
	//at this point there is no focused window, we have to explicitly switch back to some window.
	driver.switchTo().window(lastWindowHandle);
	driver.get("http://toolsqa.com");
	}
}
