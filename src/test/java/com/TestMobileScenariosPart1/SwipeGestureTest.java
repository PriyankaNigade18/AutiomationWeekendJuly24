package com.TestMobileScenariosPart1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGestureTest {
  @Test
  public void testSwipe() throws InterruptedException
  {
	  //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	   //photos
	  
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  //mobile: swipeGesture
	  
	  driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","left",
			  "percent",1.0
			  ));
	  
	  Thread.sleep(2000);
	  
	  
	  Utility.swipeRight(driver,area);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
}
