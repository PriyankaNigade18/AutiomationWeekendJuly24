package com.WebElementHandlingDay_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1 {
  @Test
  public void testAlert() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //submit click-->alert
	  driver.findElement(By.name("proceed")).click();
	  Thread.sleep(2000);
	  
	  //alert message
	  /*
	   * If alert is not handled then  selenium throws this exception
	   * 
	   * UnhandledAlertException: unexpected alert open: {Alert text : Please enter a valid user name}
	   */
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert message: "+alt1.getText());
	  alt1.accept();
	  
	  
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  
  }
}
