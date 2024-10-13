package com.TestNGFramework.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageUsingBy
{
	//Encapsulation=data+function
	
	WebDriver driver;
	public LoginPageUsingBy(WebDriver driver)//base class driver
	{
		this.driver=driver;
	}
	
	//Locator-element
	By email=By.id("email-id");
	By password=By.id("password");
	By checkbox=By.id("remember");
	By submitbtn=By.id("submit-id");
	
	//Method-action
	public void enterEmail(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	
	public void enterPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void checkCheckBox()
	{
		driver.findElement(checkbox).click();
	}
	
	public void clickSubmitButton()
	{
		driver.findElement(submitbtn).click();
	}
	
	
	public void doLogin(String em,String psw) {
		driver.findElement(email).sendKeys(em);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(checkbox).click();
		driver.findElement(submitbtn).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	

}
