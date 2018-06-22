package com.w2a.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.variables.constant;

public class comjsexecfun {
	public static void pageopenjsexec(String browname,String url) throws InterruptedException {
	    String urlstr= "window.location = \'"+url+"\'";
	    if(browname.equalsIgnoreCase("firefox")) {
	    System.out.println("Launching Firefox browser..");  
		System.setProperty("webdriver.gecko.driver",constant.driverPath+"geckodriver.exe"); 
		constant.driver = new FirefoxDriver();
		Thread.sleep(3000);
		((JavascriptExecutor) constant.driver).executeScript(urlstr);
		constant.driver.manage().window().maximize();
	    }
	    else if(browname.equalsIgnoreCase("chrome")) {
	    	System.out.println("Launching google chrome with new profile..");
			System.setProperty("webdriver.chrome.driver",constant.driverPath+"chromedriver.exe");
			constant.chropt.addArguments("--start-maximized");
			constant.driver = new ChromeDriver(constant.chropt);
			constant.js.executeScript(urlstr);
			Thread.sleep(3000);
	    }
	    else {
	    	// default chrome browser
	    	System.out.println("Launching google chrome with new profile..");
			System.setProperty("webdriver.chrome.driver",constant.driverPath+"chromedriver.exe");
			constant.chropt.addArguments("--start-maximized");
			constant.driver = new ChromeDriver(constant.chropt);
		//	constant.js.executeScript(urlstr);
			((JavascriptExecutor) constant.driver).executeScript(urlstr);

			Thread.sleep(3000);
	    }
}
}
