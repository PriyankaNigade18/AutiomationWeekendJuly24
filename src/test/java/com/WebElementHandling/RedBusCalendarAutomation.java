package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusCalendarAutomation {
  @Test
  public void testCalendar()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.redbus.in/");
	  
	  //open calendar
	  driver.findElement(By.xpath("//span[text()='Date']")).click();
	  
	  //Expectation
	  String day="6";
	  String month="Apr";
	  String year="2025";
	  
	  //month selection
	  while(true)
	  {
		  //get the current month
	  String monthtext=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Ic')])[2]")).getText();
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
		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Ic')])[3]")).click();
		  
	  }
	  }
	  
	  //date selection
	  
	  List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'DayTilesWrapper')]//span[contains(@class,'DayTiles__CalendarDays')]"));
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
