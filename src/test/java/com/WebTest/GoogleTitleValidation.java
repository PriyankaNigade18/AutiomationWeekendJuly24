package com.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args)
	{
		//ctrl+shift+O
		
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//Open Google application get(Url)
		driver.get("https://www.google.com");
		
		//Get the title
		String actTitle=driver.getTitle();
		String exp="Google";
		
		//validate 
		if(actTitle.equals(exp))
		{
			System.out.println("Title matched!....Test Pass");
			System.out.println("Current title is: "+actTitle);
		}else
		{
			System.out.println("Title is not matched!....Test Fail");
		}
		
		
		/*
		 * close the browser
		 * close(): Close current active window/browser page
		 * quit(): close all the open windows/browser pages
		 */
		//driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
