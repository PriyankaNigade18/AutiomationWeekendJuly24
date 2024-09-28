package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdownAutomation 
{
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		  Select dd=new Select(ele);
		List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
	
	
	
  @Test
  public void testDropdown() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com");
	  
	  
	  //click on create  new account
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day dropdown
	  WebElement day=driver.findElement(By.id("day"));
	  
	  selectBasedDropdown(day,"30");
	  
	  //month dropdown
	  WebElement month=driver.findElement(By.id("month"));
	  selectBasedDropdown(month,"Nov");
	  
	  //year dropdown
	  WebElement year=driver.findElement(By.id("year"));
	  selectBasedDropdown(year,"2010");
	  
	  
	  
//	  Select daydd=new Select(ele1);
//	  System.out.println("Is dropdown support multiple selection?: "+daydd.isMultiple());
//	  
//	  //single selection
//	  daydd.selectByIndex(4);
//	  Thread.sleep(2000);
//	  daydd.selectByValue("8");
//	  Thread.sleep(2000);
//	  daydd.selectByVisibleText("29");
	  
	  //To get all the options
//	  List<WebElement> allOptions=daydd.getOptions();
//	  System.out.println("Total Options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("29"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	 
	  
	 // Select monthdd=new Select(ele2);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
