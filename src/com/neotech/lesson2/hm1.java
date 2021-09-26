package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class hm1 extends BaseClass1{
	
	public static void main(String[] args) {
		
		setUp();
		
		System.out.println(driver.getTitle());
	
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//first way
//		String str1 =driver.findElement(By.cssSelector("a#welcome")).getText();
//		System.out.println(str1 + " to the page!");
		
		
		//second way
		WebElement str1 =driver.findElement(By.cssSelector("a#welcome"));
		if(str1.isDisplayed()) {
			System.out.println("Welcome to the page!");
		}else {
			System.out.println("invalid token or empty box!");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tearDown();
	}

}
