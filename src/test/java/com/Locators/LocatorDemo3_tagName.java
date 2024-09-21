package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorDemo3_tagName {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		//Number of Input boxes
		List<WebElement> allInputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Number of input boxes are: "+allInputBoxes.size());
		
		//Number of Images
		int totalImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images are: "+totalImages);
		
		
		//Number of link on the page
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		
		String exp="https://twitter.com/orangehrm?lang=en";
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			if(i.getAttribute("href").contains(exp))
			{
				System.out.println("Link Found...Test Pass");
				break;
			}
		}
		
		
		
		
		
		
		
		

	}

}
