package com.TestNGFramework.PageObjectUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//encapsulation =private data + public method
	
	private WebDriver driver;
	
	//Initialize  driver object
	public LoginPage(WebDriver driver)//driver is from base class
	{
		this.driver=driver;
	}
	
	//Locators
	
	private By usern=By.name("username");
	private By pass=By.name("password");
	private By loginbtn=By.xpath("//button[@type='submit']");
	
	//Actions
	public void enterUserName(String un)
	{
		driver.findElement(usern).sendKeys(un);
	}
	
	public void enterPassword(String psw)
	{
		driver.findElement(pass).sendKeys(psw);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginbtn).click();
	}
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(usern).sendKeys(un);
		driver.findElement(pass).sendKeys(psw);
		driver.findElement(loginbtn).click();
		
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	

}
