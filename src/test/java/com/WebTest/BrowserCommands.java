package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		
		//open application
		driver.get("https://www.automationplayground.com/crm/login.html");
		
		//title of application
		System.out.println("Title is: "+driver.getTitle());
		
		//current url of page
		System.out.println("Current Url is:"+driver.getCurrentUrl());		
		
		//to get page source
		System.out.println(driver.getPageSource());
		
		//close the browser
		driver.quit();
		

	}

}
