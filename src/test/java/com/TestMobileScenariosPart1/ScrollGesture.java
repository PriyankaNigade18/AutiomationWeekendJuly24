package com.TestMobileScenariosPart1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll() throws InterruptedException 
    {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  Utility.scrollDown(driver,area);
	  
	  Thread.sleep(2000);
	  
	  Utility.scrollUp(driver,area);
	  
	  Thread.sleep(2000);
	  Utility.scrollDownUptoCount(driver,area,3);
	  
//	  //mobile: scrollGesture
//	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
//			  
//			  "elementId",((RemoteWebElement)area).getId(),
//			  "direction","down",
//			  "percent",1.0
//			  		  
//			  ));
//	  
//	  System.out.println("Scroll down is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
