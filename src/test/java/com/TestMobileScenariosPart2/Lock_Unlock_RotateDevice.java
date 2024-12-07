package com.TestMobileScenariosPart2;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_RotateDevice {
  @Test
  public void testBasicSetup() throws InterruptedException 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  /*
	   * lockDevice()
	   * unlockDevice()
	   * rotate(ScreenOrientation)
	   */
	  
	  
	  
	  //lock the device
	  
	  ((AndroidDriver)driver).lockDevice();
	  
	  
	  //Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  
	  
	  //rotate
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
