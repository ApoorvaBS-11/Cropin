package com.cropin.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	
	public String baseURL ="https://app.hubspot.com/contacts/9396101/deal/4123661603";
public String emailaddress="tasleem.banu@cropin.com";
public String password="Cropin@123";
	public static  WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDriver//chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
	Thread.sleep(6000); 
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	}
				
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
