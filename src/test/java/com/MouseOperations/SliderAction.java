package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderAction {
  @Test
  public void testSlider() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //ele
	  WebElement ele=driver.findElement(By.className("ui-slider-handle"));
	  
	  Actions act=new Actions(driver);
	  act.clickAndHold(ele).moveToElement(ele,100,0).build().perform();
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
