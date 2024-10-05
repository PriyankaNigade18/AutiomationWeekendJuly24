package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorScenarios {
  @Test
  public void testJavascriptScenario() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  driver.findElement(By.linkText("Best Sellers")).click();
	  
	  //how to refresh the page
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("history.go(0)");
	  
	  //how to get title
	  System.out.println("Title iusing driver:"+driver.getTitle());
	  String title=js.executeScript("return document.title").toString();
	  System.out.println("Title using Javascript:"+title);
	  
	  //how to interact with element using javascript
	  WebElement ele=driver.findElement(By.linkText("Mobiles"));
	  js.executeScript("arguments[0].click()",ele);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
