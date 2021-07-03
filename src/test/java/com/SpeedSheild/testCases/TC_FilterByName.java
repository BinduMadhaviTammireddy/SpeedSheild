package com.SpeedSheild.testCases;

import org.testng.annotations.Test;

import com.SpeedSheild.pageObject.AdministrationPage;



public class TC_FilterByName  extends Base

{
	@Test
	public void filterbynames()
		{
		
		TC_Login_001 login_TC = new TC_Login_001();
		login_TC.loginTestCase();
		
		AdministrationPage admin_page = new AdministrationPage(driver);
		admin_page.filterByFirstName("Operator");
		admin_page.filterByLastName("Card1236");
		screenwait();
		
		admin_page.output("Operator");
	
	
		}
}
