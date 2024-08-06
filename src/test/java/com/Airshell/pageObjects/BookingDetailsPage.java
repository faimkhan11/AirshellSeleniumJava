package com.Airshell.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingDetailsPage {
	
	//Constructor for all test cases
	
		WebDriver lriver;
		
		public  BookingDetailsPage(WebDriver rdriver)
	    {
	  	  lriver=rdriver;
	  	  PageFactory.initElements(rdriver, this);
	  	  
	    }
		
		@FindBy (xpath = "//input[@id='date-out']")
		WebElement depcalender;
		
		public void clkdepcalender()
		{
			depcalender.click();
		}
		
		
		@FindBy (xpath = "//button[normalize-space()='15']")
		WebElement depdate;
		
		public void selectdepdate()
		{
			depdate.click();
		}
		
		@FindBy (xpath = "//*[@class=\"btn-flat datepicker-done waves-effect btn-confirm\"]")
		WebElement selectbtn;
		
		public void clkselectbtn()
		{
			selectbtn.click();
		}
		
		@FindBy (xpath = "//select[@id='hour-out']")
		WebElement pickuphr;
		
		public void selectpickuphr()
		{
			Select hr = new Select(pickuphr);
			hr.selectByValue("15");
		}
		
		@FindBy (xpath = "//select[@id='minute-out']")
		WebElement pickupmin;
		
		public void selectpickupmin()
		{
			Select min = new Select(pickupmin);
			min.selectByValue("30");
		}
		
		
		@FindBy (id="airport-id-departure")
		WebElement depairport;
		
		public void selectdepairport()
		{
			Select airport = new Select(depairport);
			airport.selectByValue("25");
		}
		
		@FindBy (xpath = "//input[@id='date-return']")
		WebElement returncal;
		
		public void clkreturncal()
		{
			returncal.click();
		}
		
		@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[4]/button[1]")
		WebElement nextmoth;
		
		public void selectnextmonth() throws InterruptedException
		{
			
			nextmoth.click();
		}		
		
		@FindBy (xpath = "(//button[@type='button'][normalize-space()='Select'])[2]")
		WebElement selectrtrn ;
		
		public void clkselectrtn()
		{
			selectrtrn.click();
		}
		
		@FindBy (xpath = "//select[@id='hour-in']")
		WebElement rtnhr;
		
		public void clkrtnhr()
		{
			Select hr = new Select(rtnhr);
			hr.selectByValue("11");
			
		}
		
		@FindBy (xpath = "//select[@id='minute-in']")
		WebElement rtnmin ;
		
		public void clkrtnmin()

		{
			Select min = new Select(rtnmin);
		    min.selectByValue("30");		
		}
		
		@FindBy (xpath = "//*[@id=\"button-booking\"]")
		WebElement continuebtn;
		
		public void clkcontinuebtn()
		{
			continuebtn.click();
		}
		
		
		
		
	    
		
		
		
		
		
		
		
		
		

}
