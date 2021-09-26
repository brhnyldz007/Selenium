package com.neotech.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.com/");
	    
	    //there are 8 locators to find the elements in DOM
	    //id,name,className,linkText,parrtialLinkText,tagName,xpath,cssSelector
	    WebElement text =driver.findElement(By.id("twotabsearchtextbox"));
	    text.sendKeys("clothes");
	    
	    Thread.sleep(2000);
	    
	    
	    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	    searchButton.click();		
	    
	    Thread.sleep(2000);
	    driver.close();
	    
	    //driver.quit(); closing the whole browser
	}

}
