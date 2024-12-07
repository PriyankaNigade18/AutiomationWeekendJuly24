package com.TestMobileScenariosPart2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleWifi_Data_AirplaneMode {
  @Test
  public void testToggleSetup() throws InterruptedException
  {
	  //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  /*
	   * toggleWifi()
	   * toggleData()-MobileData
	   * toggleAirplaneMode()
	   */
	  
	  System.out.println("Initial status for wifi is ON");
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("After toggle wifi is OFF");

	  //ON
	  ((AndroidDriver)driver).toggleWifi();
	  
	  
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  
	  //swipe left
	  Utility.swipeLeft(driver,area);
	  
	  Thread.sleep(1500);
	    
	  System.out.println("Initial status for MobileData is ON");
	  
	  ((AndroidDriver)driver).toggleData();

	  System.out.println("After toggle for MobileData is OFF");
	  //On
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  //airplanemode
	  System.out.println("Initial status for Aiplanemode is OFF");

	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("After toggle Aiplanemode is ON");
	  
	  //Off
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
