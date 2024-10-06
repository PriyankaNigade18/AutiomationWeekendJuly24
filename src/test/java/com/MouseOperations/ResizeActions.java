package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeActions {
  @Test
  public void testResize() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //ele
	  WebElement ele=driver.findElement(By.className("ui-icon"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).dragAndDropBy(ele,100,50).build().perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
