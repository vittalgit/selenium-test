package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 

public class GoogleHomePageTest {
	private WebDriver driver; 
	//String appURL = "https://www.google.com/";
	String appURL = "http://13.233.124.195:8080/Course/";

	@BeforeClass
	public void testSetUp() {		
		System.out.println("Initiating headless browser");
		String chromeDriverPath = "/home/selenium/tools/chromedriver/chromedriver" ;
	    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors", "--silent");
	    driver = new ChromeDriver(options);			
	}
	
	@Test
	public void verifyGooglePageTittle() {
		System.out.println("Verifying the Page Title");
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		System.out.println("----------------------TEST CASE TO PRINT THE PAGE TITLE-------------------------");
		System.out.println("Title of the page is  ........ " + getTitle);
		System.out.println("---------------------- TEST CASE EXECUTION COMPLETED -------------------------");
		Assert.assertEquals(getTitle, "Skills Development");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("Quitting the browser");
		driver.quit();
	}
}
