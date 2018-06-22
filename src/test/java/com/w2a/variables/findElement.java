package com.w2a.variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findElement {
	public static WebElement getwebelement(String lobj,String lobvalue){
		/*
        find web element(s) By 
        By.id()
        By.name()
        By.className()
        By.tagName().
        By.link() and By.partialLinkText().
        By.cssSelector().
        By.xpath().*/
	   
		WebElement locelem=null;
		if(lobj.equalsIgnoreCase("id")){
			
			 locelem=constant.driver.findElement(By.id(lobvalue));
			 
			      	}
		     else if(lobj.equalsIgnoreCase("name")){
		    	
		        locelem = constant.driver.findElement(By.name(lobvalue));
		      
				}
		     else if((lobj.equalsIgnoreCase("className"))||(lobj.equalsIgnoreCase("class")))
		    	{
		    	
		      locelem=constant.driver.findElement(By.className(lobvalue));
				 }
		     else if((lobj.equalsIgnoreCase("linkText"))||(lobj.equalsIgnoreCase("link")))
		    		 {
		    	
		     locelem=constant.driver.findElement(By.linkText(lobvalue));
				        }  
		     else if(lobj.equalsIgnoreCase("partialLinkText")){
		    	
		     locelem=constant.driver.findElement(By.partialLinkText(lobvalue));
				        }  
		     else if((lobj.equalsIgnoreCase("tagName"))||(lobj.equalsIgnoreCase("tag"))){
		    	
		     locelem=constant.driver.findElement(By.tagName(lobvalue));
				        } 
		     else if((lobj.equalsIgnoreCase("cssSelector"))||(lobj.equalsIgnoreCase("css"))){
		    	
		     locelem=constant.driver.findElement(By.cssSelector(lobvalue));
				        }
		     else if(lobj.equalsIgnoreCase("xpath")){
		    	
		     locelem=constant.driver.findElement(By.xpath(lobvalue));
				        }
			else {
			    System.out.println("Unknown locator:'" +lobj + "'");
			 }
	return locelem;	
	}//end of find element function
}
