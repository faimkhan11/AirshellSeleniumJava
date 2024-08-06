package com.Airshell.utilities;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportClass implements ITestListener
{
	 ExtentSparkReporter htmlReporter;
	 ExtentReports reports;
	 ExtentTest test;
	
	public void configureReport()
	{
		
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String reportName = "AirshellsTestReport-" + timestamp + ".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Extent_Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//Add system information/emvironement info to reports
		reports.setSystemInfo("Machine:", "FaimPC");
		reports.setSystemInfo("OS", "Windows 10");
		reports.setSystemInfo("browser", "chrome");
		reports.setSystemInfo("User name", "Faim");
		
		//Configuration to change look and feel of report
		htmlReporter.config().setDocumentTitle("Airshells Project Report");
		htmlReporter.config().setReportName("Extent Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	public void onStart(ITestContext Result)
	{
		configureReport();
		System.out.println("On start method invoked....");
				
	}
	
	public void onFinish(ITestContext Result)
	{
		System.out.println("On finish methode invokes....");
		reports.flush();
		
	}
	
	
	//When test case is getting failed, this method is call
	
	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("Name of test method failed:" + Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + Result.getName(), ExtentColor.RED));
	
		String screenShotPath = System.getProperty("user.dir") + "\\Screenshots" + Result.getName() + ".png";
		
		File screenShotFile = new File(screenShotPath);
		
		if(screenShotFile.exists())
		{
			test.fail("Captured screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
		}
		
		// test.addScreenCaptureFromPath("");
	}
	
	//When test case is getting skipped
	
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("Name of test method skipped:" + Result.getName());
		
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped test case is: " + Result.getName(), ExtentColor.ORANGE));
	}
	
	//When test case get started
	
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of test method started:" + Result.getName() );
		
	}
	
	//When test case get passed
	
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Name of test method Successfully executed:" + Result.getName() );
		
		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + Result.getName() ,ExtentColor.GREEN));
	}
	
	
	
	//When test case get started
	
		public void onTestFailedButWithSuccessPercentage(ITestContext Result)
		{
		
			
		}
	
}
