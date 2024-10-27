package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstTestOnGrid {
  @Test
  public void gridTest() throws MalformedURLException, InterruptedException 
  {
	  System.out.println("Remote session intialized!");
	  
	  URL url=new URL("http://localhost:4444/");
	  ChromeOptions option=new ChromeOptions();
	  
	  WebDriver driver=new RemoteWebDriver(url,option);
	  
	  System.out.println("Remote session Created!");
	  
	  Thread.sleep(6000);
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(10000);
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  
	  System.out.println("title is: "+driver.getTitle());
	  
	  driver.quit();

	  
	  
  }
}
