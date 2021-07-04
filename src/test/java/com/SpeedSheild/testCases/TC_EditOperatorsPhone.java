package com.SpeedSheild.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SpeedSheild.pageObject.AdministrationPage;

public class TC_EditOperatorsPhone extends Base

{
	public String Personal_number_1 = readconfig.Personal_number_1();
	public String Personal_number_2 = readconfig.Personal_number_2();
	@Test

	
	// this is used to enter the personal number with  number previously.
	public void editOperatorPhoneNumber()
	{
	
	TC_FilterByName filter = new TC_FilterByName();
	filter.filterbynames();
	AdministrationPage admin_page = new AdministrationPage(driver);
	admin_page.OperatorDetails();
	admin_page.clearPersonalNumber();
	admin_page.enternumber(Personal_number_2);
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
