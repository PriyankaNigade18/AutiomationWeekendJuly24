package com.TestNGFramework.Annotation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeAnnotationUse extends BaseClass
{
	//WebDriver driver;
	
//	@BeforeClass
//	public void browserSetup()
//	{
//		System.out.println("Application Browser Setup is running!");
//		driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/");
//		
//	}
  @Test(priority=1,description = "SmokeTest")
  public void testSignInLink()
  {
	  WebElement ele=driver.findElement(By.linkText("Sign In"));
	  if(ele.isDisplayed() && ele.isEnabled())
	  {
		  ele.click();
		  
	  }
	  System.out.println("Sign In Link validation is done");
	  
  }
  
  
  @Test(priority=2,description = "Functional Test",dependsOnMethods = "testSignInLink")
  public void testlogin() {
	  
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  System.out.println("Login Test completed!");

  }
  
  
//  @BeforeMethod
//  public void getAppTitle()
//  {
//	  System.out.println("Application Title : "+driver.getTitle());
//  }
//  
//  @AfterMethod
//  public void getUrl()
//  {
//	  System.out.println("Application Current url is: "+driver.getCurrentUrl());
//  }
//  
//  @AfterClass
//  public void tearDown()
//  {
//	  driver.quit();
//	  System.out.println("Session is closed!");
//  }
//  
}
