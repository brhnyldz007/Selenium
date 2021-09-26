package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefoxDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    
	   // driver.get("https://www.amazon.com/");
	    //will wait for the elements to be loaded
	    
	    driver.navigate().to("https://www.amazon.com/");
	    //will not wait for elements to be loaded
	    //will keep the history
	    driver.navigate().to("https://www.google.com/");
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    //will go back to the previous page
	    driver.navigate().forward();
	    //will go to the forward page
	    
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
		
        /*System.setProperty("webdriver.gecko.driver","Drivers/geckodriver");
		
	    WebDriver driver = new FirefoxDriver();
	    
	    Thread.sleep(2000);
	    
	    driver.close();*/
	    
		
	}
}
