package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	
	//Constructor for all test cases
	
		WebDriver lriver;
		
		public  ProductPage(WebDriver rdriver)
	    {
	  	  lriver=rdriver;
	  	  PageFactory.initElements(rdriver, this);
	  	  
	    }
		
		
		@FindBy(xpath = "//div[@class='col s12 section href-underline']//div[1]//div[1]//div[1]//button[1]")
		WebElement booknowbtn ;
		
		public void clkbooknowbtn() throws InterruptedException
		{
			booknowbtn.click();
			Thread.sleep(3000);
		}
	
	
	
	
	
}
