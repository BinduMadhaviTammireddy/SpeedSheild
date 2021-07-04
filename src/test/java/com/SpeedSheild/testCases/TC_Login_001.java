package com.SpeedSheild.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SpeedSheild.pageObject.Login;

public class TC_Login_001 extends Base
{
	@Test
	public void loginTestCase()
		{
			driver.get(Home_Url);
			
			Login login =new Login(driver);
			login.clickOK();
			logger.info("Acepted cookies");
			login.fillUserName(username);
			login.fillPassword(password);
			login.clickSignIN();
			logger.info("Click signin");
			screenwait();
			
			
			  if(driver.getPageSource().contains("Operator Management"))
			  {
				  logger.info("signin test pass");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				
				  logger.info("signin test fail");

				  Assert.assertTrue(false);
			  }
			   
			
			
		}
	
}
