package com.TestMobileScenariosPart1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickGesture {
  @Test
  public void testLongclick()
  {
	  
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot1
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //mobile: longClickGesture
	  driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",4000
			    
			  ));
	  
	  System.out.println("Long Click ois completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
