package com.neotech.lesson10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {

		/*
		 * TC 1: Upload file and Take Screenshot 1.Navigate to
		 * http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
		 * 2.Upload file 3.Verify file got successfully uploaded and take screenshot
		 */

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/screenshot_1.png";

		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);

		wait(2);

		driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();

		wait(2);

		String expected = "File uploaded!";

		String actual = getAlertText();

		if (actual.equals(expected)) {
			System.out.println("Test is passed!");
		} else {
			System.out.println("Test failed!");
		}

		acceptAlert();

		// Take a screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;

		// take the screenshot

		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/Lesson13/fileUploaded1.png");

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			System.out.println("The screenshot cannot be saved!");
			e.printStackTrace();
		}

		tearDown();
	}

}
