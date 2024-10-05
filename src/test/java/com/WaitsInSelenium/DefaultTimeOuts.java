package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DefaultTimeOuts {
  @Test
  public void testDefaultimeOut()
  {
	  WebDriver driver=new ChromeDriver();
	  //Page Load
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	  //implicit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //scrip time
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	  
	  driver.get("https://www.google.com");
	  
  }
}
