package com.Airshell.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path = "C:\\Aotomation\\SeleniumWebDrivers\\AirshellsProject\\Configuration\\config.properties";
	
	public ReadConfig()
	{
	
	try {
	    properties = new Properties();
	   	
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	    } 
	
	   catch (Exception e) 
	   {
			e.printStackTrace();
	   }
	
	}
	
	public String getbrowser()
	{
		String value = properties.getProperty("browser");
		return value;
	}
	
	public String getwebsiteURL()
	{
		String value = properties.getProperty("websiteURL");
		return value;
	}
	
	
	
	
	
	   
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is" + e.getMessage());
		}
		
		}
	
	public String getWebSiteURL()
	{
		String url=pro.getProperty("websiteURL");
		return url;		
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getIePath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}

*/	
	
	


