package com.MouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickAction {
  @Test
  public void testRightClickAction()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //create object of Actions class
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  //get the menu and click on delete
	  List<WebElement> menu1=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  for(WebElement i:menu1)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //alert handling
	  Alert alt1=driver.switchTo().alert();
	  
	  System.out.println("Alert Text is: "+alt1.getText());
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
