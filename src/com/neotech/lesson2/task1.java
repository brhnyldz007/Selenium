package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public final static String url = " https://demoqa.com/text-box";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver str = new ChromeDriver();

		str.get(url);
		
		str.findElement(By.cssSelector("input#userName")).sendKeys("Mila");
		str.findElement(By.cssSelector("input#userEmail")).sendKeys("mila@neotech.com");
		str.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("ca");
		str.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("ca");
		str.findElement(By.id("submit")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		str.quit();
	}

}
