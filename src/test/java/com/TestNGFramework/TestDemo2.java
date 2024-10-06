package com.TestNGFramework;

import org.testng.annotations.Test;

public class TestDemo2 
{
  @Test(priority=1,description="Test case1")
  public void registerTest() 
  {
	  System.out.println("User will register first");
  }
  
  @Test(priority=2,description="Test case2",invocationCount=3)
  public void loginTest() 
  {
	  System.out.println("User will login after registration");
  }
  @Test(priority=3,description="Test case3")
  public void searchProductTest() 
  {
	  System.out.println("User will search Product");
  }
  
  @Test(priority=4,description="Test case4")
  public void addToCartTest() 
  {
	  System.out.println("User will select the products and add to cart!");
  }
  
  
}
