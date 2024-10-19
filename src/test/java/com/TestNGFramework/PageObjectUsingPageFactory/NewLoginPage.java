package com.TestNGFramework.PageObjectUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPage
{

	
	private WebDriver driver;
	
	public NewLoginPage(WebDriver driver)//baseclass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//locator
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	//Actions
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
		public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
