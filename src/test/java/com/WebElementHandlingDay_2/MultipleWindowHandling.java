package com.WebElementHandlingDay_2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindow() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //home page
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //child page
	  Set<String> allWindowId=driver.getWindowHandles();
	  System.out.println(allWindowId);
	  
	  for(String childId:allWindowId)
	  {
		  if(!parentId.equals(childId))//parentid is not equal to child=child page
		  {
			  //driver need to switch to child page
			  driver.switchTo().window(childId);
			  driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  //driver.close();//child page
			  //driver.quit();//close all open pages
			  
		  }
	  }
	 // parent window
	  driver.switchTo().window(parentId);
	  driver.findElement(By.name("username")).sendKeys("Priyanka");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
}
