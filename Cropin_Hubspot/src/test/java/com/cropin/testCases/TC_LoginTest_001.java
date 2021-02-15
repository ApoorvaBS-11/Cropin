package com.cropin.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cropin.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest()
	{
		 driver.get(baseURL);
		LoginPage lp= new LoginPage(driver);
		lp.setEmailAddress(emailaddress);
		lp.setPassword(password);
		lp.clickLogin();
		
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
