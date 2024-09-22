package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo10_RelativeLocators {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//email is above password
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test@gmail.com");
		
		//get the password is below email id
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		//click on checkbox which is near text Remember me
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
	
		//click on submit which is below that checkbox
		driver.findElement(RelativeLocator.with(By.id("submit-id")).below(By.id("remember"))).click();

	}

}
