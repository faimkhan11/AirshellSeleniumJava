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
	   
	   @FindBy(xpath = "//*[@class=\"btn btn-info mb1\"]")
	   WebElement viewbtn;
	   
	   public void clkviewbtn()
	   {
		   viewbtn.click();
		   
	   }
	   
	   @FindBy(xpath = "//*[@class=\"td-padding\"]")
	    WebElement title;
	   
	   public void verifytitle()
	   {
		   if (title.getText().equals("Order confirmation"))
		   {
			   System.out.println("Test Case Passed: User is successfully landed to Order Confirmation page");
		   }
		   else
		   {
			   System.out.println("Test case Failed");
		   }
	   }
	   
	 
	   
	   
	   
	   
	   
 

}
