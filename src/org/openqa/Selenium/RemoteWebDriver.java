package org.openqa.Selenium;

public class RemoteWebDriver  implements WebDriver

{

	@Override
	public void findElement() {
		System.out.println("Identifies Single WebElement");
		
	}

	@Override
	public void findElements() {
		System.out.println("FindElements idntify multiple webelements");
	}

	@Override
	public void get(String url) {
		System.out.println("Get() will open Application: "+url);
		
	}

	@Override
	public String getTitle() {

		String title="Application title";
		return title;
	}

	@Override
	public String getCurrentUrl() {
		String url="Application Current url";
		return url;
	}

}
