package com.WebElementHandlingDay_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindow_Tab {
  @Test
  public void testNewWindow() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  WebDriver window=driver.switchTo().newWindow(WindowType.WINDOW);
	  window.get("https://www.amazon.in");
	  System.out.println(window.getTitle());
	  
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver tab=driver.switchTo().newWindow(WindowType.TAB);
	  tab.get("https://www.facebook.com");
	  }
	  
//	  String pid=window.getWindowHandle();
//	  window.switchTo().window(pid);
//	  
//	 window.switchTo().newWindow(WindowType.TAB);
//	  window.get("https://www.facebook.com");
	  
	  
	  
  }
}
