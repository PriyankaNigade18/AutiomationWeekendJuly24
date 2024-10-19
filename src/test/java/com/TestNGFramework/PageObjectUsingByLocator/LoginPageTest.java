package com.TestNGFramework.PageObjectUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	 // LoginPage lp=new LoginPage();
	  String url=lp.getAppUrl();
	  Assert.assertTrue(url.contains("open"));
	  System.out.println("Url matched!..."+url);
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("HRM"));
	  System.out.println("Title matched!..."+title);
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.enterUserName("Admin");
	  lp.enterPassword("admin123");
	  lp.clickLoginButton();
	  
	 // lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"));
	  System.out.println("Login Completed!");
  }
}
