package com.Airshell.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_01_VerifyUserIsAbleToLoginToWebsite extends BaseClass
{
	
	@Test
	public void login() throws InterruptedException
	{
		
		driver.get(url);
		logger.info("Open website page");
		
		HomePage hp = new HomePage(driver);		
		
		hp.clkalertbtn();
		logger.info("Click on Alert button");
		
		hp.clksignInbtn();
		logger.info("Click on SignIn button");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("testt_user011@cropsly.com");
		logger.info("Enter User's Email ID");
		
		lp.enteruserpassword("faim@cropsly.com");
		logger.info("Enter User's Password");
		
		lp.clksummitbtn();
		logger.info("Click on Login button");
		
		String title=driver.getTitle();
		if(title.equals("Order Information"))
		{
			Assert.assertEquals("User is successfully Login to the website", "Order Information" , title);
			logger.info("User is successfully Login to the website");
		}
		else 
		{
			logger.info("Test case is failed");
		}	
		
				
		
		
		
	}
	
		
		
		
	}
	
