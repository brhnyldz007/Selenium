package com.neotech.lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.BaseClass5;
import com.neotech.utils.ConfigsReader;

public class hw2 extends BaseClass {

//	1)Open chrome browser
//	2)Go to "https://opensource-demo.orangehrmlive.com/"
//	3)Login into the application
//	4)Click On PIM>Add Employee
//	5)Add Employee
//	6)Go to Employee List
//	7)Verify Employee has been added
//	8)Delete added Employee
//	9)Quit the browser
	// Login
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
	driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
	driver.findElement(By.id("btnLogin")).submit();

	driver.findElement(By.id("menu_pim_viewPimModule")).click();

	Thread.sleep(2000);

	String expectedValue = "Charlie";

	// Locating all the rows of the table
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
	for (int i = 0; i < rows.size(); i++) { // loop all the rows
		String rowText = rows.get(i).getText(); // get the text of one row
         
		System.out.println("text ==> " + rowText);
		//System.out.println("rows size ==> " + rows.size());
		if (rowText.contains(expectedValue)) { // validating the expected value
			// get the first column of all rows in the table
			List<WebElement> firstColumns = driver
					.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
			firstColumns.get(i).click();
            
			
			Thread.sleep(3000);
			
			// After we find the row and click to go to the details
			// you have to break the loop, otherwise we will have
			// StaleElementReferenceException
			break;
		}
	}

	Thread.sleep(5000);
	tearDown();
	}
}
