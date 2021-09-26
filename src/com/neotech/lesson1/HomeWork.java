package com.neotech.lesson1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWork {
	
	@Test
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.com/");
	    
	    String url = driver.getCurrentUrl();
	    
	    System.out.println(url);
	    
	    Thread.sleep(2000);
	    
	   /* WebElement str = driver.findElement(By.id("twotabsearchtextbox"));
	    str.sendKeys("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	    Thread.sleep(1000);
	    
	    WebElement str1 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
	    str1.click();*/
	    
	    String title = driver.getTitle();
	    
	    String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	    
	    if(title.equalsIgnoreCase(expectedTitle)) {
	    	System.out.println("it passed!");
	    }else {
	    	System.out.println("It didn't pass!");
	    }
	     
	    driver.quit();
	    
	    
	    
	}

}
