package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	 private WebDriver driver;
	 
	 public CartPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath="//div[@class='cart_item_label']")
	 WebElement details;
	 
	 @FindBy(xpath="//button[text()='Remove']")
	 WebElement removeBtn;
	 
	 @FindBy(id="continue-shopping")
	 WebElement contBtn;
	 
	 @FindBy(id="checkout")
	 WebElement checkBtn;
	 
	 @FindBy(xpath="//div[@class='inventory_item_name']")
	 WebElement pname;
	 
	 public void getAddedProductDetails()
	 {
		 System.out.println(details.getText());
	 }
	 
	 public void removeProduct()
	 {
		 String name=pname.getText();
		 removeBtn.click();
		 System.out.println("Product Removed from cart: "+name);
	 }
	 
	 public InventoryPage doContinueShopping()
	 {
		 contBtn.click();
		 return new InventoryPage(driver);
	 }
	 
	 public CheckoutPage openCheckOutPage()
	 {
		 checkBtn.click();
		 return new CheckoutPage();
	 }
	 
	 
}
