package com.SwagLab.TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseTest;

public class CartPageTest extends BaseTest

{
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
		ip.addProducttoCart("Sauce Labs Bolt T-Shirt");
		cp=ip.openCartPage();
	}
  @Test(priority=1)
  public void validateAddedProduct() 
  {
	  cp.getAddedProductDetails();
  }
  
  @Test(priority=2)
  public void validateProductRemove() 
  {
	  cp.removeProduct();
  }
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.doContinueShopping();
	  ip.addProducttoCart("Sauce Labs Fleece Jacket");
	  ip.openCartPage();
  }
  
  
  @Test(priority=4)
  public void validateLaunchOfCheckoutPage()
  {
	  cp.openCheckOutPage();
  }
}
