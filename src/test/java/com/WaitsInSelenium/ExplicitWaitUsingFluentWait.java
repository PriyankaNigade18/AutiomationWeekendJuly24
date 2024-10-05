package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;



public class ExplicitWaitUsingFluentWait {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	    
	  By ele1=By.xpath("//button[text()='Start']");
	  By ele2=By.xpath("(//h4)[2]");
	  
	  
	  driver.findElement(ele1).click();
	  
	  Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofSeconds(2))
		            .ignoring(NoSuchElementException.class);
	  
	  String text=wait.until(ExpectedConditions.visibilityOfElementLocated(ele2)).getText();
	  
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
