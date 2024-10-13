package com.TestNGFramework.PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestUsingBy extends Baseclass
{
  @Test(priority=1)
  public void validateUrl()
    {
	  //LoginPageUsingBy lp=new LoginPageUsingBy();
	  String url=lp.getAppUrl();
	  Assert.assertTrue(url.contains("login"),"Url not matched!");
	  System.out.println("Url matched!: "+url);
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("Login"),"title not matched!");
	  System.out.println("title matched!: "+title);
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(lp.getAppUrl().contains("customers"));
	  System.out.println("Login completed Successfully!");
  
  }
}
