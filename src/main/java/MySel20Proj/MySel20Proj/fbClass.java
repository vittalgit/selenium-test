package MySel20Proj.MySel20Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class fbClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); 
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
	    WebDriver driver = new FirefoxDriver();
	    
	    String fb_url = "https://www.facebook.com/";
	    
	    driver.get(fb_url);
	    
	    System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver");
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("fbaccount");;
	    //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password1");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(500);
	    
	    driver.close();
	}	
}
