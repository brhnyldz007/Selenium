package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass1;

public class hw2 extends BaseClass1{
	
	public static void main(String[] args) {
		
		setUp();
		
		

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		WebElement str = driver.findElement(By.cssSelector("span#spanMessage"));
		System.out.println(str.getText());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		tearDown();
	}

}
