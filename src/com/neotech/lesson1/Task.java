package com.neotech.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	
	public final static String url = "https://www.facebook.com/";
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		
		WebDriver str = new ChromeDriver();
		
		str.get(url);
        
		str.findElement(By.cssSelector("input[name='email']")).sendKeys("ivonne@gmail.com");
		str.findElement(By.cssSelector("input[id='pass']")).sendKeys("ivonne");		
		str.findElement(By.cssSelector("button[type='submit']")).click();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		str.quit();
		
		
	}

}
