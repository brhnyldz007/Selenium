package com.neotech.lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Hw3 extends CommonMethods {

	public static void main(String[] args) {
//		Homework 1: Leave List Search Validation
//		1. Open chrome browser
//		2. Go to https://opensource-demo.orangehrmlive.com/
//		3. Login into the application
//		4. Select Leave List
//		5. Select from July 1, 2021 until August 31, 2020
//		6. Check only "Scheduled"
//		7. Click on Search
//		8. Validate "No Records Found" is displayed
//		9. Quit the browser
		setUp();

		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();

		WebElement leave = driver.findElement(By.cssSelector("a#menu_leave_viewLeaveModule"));
		leave.click();

		WebElement list = driver.findElement(By.cssSelector("a#menu_leave_viewLeaveList"));
		list.click();

		wait(2);

		
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img"));
		calendar.click();

		WebElement calendar1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		selectDropdown(calendar1, "Jul");

		wait(2);

		List<WebElement> str2 = driver.findElements(By.xpath("//tbody/tr/td/a[@class='ui-state-default']"));

		for (WebElement str : str2) {
			String dayNum = str.getText();
			// System.out.println(dayNum);
			if (dayNum.equals("1")) {
				str.click();
				break;
			}
		}

		wait(2);

		WebElement returnDate = driver.findElement(By.xpath("//ol/li[2]/img"));
		returnDate.click();

		wait(2);

		WebElement calendar2 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		selectDropdown(calendar2, "Aug");

		wait(2);

		WebElement calendar3 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		selectDropdown(calendar3, "2020");

		List<WebElement> str3 = driver.findElements(By.xpath("//tbody/tr/td/a[@class='ui-state-default']"));

		for (WebElement str : str3) {
			String dayNum1 = str.getText();
			// System.out.println(dayNum1);
			if (dayNum1.equals("31")) {
				str.click();
				break;
			}
		}

		wait(2);

		WebElement error = driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/span"));

		if (error.isDisplayed()) {
			System.out.println("No Records Found");
		} else {
			System.out.println("Record found!");
		}

		tearDown();
	}

}
