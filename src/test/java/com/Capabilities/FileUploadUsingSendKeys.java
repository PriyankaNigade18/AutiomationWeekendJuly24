package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadUsingSendKeys {
  @Test
  public void testUpload()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  String path="C:\\Users\\Ganes\\OneDrive\\Desktop\\API Testing.txt";
	  driver.findElement(By.id("file-upload")).sendKeys(path);
	  
	  driver.findElement(By.id("file-submit")).click();
	  
	  
	  
  }
}
