package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	private WebDriver driver; 
	String appURL = "https://www.google.com/";

	@BeforeClass
	public void testSetUp() {		
		System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver");
		System.setProperty("webdriver.gecko.driver","/home/selenium/tools/geckodriver.exe"); 
		//FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		System.out.println("At TEST - verifyGooglePageTittle");
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("At AFTERCLASS");
		driver.quit();
	}
}
