package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariTotalLinkScenario {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are: "+allLinks.size());
		
		String exp="https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch";
		
		for(WebElement i: allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			try {
			if(i.getAttribute("href").contains(exp))
			{
				System.out.println("Link found.....Test Pass");
				break;
			}
			}catch(NullPointerException n)
			{
			System.out.println("href object is Null");	
			}
		}
			
		
		
		
		
		
		
		
		
		

	}

}
