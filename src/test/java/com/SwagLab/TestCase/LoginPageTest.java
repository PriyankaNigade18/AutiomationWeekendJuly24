package com.SwagLab.TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseTest;

public class LoginPageTest extends BaseTest
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String url=lp.getAppUrl();
	  AssertJUnit.assertTrue(url.contains("demo"));
	  System.out.println("Url matched!...."+url);
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String title=lp.getAppTitle();
	  AssertJUnit.assertTrue(title.contains("Labs"));
	  System.out.println("Title matched!...."+title);
  }
  
  
  @Test(priority=3)
  public void validateLogin()
  {
	  
	  lp.doLogin("standard_user","secret_sauce");
	  AssertJUnit.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login completed!");
  }
}
