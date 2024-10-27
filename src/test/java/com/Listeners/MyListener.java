package com.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started: "+result.getName());
	}

	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case Pass: "+result.getName());
	}
	
	
	public void onTestSkip(ITestResult result)
	{
		System.out.println("Test case skiped: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case Fail: "+result.getName());
	}
}
