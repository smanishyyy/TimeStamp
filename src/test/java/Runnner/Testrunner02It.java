package Runnner;

import java.io.File;

import org.junit.platform.commons.annotation.Testable;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.service.pageobjectmanager.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features = {

		// "src/main/java/com/snow/feature",

		 "src/main/java/com/snow/feature/ReusableSteps.feature",
		// "src/main/java/com/snow/feature/MLFtoIBMChange.feature",
	//	"src/main/java/com/snow/feature/MLFtoIBMChangeV2.feature"

}, plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target2/CucumberReport/ExtentReport.html" },

		glue = { "StepDefinition", "ReusableStepDefinitionFile" }, format = {

				"pretty", "html:target2/CucumberReport/index.html",
				"json:target2/CucumberReport" + "/CumcumberJson.json", "junit:target2/CucumberReport/CucumberJunit.xml",
				"rerun:target2/CucumberReport/rerun.txt" }, dryRun = false, monochrome = true, strict = true
//
	, tags = { "@Second" }
				)

public class Testrunner02It {

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
