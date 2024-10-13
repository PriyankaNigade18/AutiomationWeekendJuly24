package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void hardAssertionTest()
  {
	  String act="Selenium WebDriver is WebUI automation library";
	  String exp="Selenium WebDriver is WebUI automation library/tool";
	  /*
	   * If assertion will fail you will get AssertionError
	   */
	  
	  //Assert.assertEquals(act,exp,"Test Fail: As Strings are not equal");
	  //System.out.println("Test Pass: As Strings are equal");
	  
//	  Assert.assertTrue(act.contains("testng"),"Test Fail:Expected String is not a part of Actual string");
//	  System.out.println("Test Pass:Expected String is a part of Actual string");

	  Assert.assertFalse(act.contains("testng"),"Test Fail: Expected string is a part of actual");
	  System.out.println("Test Pass: Expected string is not a part of actual");
  }
  
  @Test
  public void softAssertionTest()
  {
	  
	  int a=100,b=100;
	  
	  SoftAssert sf=new SoftAssert();
//	  sf.assertEquals(a,b,"Test Fail: As both numbers are not equal");
//	  System.out.println("Test Pass: As both numbers are equal");
	  
	  sf.assertTrue(a!=b,"Test Fail: As condition is false");
	  System.out.println("Test Pass: As Condition is true");
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
	  
  }
}
