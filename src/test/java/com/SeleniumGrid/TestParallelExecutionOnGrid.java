package com.SeleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestParallelExecutionOnGrid
{
	WebDriver driver;
	
@Parameters({"bname"})
  @Test
  public void testGoogle(String bname) throws MalformedURLException, InterruptedException
  {
	  if(bname.equals("chrome"))
	  {
		  URL url=new URL("http://localhost:4444/");
		  ChromeOptions option=new ChromeOptions();
		  
		  driver=new RemoteWebDriver(url,option);
	  }else if(bname.equals("edge"))
	  {
		  URL url=new URL("http://localhost:4444/");
		 EdgeOptions option=new EdgeOptions();
		  
		  driver=new RemoteWebDriver(url,option);
	  }else if(bname.equals("firefox"))
	  {
		  URL url=new URL("http://localhost:4444/");
		  FirefoxOptions option=new FirefoxOptions();
		  
		  driver=new RemoteWebDriver(url,option);
	  }
	  
	  
	  System.out.println("Remote session Created!");
	  
	  Thread.sleep(6000);
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(10000);
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  
	  System.out.println("title is: "+driver.getTitle());
	  
	  driver.quit();
  }
}
