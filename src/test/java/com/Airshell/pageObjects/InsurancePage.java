package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage {
	//Constructor for all test cases
	
		WebDriver lriver;
		
		public InsurancePage(WebDriver rdriver)
	    {
		 lriver=rdriver;
	  	 PageFactory.initElements(rdriver, this);
	  	}
		
		

}
