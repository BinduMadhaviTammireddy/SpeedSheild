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
			login.fillUserName(username);
			login.fillPassword(password);
			login.clickSignIN();
			screenwait();
			
			
			  if(driver.getPageSource().contains("Operator Management"))
			  {
				  System.out.print("in true");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				
				  System.out.print("in false");

				  Assert.assertTrue(false);
			  }
			   
			
			
		}
	
}
