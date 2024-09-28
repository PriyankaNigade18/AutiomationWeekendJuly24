package com.Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		  Select dd=new Select(ele);
		List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}

}
