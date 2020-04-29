package ReusableStepDefinitionFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.EmailException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.snow.textcontext.TextContext;
import com.snow.util.EmailSent;
import com.snow.util.ListnerAdapter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	 private List <String> fileList;
	    private static final String OUTPUT_ZIP_FILE = System.getProperty("user.dir")+"//Folder.zip";
	    private static final String SOURCE_FOLDER = System.getProperty("user.dir")+"\\target\\CucumberReport"; // SourceFolder path
	public TextContext textContext;
	public Hooks(TextContext context) {
		textContext = context;
	}
	@Before
	public void BeforeSteps() {
		
		/*Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");*/
		/*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");

 		String timeStamp = dateFormat.format(new Date());
 		System.out.println("timeStamp : " + timeStamp);
 		String repName = "TestReport_" + timeStamp + ".html";
 		//System.out.println(System.getProperty("user.dir") + "/test-output/" + repName);
 		//.out.println(System.getProperty("user.dir") + "//target//Cucumber_Report_"+timeStamp+"//"+"Report.html");
 		HtmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "//target//CucumberReport//" + repName));
 		//HtmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "//target//Cucumber_Report_"+timeStamp+"//"+"Report.html"));
 		HtmlReporter.loadConfig(System.getProperty("user.dir") + "//extent-config.xml");
 		extent = new ExtentReports();
 		extent.attachReporter(HtmlReporter);
 		extent.setSystemInfo("Host name", "Local");
 		extent.setSystemInfo("Enviroment", "QA");
 		extent.setSystemInfo("User", "Manish");
 		HtmlReporter.config().setDocumentTitle("NewExtent");
 		HtmlReporter.config().setReportName("Functional Testing");
 		HtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);*/
	}
	
	@After
	public void AfterSteps() {
		System.out.println("QQQQQQQQ");
//textContext.getPageObjectManager().getWebDriverManager().quitDriver();
		
	textContext.getPageObjectManagerIETL().getWebDriverManager().quitDriver();
//		customefunction.sleep(10000);
//		ZipUtils sp=new ZipUtils();
//	
//		sp.zipfile();
	System.out.println("Hook :"+System.getProperty("user.dir")+"\\target\\CucumberReport\\"+ListnerAdapter.timeStamp+"\\"+"Report.html");
//	File src=new File(System.getProperty("user.dir")+"\\target\\CucumberReport\\"+ListnerAdapter.timeStamp+"\\"+"Report.html");
//File dst=new File(System.getProperty("user.dir")+"\\target\\CucumberReport\\Latest");


	
}
	
	
		
		
		
	        
}
	

	
