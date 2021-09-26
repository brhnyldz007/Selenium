package com.neotech.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver");
		
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.redfin.com/");
	    
	    String url =  driver.getCurrentUrl();
	    
	    String expecttedUrl = "https://www.redfin.com/";
	    
	    if(url.equalsIgnoreCase(expecttedUrl)) {
	    	System.out.println("https://www.redfin.com/");
	    }else {
	    	System.out.println("upss");
	    }
	    
	    Thread.sleep(5000);
	    
	    driver.close();
	}

}
