package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_CssSelectorSpecialCharacters {

	public static void main(String[] args) {
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email with *contains partial match
		driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("sumit11@gmail.com");
		
		//pass using ^StartsWith(prefix)
		driver.findElement(By.cssSelector("input[placeholder ^='Pass']")).sendKeys("test123");
		
		//login using $endsWith(suffix)
		driver.findElement(By.cssSelector("input[class $='primary']")).click();
		
		
		
		
				
	}

}
