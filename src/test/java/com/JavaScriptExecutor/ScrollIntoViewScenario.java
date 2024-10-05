package com.JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ScrollIntoViewScenario {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in");
	  
	  Utility.scrollDown(driver);
	  
	  Thread.sleep(3000);
	  
	  Utility.scrollUp(driver);
	  
	  
	  Thread.sleep(3000);
	  
	WebElement ele=driver.findElement(By.xpath("//span[text()='Up to 40% off | Deals on smartphones']"));
	
	Utility.scrollUpToElement(driver,ele);
	
	
	
//	  //javascript ineterface object
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	//scroll upto the element
//	WebElement ele=driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
//	  //WebElement ele=driver.findElement(By.xpath("//span[text()='Up to 40% off | Deals on smartphones']"));
//	  //scrollInto
//	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
  }
}
