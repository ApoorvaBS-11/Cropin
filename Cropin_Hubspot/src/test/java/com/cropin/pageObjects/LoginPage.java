package com.cropin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver localdriver;
	
	public LoginPage(WebDriver removedriver)
	{
		localdriver=removedriver;
		PageFactory.initElements(removedriver, this);
	}
	
	
	@FindBy(id="username")
	WebElement emailaddress;
	

	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="loginBtn")
	WebElement login;
	
	public void setEmailAddress(String email)
	{
		emailaddress.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		login.click();
	}
	
}




