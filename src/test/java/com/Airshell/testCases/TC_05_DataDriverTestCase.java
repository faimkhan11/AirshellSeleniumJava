package com.Airshell.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Airshell.pageObjects.HomePage;
import com.Airshell.pageObjects.LoginPage;
import com.Airshell.utilities.ReadExcelFile;

import junit.framework.Assert;

public class TC_05_DataDriverTestCase extends BaseClass
{
	
	@Test(dataProvider = "LoginDataProvider")
	public void login(String userEmail, String password)
	{
		driver.get(url);
		logger.info("Open website page");
		
		HomePage hp = new HomePage(driver);
		
		hp.clkalertbtn();
		logger.info("Click on Alert button");
		
		hp.clksignInbtn();
		logger.info("Click on SignIn button");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterusername(userEmail);
		lp.enteruserpassword(password);
		lp.clksummitbtn();
		
		
				
		
		
		
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
	
