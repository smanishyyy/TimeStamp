package Runnner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features = {
	
		//"src/main/java/com/snow/feature",
		
		//"src/main/java/com/snow/feature/ReusableSteps.feature",
		"src/main/java/com/snow/feature/MLFtoIBMChange.feature",
	"src/main/java/com/snow/feature/MLFtoIBMChangeV2.feature"
		//"@target/CucumberReport/rerun.txt"
		
		
		
		},
plugin = { 
		//"com.cucumber.listener.ExtentCucumberFormatter:target/CucumberReport/ExtentReport.html",
	"rerun:target/CucumberReport/rerun.txt" },
//com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:
//com.cucumber.listener.ExtentCucumberFormatter
glue = {"StepDefinition","ReusableStepDefinitionFile"}, 
format = {
		
		"pretty", "html:target/CucumberReport/index.html", 
		"json:target/CucumberReport"
				+ "/CumcumberJson.json",
				"junit:target/CucumberReport/CucumberJunit.xml" },
 dryRun = false, monochrome = true, strict = true 

,tags = {"@First,@Eleven"
		
}
 
 
)

public class Testrunner01It {
	

	public static ExtentHtmlReporter HtmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;


	 	
	private TestNGCucumberRunner testNGCucumberRunner2;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {

		testNGCucumberRunner2 = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Run Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {

		testNGCucumberRunner2.runCucumber(cucumberFeature.getCucumberFeature());

	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner2.provideFeatures();

	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner2.finish();
	}
}



