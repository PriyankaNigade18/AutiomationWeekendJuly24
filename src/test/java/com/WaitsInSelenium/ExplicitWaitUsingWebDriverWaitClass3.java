package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ExplicitWaitUsingWebDriverWaitClass3 
{

	
  @Test
  public void example1()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  
	  By ele1=By.xpath("//button[text()='Start']");
	  By ele2=By.xpath("(//h4)[2]");
	  
	 boolean urlStatus= Utility.waitForUrlContains(driver,"herokuapp", 5);
	 System.out.println("Url contains herokuapp?: "+urlStatus);
	  
	  boolean titleStatus=Utility.waitForTitleContains(driver,"Internet",5);
	  System.out.println("Is title contains Internet?: "+titleStatus);
	  
	  
	  Utility.waitForpresenceOfElement(driver, ele1, 5).click();
	  String text=Utility.waitForVisibilityOfElement(driver, ele2, 5).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
  }
}
