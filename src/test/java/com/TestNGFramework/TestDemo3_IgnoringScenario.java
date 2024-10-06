package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_IgnoringScenario {
  @Test(priority=1)
  public void interviewProcess() 
  {
	  System.out.println("Interview process for employee is done!");
  }
  
  @Test(priority=2)
  public void documentProcess() 
  {
	  System.out.println("Employee submit all the document to oranganization!");
  }
  
  
  @Test(priority=3)
  public void onBoardProcess() 
  {
	  System.out.println("Employee will onBord/join that organazation!");
  }
  
  //way 1: using enabled argument
  @Test(priority=4,enabled=false)
  public void KTProcess() 
  {
	  System.out.println("Employee will get KT!");
  }
  
  @Test(priority=5)
  public void projectAssignProcess() 
  {
	  System.out.println("Employee will get Project to Work!");
  }
}
