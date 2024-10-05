package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void example1()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators
	  By ele1=By.id("input-email");
	  By ele2=By.id("input-password");
	  By ele3=By.xpath("//input[@value='Login']");
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for visibility of element located by 
	   * By.id: input-email### 
	   * (tried for 5 second(s) with 500 milliseconds interval)
	   * Interval time/Polling time=0.5 sec -->500msc
	   */
	  
	 //wait for 5 sec till email id visible into dom then pass email id
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement emailele= wait.until(ExpectedConditions.visibilityOfElementLocated(ele1));
	  
	 emailele.sendKeys("test@gamil.com");
	 
	  //wait for 5 sec till pass is present in Dom
	 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement passEle=wait2.until(ExpectedConditions.presenceOfElementLocated(ele2));
	  
	 
	 passEle.sendKeys("test123");
	 
	 //wait 5 sec for button based on button is clickable
	 
	 WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement loginbtn=wait3.until(ExpectedConditions.elementToBeClickable(ele3));
	 
	 loginbtn.click();
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
