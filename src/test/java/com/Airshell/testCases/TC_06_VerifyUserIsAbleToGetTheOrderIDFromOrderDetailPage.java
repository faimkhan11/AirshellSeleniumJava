package com.Airshell.testCases;

import org.testng.annotations.Test;

import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.LoginPage;
import com.Airshell.pageObjects.OrderDetailsPage;

import junit.framework.Assert;

public class TC_06_VerifyUserIsAbleToGetTheOrderIDFromOrderDetailPage extends BaseClass
{
	
	@Test 
	public void orderdetails() throws InterruptedException
	{

		//Open URL
		driver.get(url);
		logger.info("Open Website");
		
        HomePage hp = new HomePage(driver);
		
		hp.clkalertbtn();
		logger.info("Click on Alert button");
		
		hp.clksignInbtn();
		logger.info("Click on SignIn button");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterusername("testt_user011@cropsly.com");
		logger.info("Enter User Email");
		
		lp.enteruserpassword("faim@cropsly.com");
		logger.info("Enter Password");
		
		lp.clksummitbtn();
		logger.info("Click on Submit button");
		Thread.sleep(5000);
			
		
		hp.clksignInbtn();
		logger.info("Click on My Account");
		
		OrderDetailsPage odp = new OrderDetailsPage(driver);
		odp.getorderID();
		
		

    }


}
