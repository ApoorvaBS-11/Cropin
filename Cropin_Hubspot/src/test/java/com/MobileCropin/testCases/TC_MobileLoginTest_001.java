package com.MobileCropin.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MobileCropin.pageObjects.MobileLoginPage;
import com.cropin.pageObjects.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TC_MobileLoginTest_001 extends MobileBaseClass{
	@Test
	public void loginTest()
	{
		
		//LoginPage lp= new LoginPage(driver);
	    MobileLoginPage mp = new  MobileLoginPage(driver);
		mp.LoginClick();
		mp.setEmailAddress(emailaddress);
		mp.setPassword(password);
		mp.clickLogin();
		
		if(driver.getTitle().equals("Don't have an account?Sign up"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}


