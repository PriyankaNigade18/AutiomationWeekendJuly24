package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationTableScenario
{
  @Test
  public void testWebTable()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("Scenario1: Total pages from the table");
	  List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total Pages are: "+pages.size());
	  
	  for(WebElement i:pages)
	  {
		  System.out.println("Page Number: "+ i.getText());
		//total row data
		  List<WebElement> data=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td"));
		  for(WebElement j:data)
		  {
			  System.out.print(j.getText()+"  ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println("*********************");
	  
//	  //total row data
//	  List<WebElement> data=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td"));
//	  for(WebElement i:data)
//	  {
//		  System.out.println(i.getText());
//	  }
	  System.out.println("selecting specific record");
	  
	  
	for(WebElement i:pages)
	{
		System.out.println("page number: "+i.getText());
		//driver.findElement(By.xpath("//ul[@id='pagination']//li//a[4]")).click();
		if(i.getText().contains("4"))
		{
			i.click();
		driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[2]//td[4]//input")).click();
		
	}}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
