package com.w2a.testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class orangehrmParameters {
	WebDriver driver;
	String driverPath="C:/usb/";
   // String browURL="http://opensource.demo.orangehrmlive.com/";
  @BeforeTest
  @Parameters({"browsername","browURL"})
  public void setUP(@Optional("") String browser,String Url ) {
	  if(browser.equalsIgnoreCase("firefox")){
		  System.out.println("browser passed as :- " + browser);
		  System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get(Url);
		  driver.manage().window().maximize();
	  }
	  else if(browser.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		  ChromeOptions chropt=new ChromeOptions();
		  chropt.addArguments("--start-maximized");
		  driver=new ChromeDriver(chropt);
		  driver.get(Url);
	  }
	  else {
		  System.out.println("Invalid browser option by default chrome will open");
		  System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		  ChromeOptions chropt=new ChromeOptions();
		  chropt.addArguments("--start-maximized");
		  driver=new ChromeDriver(chropt);
		  driver.get(Url);
	  }
	 
  }
 @Test
 @Parameters({"userid","password"})
  public void loginhrmlive(String uid,String pwd) {
	WebElement wel=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	wel.sendKeys(uid);
	WebElement pss=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	pss.sendKeys(pwd); 
	WebElement logbutt=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	logbutt.click();
  }
  @AfterTest
  public void afterMethod() {
	  driver.quit();
  }


}
