package com.SpeedSheild.testCases;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SpeedSheild.pageObject.AdministrationPage;



public class TC_FilterByName  extends Base

{
	public String First_name = readconfig.First_name();
	public String Last_name = readconfig.Last_name();
	@Test
	public void filterbynames()
		{
		
		TC_Login_001 login_TC = new TC_Login_001();
		login_TC.loginTestCase();
		
		AdministrationPage admin_page = new AdministrationPage(driver);
		admin_page.filterByFirstName(First_name);
		admin_page.filterByLastName(Last_name);
		screenwait();
		  logger.info("Operators filtered");
		  
		   List<String> filteredData =   admin_page.output();
		   
		   for (int i=0; i< filteredData.size();i++)
			{
			   String value= filteredData.get(i);
				if (value.contains(First_name) && value.contains(Last_name)) 
				
				{
					  logger.info("Filter based on first name: test pass");
					  Assert.assertTrue(true);
				  }
				  else
				  {
					
					  logger.info("Filter based on first name: test fail");

					  Assert.assertTrue(false);
				  }
				   
			}
				


		}
}
