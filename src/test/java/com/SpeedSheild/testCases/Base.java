package com.SpeedSheild.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	public String Home_Url="https://staging.fleetonline.net";
	public String username="test_141@sst.com";
	public String password="Pass123!";
	
	public static WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bindumadhavitammireddy/sel_testing/SpeedSheild/SpeedSheild/Drivers/chromedriver");

		driver= new ChromeDriver();	
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
