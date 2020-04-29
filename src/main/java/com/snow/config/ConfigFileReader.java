package com.snow.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.snow.base.TestBase;
import com.snow.enums.Context;
import com.snow.enums.EnvironmentType;

public class ConfigFileReader {
	private static Properties prop;
	

	
	public ConfigFileReader() throws FileNotFoundException{
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/snow/config/config.properties");
			prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	@SuppressWarnings("unused")
	public static String getReportConfigPath(){
		 String reportConfig = prop.getProperty("reportConfigPath");
		// String reportConfigPath="\\"+reportConfig;
		 String reportConfigPath= System.getProperty("user.dir")+reportConfig;
		 System.out.println("reportConfigPath .................."+System.getProperty("user.dir"));
		 System.out.println("reportConfigPath .................."+reportConfigPath);
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
	@SuppressWarnings("unused")
	public String getDriverPath(){
		 String driverPath = prop.getProperty("ChromedriverPath");
		 String drPath= System.getProperty("user.dir")+driverPath;
		 if(drPath!= null) return drPath;
		 else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
		 }
	
	
		 
		 public long getImplicitlyWait() { 
		 String implicitlyWait = prop.getProperty("implicitlyWait");
		 if(implicitlyWait != null) {
		 try{
		 return Long.parseLong(implicitlyWait);
		 }catch(NumberFormatException e) {
		 throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
		 }
		 }
		 return 30; 
		 }
		 
		 public String getApplicationUrl() {
		 String url = prop.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
		 }
		 public String getScreenshotFolderPath() {
			 String url = prop.getProperty("ScreenshotPath");
			 if(url != null) return url;
			 else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
			 }
		 
//		 public Context getBrowser() {
//		 String browserName = prop.getProperty("browser");
//		 if(browserName == null || browserName.equals("chrome")) return Context.CHROME;
//		 else if(browserName.equalsIgnoreCase("firefox")) return Context.FIREFOX;
//		 else if(browserName.equals("iexplorer")) return Context.INTERNETEXPLORER;
//		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
//		 }
		 
		 public EnvironmentType getEnvironment() {
		 String environmentName = prop.getProperty("environment");
		 if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		 else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		 else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
		 }
		 
		 public Boolean getBrowserWindowSize() {
		 String windowSize = prop.getProperty("windowMaximize");
		 if(windowSize != null) return Boolean.valueOf(windowSize);
		 return true;
		 }
		 
		 
		 public void quitDriver()
		 {
			 try
				{
					if(TestBase.driver!=null)
					{
				TestBase.driver.quit();
				System.out.println("Close first browser");
				if(TestBase.driver2!=null)
				{
					TestBase.driver2.quit();
					System.out.println("Close Second browser");	
				}
					}
					
					System.out.println("End");
				}
				catch(Exception e)
				{
					e.printStackTrace();	
				}
					finally
			        { 
			            System.out.println("Finally"); 
			        }
		 }
		 
		}
	
	



