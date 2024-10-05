package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorScrollScenario
{
  @Test
  public void testScroll() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //javascript ineterface object
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  /*
	  //scroll down
	 // js.executeScript("window.scrollTo(0,2000)");
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(3000);
	  
	  //scroll up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Thread.sleep(3000);
	  */
	  //scroll upto the element
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Starting ₹99 + 20% cashback on first order | Beauty & makeup']"));
	  
	  //scrollInto
	  js.executeScript("arguments[0].scrollIntoView(true)",ele);
	  
	  
	  
  }
}
