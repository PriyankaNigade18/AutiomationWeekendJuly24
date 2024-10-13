package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo5_timeoutArgument
{
  @Test(timeOut = 3000)
  public void testCase1() throws InterruptedException 
  {
	  System.out.println("This is test 1");
	  Thread.sleep(2000);
  }
  
  
  @Test(timeOut = 3000)
  public void testCase2() throws InterruptedException 
  {
	  System.out.println("This is test 2");
	  Thread.sleep(4000);
  }
}
