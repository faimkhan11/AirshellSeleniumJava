package com.Airshell.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Airshell.pageObjects.CartPage;
import com.Airshell.pageObjects.CheckoutPage;
import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.ProductPage;

public class TC_03_VerifyUserIsAbleToCheckoutProductFromCart extends BaseClass
{
	@Test(priority=1)
	public void checkout() throws InterruptedException, IOException
	{
		
		//Open URL
		driver.get(url);
		logger.info("Open Website");
		
		//Alert button
		HomePage hp = new HomePage(driver);
		hp.clkalertbtn();
		Thread.sleep(2000);
		logger.info("Click on Alert button");
		
		//Product button
		hp.clkproductbtn();
		logger.info("Click on Product button");
		
		//Book Now button
		ProductPage pp = new ProductPage(driver);
		Thread.sleep(2000);
		pp.clkbooknowbtn();
		logger.info("Click on BookNow botton");
		
		//Departure Calendar
		CartPage cp = new CartPage(driver);
		cp.clkdepcalender();
		logger.info("Click on Departure Calender");
		
		
		//Departure Date
		cp.selectdepdate();
		logger.info("Select Departure date");
		
		//Departure Select button
		cp.clkselectbtn();
		logger.info("Click on Select button");
		
		//Departure Hour
		cp.selectpickuphr();
		logger.info("Select Departure hour");
		
		//Departure Min
		cp.selectpickupmin();
		logger.info("Select departure min");
		
		//Departure Airport
		cp.selectdepairport();
		logger.info("Select Airport");
		
		//Return Calendar
		cp.clkreturncal();
		logger.info("Click on Return Calender");
		
		//Return Month
		cp.selectnextmonth();
		logger.info("Click on button to select next moth date");
		
		
		//Return Select
		cp.clkselectrtn();
		logger.info("Select Return date");
		
		//Return Hour
		cp.clkrtnhr();
		logger.info("Select return hour");
		
		//Return min
		cp.clkrtnmin();
		logger.info("Select Return min");
		
		//Continue button
		cp.clkcontinuebtn();
		logger.info("Click on Continue button");
	
		
		String checkoutpage = driver.getTitle();
		if(checkoutpage.equals("Checkout"))
		{
			logger.info("User is successfully landed to Checkout page");
			Assert.assertEquals(checkoutpage, "Checkout");
			Assert.assertEquals(checkoutpage, "Checkout", "User is successfully landed to Checkout page");
		
		}
		else
		{
			logger.info("Test case failed");
			captureScreenshot(driver, "checkout");
			Assert.assertTrue(false);
		}
		
	
		CheckoutPage cp2 = new CheckoutPage(driver);
		
		cp2.enterfirstname("Test");
		logger.info("First Name");
		
		cp2.enterlastname("User");
		logger.info("Last Name");
		
		cp2.enteremail("testuser01@cropsly.com");
		logger.info("Email");
		
		cp2.slectcuntry();
		logger.info("Country Code");
		
		cp2.entertelephone("8699235075");
		logger.info("Telephone");
		
		cp2.enteraddress("Copenhagen");
		logger.info("Address");
		
		cp2.enterpostcode("1620");
		logger.info("Postcode");
		
		cp2.entercity("Copenhagen");
		logger.info("City");
		
		cp2.entercountry();
		logger.info("Country");
		
		cp2.clkcntinue();
		logger.info("Continue");
		
		String title = driver.getTitle();
		if (title.equals("Checkout"))
		{
			Assert.assertEquals(title, "Checkout", "User is successfully landed to Insurance page");
		}
			
		

		
	}
		
		
		
		
		
		
		
		
		
	

}
