package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//signIn is link by linkText/partialLinkText
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("In")).click();
		
		//email by id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password by name
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox by id
		driver.findElement(By.id("remember")).click();
		
		//submit by id
		driver.findElement(By.id("submit-id")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
