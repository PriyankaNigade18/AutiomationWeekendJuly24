package com.WebElementHandlingDay_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo1 {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  int count=driver.findElements(By.tagName("frame")).size();
	  System.out.println("Total Frames are: "+count);//5
	  
	  //frame 1 with index
	  driver.switchTo().frame(0);
	  driver.findElement(By.name("mytext1")).sendKeys("Frame1 Handled!");
	  
	  //come to the Main page
	  driver.switchTo().defaultContent();
	  
	  //frame 2 with webelement
	  WebElement fele=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  
	  driver.switchTo().frame(fele);
	  
	  driver.findElement(By.name("mytext2")).sendKeys("Frame2 handled!");
	  
	  //come to the main document
	  driver.switchTo().defaultContent();
	  
	  //frame 3 with index
	  
	  WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  
	  driver.switchTo().frame(frame3);
	  
	  driver.findElement(By.name("mytext3")).sendKeys("Frame3 handled!");
	  
	  //switch to inner frame
	  WebElement iframe=driver.findElement(By.tagName("iframe"));
	  driver.switchTo().frame(iframe);
	  
	  //click on radio button
	  driver.findElement(By.xpath("//div[@id='i8']")).click();
	  
	  
	  
	  
	  
  }
}
