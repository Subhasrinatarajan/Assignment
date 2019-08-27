package com.atmecs.automation.report;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentRport 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
   @BeforeSuite
   public static void setup()
   {
	htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");
	extent =new ExtentReports();
	extent.attachReporter(htmlReporter);
	
   }
   
   @AfterMethod
   public void getResult(ITestResult result)
   {
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		   test.fail(MarkupHelper.createLabel(result.getName()+"Test Case Failed", ExtentColor.RED));
		   test.fail(result.getThrowable());
	   }
	   else if(result.getStatus()==ITestResult.SUCCESS)
	   {
		   test.pass(MarkupHelper.createLabel(result.getName()+"Test Case Passed", ExtentColor.GREEN));
	   }
	   else
	   {
		   test.skip(MarkupHelper.createLabel(result.getName()+"Test Case Skipped", ExtentColor.YELLOW));
	   }
	}
   
   @AfterSuite
   public static void tearDown()
   {
	   extent.flush();
   }   
   }

