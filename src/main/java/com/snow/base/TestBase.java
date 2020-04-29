package com.snow.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.service.pageobjectmanager.FileReaderManager;
import com.snow.log.Log;
import com.snow.util.TestUtil;


public class TestBase {
	
	public static ExtentTest logger;
	public static Properties prop;
	 public static WebDriver driver;
	 public static WebDriver driver2;
	 public static WebElement ele;
	
	 
	
	public TestBase()
	{
		try
		{
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/snow/config/config.properties");
		prop.load(ip);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static WebDriver  initialization(String string)
	{
		System.out.println("Initial : "+driver);
		DOMConfigurator.configure(System.getProperty("user.dir")+prop.getProperty("Log4JFilePath"));
		Log.info("Successfully entered into the application");

		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			
			//System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromedriverPath"));
			System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
			System.out.println("Initial2 : "+driver);
			
			driver=new ChromeDriver();
			System.out.println("Initial3 : "+driver);
			
		}
		else if(browsername.equals("FF"))
		{
			//System.setProperty("webdriver.chrome.driver","C://Users//chaurma//eclipse-workspace//ServiceNowPageObjectModel//Drivers//chromedriver.exe");
			//driver=new FirefoxDriver();
		}
		
		System.out.println("Initial3.1 : "+driver);
		driver.manage().window().maximize();
		System.out.println("Initial4 : "+driver);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		System.out.println("Initial5 : "+driver);
		try
		{
		driver.get(prop.getProperty(string));
		ele=driver.findElement(By.cssSelector(".placeholderContainer input[name='loginfmt']"));
		ele.sendKeys("chaurma@mfcgd.com");
		/*customefunction.sleep(3000);*/
		ele=driver.findElement(By.cssSelector("#idSIButton9"));
		ele.click();
	//	driver2.get("http://manulifetest.service-now.com");
		return driver;
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Initial6 : "+driver);
		
		return driver;
	}
	
public static WebDriver getWebDriver()
{
	return TestBase.driver;
	
}
public static WebDriver getWebDriver2()
{
	return TestBase.driver2;
	
}

	public static WebDriver  initialization2( String string)
	{
		System.out.println("Initial : "+driver2);
		DOMConfigurator.configure(System.getProperty("user.dir")+prop.getProperty("Log4JFilePath"));
		Log.info("Successfully entered into the application");

		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			
			//System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromedriverPath"));
			System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
			/* driver2 = new HtmlUnitDriver(true);

				driver2.setJavascriptEnabled(false);*/
			driver2=new ChromeDriver();
			
			
		}
		else if(browsername.equals("FF"))
		{
			//System.setProperty("webdriver.chrome.driver","C://Users//chaurma//eclipse-workspace//ServiceNowPageObjectModel//Drivers//chromedriver.exe");
			//driver=new FirefoxDriver();
		}
		driver2.manage().window().maximize();
		driver2.manage().deleteAllCookies();
		driver2.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("Driver1: "+driver2);
		driver2.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
driver2.get(prop.getProperty(string));
		System.out.println("Driver2: "+driver2);
		ele=driver2.findElement(By.cssSelector(".placeholderContainer input[name='loginfmt']"));
		ele.sendKeys("chaurma@mfcgd.com");
		/*customefunction.sleep(3000);*/
		ele=driver2.findElement(By.cssSelector("#idSIButton9"));
		ele.click();
	//	driver2.get("http://manulifetest.service-now.com");
		return driver2;
	}
	
	
public static File captureScreenMethod(WebDriver driver2,String TestcaseNumber) {
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy_mm_dd_hh_mm_ss");
		String timeStamp=dateFormat.format(new Date());
		TakesScreenshot tk=((TakesScreenshot)driver2);
	File src=	tk.getScreenshotAs(OutputType.FILE);
	//String str=FileReaderManager.getInstance().getConfigReader().getScreenshotFolderPath();
	//System.out.println("Str :"+str);
	StringTokenizer st1 = 
            new StringTokenizer(System.getProperty("user.dir"), "\\"); 
	LinkedList<String> ls=new LinkedList<String>();
	
	while (st1.hasMoreTokens()) 
	{
		ls.add(st1.nextToken());
	}
	
	StringBuilder  ScreenshotDir = new StringBuilder ();

	for(int i=0;i<ls.size()-1;i++)
	{
	ScreenshotDir.append("\\"+ls.get(i));
		
	}
	System.out.println("Dir : "+"\\"+ScreenshotDir+"\\"+prop.getProperty(TestcaseNumber));
	File dst=new File("\\"+ScreenshotDir+"\\"+prop.getProperty(TestcaseNumber)+ "\\screenshots" + timeStamp + ".png");
	try {
		FileUtils.copyFile(src, dst);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return dst;
	
}
public static String getDataFromPropertyFile(String data)
{
	return prop.getProperty(data);
	
}


}
