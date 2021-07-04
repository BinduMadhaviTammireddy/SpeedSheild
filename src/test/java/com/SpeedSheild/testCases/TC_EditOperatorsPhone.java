package com.SpeedSheild.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SpeedSheild.pageObject.AdministrationPage;

public class TC_EditOperatorsPhone extends Base

{
	@Test
	public void editOperatorPhoneNumber()
		{
		TC_FilterByName filter = new TC_FilterByName();
		filter.filterbynames();
		AdministrationPage admin_page = new AdministrationPage(driver);
		admin_page.OperatorDetails();
		admin_page.enternumber("1236");
		admin_page.updateDetails();
		admin_page.confirmUpdate();
		screenwait();
		
		
		  if(driver.getPageSource().contains("Operator Details updated successfully."))
		  {
			  logger.info("Operators Personal number edit : test pass");
			  Assert.assertTrue(true);
		  }
		  else
		  {
			
			  logger.info("Operators Personal number edit : test fail");

			  Assert.assertTrue(false);
		  }
		}
	
}
