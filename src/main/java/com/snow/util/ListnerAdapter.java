package com.snow.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.snow.base.TestBase;

public class ListnerAdapter implements ITestListener {
	public static ExtentHtmlReporter HtmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String strReportPath;
	public static String strJSPath;
	public static String timeStamp;
	private LinkedList<String> lines;

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		/*
		 * System.out.println("Test failed :"+Thread.currentThread().getId() + "diver:"
		 * + TestBase.driver2); if (result.getStatus() == ITestResult.FAILURE) {
		 * TestBase.logger.log(Status.FAIL, result.getThrowable()); SimpleDateFormat
		 * dateFormat = new SimpleDateFormat("yyy_mm_dd_hh_mm_ss"); String timeStamp =
		 * dateFormat.format(new Date()); TakesScreenshot tk = ((TakesScreenshot)
		 * TestBase.driver2); File src = tk.getScreenshotAs(OutputType.FILE);
		 * 
		 * StringTokenizer st1 = new StringTokenizer(System.getProperty("user.dir"),
		 * "\\"); LinkedList<String> ls = new LinkedList<String>();
		 * 
		 * while (st1.hasMoreTokens()) { ls.add(st1.nextToken()); }
		 * 
		 * StringBuilder ScreenshotDir = new StringBuilder();
		 * 
		 * for (int i = 0; i < ls.size() - 1; i++) { ScreenshotDir.append("\\" +
		 * ls.get(i));
		 * 
		 * }
		 * 
		 * File dst = new
		 * File("\\" + ScreenshotDir + "\\" + "TestCase" + "\\screenshots" +
		 * result.getMethod().getMethodName() + timeStamp + ".png"); try {
		 * FileUtils.copyFile(src, dst);
		 * TestBase.logger.addScreenCaptureFromPath(dst.toString()); } catch
		 * (IOException e) {
		 * 
		 * e.printStackTrace(); } }
		 */

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		timeStamp = dateFormat.format(new Date());

		StringTokenizer st1 = new StringTokenizer(System.getProperty("user.dir"), "\\");
		LinkedList<String> ls = new LinkedList<String>();

		while (st1.hasMoreTokens()) {
			ls.add(st1.nextToken());
		}

		StringBuilder ScreenshotDir = new StringBuilder();

		for (int i = 0; i < ls.size() - 1; i++) {
			ScreenshotDir.append("\\" + ls.get(i));

		}
		System.out.println(
				"Directory : " + "\\" + ScreenshotDir + "\\SnowNowPageObjectFramework\\target" + "\\" + timeStamp);
		File dst = new File(
				"\\" + ScreenshotDir + "\\SnowNowPageObjectFramework\\target\\CucumberReport\\" + timeStamp);
		dst.mkdirs();
		strReportPath = "\\" + ScreenshotDir + "\\SnowNowPageObjectFramework\\target\\CucumberReport\\" + timeStamp
				+ "\\" + "Report.html";
		strJSPath = "\\" + ScreenshotDir + "\\SnowNowPageObjectFramework\\target\\CucumberReport\\reportHistory.js";
		HtmlReporter = new ExtentHtmlReporter(new File(strReportPath));

		HtmlReporter.loadConfig(System.getProperty("user.dir") + "//extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
		extent.setSystemInfo("Host name", "Local");
		extent.setSystemInfo("Enviroment", "QA");
		extent.setSystemInfo("User", "Manish");

		HtmlReporter.config().setDocumentTitle("NewExtent");
		HtmlReporter.config().setReportName("Functional Testing");
		HtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		System.out.println("Onfinsh Report Path : " + ListnerAdapter.strReportPath);

		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File(ListnerAdapter.strReportPath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Pattern pattern1 = Pattern.compile("(>)(\\d+)(<\\/span> test\\(s\\) passed)");
		Pattern pattern2 = Pattern.compile("(>)(\\d+)(<\\/span> test\\(s\\) failed)");
		Matcher matcher1 = null;
		Matcher matcher2 = null;

		String strFailCount = "0";
		String strPassCount = "0";
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			matcher1 = pattern1.matcher(line);
			matcher2 = pattern2.matcher(line);
			if (matcher1.find()) {
				strPassCount = matcher1.group(2);

			}

			if (matcher2.find()) {
				strFailCount = matcher2.group(2);

			}

		}

		Integer intSum = Integer.parseInt(strPassCount) + Integer.parseInt(strFailCount);

		String strUpdateMsg = ", \n";
		strUpdateMsg = strUpdateMsg + "{\"PassTC\":\"";
		strUpdateMsg = strUpdateMsg + strPassCount;
		strUpdateMsg = strUpdateMsg + "\",\"FailTC\":\"";
		strUpdateMsg = strUpdateMsg + strFailCount;
		strUpdateMsg = strUpdateMsg + "\",\"ReportPath\":\"";
		strUpdateMsg = strUpdateMsg + ListnerAdapter.timeStamp;
		strUpdateMsg = strUpdateMsg + "//Report.html\",\"ExecTC\":\"";
		strUpdateMsg = strUpdateMsg + intSum;
		strUpdateMsg = strUpdateMsg + "\",\"ExecutionDate\":\"";
		strUpdateMsg = strUpdateMsg + ListnerAdapter.timeStamp;
		strUpdateMsg = strUpdateMsg + "\",\"ExecTime\":\"00:05:00\"}]";

		File file = new File(ListnerAdapter.strJSPath);
		String fileContext = null;
		try {
			fileContext = FileUtils.readFileToString(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		fileContext = fileContext.replaceAll("]", strUpdateMsg);
		try {
			FileUtils.write(file, fileContext);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Flush :" + System.getProperty("user.dir") + "\\target\\CucumberReport\\"
				+ ListnerAdapter.timeStamp + "\\" + "Report.html");
		File src = new File(System.getProperty("user.dir") + "\\target\\CucumberReport\\" + ListnerAdapter.timeStamp
				+ "\\" + "Report.html");
		File dst = new File(System.getProperty("user.dir") + "\\target\\CucumberReport\\Latest\\Report.html");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			EmailSent.sendEmail(System.getProperty("user.dir")+"\\target\\CucumberReport\\Latest\\Report.html",strFailCount,strPassCount);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File src2 = new File(System.getProperty("user.dir") + "\\target\\CucumberReport\\Latest\\Report.html");
		File dst2 = new File("C:\\Users\\vjatfro\\OneDrive - Manulife\\AutomationResult\\Selenium\\MLF-IBM_Change"+ListnerAdapter.timeStamp+".html");
		try {
			FileUtils.copyFile(src2, dst2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
