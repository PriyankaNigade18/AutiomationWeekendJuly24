package com.TestNGFramework.DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo1 
{
	
	
//	@DataProvider(name="mydata")
//	public Object[][] testData()
//	{
//		Object data[][]= {{"Admin","admin123"},{"Rashmi","test123"},{"Sumit","test123"}};
//		return data;
//	}
	
	
  @Test(dataProvider = "mydata",dataProviderClass = CustomData.class)
  public void testLogin(String un,String psw) 
  {
	  System.out.println("UserName is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
