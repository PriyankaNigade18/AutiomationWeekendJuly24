package com.Capabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownLoadTest {
  @Test
  public void testFileDownload() 
  {
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	 String path="C:\\Users\\Ganes\\OneDrive\\Desktop\\Learning\\AutomationJuly2024\\MavenSimple\\Downloads";
	  prefs.put("download.default_directory",path);
	  options.setExperimentalOption("prefs", prefs);
	  
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  //file address
	  driver.findElement(By.linkText("myfile.pdf")).click();
	  
	  
	  
  }
}
