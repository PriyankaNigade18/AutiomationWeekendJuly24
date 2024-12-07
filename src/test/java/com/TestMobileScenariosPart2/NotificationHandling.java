package com.TestMobileScenariosPart2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NotificationHandling {
  @Test
  public void testNotifications() 
  {
	  //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //open notifications
	  
	  ((AndroidDriver)driver).openNotifications();
	  
	    
	  //for arrow
	  driver.findElement(AppiumBy.accessibilityId("Expand")).click();
	  
	  
	  WebElement note1=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Configure physical keyboard\")"));
	  System.out.println("NotificationHeading 1: "+note1.getText());
	  
	  WebElement note2=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Appium Settings\").instance(1)"));
	  System.out.println("NotificationHeading 2: "+note2.getText());
	  
	  String noteText=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(noteText);
	  
	  //notification3
	  WebElement note3=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Serial console enabled\")"));
	  System.out.println("NotificationHeading 3: "+note3.getText());

	  
	  
	  
	  
  }
}
