package com.TestMobileScenariosPart2;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithAppCommands {
  @Test
  public void testCommands()
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  
	  //current application status
	  System.out.println("Current App status is: "+((AndroidDriver)driver).queryAppState(packageName));
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp(packageName);
	  
	  System.out.println("After terminate status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  
	  //activate app
	  ((AndroidDriver)driver).activateApp(packageName);	  
	  
	  System.out.println("After activate status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  //uninstall 
	  ((AndroidDriver)driver).removeApp(packageName);
	  
	  System.out.println("After uninstallation status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  //install
	  ((AndroidDriver)driver).installApp(path);
	  
	  System.out.println("After install status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  
	  //activate
	  ((AndroidDriver)driver).activateApp(packageName);	  
	  
	  System.out.println("After activate status is: "+((AndroidDriver)driver).queryAppState(packageName));

	   
	  
	  //background
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
