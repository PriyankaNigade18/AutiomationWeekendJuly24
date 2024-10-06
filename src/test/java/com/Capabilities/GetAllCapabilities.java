package com.Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllCapabilities {
  @Test
  public void chromeCapability()
  {
	  
	  
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> map=cap.asMap();
	  System.out.println(map);
	  
	  /*
	   * {acceptInsecureCerts=false, 
	   * browserName=chrome, 
	   * browserVersion=129.0.6668.90, 
	   * chrome={chromedriverVersion=129.0.6668.89
	   *  (951c0b97221f8d4ba37cf97d324505c832251cf9-refs/branch-heads/6668@{#1503}),
	   *   userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir10580_763030871},
	   *    fedcm:accounts=true, 
	   *    goog:chromeOptions={debuggerAddress=localhost:54276},
	   *     networkConnectionEnabled=false, 
	   *     pageLoadStrategy=normal, 
	   *     platformName=windows, 
	   *     proxy=Proxy(),
	   *      se:cdp=ws://localhost:54276/devtools/browser/bea55eee-d07b-48b4-9d31-034849e85505, 
	   *      se:cdpVersion=129.0.6668.90, 
	   *      setWindowRect=true, s
	   *      trictFileInteractability=false,
	   *       timeouts={implicit=0, pageLoad=300000, script=30000},
	   *        unhandledPromptBehavior=dismiss and notify, 
	   *        webauthn:extension:credBlob=true, 
	   *        webauthn:extension:largeBlob=true, 
	   *        webauthn:extension:minPinLength=true,
	   *         webauthn:extension:prf=true, webauthn:virtualAuthenticators=true}

	   */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
