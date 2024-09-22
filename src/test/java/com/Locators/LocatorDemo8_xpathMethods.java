package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_xpathMethods {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//bestSellers- text()
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		String text1=driver.findElement(By.xpath("//span[text()='Amazon Bestsellers']")).getText();
		System.out.println(text1);
		
		//open cart page- normalize-sapce()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		//get the cart message- contains()
		String text2=driver.findElement(By.xpath("//h2[contains(normalize-space(),'Cart')]")).getText();
		System.out.println(text2);
		
		//search box-contains
		driver.findElement(By.xpath("//input[contains(@id,'tabsearch')]")).sendKeys("watch",Keys.ENTER);
				
		//clear the result and search for bags- starts-with()
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		ele.clear();
		ele.sendKeys("bags",Keys.ENTER);
		
		
		
		
		
		

	}

}
