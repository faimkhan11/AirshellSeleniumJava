package com.Airshell.testCases;

import org.testng.annotations.Test;

import com.Airshell.pageObjects.CartPage;
import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.LoginPage;
import com.Airshell.pageObjects.ProductPage;

public class TC_07_VerifUserIsAbleToIncreaseQuantityOfProductFromCartPage extends BaseClass
{
  @Test
	public void productcount() throws InterruptedException
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
		
		hp.clkproductbtn();
		logger.info("User clicked on Product button");
		
		
		ProductPage pp = new ProductPage(driver);
		pp.clkbooknowbtn();
		logger.info("User clicked on Book Now button");
		
	   CartPage cp = new CartPage(driver);
	   cp.clkcarticon();
	   logger.info("Click on Cart Icon");
	   
	   cp.printbebeforequantity();
	   logger.info("Printing Quantity of the product before increasing the count");
	   
	   cp.clkplusbtn();
	   logger.info("Click on Plus button");
	   
	   cp.printafterquantity();
	   logger.info("Printing Quantity of the product after increasing the count");
	   
	   
	  
  }
}
