package com.TestMobileScenariosPart1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsForAndroid {
  @Test
  public void testLocators() throws InterruptedException 
  {
	  //create  a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //locators-accessibility-id(primary)
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element1: "+ele1.getText());
	  ele1.click();
	  
	  //navigate to back
	  driver.navigate().back();
	  
	  
	  //xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
	  System.out.println("Text of Eelement2: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  //locator- androidUiAutomator
	  WebElement ele3=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"App\")"));
	  
	  System.out.println("Text of Eelement3: "+ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  
	  //locator- className
	  
	  WebElement ele4=driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
	  System.out.println("Text of Eelement4: "+ele4.getText());
	  ele4.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  //locator- resource-id -->id
	  
	  WebElement ele5=driver.findElements(AppiumBy.id("android:id/text1")).get(10);
	  System.out.println("Text of Eelement5: "+ele5.getText());
	  ele5.click();
	  
	  Thread.sleep(1500);
	  
	  //navigate back
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
