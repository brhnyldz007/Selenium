package com.neotech.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		WebDriver str = new ChromeDriver();
		str.manage().window().maximize();
		
		str.get("http://demo.guru99.com/test/newtours/");
		str.findElement(By.linkText("REGISTER")).click();
		str.findElement(By.name("firstName")).sendKeys("Mila");
		str.findElement(By.name("lastName")).sendKeys("Lillian");
		str.findElement(By.name("phone")).sendKeys("2344453");
		str.findElement(By.name("email")).sendKeys("mila@neotech.com");
		str.findElement(By.name("country")).sendKeys("UNITED STATES");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		str.findElement(By.name("submit")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		str.quit();
		
		
	}

}
