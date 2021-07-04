package com.SpeedSheild.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.SpeedSheild.utilities.ReadConfig;

public class Base {
	
	/*public String Home_Url="https://staging.fleetonline.net";
	public String username="test_141@sst.com";
	public String password="Pass123!";
	*/
	


	public static WebDriver driver;
	public static Logger logger;
	public static ReadConfig readconfig= new ReadConfig();
	
	public String Home_Url = readconfig.getURL();
	public String username = readconfig.getUsername_1();
	public String password = readconfig.getPassword_1();	
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
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
