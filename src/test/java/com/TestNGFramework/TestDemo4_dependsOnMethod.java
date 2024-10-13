package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo4_dependsOnMethod
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is register test");
	  //Assert.assertEquals(true,false);
  }
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest()
  {
	  System.out.println("This is login test");
	  AssertJUnit.assertEquals(true,false);
  }
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest()
  {
	  System.out.println("This is logout test");
  }
}
