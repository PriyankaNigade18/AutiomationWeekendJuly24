package org.openqa.Selenium;

public class GoogleTest {

	public static void main(String[] args)
	{
			//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		driver.findElement();
		driver.findElements();

	}

}
