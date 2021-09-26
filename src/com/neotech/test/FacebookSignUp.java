package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) {

		// url=https://www.facebook.com/r.php

		setUp();

		WebElement month = driver.findElement(By.id("month"));
		selectDropdown(month, 8);

		// 1-liner
//		selectDropdown(driver.findElement(By.id("month")),8);

		WebElement day = driver.findElement(By.id("day"));
		selectDropdown(day, "10");

		WebElement year = driver.findElement(By.id("year"));
		selectDropdown(year, "1995");

		wait(2);

		tearDown();
	}
}
