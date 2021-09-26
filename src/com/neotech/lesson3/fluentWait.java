package com.neotech.lesson3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass5;

public class fluentWait extends BaseClass5 {

//	 (try to use FluentWait)
//     Add Employee
//     Open chrome browser
//     Go to “https://opensource-demo.orangehrmlive.com/”
//     Login into the application
//     Click on Admin>User Management> Users
//     Add Employee
//     Log out 
//     Quit the browser
	public static void main(String[] args) {
		setUp();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		tearDown();
		
	}

}
