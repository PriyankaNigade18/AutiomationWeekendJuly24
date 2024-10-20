package com.SwagLab.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseTest;

public class InventoryPageTest extends BaseTest
{
	
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
	}
	
  @Test(priority=1)
  public void validateProductCount()
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count,6);
	  System.out.println("Product count matched!...Total Products are:"+count);
  }
  
  @Test(priority=2)
  public void validateProductDetails()
  {
	  ip.getProductDetails();
  }
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  ip.addProducttoCart("Sauce Labs Backpack");
	  
  }
  
  @Test(priority=4)
  public void validateLaunchOfCartPage()
  {
	  ip.openCartPage();
  }
}
