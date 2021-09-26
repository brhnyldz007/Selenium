package com.neotech.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class PrintTableData extends CommonMethods {

	public static void main(String[] args) {
		// https://the-internet.herokuapp.com/tables
		setUp();
		// I want you to print all the data from the body
		int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();

		for (int i = 1; i <= rows; i++) {
			// iterating the rows

			for (int j = 1; j < cols; j++) { // skipping the last column
				// iterating the columns
				WebElement el = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(el.getText() + " | ");
			}

			System.out.println();
		}

		tearDown();
	}

}
