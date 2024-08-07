package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    //Constructor for all test cases
	
	WebDriver lriver;
	
	public  HomePage(WebDriver rdriver)
    {
	 lriver=rdriver;
  	 PageFactory.initElements(rdriver, this);
  	}
	
	
	//CLick on Alert button
	@FindBy(id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
	WebElement alertBtn;
	
	
	public void clkalertbtn() throws InterruptedException
	{
		alertBtn.click();
		Thread.sleep(2000);
	
	}
	
	
	
	@FindBy(linkText = "account_circle")
	WebElement signInbtn;
	
	public void clksignInbtn()
	{
		signInbtn.click();
	}
	
	
	@FindBy(linkText = "Products")
	WebElement productbt;
	
	public void clkproductbtn()
	{
		productbt.click();
		
	}
	
	
	
	
	

}

