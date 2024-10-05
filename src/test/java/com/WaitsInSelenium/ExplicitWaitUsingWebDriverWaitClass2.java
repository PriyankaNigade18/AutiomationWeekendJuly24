package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitUsingWebDriverWaitClass2 
{
	
	public static WebElement presenceOfElement(WebDriver driver,By loc,int duration)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
		  return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		  
	}
	
	
  @Test
  public void example1()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  
	  By ele1=By.xpath("//button[text()='Start']");
	  By ele2=By.xpath("(//h4)[2]");
	  
	  driver.findElement(ele1).click();
	  //wait for text elee
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//	  WebElement textele=wait.until(ExpectedConditions.presenceOfElementLocated(ele2));
//	  
	  WebElement textele=presenceOfElement(driver,ele2,5);
	  
	  //String text=driver.findElement(ele2).getText();
	  String text=textele.getText();
	  System.out.println("Text is: "+text);
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
