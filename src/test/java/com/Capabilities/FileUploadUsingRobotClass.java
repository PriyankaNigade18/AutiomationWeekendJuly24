package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;

public class FileUploadUsingRobotClass {
  @Test
  public void testUpload() throws AWTException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose file click
	  WebElement chooseFile=driver.findElement(By.id("file-upload"));
	  
	  Actions act=new Actions(driver);
	  act.click(chooseFile).perform();
	 
	  //clipboard copy ctrl+c
	  Robot rb=new Robot();
	  rb.delay(5000);
	  
	  //clipboard step
	  StringSelection sc=new StringSelection("C:\\Users\\Ganes\\OneDrive\\Desktop\\Api Testing.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //ctrl+v
	  
	  //keypress
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //key release
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V); 
	  
	  //press enter key
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  //click on upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  

	  
	  
	  
  }
}
