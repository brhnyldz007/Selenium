package com.neotech.lesson9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class TakeScreenShoots extends CommonMethods {
	public static void main(String[] args) {

		setUp();

		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);


		try {
			FileUtils.copyFile(source, new File("screenshots/ScreenShots_1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		tearDown();
	}
}
