package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage 
{
	
       WebDriver lriver;
	
	   public  OrderDetailsPage(WebDriver rdriver)
      {
  	  lriver=rdriver;
  	  PageFactory.initElements(rdriver, this);
  	  
      }
	   
	   @FindBy(xpath = "//h1[@class=\"p0 mg0\"]")
	   WebElement orderID;
	   
	   public void getorderID()
	   {
		   System.out.println(orderID.getText());
		   
	   }
	   
 

}
