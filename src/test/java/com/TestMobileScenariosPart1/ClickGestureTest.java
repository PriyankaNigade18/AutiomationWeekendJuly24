package com.TestMobileScenariosPart1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGestureTest {
  @Test
  public void testClickGesture() 
  {
	  
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views element
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //mobile: clickGesture
	  driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId()
			  ));
	  
	  System.out.println("Click Gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
