package com.SwagLab.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseTest;
import com.SwagLab.Utility.Utility;

public class InventoryPageTest extends BaseTest
{
	
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
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
	  ip.addProducttoCart(prop.getData("pname1"));
	  
  }
  
  @Test(priority=4)
  public void validateLaunchOfCartPage()
  {
	  ip.openCartPage();
  }
}
