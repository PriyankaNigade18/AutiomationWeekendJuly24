package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args)
	{

		 //create a driver session
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//login
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		driver.findElement(By.className("oxd-button")).click();
		
	}

}
