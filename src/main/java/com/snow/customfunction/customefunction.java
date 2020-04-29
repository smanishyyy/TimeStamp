package com.snow.customfunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import com.google.common.base.Function;
import com.service.pageobjectmanager.PageObjectManager;
import com.service.pageobjectmanager.PageObjectManagerIETL;
import com.snow.pages.AdminHomePageApproveRequestItemtObj;
import com.snow.pages.CatalogtaskPageObj;
import com.snow.pages.EmployeePortaltestObj;
import com.snow.pages.HPPrinterItemObj;
import com.snow.pages.HomepageObj;
import com.snow.pages.IncidentPage_MLF_Object;
import com.snow.pages.RPSSDTechnicalSupportModeObj;
import com.snow.pages.RequestServiceObj;
import com.snow.pages.RequestedItemObj;

import ReusableStepDefinitionFile.ReusableMLFIncBrigdeWithEX;



public class customefunction {
	public static HomepageObj hompage;
	public static RequestServiceObj RequestService;
	public static String val2,xpath1,xapth2,xpath3;
	public static WebDriver driver2;
	public static WebDriver driverPa;
	public static EmployeePortaltestObj EmployeePortaltest;
	public static int whichIndexYouWantToSelect;
	public static String RequestNumber;
	public static AdminHomePageApproveRequestItemtObj AdminHomePage;
	public static CatalogtaskPageObj CatalogtaskPage;
	public static PageObjectManager PageObjectManager;
	public static PageObjectManagerIETL PageObjectManagerIETL;
	public static RequestedItemObj RequestedItem;
	public static RPSSDTechnicalSupportModeObj RPSSDTechnicalSupportMode;
	public static String PartailText;
	public static String FullText;
	public static String stringVal;
	public static HPPrinterItemObj HPPrinterItem;
	public static File fl;
	public static IncidentPage_MLF_Object IncidentPage_MLF;
	public static WebDriver driver;
	public static WebElement ele;
	public  WebElement ele2;

