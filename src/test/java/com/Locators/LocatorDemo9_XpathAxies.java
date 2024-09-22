package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathAxies {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=sdasd&submit-name=");

		//ancestor for John
    String tag1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
	System.out.println("Ancestor for John is: "+tag1);
	
	//parent of John
     String tag2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
     System.out.println("Parent of John is: "+tag2);
     
     //get the all childs count for row 4
     
     int count=driver.findElements(By.xpath("//tbody//tr[4]//child::td")).size();
     System.out.println("Total childs for row 4 are: "+count);
     
     //get all the following element count for John
     int allEle=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
     System.out.println("All Following elements for John are: "+allEle);//13
     
     //get the all previous element count for John
int allpele=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
System.out.println("All the previous elements are: "+allpele);//16

//get the all previous siblings count
int countps=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
System.out.println("Total Preceding siblings for John: "+ countps);//1

//get the all following siblings count
int countfs=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
System.out.println("Total Following siblings for John: "+ countfs);//3







     
     
     
     
     
     
		
		
		
	}

}
