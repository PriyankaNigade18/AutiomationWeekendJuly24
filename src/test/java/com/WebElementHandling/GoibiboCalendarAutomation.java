package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoibiboCalendarAutomation {
  @Test
  public void testCalendar()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.goibibo.com/flights/");
	  driver.manage().window().maximize();
	  
	  //close the popup
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	//open calendar
	  driver.findElement(By.xpath("(//span[contains(@class,'fswDownArrow')])[1]")).click();
	  
	  //Expectation
	  String day="6";
	  String month="April";
	  String year="2025";
	  
	  //month selection
	  while(true)
	  {
		  //get the current month
	  String monthtext=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	  System.out.println(monthtext);
	  
	  String currentmonth=monthtext.split(" ")[0];
	  System.out.println(currentmonth);
	  
	  String currentyear=monthtext.split(" ")[1];
	  System.out.println(currentyear);
	  //compare current month with expected
	  
	  if(currentmonth.contains(month) && currentyear.contains(year))
	  {
		  //if expected month and current month match then go for date selection
		  break;
	  }else
	  {
		  //if not then click on arrow till it match with expected month
		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		  
	  }
	  }
	
	  //date selection
	  
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day']"));
	  System.out.println("Total Dates: "+allDates.size());
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(day))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  

	  
	  
	  
	  
	  
  }
}
