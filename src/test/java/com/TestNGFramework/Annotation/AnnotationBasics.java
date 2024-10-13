package com.TestNGFramework.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationBasics
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("Register Test");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("Login Test");
  }
  
  @Test(priority=3)
  public void logoutTest()
  {
	  System.out.println("Logout Test");
  }
  
  //Annotations
  
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("Before Method will execute before every test case");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("After Method will execute after every test case");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass execute before first test case");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass execute after last test case");
  }
  
}
