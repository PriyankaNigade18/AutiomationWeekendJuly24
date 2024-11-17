package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CrmHooks 
{
	public WebDriver driver;

	@Before
	public void setUp()
	{
		System.out.println("Driver Session Initialized....");
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
	}
	
	
	@After
	public void tearDown()
	{
		System.out.println("Driver session Closed.....");
		driver.quit();
	}
}
