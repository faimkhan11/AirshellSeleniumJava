package com.Airshell.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Airshell.pageObjects.CartPage;
import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.ProductPage;
import com.Airshell.utilities.ReadExcelFile;

public class TC_04_VerifyUserIsAbleToCheckoutProductFromCartDataDrivenTesting extends BaseClass
{
	@Test(dataProvider = "LoginDataProvider")
	public void checkout(String userEmail, String password) throws InterruptedException, IOException
	{
		
		driver.get(url);
		logger.info("Open Website");
		
		HomePage hp = new HomePage(driver);
		hp.clkalertbtn();
		logger.info("CLick on Alert button");
		
		hp.clkproductbtn();
		logger.info("Click on Product button");
		
		ProductPage pp = new ProductPage(driver);
		Thread.sleep(2000);
		pp.clkbooknowbtn();
		logger.info("Click on BookNow botton");
		
		CartPage cp = new CartPage(driver);
		cp.clkdepcalender();
		logger.info("Click on Departure Calender");
		
		cp.selectdepdate();
		logger.info("Select Departure date");
		
		cp.clkselectbtn();
		logger.info("Click on Select button");
		
		cp.selectpickuphr();
		logger.info("Select Departure hour");
		
		cp.selectpickupmin();
		logger.info("Select departure min");
		
		cp.selectdepairport();
		logger.info("Select Airport");
		
		cp.clkreturncal();
		logger.info("Click on Return Calender");
		
		cp.selectnextmonth();
		logger.info("Click on button to select next moth date");
		
		
		cp.clkselectrtn();
		logger.info("Select Return date");
		
		cp.clkrtnhr();
		logger.info("Select return hour");
		
		cp.clkrtnmin();
		logger.info("Select Return min");
		
		cp.clkcontinuebtn();
		logger.info("Click on Continue button");
	
		
		String checkoutpage = driver.getTitle();
		if(checkoutpage.equals("faim"))
		{
			logger.info("User is successfully landed to Checkout page");
			Assert.assertTrue(true);
		
		}
		else
		{
			logger.info("Test case failed");
			captureScreenshot(driver, "checkout");
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
	}
	
 
   @DataProvider(name = "LoginDataProvider")
   public String [][] LoginDataProvider()
    {
	String fileName = System.getProperty("user.dir") + "\\TestData\\Airshells.xlsx";
	
	int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
	int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	
	String data[][] = new String[ttlRows-1][ttlColumns];
	
	for(int i=1;i<ttlRows;i++)
	{
		for(int j=0;j<ttlColumns;j++)
		{
			data [i-1][j] = ReadExcelFile.getCellValue(fileName, "LoginTestData", i, j);
		} 
	}
	return data;
}
		}
