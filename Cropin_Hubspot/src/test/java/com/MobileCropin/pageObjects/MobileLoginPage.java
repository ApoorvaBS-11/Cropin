package com.MobileCropin.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileLoginPage {

	WebDriver localdriver;
	
	public MobileLoginPage(WebDriver removedriver)
	{
		localdriver=removedriver;
		PageFactory.initElements(removedriver, this);
	}
	
	@FindBy(id="com.hubspot.android:id/login")
	WebElement loginButton;
	
	
	@FindBy(id="username")
	WebElement emailaddress;
	

	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="loginBtn")
	WebElement login;
	
	public void LoginClick()
	{
		loginButton.click();
	}
	
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





