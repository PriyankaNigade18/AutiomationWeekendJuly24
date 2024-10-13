package com.TestNGFramework.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;
	@BeforeClass
	public void browserSetup()
	{
		System.out.println("Application Browser Setup is running!");
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
	}
	
	@BeforeMethod
	  public void getAppTitle()
	  {
		  System.out.println("Application Title : "+driver.getTitle());
	  }
	  
	  @AfterMethod
	  public void getUrl()
	  {
		  System.out.println("Application Current url is: "+driver.getCurrentUrl());
	  }
	  
	  @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
		  System.out.println("Session is closed!");
	  }
	  
}
