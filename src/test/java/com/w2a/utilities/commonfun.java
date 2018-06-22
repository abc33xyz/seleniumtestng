package com.w2a.utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.w2a.variables.constant;

public class commonfun {
	public static void openbrowsers(String browname,String url) throws InterruptedException {
		   if (browname.equalsIgnoreCase("firefox")) {
				System.out.println("Launching Firefox browser..");
				System.setProperty("webdriver.gecko.driver",constant.driverPath+"geckodriver.exe"); 
				constant.driver = new FirefoxDriver();
				constant.driver.navigate().to(url);
				Thread.sleep(3000);
				constant.driver.manage().window().maximize();
			   }
			   else if(browname.equalsIgnoreCase("chrome")) {
				    System.out.println("Launching google chrome with new profile..");
					System.setProperty("webdriver.chrome.driver",constant.driverPath+"chromedriver.exe");
					constant.chropt.addArguments("--start-maximized");
					constant.driver = new ChromeDriver(constant.chropt);
					constant.driver.navigate().to(url);	
					Thread.sleep(3000);
				}
				else if(browname.equalsIgnoreCase("ie"))
				{
					
					System.out.println("Launching IE browser..");
					constant.options= new InternetExplorerOptions();
					/* 
					 options.setCapability(InternetExplorerDriver.
				 INITIAL_BROWSER_URL,”http://URLyouwanttoset"); 
				 otherwise you will get "This is the initial start page for the WebDriver server"
				 options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					 options.setCapability("ignoreProtectedModeSettings", true);
						options.setCapability("nativeEvents", false);
						options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
				// protected mode setting is not working through optios set through tools
					// all 4 zone will be protected  
					 
					 options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
					 */
					constant.options.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,url);
					//make sure that your zoom is set up to 100%
					constant.options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				    System.setProperty("webdriver.ie.driver",constant.driverPath+"IEDriverServer.exe");
				    constant.driver = new InternetExplorerDriver(constant.options);
					//public InternetExplorerDriver(InternetExplorerOptions options)
				    constant.driver.manage().window().maximize();
				    constant.driver.navigate().to(url);
					Thread.sleep(3000);
				}
				else {
				
					System.out.println("Launching google chrome with new profile..");
					System.setProperty("webdriver.chrome.driver",constant.driverPath+"chromedriver.exe");
					constant.chropt.addArguments("--start-maximized");
					constant.driver = new ChromeDriver(constant.chropt);
					constant.driver.navigate().to(url);	
					Thread.sleep(3000);
				}
			    	
		}// end of browser open function
	// to open a web page file for test you can test file before it deployed in web
	public static void openwebfile(String browname,String fnm) throws InterruptedException {
		switch(browname.toLowerCase()) {
		case "firefox":
			System.out.println("Launching Firefox browser..");
	 		System.setProperty("webdriver.gecko.driver",constant.driverPath+"geckodriver.exe"); 
	 		constant.driver = new FirefoxDriver();
	 		constant.driver.get(fnm);
	 		Thread.sleep(3000);
	 		constant.driver.manage().window().maximize();
	 	break;
		case "chrome":
			System.out.println("Launching google chrome with new profile..");
			System.setProperty("webdriver.chrome.driver",constant.driverPath+"chromedriver.exe");
			constant.chropt.addArguments("--start-maximized");
			constant.driver = new ChromeDriver(constant.chropt);
			constant.driver.get(fnm);
	 		Thread.sleep(3000);
	 		
	 	break;
	 	default :
	 		// default browser is chrome
	 		System.out.println("Launching google chrome with new profile..");
			System.setProperty("webdriver.chrome.driver",constant.driverPath+"chromedriver.exe");
			constant.chropt.addArguments("--start-maximized");
			constant.driver = new ChromeDriver(constant.chropt);
			constant.driver.get(fnm);
	 		Thread.sleep(3000);
	 			
		}
	}
}
