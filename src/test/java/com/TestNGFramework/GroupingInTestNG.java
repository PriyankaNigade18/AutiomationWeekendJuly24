package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingInTestNG {
  @Test(groups = "smokeTest")
  public void testCase1()
  {
	  System.out.println("Test case 1");
  }
  @Test(groups = "smokeTest")
  public void testCase2()
  {
	  System.out.println("Test case 2");
  }
  @Test(groups = "FunctionalTest")
  public void testCase3()
  {
	  System.out.println("Test case 3");
  }
  @Test(groups = "FunctionalTest")
  public void testCase4()
  {
	  System.out.println("Test case 4");
  }
  @Test(groups = "regressionTest")
  public void testCase5()
  {
	  System.out.println("Test case 5");
  }
  @Test(groups = "regressionTest")
  public void testCase6()
  {
	  System.out.println("Test case 6");
  }
}
