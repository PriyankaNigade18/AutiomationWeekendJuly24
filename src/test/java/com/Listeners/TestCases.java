package com.Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(com.Listeners.MyListener.class)
public class TestCases
{
  @Test
  public void testCase1()
  {
	  System.out.println("This is test case 1");
	  Assert.assertEquals(false, false);
	  System.out.println("Test Pass as assertion pass");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("This is test case 2");
	  Assert.assertEquals(true,false,"Test Fail as assertion fails");
	  System.out.println("Test Pass as assertion pass");
  }
}
