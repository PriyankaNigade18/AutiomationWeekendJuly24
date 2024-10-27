package com.Listeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport()
  {
	  //create object of ExtentReports class
	  ExtentReports extent=new ExtentReports();
	  
	  //path to generate report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Report//AutomationReport.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("TestCaseReport");
	  spark.config().setReportName("First Sprint Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  
	  //attach report to extent object
	  extent.attachReporter(spark);
	  
	  
	  
	  
	  //to generate log
	  ExtentTest test=extent.createTest("Test Case status");
	  
	  
	  test.log(Status.PASS,"Test Case is pass");
	  test.log(Status.FAIL,"Test Case is Fail");
	  test.log(Status.SKIP,"Test Case is skip");
	  test.log(Status.INFO,"Test Case information");
	  
	  //close report- flush()
	  extent.flush();
	  
	  
	  
	  
	  
  }
}