	public static void pressEnter()
	{
		try {
			Robot robot=new Robot();
		
			robot.keyPress(KeyEvent.VK_ENTER);
			
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		
		} catch (AWTException e) {
		
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void copyText()
	{
		try {
			Robot robot=new Robot();
		
			
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_A);
			
			
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			Thread.sleep(3000);
		
		} catch (AWTException e) {
		
			e.printStackTrace();	
	}
catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static void sleep(int timeInMilliSecond)
	{
		try {
			Thread.sleep(timeInMilliSecond);
		} catch (InterruptedException e) {
		
		}
}
	
	public static  String cfunToRetrieveIBMNum(WebDriver dr,String xpath,String VendorNUm) {
		driver=dr;
		driver.findElement(By.xpath(xpath)).click();
		
		
	
	System.out.println(VendorNUm);
	StringTokenizer st=new StringTokenizer(VendorNUm,"/=");
	
	LinkedList<String> ls=new LinkedList<String> ();
	
	while(st.hasMoreElements())
	{
		ls.add(st.nextToken());
	}
	
	for(int i=0;i<ls.size();i++)
	{
		System.out.println("List"+"["+i+"]"+" : "+ls.get(i));
	}
	return ls.get(1);
	}
	
	public static void cFunScrollToElement(String Xpath,WebDriver driver2) {

		
		WebElement ele;
		System.out.println("Scroll down");
		try {
			ele = driver2.findElement(By.xpath(Xpath));
			JavascriptExecutor ex = (JavascriptExecutor)driver2;
			ex.executeScript("arguments[0].scrollIntoView(true);", ele);
			System.out.println("Scroll down : "+ele);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.getMessage();
	
		}

	}
public static void cFunScrollToElementt(WebElement ele,WebDriver driver) {

		
		
		
		System.out.println("Driver  : "+driver);
		try {
			
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			ex.executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(3000);
			System.out.println("Scroll down : "+ele);

		} catch (Exception e) {
			e.getMessage();
	
		}

	}
	
	public static void SwitchToFrmaeByNameOrID(WebDriver driver2,String name)
	{
		driver2.switchTo().frame(name);
		System.out.println("Frame swictched succesfully");
	}
	
	public static void SelectValueFromDrp(WebDriver driver2,String xpath,String Value)
	{
		Select sel=new Select(driver2.findElement(By.xpath(xpath)));
		System.out.println("Frame swictched succesfully");
		
		try {
			sel.selectByVisibleText(Value);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	public static void SelectValFromDrp(WebDriver driver2,WebElement  ele,String Value)
	{
		Select sel=new Select(ele);
		System.out.println("Frame swictched succesfully");
		
		try {
			sel.selectByVisibleText(Value);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	public static void captureScreenMethod(WebDriver driver2, String DirPath, String TestcaseNumber) {
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy_mm_dd_hh_mm_ss");
		String timeStamp=dateFormat.format(new Date());
		TakesScreenshot tk=((TakesScreenshot)driver2);
	File src=	tk.getScreenshotAs(OutputType.FILE);
	File dst=new File(DirPath+TestcaseNumber+ "\\screenshots" + timeStamp + ".png");
	try {
		FileUtils.copyFile(src, dst);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
	
	
	public static void switchWindow(WebDriver driverPa)
	{
		
		
		Set handles = driverPa.getWindowHandles();
		System.out.println("driverPa : "+ driverPa);
       // System.out.println("driver3 : "+ driver3);
		for (String handles1 : driverPa.getWindowHandles()) {
          System.out.println(handles1);
	 
          driverPa.switchTo().window(handles1);
	         
	         System.out.println("Driver swicthed successfully");
	         
		}
//		@SuppressWarnings("rawtypes")
//		String parent=driver2.getWindowHandle();
//		  System.out.println(parent);
//		Set handles = driver2.getWindowHandles();
//		  System.out.println(handles);
//		for (String handles1 : driver2.getWindowHandles()) {
//			 
//	          System.out.println(handles1);
	 
	         // driver.switchTo().window(handles1);
	 
	          
	}
	public static String cFunToVrfyStaticTextGeneric(WebDriver driver2,String partialtext, String fulltext) {
		boolean flag=false;
		String data = partialtext.trim();
		String data2 = fulltext.trim();
		String gg = null;
		System.out.println("Xpath text : " + data);
		System.out.println("Full text : " + data2);
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			LinkedList<String> ls = new LinkedList<>();
			LinkedList<String> ls2 = new LinkedList<>();

			 gg = driver2.findElement(By.xpath("//*[contains(text(),'" + data + "')]")).getText().trim();
			System.out.println(gg);

			String hh = data2;

			String[] str = hh.split("\\s*");
			String[] str2 = gg.split("\\s*");

			for (int i = 0; i < str2.length; i++) {

				ls.add(str2[i]);

			}
			System.out.println("Ls : " + ls);
			Object arr[] = ls.toArray();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i].toString();
				System.out.println("[AppUI " + i + "]" + arr[i]);
			}

			for (int i = 0; i < str.length; i++) {

				ls2.add(str[i]);

			}
			System.out.println("tt" + ls);
			System.out.println("tttt" + ls2);
			System.out.println("Ls2 : " + ls);
			Object arr2[] = ls2.toArray();
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr2[i].toString();
				System.out.println("[Condition " + i + "]" + arr[i]);
			}
			System.out.println("ls" + ls);
			System.out.println("ls2" + ls2);
			Thread.sleep(2000);
			if (ls2.equals(ls)) {
				System.out.println("Text is veryfied :"+gg);
				flag=true;
			} else  {

				System.out.println(
						"You are passing incorrect text from condition column so please enter this text :" + gg);
				flag=false;
			}
//			} else {
//				System.out.println("Text is not present anywhere in application");
//				Report.updateTestLog("Text is not present anywhere in application", " Not Done " + data, Status.FAIL);
//			}
//			Thread.sleep(10000);
//
////			addGlobalVar("%strSelectedValue%", gg);
//			userData.putData("Login&User", "Data1", gg);
			// Report.updateTestLog("Text is verified", " Done "+data, Status.PASS);
		} catch (Exception e) {

		e.printStackTrace();
		}
		return gg;

	}
	public static void cfunToEnterDateAfterBeforeCurrent(int numberOfDays,String Xpath,WebDriver driver)
	{
		try
		{
		 SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd");
		 
		    Calendar c=Calendar.getInstance();
		    c.add(Calendar.DATE, numberOfDays);

		    String  date=dateFormat.format(c.getTime());
		    System.out.println("Changed date"+c.getTime());
		    System.out.println(date);	
		    WebElement ele = driver.findElement(By.xpath(Xpath));
			ele.click();
			
			ele.sendKeys(date);
		}
		catch(Exception e)
		{
			
		}
	}
	public static void cfunToEnterDate(int numberOfDays,WebElement el,WebDriver driver,int numberOfYears,int numberOfMonth)
	{
		try
		{
			ele=el;
		 SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		 
		    Calendar c=Calendar.getInstance();
		    c.add(Calendar.DATE, numberOfDays);
		    c.add(Calendar.MONTH, numberOfMonth);
		    c.add(Calendar.MONTH, numberOfYears);
System.out.println("Date: "+c);
		    String  date=dateFormat.format(c.getTime());
		    System.out.println("Changed date"+c.getTime());
		    System.out.println(date);	
		   
			ele.click();
			//ele.sendKeys(date);
ele.sendKeys(date+" "+"IST");
ReusableMLFIncBrigdeWithEX.logger.log(Status.PASS, "Choose plan date as  "+date);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static  WebElement FluentWait(final String xapth, int waitTime, WebDriver driver3) {
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);

		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver dr) {
				WebElement ele = dr.findElement(By.xpath(xapth));
				String val = ele.getAttribute("value");
				System.out.println("IBM fluent : "+val);
				if (val.contains("IBMR=CH")) {
					
					return ele;
				} else {
					System.out.println("Reloading the page");		
					Actions action = new Actions(dr);
					ele=dr.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
					action.contextClick(ele).build().perform();
					dr.findElement(By.xpath("//*[@id='context_1']/div[20]")).click();
					System.out.println("IBM state before else block : "+val);
					return null;
				}
			}

		};
		return wt.until(fn);

	}
	public static  WebElement FluentWaitVerifyWorkNote(final String xapth, int waitTime, WebDriver driver3) {
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);

		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver dr) {
		WebElement ele = dr.findElement(By.xpath("//*[text()='"+xapth+"']"));
			//	WebElement ele = dr.findElement(By.xpath("//div[@class='sn-widget sn-widget-textblock state-expanded']//span)[1]"));
				
				String val = ele.getText();
				System.out.println("IBM work note : "+val);
				if (ele.isDisplayed()) {
					System.out.println("Element present with text : " + val);
					return ele;
				} else {
					System.out.println("Element is not present with text : " + val);
					return null;
				}
			}

		};
		return wt.until(fn);

	}
	public static  WebElement FluentWaitVerifyWorkNoteAtMLFChange(final String xapth, int waitTime, WebDriver driver3) {
		System.out.println("Polling start");
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);
		System.out.println("Polling elemet 22");
		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@SuppressWarnings("unused")
			@Override
			public WebElement apply(WebDriver dr) {
				System.out.println("Polling elemet");
		WebElement ele = dr.findElement(By.xpath("//span[contains(@class,'sn-widget-textblock-body sn-widget-textblock-body_formatted ng-binding')]"));
			//	WebElement ele = dr.findElement(By.xpath("//div[@class='sn-widget sn-widget-textblock state-expanded']//span)[1]"));
				
				String val = ele.getText();
				System.out.println("MLF work note from IBM : "+val);
if (val.contains(xapth)) {
	System.out.println("Work note from IBM is  : "+val);		
					return ele;
				} else {
					System.out.println("WORK NOTE FROM IBM IS : " + val);
					return null;
				}
				
			}

		};
		return wt.until(fn);

	}
	@SuppressWarnings("deprecation")
	public static  WebElement FluentWaitIBMState(  WebElement ele2, int waitTime,   WebDriver driver3,  String xapth) {
		System.out.println("Polling start");
		
		 val2=xapth;
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);
		System.out.println("Polling elemet 22");
		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@SuppressWarnings("unused")
			@Override
			public WebElement apply(WebDriver dr) {
				System.out.println("Polling elemet"+ele);
				ele=dr.findElement(By.xpath("//*[@id='sys_readonly.change_request.state']"));
				Select select = new Select(ele);
				WebElement option = select.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println("First Valeu "+defaultItem );
				System.out.println("IBM state before if block : "+defaultItem);
				
				 
if (defaultItem.contains(val2)) {
	System.out.println("IBM state in 'if block'  : "+defaultItem);	
	Reporter.addStepLog("IBM state is: "+defaultItem);
	
					return ele;
				} else {
					System.out.println("Reloading the page");		
					Actions action = new Actions(dr);
					ele=dr.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
					action.contextClick(ele).build().perform();
					dr.findElement(By.xpath("//*[@id='context_1']/div[17]")).click();
					System.out.println("IBM state before else block : "+defaultItem);
					return null;
				}
				
				
				
				
			}

		};
		return wt.until(fn);

	}
	
	@SuppressWarnings("deprecation")
	public static  WebElement FluentWaitIBMApprovalState(  WebElement ele2, int waitTime,   WebDriver driver3,  String xapth) {
		System.out.println("Polling start");
		
		 val2=xapth;
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);
		System.out.println("Polling elemet 22");
		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@SuppressWarnings("unused")
			@Override
			public WebElement apply(WebDriver dr) {
				System.out.println("Polling elemet"+ele);
				ele=dr.findElement(By.xpath("//*[@id=\"sys_readonly.change_request.approval\"]"));
				Select select = new Select(ele);
				WebElement option = select.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println("First Valeu "+defaultItem );
				System.out.println("IBM state before if block : "+defaultItem);
				
				 
if (defaultItem.contains(val2)) {
	System.out.println("IBM state in 'if block'  : "+defaultItem);	
	Reporter.addStepLog("IBM approval state is: "+defaultItem);
	
					return ele;
				} else {
					System.out.println("Reloading the page");		
					Actions action = new Actions(dr);
					ele=dr.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
					action.contextClick(ele).build().perform();
					dr.findElement(By.xpath("//*[@id='context_1']/div[17]")).click();
					System.out.println("IBM state before else block : "+defaultItem);
					return null;
				}
				
				
				
				
			}

		};
		return wt.until(fn);

	}
	@SuppressWarnings("deprecation")
	public static  WebElement FluentWaitIBMTaskState(  WebElement ele2, int waitTime,   WebDriver driver3,  String xapth) {
		System.out.println("Polling start");
		
		 val2=xapth.trim();
		 System.out.println("Value from table "+val2 );
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);
		System.out.println("Polling elemet 22");
		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@SuppressWarnings("unused")
			@Override
			public WebElement apply(WebDriver dr) {
				System.out.println("Polling elemet"+ele);
				ele=dr.findElement(By.xpath("//*[@id='sys_readonly.change_task.state']"));
				Select select = new Select(ele);
				WebElement option = select.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println("First Valeu "+defaultItem );
				System.out.println("IBM state before if block : "+defaultItem);
				 
if (defaultItem.contains(val2)) {
	System.out.println("IBM state in 'if block'  : "+defaultItem);	
	Reporter.addStepLog("IBM state is: "+defaultItem);
					return ele;
				} else {
					System.out.println("Reloading the page");		
					Actions action = new Actions(dr);
					ele=dr.findElement(By.xpath("//*[@id='connectFollowWidgetAction']/span[1]"));
					action.contextClick(ele).build().perform();
					dr.findElement(By.xpath("//*[@id='context_1']/div[13]")).click();
					System.out.println("IBM state before else block : "+defaultItem);
					return null;
				}
				
				
				
				
			}

		};
		return wt.until(fn);

	}
	
	@SuppressWarnings("deprecation")
	public static  WebElement FluentWaitAtMLFIBMState(  WebElement ele2, int waitTime,   WebDriver driver3,  String x1, String x2,String val,String x3) {
		System.out.println("Polling start");
		val2=val;
		xpath1=x1;
		xapth2=x2;
		xpath3=x3;
		Actions action = new Actions(driver3);
		ele=driver3.findElement(By.xpath(xapth2));
		action.contextClick(ele).build().perform();
		driver3.findElement(By.xpath(xpath3)).click();
		 
		Wait<WebDriver> wt = new FluentWait<>(driver3).withTimeout(waitTime, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(NullPointerException.class).ignoring(Exception.class);
		System.out.println("Polling elemet 22");
		Function<WebDriver, WebElement> fn = new Function<WebDriver, WebElement>() {
			@SuppressWarnings("unused")
			@Override
			public WebElement apply(WebDriver dr) {
				System.out.println("Polling elemet"+ele);
				ele=dr.findElement(By.xpath(xpath1));
				Select select = new Select(ele);
				WebElement option = select.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println("First Valeu "+defaultItem );
				System.out.println("IBM state before if block : "+defaultItem);
				 
if (defaultItem.contains(val2)) {
	System.out.println("IBM state in 'if block'  : "+defaultItem);	
	Reporter.addStepLog("MLF phase state is: "+defaultItem);
					return ele;
				} else {
					System.out.println("Reloading the page");		
					Actions action = new Actions(dr);
					ele=dr.findElement(By.xpath(xapth2));
					action.contextClick(ele).build().perform();
					dr.findElement(By.xpath(xpath3)).click();
					System.out.println("IBM state before else block : "+defaultItem);
					return null;
				}
				
				
				
				
			}

		};
		return wt.until(fn);

	}


	public static String getORvalue2(String data, String xmlFilePath) {
		try {
			xmlFilePath="C:\\Users\\chaurma\\eclipse-workspace\\SnowNowPageObjectFramework\\ObjectRepository.xml";
			File inputFile = new File(xmlFilePath);									
		    SAXReader saxReader = new SAXReader();					
		    Document document;
			
				document = saxReader.read(inputFile);
									
		    String GoogleSearch =document.selectSingleNode("//menu/"+data).getText();
		   
		    data=GoogleSearch;
			}
		    catch (DocumentException e) {
				
				e.printStackTrace();
			}
				return data;
				
			}
	
	
	public static void writeFile(String canonicalFilename, String text) 
			throws IOException
			{
			  File file = new File (canonicalFilename);
			  BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
			  out.write(text);
			  out.close();
	
}
	public static void cFunSelectValueByIndexXpath(String xpath,WebDriver driver) {
		
		List<WebElement> ele;

		
		try {

			ele = driver.findElements(By.xpath(xpath));
			Thread.sleep(3000);
			System.out.println("Rowcount" + ele);

			int RowCount = ele.size();
			System.out.println("Rowcount" + RowCount);

			for (WebElement option : ele) {
				System.out.println("Otion " + option.getText());

				option.click();
				// JavascriptExecutor ex= (JavascriptExecutor)Driver;
				// ex.executeScript("arguments[0].click", option);
				Thread.sleep(3000);
				System.out.println("Selected value is " + xpath);

			}

		} catch (Exception e) {
			System.out.println("Value are not finding");
		}
	}
	public static boolean IsElementExist(WebElement ele) {
		try {
			System.out.println("IsElementExist :"+ele);
			ele.isDisplayed();
			return true;
		} catch (Exception e) {
			System.out.println("Exception :"+ele);
			return false;
		}
		
	}
	public static void SetIfExist(WebElement ele, String Value) {
		try {
			System.out.println("IsElementExist :"+ele);
			ele.isDisplayed();
			ele.sendKeys(Value);
			
		} catch (Exception e) {
			System.out.println("Exception :"+ele);
		
		}
	}
	
	@SuppressWarnings("static-access")
	public static String cusFunSerrachINCorREQ(WebDriver dr,String INCNum)
	{
		PageObjectManagerIETL = new PageObjectManagerIETL(dr);
		System.out.println("PageObjec :"+dr);
		//RPSSDTechnicalSupportMode=	PageObjectManager.getRPSSDTechnicalSupportModeObj();
		
		//System.out.println("RequestNumber.getText() "+RPSSDTechnicalSupportMode.getRequestNumber());
		AdminHomePage=PageObjectManagerIETL.getAdminHomePageApproveRequestItemtObj();
		//customefunction.captureScreenMethod(driver2, XpathRepository.path, ScreenshotFoldername);
		AdminHomePage.SearchRequestNumberInAdmin2(INCNum);
		return INCNum;
	}
	public static void cusScrollDownByPixel(WebDriver driver22) {
		JavascriptExecutor js = (JavascriptExecutor) driver22;
		js.executeScript("window.scrollBy(0,250)");
		System.out.println("Scroll down by pixel");
		
	}
	
	public static WebElement waitVisibilityOfElementLocated(String string,int waitTime, WebDriver driver) {
		WebElement ele = null;
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,waitTime);
		ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(string)));
		System.out.println("Inspected element : "+ele);
		
	
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ele;
	}
	public static WebElement waitElementTobeCLickable(String string, int waitTime, WebDriver driver3) {
		WebElement ele = null;
		try
		{
		WebDriverWait wait=new WebDriverWait(driver3,waitTime);
		ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(string)));
		System.out.println("Inspected element : "+ele);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return ele;	
		
	}
	public static WebElement waitVisibilityOf(WebElement element, int waitTime, WebDriver driver3) {
		
		WebElement ele = null;
		try
		{
		WebDriverWait wait=new WebDriverWait(driver3,waitTime);
		ele=wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Inspected element : "+ele);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ele;	
			
	}
	public static void clickByJs(WebElement ele,WebDriver dr)
	{
		JavascriptExecutor executor = (JavascriptExecutor)dr;
		executor.executeScript("arguments[0].click();", ele);
	}
	public static void sendKeys(String string, String string2, WebDriver driver3) {
		ele=driver3.findElement(By.xpath(string));
		ele.sendKeys(string2);
				
			}
	public static void sendKeysEle(WebElement el,String arg, WebDriver driver3) {
		ele=el;
		ele.sendKeys(arg);
				
			}
	public static void cfunToRetrieveDataFromDrpDown(WebDriver driver,String xpath) {
		
		List<WebElement> ele;
		String value;
	
		String Xpath = xpath;

		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			// "(//*[contains(@id,'select2-drop')])[2]//us//child::li"
			ele = driver.findElements(By.xpath(Xpath));
			System.out.println("ele" + ele);
			int RowCount = ele.size();
			System.out.println("Rowcount" + RowCount);
			int i = 0;
			for ( WebElement option : ele) {
				
				System.out.println("Dropdown Value ["+i+"]" + option.getText());
				value= option.getText();
				Reporter.addStepLog("Dropdown Value ["+i+"] : " + value); 
				i++;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static WebElement clickSpecificApprovalGroupAtIBM(WebDriver driver,String xpath,String val,String xpath2) {
		
		List<WebElement> ele;
		WebElement ele2 = null;
		String value;
	
		String Xpath = xpath;

		try {
		
			
			// "(//*[contains(@id,'select2-drop')])[2]//us//child::li"
			ele = driver.findElements(By.xpath(Xpath));
			System.out.println("ele" + ele);
			int RowCount = ele.size();
			System.out.println("Rowcount" + RowCount);
			int i = 1;
			for ( WebElement option : ele) {
				
				System.out.println("Dropdown Value ["+i+"]" + option.getText());
				value= option.getText().trim();
				Reporter.addStepLog("Group approval name ["+i+"] : " + value);
				if(value.equalsIgnoreCase(val.trim()))
				{
//					option.click();	
					System.out.println("Dropdown Value ["+i+"]" + option.getText());
ele2=driver.findElement(By.xpath(xpath2+"["+i+"]"+"//span//following::div[1]"));
break;
				}
				
					i++;
					
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return ele2;
	
	}
public static void clickSpecificApprovalGroupAtMLF(WebDriver driver,String xpath,String val,String xpath2) {
		
		List<WebElement> ele;
		String value;
	
		String Xpath = xpath;

		try {
		
			
			// "(//*[contains(@id,'select2-drop')])[2]//us//child::li"
			ele = driver.findElements(By.xpath(Xpath));
			System.out.println("ele" + ele);
			int RowCount = ele.size();
			System.out.println("Rowcount" + RowCount);
			int i = 1;
			for ( WebElement option : ele) {
				
				System.out.println("Dropdown Value ["+i+"]" + option.getText());
				value= option.getText();
				Reporter.addStepLog("Group approval name ["+i+"] : " + value);
				if(value.equalsIgnoreCase(val))
				{
//					option.click();	
driver.findElement(By.xpath(xpath2+"["+i+"]")).click();
				}

					i++;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void cufunSelectByVisibletext(String selVal, String xpath, WebDriver driver3) {
		driver=driver3;
		System.out.println("driver sel :"+driver);
		int i=0;
		try
		{
		List<WebElement> ls=driver.findElements(By.xpath(xpath));
		WebElement ele;
		
		for(WebElement option :ls)
		{
			System.out.println("["+i+"] : "+ls.get(i).getText());
			customefunction.sleep(3000);
			if(ls.get(i).getText().equals(selVal))
			{
				ls.get(i).click();
				break;
				
			}
				
			i++;	
		}
		}
		catch(Exception e)
		{
			Reporter.addStepLog("Selected Value is at position ["+i+"] : " + selVal);
			
		}
		Reporter.addStepLog("Selected Value is at position ["+i+"] : " + selVal); 
	}
	
	public static void IsWebAlertPresent(WebDriver driver3, int i) {
		WebDriverWait wt=new WebDriverWait(driver3,10);
	 try
	      {
		wt.until(ExpectedConditions.alertIsPresent());
		
			Alert alert = driver3.switchTo().alert();
	        driver3.switchTo().alert(); 
	        System.out.println("Alert is Present");	
			System.out.println("Alert is Present");
			alert.accept();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void contextAction(String xpath, WebDriver driver22) {
		
		Actions act=new Actions (driver22);
	ele=	driver22.findElement(By.xpath(xpath));
	act.contextClick(ele).build().perform();
	}
	
public static void highliteElement(WebElement ele,WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    
js.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');", ele);
}
}





