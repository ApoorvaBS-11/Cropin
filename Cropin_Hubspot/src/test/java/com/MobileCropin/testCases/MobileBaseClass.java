package com.MobileCropin.testCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBaseClass {
	
	

	public String emailaddress="apsygowda.118@hmail.com";
	public String password="HubSpot@11";
	public 	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
AppiumDriver<MobileElement> driver;
		
		File f= new File("src");
		File fs = new File(f,"com.hubspot.android.apk");
		
		
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName","ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
		caps.setCapability(MobileCapabilityType.UDID,"HT7AG1A00153");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		
		
		caps.setCapability("appPackage","com.hubspot.android");
	caps.setCapability("appActivity","com.hubspot.android.app.splash.SplashActivity");
		//caps.setCapability(MobileCapabilityType.APP, value);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,caps);
		
	}
	
//	@AfterTest
//	public void teardown()
//	{
//		driver.quit();
//	}
}
