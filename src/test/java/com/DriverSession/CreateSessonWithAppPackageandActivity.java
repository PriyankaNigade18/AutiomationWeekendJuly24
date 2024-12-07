package com.DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateSessonWithAppPackageandActivity {
  @Test
  public void testNewSessionforDeskClock() throws MalformedURLException
   {
	  
	  
	  UiAutomator2Options option=new UiAutomator2Options();
	  
	  //through the command
	    
	  option.setCapability("appium:appPackage","com.android.deskclock");
	  option.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create driver session
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println(driver.getSessionId());
	  
	  //through the command
//	 String packageName=((AndroidDriver)driver).getCurrentPackage();
//	 
//	 String activity=((AndroidDriver)driver).currentActivity();
	  
	  
	  
	  
	  
  }
}
