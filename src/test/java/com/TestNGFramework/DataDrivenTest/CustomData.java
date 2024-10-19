package com.TestNGFramework.DataDrivenTest;

import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="mydata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Rashmi","test123"},{"Sumit","test123"},{"Admin","admin123"}};
		return data;
	}
}
