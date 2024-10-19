package com.TestNGFramework.PageObjectUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTest extends BaseTest 
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String url=lp.getAppUrl();
	  Assert.assertTrue(url.contains("demo"));
	  System.out.println("Url matched!: "+url);
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("HRM"));
	  System.out.println("Title matched!: "+title);
  }
  
  @Test
  public void validateLogin()
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"));
	  System.out.println("Login completed!");
  }
}
