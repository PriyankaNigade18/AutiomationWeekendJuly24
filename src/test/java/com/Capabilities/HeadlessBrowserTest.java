package com.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserTest {
  @Test
  public void testHeadless()
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless=old");
	  
	  System.out.println("Creating driver session....");
	  WebDriver driver=new ChromeDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Driver session is created....");
	  driver.get("https://www.google.com");
	  System.out.println("Application open....");
	  
	  System.out.println("Title is: "+driver.getTitle());
	  
	
	  driver.findElement(By.name("q")).sendKeys("testng");
	  System.out.println("Searched for TestNG.....");
	  
	  System.out.println("List of suggestions are:");
	  
	  List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	  
	  for(WebElement i:list)
	  {
		  
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
  }
  
}
