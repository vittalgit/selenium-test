package MySel20Proj.MySel20Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class diffClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); 
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://accounts.google.com/signin");
	    
	    System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver");
	    
	    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hellothere@gmail.com");;
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password1");
	    Thread.sleep(5000);
	    
	    driver.close();
	}	

}