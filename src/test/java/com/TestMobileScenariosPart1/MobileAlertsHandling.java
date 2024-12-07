package com.TestMobileScenariosPart1;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class MobileAlertsHandling {
  @Test
  public void testAlerts() throws InterruptedException
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //App
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  Thread.sleep(2000);
	  
	  //alert window will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of Alert1 is: "+alt1.getText());
	  
	  //ok
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
