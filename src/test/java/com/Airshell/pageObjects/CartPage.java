package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	        //Constructor for all test cases
	
			WebDriver ldriver;
			
			public  CartPage(WebDriver rdriver)
		    {
			 ldriver=rdriver;
		  	 PageFactory.initElements(rdriver, this);
		  	}
			
			
			@FindBy(xpath = "//*[@id=\"menu-cart\"]")
			WebElement carticon;
			
			public void clkcarticon()
			{
				carticon.click();
			}
			
			
			@FindBy(xpath = "//*[@class=\"material-icons waves-effect waves-circle input-quantity-plus\"]")
			WebElement plusbtn;
			
			public void clkplusbtn()
			{
				Actions dbl = new Actions(ldriver);
				dbl.doubleClick(plusbtn).perform();
				
			}
			
			
			@FindBy(xpath = "//*[@id=\"input-quantity\"]")
			WebElement beforequantity;
			
			public void printbebeforequantity()
			{
				System.out.println("Quantity of the product before increasing the count"+ " "+beforequantity.getText());
				
			}
			
			@FindBy(xpath = "//*[@id=\"input-quantity\"]")
			WebElement afterquantity;
			
			public void printafterquantity()
			{
				System.out.println("Quantity of the product after increasing the count"+ " "+afterquantity.getText());
				
			}
			
			
			

}
