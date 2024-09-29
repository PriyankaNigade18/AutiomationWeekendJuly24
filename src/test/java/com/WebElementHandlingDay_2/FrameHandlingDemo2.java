package com.WebElementHandlingDay_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo2 {
  @Test
  public void testNestedFrame()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  int count=driver.findElements(By.tagName("frame")).size();
	  System.out.println("Total Frames are: "+count);
	  
	  
	  //left frame
	  //top--->left
//	  driver.switchTo().frame(0);//top
//	  
//	  driver.switchTo().frame("frame-left");//left
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println("Left frame source code");
	  System.out.println(driver.getPageSource());
	  
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //middle
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  System.out.println("Middle frame source code");
	  System.out.println(driver.getPageSource());
	  
	  
	  
	  
	  
  }
}
