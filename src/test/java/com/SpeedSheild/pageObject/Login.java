package com.SpeedSheild.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="okBtn")
	WebElement OkButton;
	
	@FindBy(id="tbUsername")
	WebElement Text_Username;
	
	@FindBy(id="tbPassword")
	WebElement Text_password;
	
	@FindBy(id="btnSignIn")
	WebElement signInButton;
	
	public void clickOK()
	{	
		OkButton.click();
	}
	
	public void fillUserName(String username)
	{
		Text_Username.sendKeys(username);
	}
	
	public void fillPassword(String password)
	{
		Text_password.sendKeys(password);
		
	}
	
	public void clickSignIN()
	{	
		signInButton.click();
		
	}
	
}
