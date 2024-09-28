package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AmazonDropdownAutomation {
  @Test
  public void testDropdown() throws InterruptedException
  {
	  //Create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //get the address of dropdown
	  WebElement ddele=driver.findElement(By.name("url"));
	  Utility.selectBasedDropdown(ddele,"Pet Supplies");
	  
	  
	  
	  
	  /*
	  //create an object for Select class
	  Select sc=new Select(ddele);
	  System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
	  
	  //single select
	  sc.selectByIndex(3);//fashion
	  Thread.sleep(2000);
	  sc.selectByVisibleText("Health & Personal Care");
	  Thread.sleep(2000);
	  sc.selectByValue("search-alias=gift-cards");
	  
	  
	  //To get all the options
	  List<WebElement> allOptions=sc.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  	for(WebElement i:allOptions)
	  	{
	  		System.out.println(i.getText());
	  		if(i.getText().contains("Video Games"))
	  		{
	  			System.out.println("Option found!");
	  			i.click();
	  			break;
	  		}
	  	}
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
