package com.w2a.utilities;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import com.w2a.variables.*;
public class Brokenlinks {
	public static String lobj=null,lobval=null,browname=null;
	public static List<WebElement> alllinks=new ArrayList<WebElement>();
	
	public static void findbrokenlinks(String Url) throws InterruptedException, IOException {
	//HttpURLConnection class has method to send HTTP request and
	// capture Http response code so out put of openConnection () 
	// method (URLConnection) is type casted to HttpURLconnection
		HttpURLConnection httpcon=null;
		int responsecode=200;
		commonfun.openbrowsers("",Url);
		//Url=constant.baseUrllog;
		Thread.sleep(2000);
		lobj="tagName";
		lobval="a";
		alllinks=findElements.getmultiElements(lobj,lobval);
		for(WebElement elem:alllinks) {
			String url=elem.getAttribute("href");
		if(constant.isvalidURL(url)!=0) {
			//System.out.println("The valid url name:"+url);
				 // check the URL belongs to main domain or third party.If its a external link no need to check	
				// if(url.startsWith(Url)) {
					// System.out.println("inside the 2nd if condition");
					 httpcon=(HttpURLConnection)(new URL(url).openConnection());
					 httpcon.setRequestMethod("GET");
					 httpcon.connect();
					 responsecode=httpcon.getResponseCode();
					 if(responsecode>=400) {
						 System.out.println("This link:"+" "+url+" "+"is broken");
					 }
					 else {
						 System.out.println("This link:"+" "+url+" "+"is valid"); 
					 }
					 
				 }
			}
		//}
		
	}
	
}// end of class
