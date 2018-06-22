package com.w2a.testcases;
import java.io.IOException;
import com.w2a.utilities.*;
import com.w2a.variables.*;
import org.testng.annotations.*;
public class badweblink {
	   @BeforeTest
	   public void setup() {
		   //sdfsjlf
	   }
	   @Test
	   public void runbadlink() throws InterruptedException, IOException{
		Thread.sleep(2000);
		Brokenlinks.findbrokenlinks(constant.brokenUrl);
		
	   }
	 @AfterTest
	 public void Quit() {
		 constant.driver.quit();
	 }
	}
	

