package com.TestMobileScenariosPart1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGesture {
  @Test
  public void testDragnDrop() 
    {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot3
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //dragGesture
	  driver.executeScript("mobile: dragGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",720,
			  "endY",1091
			   ));
	  
	  
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  
	  
	  System.out.println("Result text is: "+text);
	  
	  
	  
	  
	  
	  
	  
  }
}
