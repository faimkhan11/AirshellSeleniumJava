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
	public void login()
	{
		driver.get(url);
		logger.info("Open website page");
		
		HomePage hp = new HomePage(driver);
		
		hp.clkalertbtn();
		logger.info("Click on Alert button");
		
		hp.clksignInbtn();
		logger.info("Click on SignIn button");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterusername("testt_user011");
		lp.enteruserpassword("faim@cropsly.com");
		lp.clksummitbtn();
		
		 Assert.assertTrue(true);	
		
				
		
		
		
	}
	
		
		
		
	}
	
