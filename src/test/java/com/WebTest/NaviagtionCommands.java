package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagtionCommands 
{

public static void main(String args[]) throws InterruptedException
{
	
	//create a driver session
	WebDriver driver=new ChromeDriver();
	
	//Google
	driver.get("https://www.google.com");
	System.out.println("Title is: "+driver.getTitle());
	
	//facebook
	driver.navigate().to("https://www.facebook.com");
	System.out.println("Title is: "+driver.getTitle());
	
	//static wait in Selenium
	Thread.sleep(2000);
	
	//back()
	driver.navigate().back();//google
	
	Thread.sleep(2000);
	
	//forward
	driver.navigate().forward();//facebook
	
	Thread.sleep(2000);
	
	//refresh
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
