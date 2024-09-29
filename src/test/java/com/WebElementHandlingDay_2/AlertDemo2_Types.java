package com.WebElementHandlingDay_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertDemo2_Types {
  @Test
  public void testAlerts() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  //alert1- Basic Alert
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  //alert window open
	  Thread.sleep(1500);
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  alt1.accept();
	  
	  WebElement result=driver.findElement(By.id("result"));
	  System.out.println("Result of Alert1: "+result.getText());
	  
	  //alert2-confirmation alert
	 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	 Thread.sleep(1500);
	 //alert
	 Alert alt2=driver.switchTo().alert();
	 System.out.println("Alert2 text is: "+alt2.getText());
	 alt2.dismiss();
	  System.out.println("Result of Alert2: "+result.getText());

	 //alert3- Prompt alert
	 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	 
	 //alert open
	 Thread.sleep(1500);
	 Alert alt3=driver.switchTo().alert();
	 System.out.println("Alert3 text is: "+alt3.getText());
	 alt3.sendKeys("Hello All!");
	 alt3.accept();
	 
	 System.out.println("Result of Alert3: "+result.getText());

	  
	  
	  
	  
	  
	  
  }
}
