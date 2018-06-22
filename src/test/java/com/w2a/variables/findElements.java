package com.w2a.variables;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findElements {
	public static List<WebElement> getmultiElements(String lobj,String lobvalue){
		List<WebElement> locelem=new ArrayList<WebElement>();
		if(lobj.equalsIgnoreCase("id")){
			
			 locelem=constant.driver.findElements(By.id(lobvalue));
			 
			      	}
		     else if(lobj.equalsIgnoreCase("name")){
		    	
		        locelem = constant.driver.findElements(By.name(lobvalue));
		      
				}
		     else if((lobj.equalsIgnoreCase("className"))||(lobj.equalsIgnoreCase("class")))
		    	{
		    	
		      locelem=constant.driver.findElements(By.className(lobvalue));
				 }
		     else if((lobj.equalsIgnoreCase("linkText"))||(lobj.equalsIgnoreCase("link")))
		    		 {
		    	
		     locelem=constant.driver.findElements(By.linkText(lobvalue));
				        }  
		     else if(lobj.equalsIgnoreCase("partialLinkText")){
		    	
		     locelem=constant.driver.findElements(By.partialLinkText(lobvalue));
				        }  
		     else if((lobj.equalsIgnoreCase("tagName"))||(lobj.equalsIgnoreCase("tag"))){
		    	
		     locelem=constant.driver.findElements(By.tagName(lobvalue));
				        } 
		     else if((lobj.equalsIgnoreCase("cssSelector"))||(lobj.equalsIgnoreCase("css"))){
		    	
		     locelem=constant.driver.findElements(By.cssSelector(lobvalue));
				        }
		     else if(lobj.equalsIgnoreCase("xpath")){
		    	
		     locelem=constant.driver.findElements(By.xpath(lobvalue));
				        }
			else {
			    System.out.println("Unknown locator:'" +lobj + "'");
			 }
	return locelem;	
	}//end of find elements function
}
