package com.SpeedSheild.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationPage {
	
	WebDriver driver;
	
	public AdministrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tbSearch0_1")
	WebElement FilterBy_FirstName;
	
	@FindBy(id="tbSearch0_2")
	WebElement FilterBy_LastName;
	
	
	 @FindBy(xpath = "//*[@id=\"tblDataTable0_wrapper\"]/div[4]/div[1]/div/table/thead/tr/th[1]") List<WebElement> col;
	 @FindBy(tagName = "tr") List<WebElement> row;
	 @FindBy(xpath="//*[@id=\"tblDataTable0\"]/tbody/tr/td[1]")
	 WebElement filterdOperator;
	 
	 @FindBy(id="tbPersonnelNumber")
	 WebElement phoneNumber;
	 
	 @FindBy(id="btnUpdateOperatorDetails")
	 WebElement UpdateDetails;
	 
	 @FindBy(id="btnUpdateYes")
	 WebElement confirmUpdate;
	 
	public void  filterByFirstName(String firstname)
	{
		FilterBy_FirstName.sendKeys(firstname);
	}
	
	public void  filterByLastName(String lastname)
	{
		FilterBy_LastName.sendKeys(lastname);
	}
	
	public void OperatorDetails()
	{
		filterdOperator.click();
	}
	public void clearPersonalNumber()
	{
		phoneNumber.click();
		phoneNumber.clear();
	}
	
	public void  enternumber(String number)
	{
		phoneNumber.sendKeys(number);
	}
	
	public void updateDetails()
	{
		UpdateDetails.click();
	}
	public void confirmUpdate()
	
	{
		confirmUpdate.click();
	}
	public void output(String firstname)
	{
		
		System.out.println("Filtered entries count is"+ col.size());
		/*for (int i=0; i<col.size();i++)
		{
			boolean result;
			String value= col.get(i).getText();
			if (value.contains(firstname)) 
			{result= true;}
			else
			{result = false ;}
		}
		*/

	}
}
