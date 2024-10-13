package com.TestNGFramework.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass
{
	public WebDriver driver;
	public LoginPageUsingBy lp;
	

	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		lp=new LoginPageUsingBy(driver);
		
		
	}
}
