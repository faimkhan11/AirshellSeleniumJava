package com.Airshell.testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.LoginPage;
import com.Airshell.pageObjects.OrderDetailsPage;

public class TC_08_VerifyUserIslandingToOrderConfirmationscreenAfterClickingOnViewOrderConfirmationButton extends BaseClass

{
	@Test
	public void viewconfirmationbtn() throws InterruptedException
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
	
	hp.clksignInbtn();
	logger.info("Click on My Account");
	
	OrderDetailsPage odp = new OrderDetailsPage(driver);
	odp.clkviewbtn();
	logger.info("Click on View Order Confirmation button");
	
	List<String> getIDs = new ArrayList(driver.getWindowHandles());
    System.out.println("ID's of the both windows"+ " "+getIDs);
    
    String Parent = getIDs.get(0);
    String Child = getIDs.get(1);
    driver.switchTo().window(Child);
    
    odp.verifytitle();
    
    
	
	
}
}
