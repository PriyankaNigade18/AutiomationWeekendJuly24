package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args)
	{
		//create a driver session for chrome
		WebDriver driver1=new ChromeDriver();
		
		//create driver session with firefox
		WebDriver driver2=new FirefoxDriver();
		
		//create driver session with edge
		WebDriver driver3=new EdgeDriver();
		
		
		

	}

}
