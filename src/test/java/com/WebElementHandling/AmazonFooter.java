package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonFooter {
  @Test
  public void footerTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in");
	  
	  //footer list
	  List<WebElement> footerlist=driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol')]//ul//li"));
	  System.out.println("Total Footer links: "+footerlist.size());
	  
	  
	  for(WebElement i:footerlist)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
