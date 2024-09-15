package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentificationOfWebElement {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//google
		driver.get("https://www.google.com");
		
		//search box-->type Java
		
		/*Way1:By locator technique
		//first get the address 
		By searchbox=By.id("APjFqb");
		
		//apply method
		WebElement ele=driver.findElement(searchbox);
		
		//validation
		System.out.println("Is search box displayed?: "+ele.isDisplayed());
		System.out.println("Is search box is enabled?: "+ele.isEnabled());
		
		//action 
		ele.sendKeys("java",Keys.ENTER);
		*/
		
		/*way2: identify +validate+performaction
		
		WebElement ele=driver.findElement(By.id("APjFqb"));
		if(ele.isDisplayed() && ele.isEnabled())
		{
			ele.sendKeys("selenium");
		}
		*/
		//way3: Identification + action
		//driver.findElement(By.id("APjFqb")).sendKeys("testng");
		
		driver.findElement(By.name("priyanka")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
