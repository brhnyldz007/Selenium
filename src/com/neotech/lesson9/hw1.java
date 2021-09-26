package com.neotech.lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.BaseClass5;

public class hw1 extends BaseClass5 {
//	1)Open chrome browser
//	2)Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3)Login to the application
//	4)Verify customer "Susan McLaren" is present in the table
//	5)Click on customer details
//	6)Update customers last name and credit card info
//	7)Verify updated customers name and credit card number is displayed in table
//	8Close browser
	public static void main(String[] args) throws InterruptedException {
		setUp();
		// Login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		// I want to get all the rows of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		//List<WebElement> cols = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));

		
		
		//System.out.println("cols size => " + cols.size());
		int rowIndex = -1;

		// Starting from 1, because I want to skip the header
		for (int i = 1; i < rows.size(); i++) {

			System.out.println("row size ===> " + rows.size());
			String rowText = rows.get(i).getText();
			// System.out.println(rowText);
			if (rowText.contains("Susan McLaren")) {
				System.out.println("We have found Susan");
				System.out.println("i -> " + i);

				rowIndex = i + 1; // rowIndex 6 = 5 + 1
				String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + rowIndex + "]/td[13]/input";

				driver.findElement(By.xpath(path)).click();
				break;
			}
		}
		Thread.sleep(1000);


		// Let's Update Customer name:
		WebElement custName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		String textInside = custName.getAttribute("value");
		System.out.println("textInside -> " + textInside);

		custName.clear();
		Thread.sleep(500);
		custName.sendKeys("Susan Ferrari");
		Thread.sleep(1000);

		// Let's click on update
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		Thread.sleep(1000);

		// Verify that the name has changed

		String newName = driver
				.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + rowIndex + "]/td[2]"))
				.getText();

		System.out.println("newName -> " + newName);
		tearDown();
	}

}
