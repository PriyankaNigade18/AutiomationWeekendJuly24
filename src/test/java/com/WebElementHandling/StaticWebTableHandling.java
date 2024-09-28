package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebTableHandling {
  @Test
  public void testTable()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //table
	  System.out.println("*********1.Get all the headings**********");
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
	  System.out.println("Total Headings are : "+headings.size());
	  
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*********2.Get Total Number of Rows**********");
	  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Total Rows are: "+rows);//7
	  
	  System.out.println("*********3.Get Total Number of Columns**********");
	  //row-->columns
	  int cells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	  System.out.println("Total Columns are: "+cells);//4

	  System.out.println("*********4.Get Specific Row data**********");
	  //row number 5 
	  List<WebElement> rowdata=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td"));
	  for(WebElement i:rowdata)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("*********5.Get Specific column data**********");

	  List<WebElement> columndata=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[3]"));
	  for(WebElement i:columndata)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*********6.Get all data**********");
	  List<WebElement> allData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
	  for(WebElement i:allData)
	  {
		  System.out.println(i.getText());
	  }
	  
  }
  
  
  
  
  
}
