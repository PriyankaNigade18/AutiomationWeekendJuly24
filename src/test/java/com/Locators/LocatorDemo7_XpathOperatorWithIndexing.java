package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathOperatorWithIndexing {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//fname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Krishna");
		
		
		//lname- and operator
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Shinde");
		
		//email- or operator
		driver.findElement(By.xpath("//input[@name='email' or @class='abcd']")).sendKeys("krishna@gmail.com");
		
		//telephone using indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("87765544");
		
		//passsword with indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		
		//yes radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//for register message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println("Confirmation message: "+text);

	}

}
