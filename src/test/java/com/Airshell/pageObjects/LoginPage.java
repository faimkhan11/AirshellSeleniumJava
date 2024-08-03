package com.Airshell.pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Field.XPath;

public class LoginPage 
{
    
	
    WebDriver lriver;
	
	public  LoginPage(WebDriver rdriver)
    {
  	  lriver=rdriver;
  	  PageFactory.initElements(rdriver, this);
  	  
    }
    

	@FindBy(xpath ="//input[@id='input-email']")
	WebElement username;
	
	public void enterusername(String userName)
	{
		username.sendKeys(userName);
	}
	
	@FindBy (xpath = "//input[@id='input-password']")
	WebElement userpassword;
	
	public void enteruserpassword(String userPassword)
	{
		userpassword.sendKeys(userPassword);
	}
	
	
	@FindBy (xpath = "//*[@type=\"submit\"]")
	WebElement summitbtn;
	
	public void clksummitbtn()
	{
		summitbtn.click();
	}
	
	@FindBy (linkText = "account_circle")
	WebElement myaccount;
	
	public void clkmyaccount()
	{
		myaccount.click();
	}
	
	
	
      
      
      
      
      
      
      
      
}
