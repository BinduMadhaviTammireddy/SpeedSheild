package com.SpeedSheild.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	public String Home_Url="https://staging.fleetonline.net";
	public String username="test_141@sst.com";
	public String password="Pass123!";
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bindumadhavitammireddy/sel_testing/SpeedSheild/SpeedSheild/Drivers/chromedriver");
		driver= new ChromeDriver();	
		
		logger= Logger.getLogger("speedSheild");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public void screenwait()
	{
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@AfterClass(alwaysRun=true)

	public void end()
	{
		driver.quit();
	}
	
}
