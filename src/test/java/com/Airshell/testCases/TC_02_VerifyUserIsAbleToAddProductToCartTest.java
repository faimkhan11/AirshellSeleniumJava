package com.Airshell.testCases;

import org.testng.annotations.Test;

import com.Airshell.pageObjects.CartPage;
import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.ProductPage;

import junit.framework.Assert;

public class TC_02_VerifyUserIsAbleToAddProductToCartTest extends BaseClass

{
    @Test
	public void buyproduct() throws InterruptedException
	{
		driver.get(url);
		logger.info("Website is open");
		
		HomePage hp = new HomePage(driver);
		hp.clkalertbtn();
		logger.info("User clicked on Alert button");
		
		hp.clkproductbtn();
		logger.info("User clicked on Product button");
		
		
		ProductPage pp = new ProductPage(driver);
		pp.clkbooknowbtn();
		logger.info("User clicked on Book Now button");
		
		
		CartPage cp = new CartPage(driver);
		cp.clkcarticon();
		logger.info("Click on Cart icon");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		if(title.equals("Shopping Cart"))
		{
			System.out.println("User is landed to"+ " "+title);
			
		}
		else
		{
			logger.info("Test case failed");
		}
				
		
		
	}
	
}