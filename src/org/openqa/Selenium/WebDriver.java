package org.openqa.Selenium;

public interface WebDriver extends SearchContext
 {

	
	
	void get(String url);
	String getTitle();
	String getCurrentUrl();
}
