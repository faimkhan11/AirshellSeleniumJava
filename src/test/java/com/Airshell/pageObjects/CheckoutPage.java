package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	
	
	   
	   //Constructor for all test cases
	
		WebDriver lriver;
		
		public  CheckoutPage(WebDriver rdriver)
	    {
		 lriver=rdriver;
	  	 PageFactory.initElements(rdriver, this);
	  	}
		
		
		//First Name
		@FindBy(id="input-payment-firstname")
		WebElement firstname;
		
		public void enterfirstname(String firstNam)
		{
			firstname.sendKeys(firstNam);
		}
		
		//Last Name
		@FindBy(id="input-payment-lastname")
		WebElement lastname;
		
		public void enterlastname(String lastName)
		{
			lastname.sendKeys(lastName);
		}
		
		
		//Email
		@FindBy(id="input-payment-email")
		WebElement email;
		
		public void enteremail (String enterEamil)
		{
			email.sendKeys(enterEamil);
		}
		
		
		//Select Country Code
		@FindBy(id="country_code_picker")
		WebElement countrycode;
				
	    public void slectcuntry()
	    {
		 Select Country = new Select(countrycode);
		 Country.selectByValue("45");
				 
	    }	    
	    
				
		//Telephone
		@FindBy(id="input-payment-telephone")
		WebElement telephone ;
				
	    public void entertelephone (String number )
	    {
		telephone.sendKeys(number);
	    }
				
	    
	    
		//Address
		@FindBy(id="input-payment-address-1")
		WebElement address;
				
	    public void enteraddress(String Address)
	    {
	    	address.sendKeys(Address);
	    }
				       

		//PostCode
		@FindBy(id="input-payment-postcode")
		WebElement postcode ;
				
	    public void enterpostcode(String postCode )
	    {
	    	postcode.sendKeys(postCode);
	    }	    
		

		//City
		@FindBy(id="input-payment-city")
		WebElement city;
				
	    public void entercity(String City )
	    {
	    	city.sendKeys(City);
	    }	    
	
	    
		//Country
		@FindBy(id="input-payment-country")
		WebElement country ;
				
	    public void entercountry()
	    {
	    	Select Country = new Select(country);
	    	Country.selectByValue("57");
	    }		
	    
		//City
	    @FindBy (xpath = "//*[@class=\"btn waves-effect waves-light btn-confirm btn-large right button-register\"]")
		WebElement cntinue;
				
	    public void clkcntinue ()
	    {
	    	cntinue.click();
	    }
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
