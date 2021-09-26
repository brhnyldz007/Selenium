package com.neotech.lesson10;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUploadDemo extends CommonMethods {

	public static void main(String[] args) {

//		url = https://the-internet.herokuapp.com/

		setUp();

		driver.findElement(By.linkText("File Upload")).click();

		String filePath = System.getProperty("user.dir") + "/screenshots/screenshot_1.png";
		// String filePath =
		// "C:\Users\sabah\eclipse-workspace_2021\Selenium2\screenshots\screenshot_2.png";
		System.out.println(filePath);

		driver.findElement(By.id("file-upload")).sendKeys(filePath);

		wait(3);

		driver.findElement(By.id("file-submit")).click();

		wait(3);

		tearDown();
	}

}
