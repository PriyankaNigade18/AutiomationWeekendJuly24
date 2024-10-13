package com.TestNGFramework.Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {
  @Test
  public void testCaseB()
   {
	  System.out.println("This is test case B");
   }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Before test is executing Before Classes");
	  
 }
  
  @AfterTest
  public void afterTest()
  {
	  System.out.println("After test is executing After Classes");
	  
 }
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("BeforeSuite will execute beforetest");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("AfterSuite will execute aftertest");
  }
}
